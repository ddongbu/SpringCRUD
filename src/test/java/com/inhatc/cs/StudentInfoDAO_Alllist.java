package com.inhatc.cs;

import java.util.List;

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

public class StudentInfoDAO_Alllist {
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void readAllMember() throws Exception{
		List<StudentInfoVO> listMembers = dao.listAll();
		
		int cnt = listMembers.size();
		
		System.out.println("-----------Test----------");
		System.out.println("데이터 수: " + cnt);
		System.out.println("-------------------------");
		
		for(int i = 0; i < cnt; i++) {
			System.out.println("Index: " + i);
			System.out.println("stuid: " + listMembers.get(i).getStu_id());
			System.out.println("stuname: " + listMembers.get(i).getStu_name());
			System.out.println("stusub: " + listMembers.get(i).getSub_no());
			System.out.println("stuaddr: " + listMembers.get(i).getStu_addr());
			System.out.println("stuphone: " + listMembers.get(i).getStu_phone());
			System.out.println("stuemail: " + listMembers.get(i).getStu_email());
			System.out.println("-------------------------");
		}
	}
}
