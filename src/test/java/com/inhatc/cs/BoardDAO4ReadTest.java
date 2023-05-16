package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Labmaster202044105VO;
import com.inhatc.persistence.BoardDAO;
import com.inhatc.persistence.Labmaster202044105DAO;



@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class BoardDAO4ReadTest {
	@Inject
	private BoardDAO dao;
	
	@Test
	public void readLab() throws Exception{
		BoardVO vo = dao.read(1);
		System.out.println("==============Test==============");
		System.out.println("Board no: " + vo.getBno());
		System.out.println("Board title: " + vo.getTitle());
		System.out.println("Board content: " + vo.getContent());
		System.out.println("================================");
	}
}
