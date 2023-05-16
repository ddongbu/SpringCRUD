package com.inhatc.persistence;


import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.Labmaster202044105VO;

@Repository
public class Labmaster202044105DAOImpl implements Labmaster202044105DAO{
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.inhatc.mapper.Labmaster202044105Mapper";
	
	
	@Override
	public void insertLab(Labmaster202044105VO vo) {
		sqlSession.insert(namespace + ".insertLab", vo);
	}
	
	@Override
	public Labmaster202044105VO readLab(String training_id) throws Exception{
		return sqlSession.selectOne(namespace + ".selectLab", training_id);
	}
	@Override
	public void modifyTraing(Labmaster202044105VO vo) throws Exception{
		sqlSession.update(namespace + ".modify", vo);
	}
	@Override
	public void remove(String training_id) throws Exception{
		sqlSession.delete(namespace + ".delete", training_id);
	}
	
	@Override
	public List<Labmaster202044105VO> listAll() throws Exception{
		return sqlSession.selectList(namespace + ".listAll");
	}
	
	
}
