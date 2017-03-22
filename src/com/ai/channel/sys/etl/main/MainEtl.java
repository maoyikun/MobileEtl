package com.ai.channel.sys.etl.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.impl.Log4jLoggerFactory;

import com.ai.channel.sys.etl.dao.ChlBaseMapper;
import com.ai.channel.sys.etl.main.MybatisUtil.DataSourceEnvironment;
import com.ai.channel.sys.etl.model.ChlBase;

public class MainEtl {

	
	
	static SqlSessionFactory ssfSource = null;
	static SqlSessionFactory ssfmd = null;
	static{
		try {
			ssfSource=MybatisUtil.getSqlSessionFactory(DataSourceEnvironment.dev_source);
			ssfmd = MybatisUtil.getSqlSessionFactory(DataSourceEnvironment.dev_md);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	public static void main(String[] args) {
		getChlBase();

	}
	
	public static void getChlBase(){
		SqlSession sqlSession = ssfSource.openSession();
		try {
			ChlBaseMapper cbm = sqlSession.getMapper(ChlBaseMapper.class);
			HashMap<String, Object> hashParam = new HashMap<String, Object>();
//			hashParam.put("chl_id", Long.valueOf(1L));
//			hashParam.put("chl_state", Integer.valueOf(1));
			hashParam.put("chl_id", 1);
			hashParam.put("chl_state", 1);
			ArrayList<ChlBase> chlBaseList = (ArrayList<ChlBase>) cbm.selectByCondition(hashParam);
			Iterator<ChlBase> chlBaseIterator = chlBaseList.iterator();
			while (chlBaseIterator.hasNext()) {
				ChlBase cb1 = chlBaseIterator.next();
				System.out.println(cb1.getChannelManagerName()+"  "+cb1.getChannelAddress());
				
			}
			
		} finally {
			// TODO: handle finally clause
			sqlSession.close();
		}
	}

}
