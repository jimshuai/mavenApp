package com.jim.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jim.service.IApplyService;
import com.jim.vo.ApplyVO;

@Service
public class ApplyServiceImpl implements IApplyService {

	@Override
	public ApplyVO getApplyById(String id) {
		// TODO Auto-generated method stub
		System.out.println("根据id获取申请信息");
		return null;
	}

	@Override
	public List<ApplyVO> getApply(ApplyVO vo) {
		// TODO Auto-generated method stub
		System.out.println("根据vo获取申请信息");
		return null;
	}

	 
}
