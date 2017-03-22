package com.ai.channel.sys.etl.dao;

import com.ai.channel.sys.etl.model.ChlDevice;

public interface ChlDeviceMapper {
    int insert(ChlDevice record);

    int insertSelective(ChlDevice record);
}