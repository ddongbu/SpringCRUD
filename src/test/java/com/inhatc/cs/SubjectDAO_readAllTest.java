package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.SubjectVO;
import com.inhatc.persistence.SubjectDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class SubjectDAO_readAllTest {
	@Inject
	private SubjectDAO dao;
	
	@Test
	public void readAllMember() throws Exception{
		List<SubjectVO> listMembers = dao.listAll();
		
		int cnt = listMembers.size();
		
		System.out.println("-----------Test----------");
		System.out.println("데이터 수: " + cnt);
		System.out.println("-------------------------");
		
		for(int i = 0; i < cnt; i++) {
			System.out.println("Index: " + i);
			System.out.println("stu_no: " + listMembers.get(i).getStu_no());
			System.out.println("kor_score: " + listMembers.get(i).getKor_score());
			System.out.println("math_score: " + listMembers.get(i).getMath_score());
			System.out.println("eng_score: " + listMembers.get(i).getEng_score());
			System.out.println("-------------------------");
		}
	}
}
