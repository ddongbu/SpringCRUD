package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.MembersVO;

public interface MembersDAO {
	
	public String getTime();
	
	public void insertMembers(MembersVO vo);
	
	public MembersVO readMember(String uesrid) throws Exception;
	
	public MembersVO readWithPW(String userid, String userpw) throws Exception;
	
	public void modify(MembersVO vo) throws Exception;
	
	public void remove(String userid) throws Exception;
	
	public List<MembersVO>  listAll() throws Exception;
	
}
