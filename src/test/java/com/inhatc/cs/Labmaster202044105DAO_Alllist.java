package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.Labmaster202044105VO;
import com.inhatc.persistence.Labmaster202044105DAO;



@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class Labmaster202044105DAO_Alllist {
	@Inject
	private Labmaster202044105DAO dao;
	
	@Test
	public void readAllMember() throws Exception{
		List<Labmaster202044105VO> listMembers = dao.listAll();
		
		int cnt = listMembers.size();
		
		System.out.println("-----------Test----------");
		System.out.println("데이터 수: " + cnt);
		System.out.println("-------------------------");
		
		for(int i = 0; i < cnt; i++) {
			System.out.println("Index: " + i);
			System.out.println("Training id: " + listMembers.get(i).getTraining_id());
			System.out.println("Training name: " + listMembers.get(i).getTraining_name());
			System.out.println("Training people: " + listMembers.get(i).getTraining_people());
			System.out.println("Training location: " + listMembers.get(i).getTraining_location());
			System.out.println("Training category: " + listMembers.get(i).getTraining_category());
			System.out.println("Training sub: " + listMembers.get(i).getTraining_sub());
			System.out.println("-------------------------");
		}
	}
}
