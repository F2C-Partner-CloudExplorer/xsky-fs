package com.fit2cloud.oss.base.mapper;

import com.fit2cloud.oss.base.domain.OssXskyBucketQuota;
import com.fit2cloud.oss.base.domain.OssXskyBucketQuotaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OssXskyBucketQuotaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_quota
     *
     * @mbg.generated
     */
    long countByExample(OssXskyBucketQuotaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_quota
     *
     * @mbg.generated
     */
    int deleteByExample(OssXskyBucketQuotaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_quota
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_quota
     *
     * @mbg.generated
     */
    int insert(OssXskyBucketQuota record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_quota
     *
     * @mbg.generated
     */
    int insertSelective(OssXskyBucketQuota record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_quota
     *
     * @mbg.generated
     */
    List<OssXskyBucketQuota> selectByExample(OssXskyBucketQuotaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_quota
     *
     * @mbg.generated
     */
    OssXskyBucketQuota selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_quota
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OssXskyBucketQuota record, @Param("example") OssXskyBucketQuotaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_quota
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OssXskyBucketQuota record, @Param("example") OssXskyBucketQuotaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_quota
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OssXskyBucketQuota record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oss_xsky_bucket_quota
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OssXskyBucketQuota record);
}