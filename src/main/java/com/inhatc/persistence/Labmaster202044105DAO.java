package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.Labmaster202044105VO;

public interface Labmaster202044105DAO {
	
	public void insertLab(Labmaster202044105VO vo);
	public Labmaster202044105VO readLab(String training_id) throws Exception;
	public void modifyTraing(Labmaster202044105VO vo) throws Exception;
	public void remove(String training_id) throws Exception;
	public List<Labmaster202044105VO>  listAll() throws Exception;


}
