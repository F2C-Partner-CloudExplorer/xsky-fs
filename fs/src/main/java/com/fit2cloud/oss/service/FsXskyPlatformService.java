package com.fit2cloud.oss.service;

import com.fit2cloud.commons.utils.UUIDUtil;
import com.fit2cloud.oss.base.domain.FsXskyPlatform;
import com.fit2cloud.oss.base.domain.FsXskyPlatformExample;
import com.fit2cloud.oss.base.mapper.FsXskyPlatformMapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FsXskyPlatformService {

    @Resource
    private FsXskyPlatformMapper fsXskyPlatformMapper;

    public List<FsXskyPlatform> getAll() {
        return fsXskyPlatformMapper.selectByExample(new FsXskyPlatformExample());
    }

    public void createBucketType(FsXskyPlatform fsXskyPlatform) {
        FsXskyPlatformExample ossXskyPlatformExample = new FsXskyPlatformExample();
        ossXskyPlatformExample.createCriteria().andPlatformEqualTo(fsXskyPlatform.getPlatform());
        List<FsXskyPlatform> ossXskyPlatforms = fsXskyPlatformMapper.selectByExample(ossXskyPlatformExample);
        if (CollectionUtils.isEmpty(ossXskyPlatforms)) {
            //添加
            fsXskyPlatform.setId(UUIDUtil.newUUID());
            fsXskyPlatformMapper.insertSelective(fsXskyPlatform);
        } else {
            throw new RuntimeException("当前存储类型已存在，不能重复添加");
        }
    }

    public void updateBucketType(FsXskyPlatform fsXskyPlatform) {
        FsXskyPlatformExample ossXskyPlatformExample = new FsXskyPlatformExample();
        ossXskyPlatformExample.createCriteria().andPlatformEqualTo(fsXskyPlatform.getPlatform());
        List<FsXskyPlatform> fsXskyPlatforms = fsXskyPlatformMapper.selectByExample(ossXskyPlatformExample);
        if (CollectionUtils.isNotEmpty(fsXskyPlatforms)){
            FsXskyPlatform fsXskyPlatform1 = fsXskyPlatforms.get(0);
            if (fsXskyPlatform1.getId().equals(fsXskyPlatform.getId())) {
                fsXskyPlatformMapper.updateByPrimaryKeySelective(fsXskyPlatform1);
            }else{
                throw new RuntimeException("当前存储类型已存在，不能重复添加");
            }
        }
    }

    public void deleteBucketType(String id) {
        fsXskyPlatformMapper.deleteByPrimaryKey(id);
    }
}
