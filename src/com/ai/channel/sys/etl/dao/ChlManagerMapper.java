package com.ai.channel.sys.etl.dao;

import com.ai.channel.sys.etl.model.ChlManager;

public interface ChlManagerMapper {
    int insert(ChlManager record);

    int insertSelective(ChlManager record);
}