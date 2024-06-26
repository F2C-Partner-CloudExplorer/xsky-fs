package com.fit2cloud.oss.base.mapper;

import com.fit2cloud.oss.base.domain.ProjectAbbreviationRef;
import com.fit2cloud.oss.base.domain.ProjectAbbreviationRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectAbbreviationRefMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_abbreviation_ref
     *
     * @mbg.generated
     */
    long countByExample(ProjectAbbreviationRefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_abbreviation_ref
     *
     * @mbg.generated
     */
    int deleteByExample(ProjectAbbreviationRefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_abbreviation_ref
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_abbreviation_ref
     *
     * @mbg.generated
     */
    int insert(ProjectAbbreviationRef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_abbreviation_ref
     *
     * @mbg.generated
     */
    int insertSelective(ProjectAbbreviationRef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_abbreviation_ref
     *
     * @mbg.generated
     */
    List<ProjectAbbreviationRef> selectByExample(ProjectAbbreviationRefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_abbreviation_ref
     *
     * @mbg.generated
     */
    ProjectAbbreviationRef selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_abbreviation_ref
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ProjectAbbreviationRef record, @Param("example") ProjectAbbreviationRefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_abbreviation_ref
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ProjectAbbreviationRef record, @Param("example") ProjectAbbreviationRefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_abbreviation_ref
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ProjectAbbreviationRef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_abbreviation_ref
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProjectAbbreviationRef record);
}