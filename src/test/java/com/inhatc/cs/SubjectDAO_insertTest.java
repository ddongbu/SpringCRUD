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

public class SubjectDAO_insertTest {
	@Inject
	private SubjectDAO dao;
	
	@Test
	public void InsertSubject() throws Exception{
		System.out.println("---------------- Insert ---------------");
		SubjectVO vo = new SubjectVO();
		vo.setStu_no("202044105");
		vo.setKor_score(80);
		vo.setMath_score(90);
		vo.setEng_score(100);
		
		dao.insertSubject(vo);
		System.out.println("---------------------------------------");
	}
}
