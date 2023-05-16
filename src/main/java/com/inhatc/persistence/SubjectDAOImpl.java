package com.inhatc.persistence;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.SubjectVO;

@Repository
public class SubjectDAOImpl implements SubjectDAO{
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.inhatc.mapper.subjectMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace + ".getTime");
	}
	
	@Override
	public void insertSubject(SubjectVO vo) {
		sqlSession.insert(namespace + ".insertSubject", vo);
	}

	@Override
	public SubjectVO readSubject(String stu_no) throws Exception {
		return sqlSession.selectOne(namespace + ".readSubject", stu_no);
	}

	@Override
	public void modify(SubjectVO vo) throws Exception {
		sqlSession.update(namespace + ".modify", vo);
	}

	@Override
	public void remove(String stu_no) throws Exception {
		sqlSession.delete(namespace + ".delete", stu_no);
		
	}

	@Override
	public List<SubjectVO> listAll() throws Exception {
		return sqlSession.selectList(namespace + ".listAll");
	}
}
