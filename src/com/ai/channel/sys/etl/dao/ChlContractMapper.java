package com.ai.channel.sys.etl.dao;

import com.ai.channel.sys.etl.model.ChlContract;

public interface ChlContractMapper {
    int insert(ChlContract record);

    int insertSelective(ChlContract record);
}