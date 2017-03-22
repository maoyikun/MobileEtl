package com.ai.channel.sys.etl.dao;

import com.ai.channel.sys.etl.model.ChlQuality;

public interface ChlQualityMapper {
    int insert(ChlQuality record);

    int insertSelective(ChlQuality record);
}