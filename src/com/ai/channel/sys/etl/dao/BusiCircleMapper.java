package com.ai.channel.sys.etl.dao;

import com.ai.channel.sys.etl.model.BusiCircle;

public interface BusiCircleMapper {
    int insert(BusiCircle record);

    int insertSelective(BusiCircle record);
}