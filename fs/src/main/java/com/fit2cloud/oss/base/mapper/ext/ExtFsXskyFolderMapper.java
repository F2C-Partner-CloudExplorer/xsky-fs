package com.fit2cloud.oss.base.mapper.ext;


import com.fit2cloud.oss.dto.SharedFileDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExtFsXskyFolderMapper {

    /**
     * 查询FTP共享文件
     */
    List<SharedFileDTO>  selectFtpSharedFileByFolderId(@Param("folderId") Long folderId);

    /**
     * 查询SMB共享文件
     */
    List<SharedFileDTO>  selectSmbSharedFileByFolderId(@Param("folderId") Long folderId);

    /**
     * 查询NFS共享文件
     */
    List<SharedFileDTO>  selectNfsSharedFileByFolderId(@Param("folderId") Long folderId);
}