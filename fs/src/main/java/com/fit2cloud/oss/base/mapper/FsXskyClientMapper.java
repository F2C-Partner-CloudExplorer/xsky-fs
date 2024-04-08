package com.fit2cloud.oss.base.mapper;

import com.fit2cloud.oss.base.domain.FsXskyClient;
import com.fit2cloud.oss.base.domain.FsXskyClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FsXskyClientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_client
     *
     * @mbg.generated
     */
    long countByExample(FsXskyClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_client
     *
     * @mbg.generated
     */
    int deleteByExample(FsXskyClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_client
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_client
     *
     * @mbg.generated
     */
    int insert(FsXskyClient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_client
     *
     * @mbg.generated
     */
    int insertSelective(FsXskyClient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_client
     *
     * @mbg.generated
     */
    List<FsXskyClient> selectByExampleWithBLOBs(FsXskyClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_client
     *
     * @mbg.generated
     */
    List<FsXskyClient> selectByExample(FsXskyClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_client
     *
     * @mbg.generated
     */
    FsXskyClient selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_client
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FsXskyClient record, @Param("example") FsXskyClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_client
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") FsXskyClient record, @Param("example") FsXskyClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_client
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FsXskyClient record, @Param("example") FsXskyClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_client
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FsXskyClient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_client
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(FsXskyClient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fs_xsky_client
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FsXskyClient record);
}