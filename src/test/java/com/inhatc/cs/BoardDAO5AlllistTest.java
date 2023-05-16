package com.inhatc.cs;

import java.util.List;

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

public class BoardDAO5AlllistTest {
	@Inject
	private BoardDAO dao;
	
	@Test
	public void readAllMember() throws Exception{
		List<BoardVO> listMembers = dao.listAll();
		
		int cnt = listMembers.size();
		
		System.out.println("-----------Test----------");
		System.out.println("데이터 수: " + cnt);
		System.out.println("-------------------------");
		
		for(int i = 0; i < cnt; i++) {
			System.out.println("Index: " + i);
			System.out.println("Board id: " + listMembers.get(i).getBno());
			System.out.println("Board Title: " + listMembers.get(i).getTitle());
			System.out.println("Board Content: " + listMembers.get(i).getContent());
			System.out.println("Board Writer: " + listMembers.get(i).getWriter());
			System.out.println("Board Regdate: " + listMembers.get(i).getRegdate());
			System.out.println("Board Viewcnt: " + listMembers.get(i).getViewcnt());
			System.out.println("-------------------------");
		}
	}
}
