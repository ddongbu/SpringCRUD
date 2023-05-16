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

public class BoardDAO1InsertTest {
	@Inject
	private BoardDAO dao;
	
	@Test
	public void testInsertMembers() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setTitle("제목이");
		vo.setContent("내용이");
		vo.setWriter("글쓴이다.");
		
	dao.create(vo);
	}
}
