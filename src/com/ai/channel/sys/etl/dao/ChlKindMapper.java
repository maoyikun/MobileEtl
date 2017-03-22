package com.ai.channel.sys.etl.dao;

import com.ai.channel.sys.etl.model.ChlKind;

public interface ChlKindMapper {
    int insert(ChlKind record);

    int insertSelective(ChlKind record);
}