package com.fit2cloud.oss.service;

import com.fit2cloud.oss.base.domain.FsXskyAccount;
import com.fit2cloud.oss.base.domain.FsXskyPool;
import com.fit2cloud.oss.base.domain.FsXskyPoolExample;
import com.fit2cloud.oss.base.mapper.FsXskyPoolMapper;
import com.fit2cloud.oss.dto.OsPage;
import com.fit2cloud.oss.utils.FsClient;
import com.fit2cloud.oss.utils.XskyCommonUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xio.sds.client.model.PoolRecord;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class FsPoolService {

    @Resource
    private FsXskyPoolMapper xskyPoolMapper;

    public List<FsXskyPool> listPoolByAccountId(String xskyAccountId) {
        FsXskyPoolExample example = new FsXskyPoolExample();
        example.createCriteria().andAccountIdEqualTo(xskyAccountId);
        return xskyPoolMapper.selectByExample(example);
    }

    public void deleteLocalData(String xskyAccountId) {
        FsXskyPoolExample example = new FsXskyPoolExample();
        example.createCriteria().andAccountIdEqualTo(xskyAccountId);
        xskyPoolMapper.deleteByExample(example);
    }

    public void syncFsPool(FsXskyAccount account, FsClient client) {
        Map<Long, FsXskyPool> localPool = getLocalPool(account);
        Map<Long, PoolRecord> xskyPools = getXskyPools(client);
        //若本地用户id在XSKY不存在,说明要删除
        for(Long localPoolId : localPool.keySet()){
            if(!xskyPools.containsKey(localPoolId)){
                xskyPoolMapper.deleteByPrimaryKey(localPool.get(localPoolId).getId());
            }
        }
        //若XSKY用户id在本地不存在,要新增;存在要更新
        for(Long xskyPoolId : xskyPools.keySet()){
            FsXskyPool xskyPool = convert(account.getId(), xskyPools.get(xskyPoolId));

            if(!localPool.containsKey(xskyPoolId)){
                xskyPoolMapper.insert(xskyPool);
            }else{
                FsXskyPoolExample example = new FsXskyPoolExample();
                example.createCriteria().andPoolIdEqualTo(xskyPool.getPoolId());
                xskyPoolMapper.updateByExampleSelective(xskyPool, example);
            }
        }
    }

    private FsXskyPool convert(String accountId, PoolRecord fsPool) {
        FsXskyPool xskyPool = new FsXskyPool();
        xskyPool.setAccountId(accountId);
        xskyPool.setName(fsPool.getName());
        xskyPool.setPoolId(fsPool.getId());
        xskyPool.setStatus(fsPool.getStatus());

        xskyPool.setUpdateTime(XskyCommonUtil.convertTime2Mills(fsPool.getUpdate()));
        xskyPool.setCreateTime(XskyCommonUtil.convertTime2Mills(fsPool.getCreate()));
        return xskyPool;
    }

    private Map<Long, FsXskyPool> getLocalPool(FsXskyAccount account){
        FsXskyPoolExample example = new FsXskyPoolExample();
        FsXskyPoolExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(account.getId());
        List<FsXskyPool> pools = xskyPoolMapper.selectByExample(example);

        Map<Long, FsXskyPool> localPools =new HashMap<>();
        pools.forEach(pool -> localPools.put(pool.getPoolId(), pool));
        return localPools;
    }

    private Map<Long, PoolRecord> getXskyPools(FsClient client){
        OsPage page = new OsPage();
        page.setLimit(OsPage.NO_LIMIT);
        List<PoolRecord> pools = client.getStoragePool(page);

        Map<Long, PoolRecord> xskyPools =new HashMap <>();
        pools.forEach( c -> {
            xskyPools.put(c.getId(), c);
            }
        );
        return xskyPools;
    }

}
