package com.jim.service;

import java.util.List;

import com.jim.vo.ApplyVO;

public interface IApplyService {

	public ApplyVO getApplyById(String id);
	
	public List<ApplyVO> getApply(ApplyVO vo);
	
	 
	
}
