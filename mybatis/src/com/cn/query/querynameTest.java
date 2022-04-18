package com.cn.query;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.cn.po.Catas;

public class querynameTest {
	@Test
	public void findCatasByIdTest () throws Exception {
		String resource="mybatis-config.xml";
		InputStream inputStream =
				Resources.getResourceAsStream(resource);
	SqlSessionFactory sqlSessionFactory=
			new SqlSessionFactoryBuilder().build(inputStream);
	SqlSession sqlSession =sqlSessionFactory.openSession();
	List<Catas> catas =sqlSession.selectList("com.cn.mapper.CatasMapper.findcatasname","se");
	for (Catas catas1 : catas){
	System.out.println(catas1);
	}
	sqlSession.close();
	
	}

}
