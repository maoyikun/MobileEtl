package com.ai.channel.sys.etl.dao;

import com.ai.channel.sys.etl.model.ChlShop;

public interface ChlShopMapper {
    int insert(ChlShop record);

    int insertSelective(ChlShop record);
}