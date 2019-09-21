package com.jim.vo;

import java.io.Serializable;
import java.util.Date;

public class ApplyVO implements Serializable {
	
	private String applyNo;
	private String applyName;
	private Date applyDate;
	private String applyStats;
	public String getApplyNo() {
		return applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyName() {
		return applyName;
	}
	public void setApplyName(String applyName) {
		this.applyName = applyName;
	}
	public Date getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}
	public String getApplyStats() {
		return applyStats;
	}
	public void setApplyStats(String applyStats) {
		this.applyStats = applyStats;
	}
	

}
