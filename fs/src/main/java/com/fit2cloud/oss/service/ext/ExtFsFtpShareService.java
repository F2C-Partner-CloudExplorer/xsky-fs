package com.fit2cloud.oss.service.ext;

import com.fit2cloud.oss.base.domain.FsFtpShare;
import com.fit2cloud.oss.base.domain.FsFtpShareExample;
import com.fit2cloud.oss.base.mapper.FsFtpShareMapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class ExtFsFtpShareService {

    @Resource
    private FsFtpShareMapper fsFtpShareMapper;

    public void removeAclNumByShareId(String accountId, Long shareId){
        FsFtpShareExample example = new FsFtpShareExample();
        FsFtpShareExample.Criteria criteria = example.createCriteria();
        criteria.andAccountIdEqualTo(accountId).andShareIdEqualTo(shareId);
        List<FsFtpShare> shares = fsFtpShareMapper.selectByExample(example);

        if (CollectionUtils.isNotEmpty(shares)) {
            FsFtpShare share = shares.get(0);
            if (share.getAclNum() > 0) {
                share.setAclNum(share.getAclNum() - 1);
                fsFtpShareMapper.updateByPrimaryKey(share);
            }
        }
    }
}
