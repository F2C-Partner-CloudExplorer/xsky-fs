package com.fit2cloud.oss.service;

import com.fit2cloud.oss.base.domain.ResourcePoolTag;
import com.fit2cloud.oss.base.domain.ResourcePoolTagExample;
import com.fit2cloud.oss.base.mapper.ResourcePoolTagMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ResourcePoolTagService {

    @Resource
    private ResourcePoolTagMapper resourcePoolTagMapper;

    public List<ResourcePoolTag> list() {
        ResourcePoolTagExample example = new ResourcePoolTagExample();
        example.setOrderByClause("_index desc");
        return resourcePoolTagMapper.selectByExample(example);
    }
}
