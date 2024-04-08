package com.fit2cloud.oss.service;

import com.fit2cloud.oss.base.domain.FsXskyAccount;
import com.fit2cloud.oss.base.domain.FsXskyGateway;
import com.fit2cloud.oss.base.domain.FsXskyGatewayExample;
import com.fit2cloud.oss.base.mapper.FsXskyGatewayMapper;
import com.fit2cloud.oss.dto.FsXskyGatewayDTO;
import com.fit2cloud.oss.dto.OsPage;
import com.fit2cloud.oss.utils.FsClient;
import com.fit2cloud.oss.utils.XskyCommonUtil;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xio.sds.client.model.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class FsGatewayService {

    private static final String ID_DESC = "id desc";

    @Resource
    private FsXskyGatewayMapper xskyGatewayMapper;

    /**
     * 对象存储用户页面展示
     * @param condition
     * @return
     */
    public List<FsXskyGateway> pagingGateway(FsXskyGatewayDTO condition){
        FsXskyGatewayExample example = new FsXskyGatewayExample();
        FsXskyGatewayExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause(ID_DESC);
        condition = null != condition ? condition : new FsXskyGatewayDTO();

        if (null != condition.getAccountId()) {
            criteria.andAccountIdEqualTo(condition.getAccountId());
        }
        if (StringUtils.isNotBlank(condition.getName())) {
            criteria.andNameLike("%" + condition.getName() + "%");
        }

        Optional.ofNullable(condition.getSort()).map(XskyCommonUtil::humpToLine)
                .ifPresent(example::setOrderByClause);

        return xskyGatewayMapper.selectByExample(example);
    }

    public List<FsXskyGateway> listGatewayByGroupId(String xskyAccountId, Long gatewayGroupId) {
        FsXskyGatewayExample example = new FsXskyGatewayExample();
        example.createCriteria().andGatewayGroupIdEqualTo(gatewayGroupId).andAccountIdEqualTo(xskyAccountId);
        return xskyGatewayMapper.selectByExample(example);
    }

    public void deleteLocalData(String xskyAccountId) {
        FsXskyGatewayExample example = new FsXskyGatewayExample();
        example.createCriteria().andAccountIdEqualTo(xskyAccountId);
        xskyGatewayMapper.deleteByExample(example);
    }

   /* public void syncFsGateway(FsXskyAccount account, FsClient client) {
        Map<Long, FsXskyGateway> localGateway = getLocalGateway(account);
        Map<Long, DfsGatewayRecord> xskyClients = getXskyGateways(client);
        //若本地用户id在XSKY不存在,说明要删除
        for(Long localGatewayId : localGateway.keySet()){
            if(!xskyClients.containsKey(localGatewayId)){
                xskyGatewayMapper.deleteByPrimaryKey(localGateway.get(localGatewayId).getId());
            }
        }
        //若XSKY用户id在本地不存在,要新增;存在要更新
        for(Long xskyGatewayId : xskyClients.keySet()){
            FsXskyGateway xskyGateway = convert(account.getId(), xskyClients.get(xskyGatewayId));

            if(!localGateway.containsKey(xskyGatewayId)){
                xskyGatewayMapper.insert(xskyGateway);
            }else{
                FsXskyGatewayExample example = new FsXskyGatewayExample();
                example.createCriteria().andGatewayIdEqualTo(xskyGateway.getGatewayId());
                xskyGatewayMapper.updateByExampleSelective(xskyGateway, example);
            }
        }
    }*/

   /* private FsXskyGateway convert(String accountId, DfsGatewayRecord fsGateway) {
        FsXskyGateway xskyGateway = new FsXskyGateway();
        xskyGateway.setAccountId(accountId);
        xskyGateway.setName(fsGateway.getNicName());
        xskyGateway.setVip(fsGateway.getVip());
        xskyGateway.setGatewayId(fsGateway.getId());
        xskyGateway.setStatus(fsGateway.getStatus());

        xskyGateway.setUpdateTime(XskyCommonUtil.convertTime2Mills(fsGateway.getUpdate()));
        xskyGateway.setCreateTime(XskyCommonUtil.convertTime2Mills(fsGateway.getCreate()));
        Optional.ofNullable(fsGateway.getFsGatewayGroup()).map(FSGatewayGroupNestview::getVip)
                .ifPresent(xskyGateway::setGatewayGroupVip);
        Optional.ofNullable(fsGateway.getFsGatewayGroup()).map(FSGatewayGroupNestview::getId)
                .ifPresent(xskyGateway::setGatewayGroupId);
        Optional.ofNullable(fsGateway.getNetworkAddress()).map(NetworkAddressNestview::getIp)
                .ifPresent(xskyGateway::setNetworkIp);
        Optional.ofNullable(fsGateway.getHost()).map(HostNestview::getAdminIp)
                .ifPresent(xskyGateway::setHostIp);
        Optional.ofNullable(fsGateway.getHost()).map(HostNestview::getName)
                .ifPresent(xskyGateway::setHostName);

        return xskyGateway;
    }*/

    private Map<Long, FsXskyGateway> getLocalGateway(FsXskyAccount account){
        FsXskyGatewayExample example = new FsXskyGatewayExample();
        FsXskyGatewayExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(account.getId());
        List<FsXskyGateway> gateways = xskyGatewayMapper.selectByExample(example);

        Map<Long, FsXskyGateway> localGateways =new HashMap<>();
        gateways.forEach(gateway -> localGateways.put(gateway.getGatewayId(), gateway));
        return localGateways;
    }

    private Map<Long, DfsGatewayRecord> getXskyGateways(FsClient client){
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<DfsGatewayRecord> clients = client.getGateway(page);

        Map<Long, DfsGatewayRecord> xskyGateways =new HashMap <>();
        clients.forEach( c -> {
            xskyGateways.put(c.getId(), c);
            }
        );
        return xskyGateways;
    }

    public void syncDfsGatewayNetworkAddresses(FsXskyAccount account, FsClient client) {
        Map<Long, FsXskyGateway> localGateway = getLocalGateway(account);
        Map<Long, DfsGatewayNetworkAddressRecord> xskyClients = getXskyGatewayNetworkAddresses(client);
        //若本地用户id在XSKY不存在,说明要删除
        for(Long localGatewayId : localGateway.keySet()){
            if(!xskyClients.containsKey(localGatewayId)){
                xskyGatewayMapper.deleteByPrimaryKey(localGateway.get(localGatewayId).getId());
            }
        }
        //若XSKY用户id在本地不存在,要新增;存在要更新
        for(Long xskyGatewayId : xskyClients.keySet()){
            FsXskyGateway xskyGateway = convert2(account.getId(), xskyClients.get(xskyGatewayId));

            if(!localGateway.containsKey(xskyGatewayId)){
                xskyGatewayMapper.insert(xskyGateway);
            }else{
                FsXskyGatewayExample example = new FsXskyGatewayExample();
                example.createCriteria().andGatewayIdEqualTo(xskyGateway.getGatewayId());
                xskyGatewayMapper.updateByExampleSelective(xskyGateway, example);
            }
        }
    }

    private Map<Long, DfsGatewayNetworkAddressRecord> getXskyGatewayNetworkAddresses(FsClient client){
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<DfsGatewayNetworkAddressRecord> clients = client.GatewayNetworkAddresses(page);

        Map<Long, DfsGatewayNetworkAddressRecord> xskyGateways =new HashMap <>();
        clients.forEach( c -> {
                    xskyGateways.put(c.getId(), c);
                }
        );
        return xskyGateways;
    }

    private FsXskyGateway convert2(String accountId, DfsGatewayNetworkAddressRecord record) {
        FsXskyGateway xskyGateway = new FsXskyGateway();
        xskyGateway.setAccountId(accountId);
//        xskyGateway.setVip(fsGateway.getVip());
        DfsGateway dfsGateway = record.getDfsGateway();
        if (ObjectUtils.isNotEmpty(dfsGateway)){
            xskyGateway.setGatewayId(dfsGateway.getId());
            xskyGateway.setStatus(dfsGateway.getStatus());
            xskyGateway.setUpdateTime(XskyCommonUtil.convertTime2Mills(dfsGateway.getUpdate()));
            xskyGateway.setCreateTime(XskyCommonUtil.convertTime2Mills(dfsGateway.getCreate()));
            Optional.ofNullable(dfsGateway.getDfsGatewayGroup()).map(DfsGatewayGroupNestview::getId)
                    .ifPresent(xskyGateway::setGatewayGroupId);
        }

        Optional.ofNullable(record.getHost()).map(HostNestview::getName)
                .ifPresent(xskyGateway::setName);
        Optional.ofNullable(record.getNetworkAddress()).map(NetworkAddressNestview::getIp)
                .ifPresent(xskyGateway::setNetworkIp);
        Optional.ofNullable(record.getHost()).map(HostNestview::getAdminIp)
                .ifPresent(xskyGateway::setHostIp);
        Optional.ofNullable(record.getHost()).map(HostNestview::getName)
                .ifPresent(xskyGateway::setHostName);

        return xskyGateway;
    }
}
