package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.MembersVO;

@Repository
public class MembersDAOImpl implements MembersDAO{
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.inhatc.mapper.MembersMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace + ".getTime");
	}
	
	@Override
	public void insertMembers(MembersVO vo) {
		sqlSession.insert(namespace + ".insertMembers", vo);
	}
	
	@Override
	public MembersVO readMember(String userid) throws Exception{
		return sqlSession.selectOne(namespace + ".selectMember", userid);
	}
	
	@Override
	public MembersVO readWithPW(String userid, String userpw) throws Exception{
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userid",  userid);
		paramMap.put("userpw",  userpw);
		
		return sqlSession.selectOne(namespace + ".readWithPw", paramMap);
	}
	
	@Override
	public void modify(MembersVO vo) throws Exception{
		sqlSession.update(namespace + ".modify", vo);
	}
	
	@Override
	public void remove(String userid) throws Exception{
		sqlSession.delete(namespace + ".delete", userid);
	}
	
	@Override
	public List<MembersVO> listAll() throws Exception{
		return sqlSession.selectList(namespace + ".listAll");
	}
	
}
