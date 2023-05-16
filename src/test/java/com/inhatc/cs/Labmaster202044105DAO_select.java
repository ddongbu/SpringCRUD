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

public class Labmaster202044105DAO_select {
	@Inject
	private Labmaster202044105DAO dao;
	
	@Test
	public void readLab() throws Exception{
		Labmaster202044105VO vo = dao.readLab("1");
		System.out.println("==============Test==============");
		System.out.println("Training id: " + vo.getTraining_id());
		System.out.println("Training name: " + vo.getTraining_name());
		System.out.println("Training people: " + vo.getTraining_people());
		System.out.println("Training location: " + vo.getTraining_location());
		System.out.println("Training category: " + vo.getTraining_category());
		System.out.println("Training sub: " + vo.getTraining_sub());

		System.out.println("================================");
	}
}
