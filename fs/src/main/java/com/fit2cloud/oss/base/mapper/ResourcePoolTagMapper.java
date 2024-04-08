package com.fit2cloud.oss.base.mapper;

import com.fit2cloud.oss.base.domain.ResourcePoolTag;
import com.fit2cloud.oss.base.domain.ResourcePoolTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResourcePoolTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vm_resource_pool_tag
     *
     * @mbg.generated
     */
    long countByExample(ResourcePoolTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vm_resource_pool_tag
     *
     * @mbg.generated
     */
    int deleteByExample(ResourcePoolTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vm_resource_pool_tag
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vm_resource_pool_tag
     *
     * @mbg.generated
     */
    int insert(ResourcePoolTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vm_resource_pool_tag
     *
     * @mbg.generated
     */
    int insertSelective(ResourcePoolTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vm_resource_pool_tag
     *
     * @mbg.generated
     */
    List<ResourcePoolTag> selectByExample(ResourcePoolTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vm_resource_pool_tag
     *
     * @mbg.generated
     */
    ResourcePoolTag selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vm_resource_pool_tag
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ResourcePoolTag record, @Param("example") ResourcePoolTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vm_resource_pool_tag
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ResourcePoolTag record, @Param("example") ResourcePoolTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vm_resource_pool_tag
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ResourcePoolTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vm_resource_pool_tag
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ResourcePoolTag record);
}