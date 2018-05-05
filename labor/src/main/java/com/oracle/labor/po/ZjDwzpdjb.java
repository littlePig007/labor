package com.oracle.labor.po;

import java.util.Date;

//单位招聘登记表
public class ZjDwzpdjb {
	// 招聘编号
	private Integer zpbh;
	// 单位编号
	private Integer dwbh;
	// 单位经办人姓名
	private String dwlxr;
	// 身份证号码
	private String lxrsfzhm;
	// 手机
	private String lxrsj;
	// 是否冻结
	private String sfdj = "否";
	// 有效期
	private Integer djyxq;
	// 登记时间
	private Date djsj;
	// 归档时间
	private Date gdsj;

	public Integer getZpbh() {
		return zpbh;
	}

	public void setZpbh(Integer zpbh) {
		this.zpbh = zpbh;
	}

	public Integer getDwbh() {
		return dwbh;
	}

	public void setDwbh(Integer dwbh) {
		this.dwbh = dwbh;
	}

	public String getDwlxr() {
		return dwlxr;
	}

	public void setDwlxr(String dwlxr) {
		this.dwlxr = dwlxr == null ? null : dwlxr.trim();
	}

	public String getLxrsfzhm() {
		return lxrsfzhm;
	}

	public void setLxrsfzhm(String lxrsfzhm) {
		this.lxrsfzhm = lxrsfzhm == null ? null : lxrsfzhm.trim();
	}

	public String getLxrsj() {
		return lxrsj;
	}

	public void setLxrsj(String lxrsj) {
		this.lxrsj = lxrsj == null ? null : lxrsj.trim();
	}

	public String getSfdj() {
		return sfdj;
	}

	public void setSfdj(String sfdj) {
		this.sfdj = sfdj == null ? null : sfdj.trim();
	}

	public Integer getDjyxq() {
		return djyxq;
	}

	public void setDjyxq(Integer djyxq) {
		this.djyxq = djyxq;
	}

	public Date getDjsj() {
		return djsj;
	}

	public void setDjsj(Date djsj) {
		this.djsj = djsj;
	}

	public Date getGdsj() {
		return gdsj;
	}

	public void setGdsj(Date gdsj) {
		this.gdsj = gdsj;
	}

	@Override
	public String toString() {
		return "ZjDwzpdjb [zpbh=" + zpbh + ", dwbh=" + dwbh + ", dwlxr=" + dwlxr + ", lxrsfzhm=" + lxrsfzhm + ", lxrsj="
				+ lxrsj + ", sfdj=" + sfdj + ", djyxq=" + djyxq + ", djsj=" + djsj + ", gdsj=" + gdsj + "]";
	}
	
}