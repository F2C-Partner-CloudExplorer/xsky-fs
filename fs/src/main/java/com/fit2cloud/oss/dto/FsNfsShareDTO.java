package com.fit2cloud.oss.dto;

import com.fit2cloud.oss.base.domain.FsNfsShare;
import lombok.Data;

import java.util.List;

@Data
public class FsNfsShareDTO extends FsNfsShare {
    private String sort;
    private List<Long> visitIdList;
    private List<Long> visitGroupIdList;
    private String visitGroupNames;
    private String visitNames;
    private List<String> sharedAddress;
    private String permission;
    private String clients;
}