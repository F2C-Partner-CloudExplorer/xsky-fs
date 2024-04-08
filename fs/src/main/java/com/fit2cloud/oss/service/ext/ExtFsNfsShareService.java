package com.fit2cloud.oss.service.ext;

import com.fit2cloud.oss.base.domain.FsNfsShare;
import com.fit2cloud.oss.base.domain.FsNfsShareExample;
import com.fit2cloud.oss.base.mapper.FsNfsShareMapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class ExtFsNfsShareService {

    @Resource
    private FsNfsShareMapper fsNfsShareMapper;

    public void removeAclNumByShareId(String accountId, Long shareId){
        FsNfsShareExample example = new FsNfsShareExample();
        FsNfsShareExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(accountId).andShareIdEqualTo(shareId);
        List<FsNfsShare> shares = fsNfsShareMapper.selectByExample(example);

        if (CollectionUtils.isNotEmpty(shares)) {
            FsNfsShare share = shares.get(0);
            if (share.getAclNum() > 0) {
                share.setAclNum(share.getAclNum() - 1);
                fsNfsShareMapper.updateByPrimaryKey(share);
            }
        }
    }
}
