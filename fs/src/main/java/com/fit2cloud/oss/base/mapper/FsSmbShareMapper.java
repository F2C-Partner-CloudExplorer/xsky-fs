package com.fit2cloud.oss.base.mapper;

import com.fit2cloud.oss.base.domain.FsSmbShare;
import com.fit2cloud.oss.base.domain.FsSmbShareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FsSmbShareMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share
     *
     * @mbg.generated
     */
    long countByExample(FsSmbShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share
     *
     * @mbg.generated
     */
    int deleteByExample(FsSmbShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share
     *
     * @mbg.generated
     */
    int insert(FsSmbShare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share
     *
     * @mbg.generated
     */
    int insertSelective(FsSmbShare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share
     *
     * @mbg.generated
     */
    List<FsSmbShare> selectByExample(FsSmbShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share
     *
     * @mbg.generated
     */
    FsSmbShare selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FsSmbShare record, @Param("example") FsSmbShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FsSmbShare record, @Param("example") FsSmbShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FsSmbShare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_smb_share
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FsSmbShare record);
}