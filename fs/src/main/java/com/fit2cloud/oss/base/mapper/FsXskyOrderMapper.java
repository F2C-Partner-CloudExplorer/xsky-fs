package com.fit2cloud.oss.base.mapper;

import com.fit2cloud.oss.base.domain.FsXskyOrder;
import com.fit2cloud.oss.base.domain.FsXskyOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FsXskyOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_order
     *
     * @mbg.generated
     */
    long countByExample(FsXskyOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_order
     *
     * @mbg.generated
     */
    int deleteByExample(FsXskyOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_order
     *
     * @mbg.generated
     */
    int insert(FsXskyOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_order
     *
     * @mbg.generated
     */
    int insertSelective(FsXskyOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_order
     *
     * @mbg.generated
     */
    List<FsXskyOrder> selectByExample(FsXskyOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_order
     *
     * @mbg.generated
     */
    FsXskyOrder selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_order
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FsXskyOrder record, @Param("example") FsXskyOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_order
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FsXskyOrder record, @Param("example") FsXskyOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FsXskyOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FsXskyOrder record);
}