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

public class StudentInfoDAO_select {
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void readMember() throws Exception{
		StudentInfoVO vo = dao.readInfo("202044105");
		System.out.println("==============Test==============");
		System.out.println("Stu id: " + vo.getStu_id());
		System.out.println("Stu name: " + vo.getStu_name());
		System.out.println("Sub no : " + vo.getSub_no());
		System.out.println("Stu addr : " + vo.getStu_addr());
		System.out.println("Stu phone : " + vo.getStu_phone());
		System.out.println("Stu email : " + vo.getStu_email());
		System.out.println("================================");
	}
}
