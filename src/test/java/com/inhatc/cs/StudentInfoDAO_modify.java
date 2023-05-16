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

public class StudentInfoDAO_modify {
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void modify() throws Exception{
		StudentInfoVO vo = new StudentInfoVO();
		vo.setStu_id("202044105");
		vo.setStu_name("nameuapdate");
		vo.setSub_no(1);
		vo.setStu_addr("addrupdate");
		vo.setStu_phone("phoneupdate");
		vo.setStu_email("mailupdate");
		dao.modify(vo);
	}
}
