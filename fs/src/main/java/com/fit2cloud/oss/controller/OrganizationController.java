package com.fit2cloud.oss.controller;

import com.fit2cloud.commons.server.base.domain.Organization;
import com.fit2cloud.commons.server.base.domain.OrganizationExample;
import com.fit2cloud.commons.server.base.mapper.OrganizationMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/organization")
@RestController
public class OrganizationController {
    @Resource
    private OrganizationMapper organizationMapper;

    @GetMapping(value = "listAll")
    public List<Organization> workspaces() {
        return organizationMapper.selectByExample(new OrganizationExample());
    }
}
