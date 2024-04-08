package com.fit2cloud.oss.service;

import com.fit2cloud.commons.server.base.domain.SystemParameter;
import com.fit2cloud.commons.server.base.domain.SystemParameterExample;
import com.fit2cloud.commons.server.base.mapper.SystemParameterMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SystemParameterService {

    @Resource
    private SystemParameterMapper systemParameterMapper;

    public String selectParameterByKey(String key) {
        SystemParameterExample example = new SystemParameterExample();
        example.createCriteria().andParamKeyEqualTo(key);
        List<SystemParameter> systemParameters = systemParameterMapper.selectByExample(example);
        if (systemParameters.size() > 0) {
            return systemParameters.get(0).getParamValue();
        }
        return null;
    }

}