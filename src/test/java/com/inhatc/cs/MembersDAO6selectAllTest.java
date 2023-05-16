package com.inhatc.cs;

import java.util.List;

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

public class MembersDAO6selectAllTest {
	@Inject
	private MembersDAO dao;
	
	@Test
	public void readAllMember() throws Exception{
		List<MembersVO> listMembers = dao.listAll();
		
		int cnt = listMembers.size();
		
		System.out.println("-----------Test----------");
		System.out.println("데이터 수: " + cnt);
		System.out.println("-------------------------");
		
		for(int i = 0; i < cnt; i++) {
			System.out.println("Index: " + i);
			System.out.println("userid: " + listMembers.get(i).getUserid());
			System.out.println("username: " + listMembers.get(i).getUsername());
			System.out.println("useremail: " + listMembers.get(i).getEmail());
			System.out.println("-------------------------");
		}
	}
}
