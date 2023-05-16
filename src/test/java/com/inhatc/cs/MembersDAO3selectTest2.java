package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.MembersVO;
import com.inhatc.persistence.MembersDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class MembersDAO3selectTest2 {
	@Inject
	private MembersDAO dao;
	
	@Test
	public void readMember() throws Exception{
		MembersVO vo = dao.readWithPW("id1", "pw1");
		System.out.println("==============Test==============");
		System.out.println("User Name: " + vo.getUsername());
		System.out.println("User Email: " + vo.getEmail());
		System.out.println("================================");
	}
}
