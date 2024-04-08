package com.fit2cloud.oss.base.mapper;

import com.fit2cloud.oss.base.domain.FsSmbShareAcl;
import com.fit2cloud.oss.base.domain.FsSmbShareAclExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FsSmbShareAclMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share_acl
     *
     * @mbg.generated
     */
    long countByExample(FsSmbShareAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share_acl
     *
     * @mbg.generated
     */
    int deleteByExample(FsSmbShareAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share_acl
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share_acl
     *
     * @mbg.generated
     */
    int insert(FsSmbShareAcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share_acl
     *
     * @mbg.generated
     */
    int insertSelective(FsSmbShareAcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share_acl
     *
     * @mbg.generated
     */
    List<FsSmbShareAcl> selectByExample(FsSmbShareAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share_acl
     *
     * @mbg.generated
     */
    FsSmbShareAcl selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share_acl
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FsSmbShareAcl record, @Param("example") FsSmbShareAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share_acl
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FsSmbShareAcl record, @Param("example") FsSmbShareAclExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share_acl
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FsSmbShareAcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share_acl
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FsSmbShareAcl record);
}