package com.inhatc.cs;

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

public class SubjectDAO_readTest {
	@Inject
	private SubjectDAO dao;
	
	@Test
	public void readSubject() throws Exception{
		SubjectVO vo = dao.readSubject("stu4");
		System.out.println("==============Test==============");
		System.out.println("kor_score: " + vo.getKor_score());
		System.out.println("math_score: " + vo.getMath_score());
		System.out.println("eng_score: " + vo.getEng_score());
		System.out.println("================================");
	}
}
