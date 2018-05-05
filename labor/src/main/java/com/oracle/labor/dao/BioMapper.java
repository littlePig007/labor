package com.oracle.labor.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.oracle.labor.po.Bio;
import com.oracle.labor.po.BioExample;

public interface BioMapper {
    long countByExample(BioExample example);

    int deleteByExample(BioExample example);

    int deleteByPrimaryKey(Integer bioId);

    int insert(Bio record);

    int insertSelective(Bio record);

    List<Bio> selectByExample(BioExample example);

    Bio selectByPrimaryKey(Integer bioId);
    
    Map<String,Object> selectByBioNo(String BioNo);

    int updateByExampleSelective(@Param("record") Bio record, @Param("example") BioExample example);

    int updateByExample(@Param("record") Bio record, @Param("example") BioExample example);

    int updateByPrimaryKeySelective(Bio record);

    int updateByPrimaryKey(Bio record);
    
    
}