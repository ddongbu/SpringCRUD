package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.BoardVO;

import com.inhatc.persistence.BoardDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class BoardDAO2UpdateTest {
	@Inject
	private BoardDAO dao;
	
	@Test
	public void update() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setBno(1);
		vo.setTitle("제목 수정 ");
		vo.setContent("내용 수정 ");
		vo.setWriter("글쓴이 수정 ");
		dao.update(vo);
	}
}
