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

public class SubjectDAO_modifyTest {
	@Inject
	private SubjectDAO dao;
	
	@Test
	public void modifySubject() throws Exception{
		SubjectVO vo = new SubjectVO();
		vo.setStu_no("202044105");
		vo.setKor_score(10);
		vo.setMath_score(20);
		vo.setEng_score(30);
		dao.modify(vo);
	}
}
