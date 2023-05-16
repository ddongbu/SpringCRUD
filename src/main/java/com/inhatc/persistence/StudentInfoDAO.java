package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.StudentInfoVO;

public interface StudentInfoDAO {
	
	public void insertInfo(StudentInfoVO vo);
	public StudentInfoVO readInfo(String stu_id) throws Exception;
	public void modify(StudentInfoVO vo) throws Exception;
	public void remove(String stu_id) throws Exception;
	public List<StudentInfoVO>  listAll() throws Exception;
}
