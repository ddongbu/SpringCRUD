package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.SubjectVO;

public interface SubjectDAO {
	public String getTime();
	
	public void insertSubject(SubjectVO vo);
	
	public SubjectVO readSubject(String stu_no) throws Exception;
	
	public void modify(SubjectVO vo) throws Exception;
	
	public void remove(String stu_no) throws Exception;
	
	public List<SubjectVO>  listAll() throws Exception;
}
