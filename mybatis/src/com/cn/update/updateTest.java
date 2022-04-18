package com.cn.update;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.cn.po.Catas;

public class updateTest {
	@Test
	public void findBookByIdTest () throws Exception {
		String resource="mybatis-config.xml";
		InputStream inputStream =
				Resources.getResourceAsStream(resource);
	SqlSessionFactory sqlSessionFactory=
			new SqlSessionFactoryBuilder().build(inputStream);
	SqlSession sqlSession =sqlSessionFactory.openSession();
	Catas catas =new Catas();
	catas.setCata_id(1934150144);
    catas.setCata_name("rose9");
	catas.setCata_des("plant9");
	catas.setCata_des("12");
	catas.setCata_price(35.0);
	catas.setCata_publish("beijingyoudain");
	
	int rows =sqlSession.update("com.cn.mapper.CatasMapper.updatecatas",catas);
	if(rows > 0){
		
		System.out.println("yes"+rows+"data");
	}else{
		System.out.println("no !");
	}
	sqlSession.commit();
	sqlSession.close();
	}
}
