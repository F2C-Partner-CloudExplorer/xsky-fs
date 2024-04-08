package com.fit2cloud.oss.service.ext;

import com.fit2cloud.oss.base.domain.FsSmbShare;
import com.fit2cloud.oss.base.domain.FsSmbShareExample;
import com.fit2cloud.oss.base.mapper.FsSmbShareMapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class ExtFsSmbShareService {

    @Resource
    private FsSmbShareMapper fsSmbShareMapper;

    public void removeAclNumByShareId(String accountId, Long shareId){
        FsSmbShareExample example = new FsSmbShareExample();
        FsSmbShareExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(accountId).andShareIdEqualTo(shareId);
        List<FsSmbShare> shares = fsSmbShareMapper.selectByExample(example);

        if (CollectionUtils.isNotEmpty(shares)) {
            FsSmbShare share = shares.get(0);
            if (share.getAclNum() > 0) {
                share.setAclNum(share.getAclNum() - 1);
                fsSmbShareMapper.updateByPrimaryKey(share);
            }
        }
    }
}
