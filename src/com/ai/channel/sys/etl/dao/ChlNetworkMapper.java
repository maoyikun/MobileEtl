package com.ai.channel.sys.etl.dao;

import com.ai.channel.sys.etl.model.ChlNetwork;

public interface ChlNetworkMapper {
    int insert(ChlNetwork record);

    int insertSelective(ChlNetwork record);
}