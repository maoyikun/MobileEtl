package com.ai.channel.sys.etl.dao;

import java.util.List;
import java.util.Map;

import com.ai.channel.sys.etl.model.ChlBase;

public interface ChlBaseMapper {
    int insert(ChlBase record);

    int insertSelective(ChlBase record);
    
    List<ChlBase> selectByCondition(Map paramap1);
    
    
}