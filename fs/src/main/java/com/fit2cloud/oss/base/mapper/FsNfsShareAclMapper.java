package com.fit2cloud.oss.base.mapper;

import com.fit2cloud.oss.base.domain.FsNfsShareAcl;
import com.fit2cloud.oss.base.domain.FsNfsShareAclExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FsNfsShareAclMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_nfs_share_acl
     *
     * @mbg.generated
     */
    long countByExample(FsNfsShareAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_nfs_share_acl
     *
     * @mbg.generated
     */
    int deleteByExample(FsNfsShareAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_nfs_share_acl
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_nfs_share_acl
     *
     * @mbg.generated
     */
    int insert(FsNfsShareAcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_nfs_share_acl
     *
     * @mbg.generated
     */
    int insertSelective(FsNfsShareAcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_nfs_share_acl
     *
     * @mbg.generated
     */
    List<FsNfsShareAcl> selectByExample(FsNfsShareAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_nfs_share_acl
     *
     * @mbg.generated
     */
    FsNfsShareAcl selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_nfs_share_acl
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FsNfsShareAcl record, @Param("example") FsNfsShareAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_nfs_share_acl
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FsNfsShareAcl record, @Param("example") FsNfsShareAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_nfs_share_acl
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FsNfsShareAcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_nfs_share_acl
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FsNfsShareAcl record);
}