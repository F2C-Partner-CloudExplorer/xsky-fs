package com.fit2cloud.oss.service;

import com.fit2cloud.oss.base.domain.*;
import com.fit2cloud.oss.base.mapper.FsXskyVipMapper;
import com.fit2cloud.oss.dto.OsPage;
import com.fit2cloud.oss.utils.FsClient;
import com.fit2cloud.oss.utils.XskyCommonUtil;
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
public class FsXskyVipService {

    @Resource
    private FsXskyVipMapper fsXskyVipMapper;

    public void syncDfsVipsApi(FsXskyAccount account, FsClient client) {
        Map<Long, FsXskyVip> localVip = getLocalVip(account);
        Map<Long, DfsVIP> xskyClients = getXskyVips(client);
        //若本地VIP id在XSKY不存在,说明要删除
        for(Long localVipId : localVip.keySet()){
            if(!xskyClients.containsKey(localVipId)){
                fsXskyVipMapper.deleteByPrimaryKey(localVip.get(localVipId).getId());
            }
        }
        //若XSKYVIP id在本地不存在,要新增;存在要更新
        for(Long localVipId : xskyClients.keySet()){
            FsXskyVip xskyVip = convert(account.getId(), xskyClients.get(localVipId));

            if(!localVip.containsKey(localVipId)){
                fsXskyVipMapper.insert(xskyVip);
            }else{
                FsXskyVipExample example = new FsXskyVipExample();
                example.createCriteria().andVipIdEqualTo(xskyVip.getVipId());
                fsXskyVipMapper.updateByExampleSelective(xskyVip, example);
            }
        }
    }

    private Map<Long, FsXskyVip> getLocalVip(FsXskyAccount account){
        FsXskyVipExample example = new FsXskyVipExample();
        FsXskyVipExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(account.getId());
        List<FsXskyVip> gateways = fsXskyVipMapper.selectByExample(example);

        Map<Long, FsXskyVip> localVip =new HashMap<>();
        gateways.forEach(vip -> localVip.put(vip.getVipId(), vip));
        return localVip;
    }

    private Map<Long, DfsVIP> getXskyVips(FsClient client){
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<DfsVIP> clients = client.getDfsVIPs(page);

        Map<Long, DfsVIP> xskyVips =new HashMap <>();
        clients.forEach( c -> {
                    xskyVips.put(c.getId(), c);
                }
        );
        return xskyVips;
    }

    private FsXskyVip convert(String accountId, DfsVIP dfsVIP) {
        FsXskyVip xskyVip = new FsXskyVip();
        xskyVip.setAccountId(accountId);
        xskyVip.setVipId(dfsVIP.getId());
        xskyVip.setVip(dfsVIP.getVip());
        xskyVip.setVipMask(dfsVIP.getVipMask());
        Optional.ofNullable(dfsVIP.getPrimaryGateway()).map(DfsGatewayNestview::getId)
                        .ifPresent(xskyVip::setGatewayId);
        Optional.ofNullable(dfsVIP.getDfsGatewayGroup()).map(DfsGatewayGroupNestview::getId)
                .ifPresent(xskyVip::setGatewayGroupId);

        return xskyVip;
    }
}
