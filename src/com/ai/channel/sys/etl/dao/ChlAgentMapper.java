package com.ai.channel.sys.etl.dao;

import com.ai.channel.sys.etl.model.ChlAgent;

public interface ChlAgentMapper {
    int insert(ChlAgent record);

    int insertSelective(ChlAgent record);
}