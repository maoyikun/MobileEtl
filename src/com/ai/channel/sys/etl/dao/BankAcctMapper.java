package com.ai.channel.sys.etl.dao;

import com.ai.channel.sys.etl.model.BankAcct;

public interface BankAcctMapper {
    int insert(BankAcct record);

    int insertSelective(BankAcct record);
}