package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.MembersVO;
import com.inhatc.persistence.MembersDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class MembersDAO2insertTest {
	@Inject
	private MembersDAO dao;
	
	@Test
	public void testInsertMembers() throws Exception{
		System.out.println("---------------- Insert ---------------");
		MembersVO vo = new MembersVO();
		vo.setUserid("id2");
		vo.setUserpw("pw2");
		vo.setUsername("name2");
		vo.setEmail("SGS2@inhatc.ac.kr");
		dao.insertMembers(vo);
		System.out.println("---------------------------------------");
	}
}
