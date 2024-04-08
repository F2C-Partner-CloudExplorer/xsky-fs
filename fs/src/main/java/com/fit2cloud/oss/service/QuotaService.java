package com.fit2cloud.oss.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.commons.server.base.domain.Organization;
import com.fit2cloud.commons.server.base.domain.OrganizationExample;
import com.fit2cloud.commons.server.base.domain.Workspace;
import com.fit2cloud.commons.server.base.domain.WorkspaceExample;
import com.fit2cloud.commons.server.base.mapper.OrganizationMapper;
import com.fit2cloud.commons.server.base.mapper.WorkspaceMapper;
import com.fit2cloud.commons.server.utils.SessionUtils;
import com.fit2cloud.commons.utils.LogUtil;
import com.fit2cloud.oss.base.domain.*;
import com.fit2cloud.oss.base.mapper.*;
import com.fit2cloud.oss.common.constants.GeneralConstants;
import com.fit2cloud.oss.controller.request.QuotaSearchRequest;
import com.fit2cloud.oss.dto.FolderQuotaSetting;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * 配额Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class QuotaService {

    @Resource
    private OrganizationMapper organizationMapper;
    @Resource
    private FsConfigurationMapper fsConfigurationMapper;
    @Resource
    private FsXskyFolderMapper fsXskyFolderMapper;
    @Resource
    private WorkspaceMapper workspaceMapper;
    @Resource
    private WorkspaceService workspaceService;
    @Resource
    private FsFtpShareMapper fsFtpShareMapper;
    @Resource
    private FsSmbShareMapper fsSmbShareMapper;
    @Resource
    private FsNfsShareMapper fsNfsShareMapper;

    /**
     * 获取所有组织
     * @param organization
     * @return
     */
    public List<Organization> listAllOrg(Organization organization) {
        OrganizationExample organizationExample = new OrganizationExample();
        OrganizationExample.Criteria criteria = organizationExample.createCriteria();
        if (StringUtils.isNotBlank(organization.getName())) {
            criteria.andNameLike("%" + organization.getName() + "%");
        } else {
            criteria.andParentIdIsNull();
        }
        // 这里description是默认配额的搜索条件
        if (StringUtils.isNotBlank(organization.getDescription())) {
            FolderQuotaSetting defaultQuotaSetting = getDefaultQuota(FolderQuotaSetting.ORG_DEFAULT_KEY);
            List<String> notDefaultGroupIds = new ArrayList<>();
            notDefaultGroupIds.add("-1");
            FsConfigurationExample sFsConfigurationExample = new FsConfigurationExample();
            sFsConfigurationExample.createCriteria().andKeyEqualTo(FolderQuotaSetting.ORG_KEY);
            List<FsConfiguration> sFsConfigurations = fsConfigurationMapper.selectByExampleWithBLOBs(sFsConfigurationExample);
            for (FsConfiguration FsConfiguration : sFsConfigurations) {
                FolderQuotaSetting quotaSetting = JSONObject.parseObject(FsConfiguration.getValue(), FolderQuotaSetting.class);
                if (!defaultQuotaSetting.equals(quotaSetting)) {
                    notDefaultGroupIds.add(FsConfiguration.getWorkspaceId());
                }
            }
            if (StringUtils.equals(organization.getDescription(), "default")) {
                criteria.andIdNotIn(notDefaultGroupIds);
            }
            if (StringUtils.equals(organization.getDescription(), "nonDefault")) {
                criteria.andIdIn(notDefaultGroupIds);
            }
        }
        return organizationMapper.selectByExample(organizationExample);
    }

    /**
     * 获取指定组织下所有工作空间
     * @param workspace
     * @param organizationId
     * @return
     */
    public List<Workspace> listAllGroup(Workspace workspace, String organizationId) {
        WorkspaceExample workspaceExample = new WorkspaceExample();
        WorkspaceExample.Criteria criteria = workspaceExample.createCriteria();
        if (StringUtils.isNotBlank(organizationId)) {
            criteria.andOrganizationIdEqualTo(organizationId);
        }
        if (StringUtils.isNotBlank(workspace.getName())) {
            criteria.andNameLike("%" + workspace.getName() + "%");
        }
        // 这里description是默认配额的搜索条件
        getCriteria(workspace, criteria);
        return workspaceMapper.selectByExample(workspaceExample);
    }

    private void getCriteria(Workspace workspace, WorkspaceExample.Criteria criteria) {
        if (StringUtils.isNotBlank(workspace.getDescription())) {
            FolderQuotaSetting defaultQuotaSetting = getDefaultQuota(FolderQuotaSetting.WORKSPACE_DEFAULT_KEY);
            List<String> notDefaultGroupIds = new ArrayList<>();
            notDefaultGroupIds.add("-1");
            FsConfigurationExample FsConfigurationExample = new FsConfigurationExample();
            FsConfigurationExample.createCriteria().andKeyEqualTo(FolderQuotaSetting.WORKSPACE_KEY);
            List<FsConfiguration> FsConfigurations = fsConfigurationMapper.selectByExampleWithBLOBs(FsConfigurationExample);
            for (FsConfiguration FsConfiguration : FsConfigurations) {
                FolderQuotaSetting quotaSetting = JSONObject.parseObject(FsConfiguration.getValue(), FolderQuotaSetting.class);
                if (!defaultQuotaSetting.equals(quotaSetting)) {
                    notDefaultGroupIds.add(FsConfiguration.getWorkspaceId());
                }
            }
            if (StringUtils.equals(workspace.getDescription(), "default")) {
                criteria.andIdNotIn(notDefaultGroupIds);
            }
            if (StringUtils.equals(workspace.getDescription(), "nonDefault")) {
                criteria.andIdIn(notDefaultGroupIds);
            }
        }
    }

    /**
     * 获取组织/工作空间默认配额
     * @param key
     * @return
     */
    public FolderQuotaSetting getDefaultQuota(String key) {
        if (StringUtils.equals(key, FolderQuotaSetting.WORKSPACE_KEY)) {
            key = FolderQuotaSetting.WORKSPACE_DEFAULT_KEY;
        }
        if (StringUtils.equals(key, FolderQuotaSetting.ORG_KEY)) {
            key = FolderQuotaSetting.ORG_DEFAULT_KEY;
        }
        FsConfigurationExample sFsConfigurationExample = new FsConfigurationExample();
        FsConfigurationExample.Criteria criteria = sFsConfigurationExample.createCriteria();
        criteria.andKeyEqualTo(key);
        List<FsConfiguration> sFsConfigurations = fsConfigurationMapper.selectByExampleWithBLOBs(sFsConfigurationExample);
        if (CollectionUtils.isNotEmpty(sFsConfigurations)) {
            return JSONObject.parseObject(sFsConfigurations.get(0).getValue(), FolderQuotaSetting.class);
        } else {
            return FolderQuotaSetting.getDefault();
        }
    }

    /**
     * 获取组织/工作空间的配额详情
     * @param id
     * @param key
     * @return
     */
    public FolderQuotaSetting getQuotaUsage(String id, String key) {
        FolderQuotaSetting quotaSetting;
        // 获取组织默认配额
        FolderQuotaSetting defaultQuotaSetting = getDefaultQuota(key);
        FsConfigurationExample sFsConfigurationExample = new FsConfigurationExample();
        FsConfigurationExample.Criteria criteria = sFsConfigurationExample.createCriteria();
        criteria.andWorkspaceIdEqualTo(id).andKeyLike(key);
        List<FsConfiguration> sFsConfigurations = fsConfigurationMapper.selectByExampleWithBLOBs(sFsConfigurationExample);
        if (CollectionUtils.isNotEmpty(sFsConfigurations)) {
            // 如果该组织/工作空间配额未做修改，则查询为空
            quotaSetting = JSONObject.parseObject(sFsConfigurations.get(0).getValue(), FolderQuotaSetting.class);
            if (quotaSetting.isFsDefaultSetting()) {
                quotaSetting.setFolderCount(defaultQuotaSetting.getFolderCount());
                quotaSetting.setFolderSize(defaultQuotaSetting.getFolderSize());
            }
        } else {
            quotaSetting = defaultQuotaSetting;
            quotaSetting.setFolderAllocateResourceIfExceed(GeneralConstants.Options.DEFAULT);
        }

        if (StringUtils.equals(key, FolderQuotaSetting.ORG_KEY)) {
            quotaSetting.setFolderTotalCount(0);
            quotaSetting.setFolderTotalSize(0);
            getTotalQuotaOfOrg(id,quotaSetting);
        }

        FsFtpShareExample fsFtpShareExample=new FsFtpShareExample();
        FsSmbShareExample fsSmbShareExample=new FsSmbShareExample();
        FsNfsShareExample fsNfsShareExample=new FsNfsShareExample();
        FsFtpShareExample.Criteria ftpCriteria = fsFtpShareExample.createCriteria();
        FsSmbShareExample.Criteria smbCriteria = fsSmbShareExample.createCriteria();
        FsNfsShareExample.Criteria nfsCriteria = fsNfsShareExample.createCriteria();
        // 获取组织/工作空间下所有文件共享
        if (StringUtils.equals(key, FolderQuotaSetting.ORG_KEY)) {
            List<String> workspaceIds = workspaceService.selectWorkspacesByOrgId(id).stream()
                    .map(Workspace::getId).collect(Collectors.toList());
            if (CollectionUtils.isEmpty(workspaceIds)) {
                return quotaSetting;
            }
            ftpCriteria.andWorkspaceIn(workspaceIds);
            smbCriteria.andWorkspaceIn(workspaceIds);
            nfsCriteria.andWorkspaceIn(workspaceIds);
        } else {
            ftpCriteria.andWorkspaceEqualTo(id);
            smbCriteria.andWorkspaceEqualTo(id);
            nfsCriteria.andWorkspaceEqualTo(id);
        }
        List<FsFtpShare> fsFtpShares = fsFtpShareMapper.selectByExample(fsFtpShareExample);
        List<FsSmbShare> fsSmbShares = fsSmbShareMapper.selectByExample(fsSmbShareExample);
        List<FsNfsShare> fsNfsShares = fsNfsShareMapper.selectByExample(fsNfsShareExample);
        // 设置组织文件共享实际使用值
        quotaSetting.clearUsed();
        quotaSetting.setFolderCountUsed(quotaSetting.getFolderCountUsed() + fsFtpShares.size() + fsSmbShares.size() + fsNfsShares.size());
        return quotaSetting;
    }



    /**
     * 获取所有工作空间
     * @param workspace
     * @param workspaceIds
     * @return
     */
    public List<Workspace> listAllWorkspaces(Workspace workspace, List<String> workspaceIds) {
        WorkspaceExample workspaceExample = new WorkspaceExample();
        WorkspaceExample.Criteria criteria = workspaceExample.createCriteria();
        if (CollectionUtils.isNotEmpty(workspaceIds)) {
            criteria.andIdIn(workspaceIds);
        }
        if (StringUtils.isNotBlank(workspace.getName())) {
            criteria.andNameLike("%" + workspace.getName() + "%");
        }
        // 这里description是默认配额的搜索条件
        getCriteria(workspace, criteria);
        return workspaceMapper.selectByExample(workspaceExample);
    }


    /**
     * 保存/修改 组织/工作空间配额
     * @param id
     * @param quotaSetting
     * @param key
     */
    public void saveQuota(String id, FolderQuotaSetting quotaSetting, String key) {
        checkQuota(id, quotaSetting, key);
        FsConfigurationExample sFsConfigurationExample = new FsConfigurationExample();
        FsConfigurationExample.Criteria criteria = sFsConfigurationExample.createCriteria();
        criteria.andWorkspaceIdEqualTo(id).andKeyEqualTo(key);
        // 删除跟默认配额相同的数据
        if (quotaSetting.isDefault()) {
            fsConfigurationMapper.deleteByExample(sFsConfigurationExample);
            return;
        }
        quotaSetting.clearUsed();
        List<FsConfiguration> fsConfigurations = fsConfigurationMapper.selectByExampleWithBLOBs(sFsConfigurationExample);
        if (CollectionUtils.isNotEmpty(fsConfigurations)) {
            FsConfiguration fsConfiguration = fsConfigurations.get(0);
            fsConfiguration.setValue(JSONObject.toJSONString(quotaSetting));
            fsConfigurationMapper.updateByPrimaryKeyWithBLOBs(fsConfiguration);
            return;
        }
        FsConfiguration fsConfiguration = new FsConfiguration();
        fsConfiguration.setWorkspaceId(id);
        fsConfiguration.setKey(key);
        fsConfiguration.setValue(JSONObject.toJSONString(quotaSetting));
        fsConfiguration.setLastUpdateBy(SessionUtils.getUser().getId());
        fsConfiguration.setLastUpdateTime(System.currentTimeMillis());
        fsConfigurationMapper.insertSelective(fsConfiguration);
    }

    private void checkQuota(String id, FolderQuotaSetting quotaSetting, String key) {
        String orgId = id;
        FolderQuotaSetting orgQuotaSetting = quotaSetting;
        if (FolderQuotaSetting.WORKSPACE_KEY.equals(key)) {
            Workspace workspace = workspaceMapper.selectByPrimaryKey(id);
            if (workspace != null) {
                orgId = workspace.getOrganizationId();
                orgQuotaSetting = getQuotaUsage(orgId, FolderQuotaSetting.ORG_KEY);
            }
        }
        WorkspaceExample workspaceExample = new WorkspaceExample();
        workspaceExample.createCriteria().andOrganizationIdEqualTo(orgId);
        List<Workspace> workspaces = workspaceMapper.selectByExample(workspaceExample);
        List<String> workspaceIds = workspaces.stream().map(Workspace::getId).collect(Collectors.toList());
        if (workspaceIds.size() == 0) {
            return;
        }
        FolderQuotaSetting sumWorkspaceQuotaSetting = new FolderQuotaSetting();

        for (String workspaceId : workspaceIds) {
            FolderQuotaSetting workspaceQuotaSetting;
            if (FolderQuotaSetting.WORKSPACE_KEY.equals(key) && workspaceId.equals(id)) {
                workspaceQuotaSetting = quotaSetting;
            } else {
                workspaceQuotaSetting = getQuotaUsage(workspaceId, FolderQuotaSetting.WORKSPACE_KEY);
            }
            sumWorkspaceQuotaSetting = sumWorkspaceQuotaSetting.sum(workspaceQuotaSetting);
        }
        boolean exceed = false;
        if((orgQuotaSetting.getFolderCount() < sumWorkspaceQuotaSetting.getFolderCount() || (orgQuotaSetting.getFolderSize() < sumWorkspaceQuotaSetting.getFolderSize()))){
            exceed = true;
        }
        if (exceed) {
            throw new RuntimeException("组织存储桶配额必须大于工作空间存储桶配额总和");
        }
    }

    /**
     * 保存/修改 组织/工作空间默认配额
     * @param quotaSetting
     * @param key
     */
    public void saveDefaultQuota(FolderQuotaSetting quotaSetting, String key) {
        // 获取组织/工作空间默认配额
        checkDefaultQuota(quotaSetting, key);
        FsConfigurationExample sFsConfigurationExample = new FsConfigurationExample();
        FsConfigurationExample.Criteria criteria = sFsConfigurationExample.createCriteria();
        criteria.andKeyEqualTo(key);
        List<FsConfiguration> sFsConfigurations = fsConfigurationMapper.selectByExampleWithBLOBs(sFsConfigurationExample);
        if (CollectionUtils.isNotEmpty(sFsConfigurations)) {
            FsConfiguration FsConfiguration = sFsConfigurations.get(0);
            FsConfiguration.setValue(JSONObject.toJSONString(quotaSetting));
            fsConfigurationMapper.updateByPrimaryKeyWithBLOBs(FsConfiguration);
        } else {
            FsConfiguration fsConfiguration = new FsConfiguration();
            fsConfiguration.setKey(key);
            fsConfiguration.setValue(JSONObject.toJSONString(quotaSetting));
            fsConfiguration.setLastUpdateBy(SessionUtils.getUser().getId());
            fsConfiguration.setLastUpdateTime(System.currentTimeMillis());
            fsConfigurationMapper.insertSelective(fsConfiguration);
        }
    }

    private void checkDefaultQuota(FolderQuotaSetting quotaSetting, String key) {
        FolderQuotaSetting orgDefaultQuota = getDefaultQuota(FolderQuotaSetting.ORG_DEFAULT_KEY);
        FolderQuotaSetting groupDefaultQuota = getDefaultQuota(FolderQuotaSetting.WORKSPACE_DEFAULT_KEY);
    }

    public void validateQuotaFolderCount(String workspaceId, int count) {
        if(StringUtils.isEmpty(workspaceId)){
            return;
        }

        if (!validateAllocateResourceIfExceed4Group(workspaceId)) {
            FolderQuotaSetting groupQuotaSetting = getQuotaUsage(workspaceId, FolderQuotaSetting.WORKSPACE_KEY);
            if (groupQuotaSetting.getFolderCount() < (groupQuotaSetting.getFolderCountUsed() + count)) {
                throw new RuntimeException("文件系统个数超出工作空间配额");
            }
        }

        if (!validateAllocateResourceIfExceed4Org(workspaceId)) {
            Workspace workspace = workspaceMapper.selectByPrimaryKey(workspaceId);
            if (workspace != null) {
                FolderQuotaSetting orgQuotaSetting = getQuotaUsage(workspace.getOrganizationId(), FolderQuotaSetting.ORG_KEY);
                if (orgQuotaSetting.getFolderCount() < (orgQuotaSetting.getFolderCountUsed() + count)) {
                    throw new RuntimeException("文件系统个数超出组织配额");
                }
            }
        }
    }

    public void validateQuotaFolderSize(String workspaceId, Long size) {
        if(StringUtils.isEmpty(workspaceId)){
            return;
        }

        if (!validateAllocateResourceIfExceed4Group(workspaceId)) {
            FolderQuotaSetting groupQuotaSetting = getQuotaUsage(workspaceId, FolderQuotaSetting.WORKSPACE_KEY);
            if (groupQuotaSetting.getFolderSize() < (groupQuotaSetting.getFolderSizeUsed() + size)) {
                throw new RuntimeException("当前工作空间文件系统容量超出工作空间配额");
            }
        }

        if (!validateAllocateResourceIfExceed4Org(workspaceId)) {
            Workspace workspace = workspaceMapper.selectByPrimaryKey(workspaceId);
            if (workspace != null) {
                FolderQuotaSetting orgQuotaSetting = getQuotaUsage(workspace.getOrganizationId(), FolderQuotaSetting.ORG_KEY);
                if (orgQuotaSetting.getFolderSize() < (orgQuotaSetting.getFolderSizeUsed() + size)) {
                    throw new RuntimeException("当前工作空间文件系统容量超出组织配额");
                }
            }
        }
    }

    // 返回true则不需要验证配额
    public boolean validateAllocateResourceIfExceed(String workspaceId) {
        return validateAllocateResourceIfExceed4Group(workspaceId) && validateAllocateResourceIfExceed4Org(workspaceId);
    }

    private boolean validateAllocateResourceIfExceed4Group(String workspaceId) {
        FolderQuotaSetting groupQuotaSetting = getQuotaUsage(workspaceId, FolderQuotaSetting.WORKSPACE_KEY);
        FolderQuotaSetting groupDefaultQuotaSetting = getDefaultQuota(FolderQuotaSetting.WORKSPACE_KEY);

        return (groupQuotaSetting.getFolderAllocateResourceIfExceed() == GeneralConstants.Options.YES ||
                (groupQuotaSetting.getFolderAllocateResourceIfExceed() == GeneralConstants.Options.DEFAULT && !(groupDefaultQuotaSetting.getFolderAllocateResourceIfExceed() == GeneralConstants.Options.NO)));

    }

    private boolean validateAllocateResourceIfExceed4Org(String workspaceId) {
        Workspace workspace = workspaceMapper.selectByPrimaryKey(workspaceId);
        if (workspace != null) {
            FolderQuotaSetting orgQuotaSetting = getQuotaUsage(workspace.getOrganizationId(), FolderQuotaSetting.ORG_KEY);
            FolderQuotaSetting orgDefaultQuotaSetting = getDefaultQuota(FolderQuotaSetting.ORG_KEY);
            return (orgQuotaSetting.getFolderAllocateResourceIfExceed() == GeneralConstants.Options.YES ||
                    (orgQuotaSetting.getFolderAllocateResourceIfExceed() == GeneralConstants.Options.DEFAULT && !(orgDefaultQuotaSetting.getFolderAllocateResourceIfExceed() == GeneralConstants.Options.NO)));
        }
        return false;
    }


    private void getTotalQuotaOfOrg(String id, FolderQuotaSetting quotaSetting) {
        // 当前组织下所有工作空间
        WorkspaceExample workspaceExample = new WorkspaceExample();
        workspaceExample.createCriteria().andOrganizationIdEqualTo(id);
        List<Workspace> workspaces = workspaceMapper.selectByExample(workspaceExample);
        if(CollectionUtils.isEmpty(workspaces)){
            return;
        }
        List<String> workspaceIds = workspaces.stream().map(Workspace::getId).collect(Collectors.toList());
        int count = workspaceIds.size();
        // 获取工作空间的默认配额
        FolderQuotaSetting defaultQuotaSetting = getDefaultQuota(FolderQuotaSetting.WORKSPACE_KEY);
        // 获取当前组织的下采用自定义配额的工作空间
        FsConfigurationExample sfConfigurationExample = new FsConfigurationExample();
        sfConfigurationExample.createCriteria().andKeyEqualTo(FolderQuotaSetting.WORKSPACE_KEY).andWorkspaceIdIn(workspaceIds);
        List<FsConfiguration> vmConfigurations = fsConfigurationMapper.selectByExampleWithBLOBs(sfConfigurationExample);
        LogUtil.info("自定义的工作空间数"+vmConfigurations.size()+"详情："+ JSON.toJSONString(vmConfigurations));
        if(CollectionUtils.isEmpty(vmConfigurations)){
            // 当前组织下的所有工作空间采用的都是默认配额
            quotaSetting.setFolderTotalCount(count * defaultQuotaSetting.getFolderCount());
            quotaSetting.setFolderTotalSize(count * defaultQuotaSetting.getFolderSize());
        }else{
            // 自定义配额的工作空间数
            AtomicInteger size = new AtomicInteger();
            vmConfigurations.forEach(vmConfiguration -> {
                FolderQuotaSetting workspaceCustomSetting = JSONObject.parseObject(vmConfiguration.getValue(), FolderQuotaSetting.class);
                if(! workspaceCustomSetting.isFsDefaultSetting()) {
                    size.getAndIncrement();
                    quotaSetting.setFolderTotalCount(quotaSetting.getFolderTotalCount() + workspaceCustomSetting.getFolderCount());
                    quotaSetting.setFolderTotalSize(quotaSetting.getFolderTotalSize() + workspaceCustomSetting.getFolderSize());
                    LogUtil.info("自定义"+JSON.toJSONString(quotaSetting));
                }
            });
            quotaSetting.setFolderTotalCount(quotaSetting.getFolderTotalCount() + (count-size.get()) * defaultQuotaSetting.getFolderCount());
            quotaSetting.setFolderTotalSize(quotaSetting.getFolderTotalSize() + (count-size.get()) * defaultQuotaSetting.getFolderSize());
        }
    }

    public void releaseWorkspaceQuota(String workspaceId) {
        FsConfigurationExample example = new FsConfigurationExample();
        example.createCriteria().andWorkspaceIdEqualTo(workspaceId).andKeyEqualTo(FolderQuotaSetting.WORKSPACE_KEY);
        fsConfigurationMapper.deleteByExample(example);
    }

    public List<Organization> listAllOrgByPid(QuotaSearchRequest quotaSearchRequest) {
        OrganizationExample organizationExample = new OrganizationExample();
        OrganizationExample.Criteria criteria1 = organizationExample.createCriteria();
        if (StringUtils.isNotBlank(quotaSearchRequest.getWorkspaceId())) {
            criteria1.andParentIdEqualTo(quotaSearchRequest.getWorkspaceId());
        }
        return organizationMapper.selectByExample(organizationExample);
    }
}
