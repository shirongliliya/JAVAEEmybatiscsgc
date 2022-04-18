package com.cn.query;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.cn.po.Catas;

public class queryidTest {
	@Test
	public void findBookByIdTest () throws Exception {
		String resource="mybatis-config.xml";
		InputStream inputStream =
				Resources.getResourceAsStream(resource);
	SqlSessionFactory sqlSessionFactory=
			new SqlSessionFactoryBuilder().build(inputStream);
	SqlSession sqlSession =sqlSessionFactory.openSession();
	Catas catas =sqlSession.selectOne("com.cn.mapper.CatasMapper.findcatasid",1934150144);
	System.out.println(catas.toString());
	sqlSession.close();
	
	}

}
