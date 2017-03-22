package com.ai.channel.sys.etl.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	
	private static final String CONFIGURATION_PATH="com/ai/channel/sys/etl/main/mybatis-config.xml";
	private static final Map<DataSourceEnvironment, SqlSessionFactory> SQLSESSIONFACTORYS =
			new HashMap<DataSourceEnvironment,SqlSessionFactory>();
	public static SqlSessionFactory getSqlSessionFactory(DataSourceEnvironment dsf) throws IOException{
		SqlSessionFactory sqlSessionFactory = SQLSESSIONFACTORYS.get(dsf);
		InputStream iStream = null;
		iStream = Resources.getResourceAsStream(CONFIGURATION_PATH);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(iStream,dsf.name());
		iStream.close();
		return sqlSessionFactory;
				
	}
	
	
	public static enum  DataSourceEnvironment{
		dev_source,
		dev_md;
	}

}
