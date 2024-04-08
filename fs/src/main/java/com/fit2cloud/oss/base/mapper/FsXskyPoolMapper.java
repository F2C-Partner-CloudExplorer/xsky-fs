package com.fit2cloud.oss.base.mapper;

import com.fit2cloud.oss.base.domain.FsXskyPool;
import com.fit2cloud.oss.base.domain.FsXskyPoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FsXskyPoolMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_pool
     *
     * @mbg.generated
     */
    long countByExample(FsXskyPoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_pool
     *
     * @mbg.generated
     */
    int deleteByExample(FsXskyPoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_pool
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_pool
     *
     * @mbg.generated
     */
    int insert(FsXskyPool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_pool
     *
     * @mbg.generated
     */
    int insertSelective(FsXskyPool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_pool
     *
     * @mbg.generated
     */
    List<FsXskyPool> selectByExample(FsXskyPoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_pool
     *
     * @mbg.generated
     */
    FsXskyPool selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_pool
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FsXskyPool record, @Param("example") FsXskyPoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_pool
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FsXskyPool record, @Param("example") FsXskyPoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_pool
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FsXskyPool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_pool
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FsXskyPool record);
}