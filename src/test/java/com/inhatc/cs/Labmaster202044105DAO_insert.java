package com.inhatc.cs;

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

public class Labmaster202044105DAO_insert {
	@Inject
	private Labmaster202044105DAO dao;
	
	@Test
	public void testInsertMembers() throws Exception{
		System.out.println("---------------- Insert ---------------");
		Labmaster202044105VO vo = new Labmaster202044105VO();
		vo.setTraining_id("3");
		vo.setTraining_name("공부실");
		vo.setTraining_people(2);
		vo.setTraining_location("3호관");
		vo.setTraining_category("컴시과");
		vo.setTraining_sub("name3");

		dao.insertLab(vo);
		System.out.println("---------------------------------------");
	}
}
