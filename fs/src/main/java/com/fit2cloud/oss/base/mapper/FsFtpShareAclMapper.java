package com.fit2cloud.oss.base.mapper;

import com.fit2cloud.oss.base.domain.FsFtpShareAcl;
import com.fit2cloud.oss.base.domain.FsFtpShareAclExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FsFtpShareAclMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_ftp_share_acl
     *
     * @mbg.generated
     */
    long countByExample(FsFtpShareAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_ftp_share_acl
     *
     * @mbg.generated
     */
    int deleteByExample(FsFtpShareAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_ftp_share_acl
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_ftp_share_acl
     *
     * @mbg.generated
     */
    int insert(FsFtpShareAcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_ftp_share_acl
     *
     * @mbg.generated
     */
    int insertSelective(FsFtpShareAcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_ftp_share_acl
     *
     * @mbg.generated
     */
    List<FsFtpShareAcl> selectByExample(FsFtpShareAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_ftp_share_acl
     *
     * @mbg.generated
     */
    FsFtpShareAcl selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_ftp_share_acl
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FsFtpShareAcl record, @Param("example") FsFtpShareAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_ftp_share_acl
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FsFtpShareAcl record, @Param("example") FsFtpShareAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_ftp_share_acl
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FsFtpShareAcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_ftp_share_acl
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FsFtpShareAcl record);
}