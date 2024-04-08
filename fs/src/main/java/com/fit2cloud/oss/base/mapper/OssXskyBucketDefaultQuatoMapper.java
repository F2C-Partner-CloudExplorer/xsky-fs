package com.fit2cloud.oss.base.mapper;

import com.fit2cloud.oss.base.domain.OssXskyBucketDefaultQuato;
import com.fit2cloud.oss.base.domain.OssXskyBucketDefaultQuatoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OssXskyBucketDefaultQuatoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_default_quato
     *
     * @mbg.generated
     */
    long countByExample(OssXskyBucketDefaultQuatoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_default_quato
     *
     * @mbg.generated
     */
    int deleteByExample(OssXskyBucketDefaultQuatoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_default_quato
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_default_quato
     *
     * @mbg.generated
     */
    int insert(OssXskyBucketDefaultQuato record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_default_quato
     *
     * @mbg.generated
     */
    int insertSelective(OssXskyBucketDefaultQuato record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_default_quato
     *
     * @mbg.generated
     */
    List<OssXskyBucketDefaultQuato> selectByExample(OssXskyBucketDefaultQuatoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_default_quato
     *
     * @mbg.generated
     */
    OssXskyBucketDefaultQuato selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_default_quato
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OssXskyBucketDefaultQuato record, @Param("example") OssXskyBucketDefaultQuatoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_default_quato
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OssXskyBucketDefaultQuato record, @Param("example") OssXskyBucketDefaultQuatoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_default_quato
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OssXskyBucketDefaultQuato record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_default_quato
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OssXskyBucketDefaultQuato record);
}