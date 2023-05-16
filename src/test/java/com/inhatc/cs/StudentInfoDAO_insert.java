package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.StudentInfoVO;
import com.inhatc.persistence.StudentInfoDAO;



@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class StudentInfoDAO_insert {
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void testInsertMembers() throws Exception{
		System.out.println("---------------- Insert ---------------");
		StudentInfoVO vo = new StudentInfoVO();
		vo.setStu_id("1233412345");
		vo.setStu_name("이겹살");
		vo.setSub_no(77);
		vo.setStu_addr("인천광역시 미추홀구 용현동");
		vo.setStu_phone("010-1234-1234");
		vo.setStu_email("sangmin5848@naver.com");
		dao.insertInfo(vo);
		System.out.println("---------------------------------------");
	}
}
