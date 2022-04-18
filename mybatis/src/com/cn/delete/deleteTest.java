package com.cn.delete;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.cn.po.Catas;

public class deleteTest {
	@Test
	public void findBookByIdTest () throws Exception {
		String resource="mybatis-config.xml";
		InputStream inputStream =
				Resources.getResourceAsStream(resource);
	SqlSessionFactory sqlSessionFactory=
			new SqlSessionFactoryBuilder().build(inputStream);
	SqlSession sqlSession =sqlSessionFactory.openSession();
	int rows =sqlSession.update("com.cn.mapper.CatasMapper.deletecatas",1934150144);
	if(rows > 0){
		
		System.out.println("yes"+rows+"data");
	}else{
		System.out.println("no !");
	}
	sqlSession.commit();
	sqlSession.close();
	}

}
