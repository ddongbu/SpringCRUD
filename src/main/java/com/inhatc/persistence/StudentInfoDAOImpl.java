package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.MembersVO;
import com.inhatc.domain.StudentInfoVO;


@Repository
public class StudentInfoDAOImpl implements StudentInfoDAO{
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.inhatc.mapper.StudentInfoMapper";
	
	
	@Override
	public void insertInfo(StudentInfoVO vo) {
		sqlSession.insert(namespace + ".insertInfo", vo);
	}
	@Override
	public StudentInfoVO readInfo(String stu_id) throws Exception{
		return sqlSession.selectOne(namespace + ".selectInfo", stu_id);
	}
	@Override
	public void modify(StudentInfoVO vo) throws Exception{
		sqlSession.update(namespace + ".modify", vo);
	}
	@Override
	public void remove(String stu_id) throws Exception{
		sqlSession.delete(namespace + ".delete", stu_id);
	}
	@Override
	public List<StudentInfoVO> listAll() throws Exception{
		return sqlSession.selectList(namespace + ".listAll");
	}
}
