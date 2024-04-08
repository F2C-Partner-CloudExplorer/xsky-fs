package com.fit2cloud.oss.service;

import com.alibaba.fastjson.JSONObject;
import com.fit2cloud.commons.server.exception.F2CException;
import com.fit2cloud.oss.base.domain.FsXskyAccount;
import com.fit2cloud.oss.base.domain.FsXskyGatewayGroup;
import com.fit2cloud.oss.base.domain.FsXskyGatewayGroupExample;
import com.fit2cloud.oss.base.mapper.FsXskyGatewayGroupMapper;
import com.fit2cloud.oss.dto.FsXskyGatewayGroupDTO;
import com.fit2cloud.oss.dto.OsPage;
import com.fit2cloud.oss.utils.FsClient;
import com.fit2cloud.oss.utils.XskyCommonUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xio.sds.client.model.DfsGatewayGroup;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class FsGatewayGroupService {

    private static final String ID_DESC = "id desc";

    @Resource
    private FsXskyGatewayGroupMapper xskyGatewayGroupMapper;

    /**
     * 对象存储用户页面展示
     * @param condition
     * @return
     */
    public List<FsXskyGatewayGroup> pagingGatewayGroup(FsXskyGatewayGroupDTO condition){
        FsXskyGatewayGroupExample example = new FsXskyGatewayGroupExample();
        FsXskyGatewayGroupExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);
        condition = null != condition ? condition : new FsXskyGatewayGroupDTO();

        if (null != condition.getAccountId()) {
            criteria.andAccountIdEqualTo(condition.getAccountId());
        }
        if (StringUtils.isNotBlank(condition.getName())) {
            criteria.andNameLike("%" + condition.getName() + "%");
        }

        Optional.ofNullable(condition.getVip()).map(ip -> "%" + ip + "%").ifPresent(criteria::andVipLike);

        Optional.ofNullable(condition.getSort()).map(XskyCommonUtil::humpToLine)
                .ifPresent(example::setOrderByClause);

        return xskyGatewayGroupMapper.selectByExample(example);
    }

    public List<FsXskyGatewayGroup> listFsGatewayGroupByAccount(String accountId, String type){
        FsXskyGatewayGroupExample example = new FsXskyGatewayGroupExample();
        FsXskyGatewayGroupExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);

        criteria.andAccountIdEqualTo(accountId);
        criteria.andTypesLike("%" + type + "%");
        return xskyGatewayGroupMapper.selectByExample(example);
    }

    public FsXskyGatewayGroup getFsGatewayGroupByName(String accountId, String name, Long id){
        FsXskyGatewayGroupExample example = new FsXskyGatewayGroupExample();
        FsXskyGatewayGroupExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);

        criteria.andAccountIdEqualTo(accountId).andNameEqualTo(name).andGatewayGroupIdEqualTo(id);
        List<FsXskyGatewayGroup> gatewayGroupList = xskyGatewayGroupMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(gatewayGroupList)) {
            return gatewayGroupList.get(0);
        }
        return null;
    }

    public void syncGatewayGroup(FsXskyAccount account, FsClient client) {
        Map<Long, FsXskyGatewayGroup> localGateway = getLocalGatewayGroup(account);
        Map<Long, DfsGatewayGroup> xskyClients = getXskyGatewayGroups(client);
        //若本地用户id在XSKY不存在,说明要删除
        for(Long localGatewayId : localGateway.keySet()){
            if(!xskyClients.containsKey(localGatewayId)){
                xskyGatewayGroupMapper.deleteByPrimaryKey(localGateway.get(localGatewayId).getId());
            }
        }
        //若XSKY用户id在本地不存在,要新增;存在要更新
        for(Long xskyGatewayId : xskyClients.keySet()){
            FsXskyGatewayGroup xskyGateway = convert(account.getId(), xskyClients.get(xskyGatewayId));

            if(!localGateway.containsKey(xskyGatewayId)){
                xskyGatewayGroupMapper.insert(xskyGateway);
            }else{
                FsXskyGatewayGroupExample example = new FsXskyGatewayGroupExample();
                example.createCriteria().andGatewayGroupIdEqualTo(xskyGateway.getGatewayGroupId());
                xskyGatewayGroupMapper.updateByExampleSelective(xskyGateway, example);
            }
        }
    }

    private FsXskyGatewayGroup convert(String accountId, DfsGatewayGroup fsGatewayGroup) {
        FsXskyGatewayGroup xskyGatewayGroup = new FsXskyGatewayGroup();
        xskyGatewayGroup.setAccountId(accountId);
        xskyGatewayGroup.setName(fsGatewayGroup.getName());
       // xskyGatewayGroup.setVip(fsGatewayGroup.getVip());
        xskyGatewayGroup.setPort(fsGatewayGroup.getPort());
        xskyGatewayGroup.setEncoding(fsGatewayGroup.getEncoding());

        xskyGatewayGroup.setGatewayGroupId(fsGatewayGroup.getId());
        //xskyGatewayGroup.setAccessGroupNum(fsGatewayGroup.getAccessGroupNum());
        xskyGatewayGroup.setActionStatus(fsGatewayGroup.getActionStatus());
        xskyGatewayGroup.setDescription(fsGatewayGroup.getDescription());
      //  xskyGatewayGroup.setSecurity(fsGatewayGroup.getSecurity());

        xskyGatewayGroup.setStatus(fsGatewayGroup.getStatus());
      //  xskyGatewayGroup.setVipMask(fsGatewayGroup.getVipMask());

        xskyGatewayGroup.setTypes(JSONObject.toJSONString(fsGatewayGroup.getTypes()));
        xskyGatewayGroup.setUpdateTime(XskyCommonUtil.convertTime2Mills(fsGatewayGroup.getUpdate()));
        xskyGatewayGroup.setCreateTime(XskyCommonUtil.convertTime2Mills(fsGatewayGroup.getCreate()));

        return xskyGatewayGroup;
    }

    private Map<Long, FsXskyGatewayGroup> getLocalGatewayGroup(FsXskyAccount account){
        FsXskyGatewayGroupExample example = new FsXskyGatewayGroupExample();
        FsXskyGatewayGroupExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(account.getId());
        List<FsXskyGatewayGroup> gatewayGroups = xskyGatewayGroupMapper.selectByExample(example);

        Map<Long, FsXskyGatewayGroup> localGatewayGroups =new HashMap<>();
        gatewayGroups.forEach(gateway -> localGatewayGroups.put(gateway.getGatewayGroupId(), gateway));
        return localGatewayGroups;
    }

    public void deleteLocalData(String xskyAccountId) {
        FsXskyGatewayGroupExample example = new FsXskyGatewayGroupExample();
        example.createCriteria().andAccountIdEqualTo(xskyAccountId);
        xskyGatewayGroupMapper.deleteByExample(example);
    }

    private Map<Long, DfsGatewayGroup> getXskyGatewayGroups(FsClient client){
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<DfsGatewayGroup> clientGroups = client.getGatewayGroup(page);

        Map<Long, DfsGatewayGroup> xskyGatewayGroups =new HashMap <>();
        clientGroups.forEach( c -> {
            xskyGatewayGroups.put(c.getId(), c);
            }
        );
        return xskyGatewayGroups;
    }

    /**
     * 根据文件网关组 gateway_group_id 查询网关
     */
    public FsXskyGatewayGroup getFSGatewayGroupByGatewayGroupId(Long gatewayGroupId){
        if (gatewayGroupId == null){
            F2CException.throwException("gatewayGroupId is null");
        }
        FsXskyGatewayGroupExample example = new FsXskyGatewayGroupExample();
        example.createCriteria().andGatewayGroupIdEqualTo(gatewayGroupId);
        List<FsXskyGatewayGroup> fsXskyGatewayGroups = xskyGatewayGroupMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(fsXskyGatewayGroups)){
            return fsXskyGatewayGroups.get(0);
        }
        return new FsXskyGatewayGroup();
    }

    public void syncDfsGatewayGroupsApi(FsXskyAccount account, FsClient client) {
        Map<Long, FsXskyGatewayGroup> localGateway = getLocalGatewayGroup(account);
        Map<Long, DfsGatewayGroup> xskyClients = getXskyDfsGatewayGroups(client);
        //若本地用户id在XSKY不存在,说明要删除
        for(Long localGatewayId : localGateway.keySet()){
            if(!xskyClients.containsKey(localGatewayId)){
                xskyGatewayGroupMapper.deleteByPrimaryKey(localGateway.get(localGatewayId).getId());
            }
        }
        //若XSKY用户id在本地不存在,要新增;存在要更新
        for(Long xskyGatewayId : xskyClients.keySet()){
            FsXskyGatewayGroup xskyGateway = convert2(account.getId(), xskyClients.get(xskyGatewayId));

            if(!localGateway.containsKey(xskyGatewayId)){
                xskyGatewayGroupMapper.insert(xskyGateway);
            }else{
                FsXskyGatewayGroupExample example = new FsXskyGatewayGroupExample();
                example.createCriteria().andGatewayGroupIdEqualTo(xskyGateway.getGatewayGroupId());
                xskyGatewayGroupMapper.updateByExampleSelective(xskyGateway, example);
            }
        }
    }

    private Map<Long, DfsGatewayGroup> getXskyDfsGatewayGroups(FsClient client) {
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<DfsGatewayGroup> clientGroups = client.getDfsGatewayGroups(page);

        Map<Long, DfsGatewayGroup> xskyGatewayGroups =new HashMap <>();
        clientGroups.forEach( c -> {
                    xskyGatewayGroups.put(c.getId(), c);
                }
        );
        return xskyGatewayGroups;
    }

    private FsXskyGatewayGroup convert2(String accountId, DfsGatewayGroup dfsGatewayGroup) {
        FsXskyGatewayGroup xskyGatewayGroup = new FsXskyGatewayGroup();
        xskyGatewayGroup.setAccountId(accountId);
        xskyGatewayGroup.setName(dfsGatewayGroup.getName());
        //查询虚拟ip表掩码

//        xskyGatewayGroup.setVip(fsGatewayGroup.getVip());
//        xskyGatewayGroup.setVipMask(dfsGatewayGroup.getVipMask());
        xskyGatewayGroup.setPort(dfsGatewayGroup.getPort());
        xskyGatewayGroup.setEncoding(dfsGatewayGroup.getEncoding());

        xskyGatewayGroup.setGatewayGroupId(dfsGatewayGroup.getId());
        xskyGatewayGroup.setActionStatus(dfsGatewayGroup.getActionStatus());
        xskyGatewayGroup.setDescription(dfsGatewayGroup.getDescription());
//        xskyGatewayGroup.setSecurity(dfsGatewayGroup.getSecurity());

        xskyGatewayGroup.setStatus(dfsGatewayGroup.getStatus());

        xskyGatewayGroup.setTypes(JSONObject.toJSONString(dfsGatewayGroup.getTypes()));
        xskyGatewayGroup.setUpdateTime(XskyCommonUtil.convertTime2Mills(dfsGatewayGroup.getUpdate()));
        xskyGatewayGroup.setCreateTime(XskyCommonUtil.convertTime2Mills(dfsGatewayGroup.getCreate()));

        return xskyGatewayGroup;
    }
}
