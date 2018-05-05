package com.oracle.labor.po;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//单位招聘工种表
public class ZjDwzpgzb {
	// 招聘工种编号
	private Integer zpgzbh;
	// 招聘编号
	private Integer zpbh;
	// 工种
	private String zpgz;
	// 名称
	private String zpgzbm;
	// 岗位类别
	private String gwlb;
	// 总人数
	private Integer zrs;
	// 男
	private Integer zprsn;
	// 女
	private Integer zprsnv;
	// 性别不限
	private Integer xbbx;
	// 户籍性质
	private String hjxz;
	// 发布开始时间
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date kssj;
	// 发布结束时间
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date jssj;
	// 最小年龄
	private String zxnl;
	// 最大年龄
	private String zdnl;
	// 文化程度
	private String whcd;
	// 用工形式
	private String ygxs;
	// 最低月薪
	private String zzyx;
	// 最高月薪
	private String zgyx;
	// 婚姻状况
	private String hyzk;
	// 健康状况
	private String jkzk;
	// 人员类别
	private String rylb;
	// 是否毕业生
	private String sfbys;
	// 招聘地区
	private String zpdq;
	// 具有语种
	private String jyyz;
	// 熟练程度
	private String slcd;
	// 计算机等级
	private String jsjdj;
	// 计算机熟练程度
	private String jsjslcd;
	// 岗位描述
	private String gwms;
	// 工作地点
	private String gzdd;
	// 成功人数(男)
	private Integer cgrsn=0;
	// 成功人数(女)
	private Integer cgrsnv=0;
	// 登记有效期
	private Integer djyxq;
	// 登记时间
	private Date djsj;
	// 归档时间
	private Date gdsj;

    public Integer getZpgzbh() {
        return zpgzbh;
    }

    public void setZpgzbh(Integer zpgzbh) {
        this.zpgzbh = zpgzbh;
    }

    public Integer getZpbh() {
        return zpbh;
    }

    public void setZpbh(Integer zpbh) {
        this.zpbh = zpbh;
    }

    public String getZpgz() {
        return zpgz;
    }

    public void setZpgz(String zpgz) {
        this.zpgz = zpgz == null ? null : zpgz.trim();
    }

    public String getZpgzbm() {
        return zpgzbm;
    }

    public void setZpgzbm(String zpgzbm) {
        this.zpgzbm = zpgzbm == null ? null : zpgzbm.trim();
    }

    public String getGwlb() {
        return gwlb;
    }

    public void setGwlb(String gwlb) {
        this.gwlb = gwlb == null ? null : gwlb.trim();
    }

    public Integer getZrs() {
        return zrs;
    }

    public void setZrs(Integer zrs) {
        this.zrs = zrs;
    }

    public Integer getZprsn() {
        return zprsn;
    }

    public void setZprsn(Integer zprsn) {
        this.zprsn = zprsn;
    }

    public Integer getZprsnv() {
        return zprsnv;
    }

    public void setZprsnv(Integer zprsnv) {
        this.zprsnv = zprsnv;
    }

    public Integer getXbbx() {
        return xbbx;
    }

    public void setXbbx(Integer xbbx) {
        this.xbbx = xbbx;
    }

    public String getHjxz() {
        return hjxz;
    }

    public void setHjxz(String hjxz) {
        this.hjxz = hjxz == null ? null : hjxz.trim();
    }

    public Date getKssj() {
        return kssj;
    }

    public void setKssj(Date kssj) {
        this.kssj = kssj;
    }

    public Date getJssj() {
        return jssj;
    }

    public void setJssj(Date jssj) {
        this.jssj = jssj;
    }

    public String getZxnl() {
        return zxnl;
    }

    public void setZxnl(String zxnl) {
        this.zxnl = zxnl == null ? null : zxnl.trim();
    }

    public String getZdnl() {
        return zdnl;
    }

    public void setZdnl(String zdnl) {
        this.zdnl = zdnl == null ? null : zdnl.trim();
    }

    public String getWhcd() {
        return whcd;
    }

    public void setWhcd(String whcd) {
        this.whcd = whcd == null ? null : whcd.trim();
    }

    public String getYgxs() {
        return ygxs;
    }

    public void setYgxs(String ygxs) {
        this.ygxs = ygxs == null ? null : ygxs.trim();
    }

    public String getZzyx() {
        return zzyx;
    }

    public void setZzyx(String zzyx) {
        this.zzyx = zzyx == null ? null : zzyx.trim();
    }

    public String getZgyx() {
        return zgyx;
    }

    public void setZgyx(String zgyx) {
        this.zgyx = zgyx == null ? null : zgyx.trim();
    }

    public String getHyzk() {
        return hyzk;
    }

    public void setHyzk(String hyzk) {
        this.hyzk = hyzk == null ? null : hyzk.trim();
    }

    public String getJkzk() {
        return jkzk;
    }

    public void setJkzk(String jkzk) {
        this.jkzk = jkzk == null ? null : jkzk.trim();
    }

    public String getRylb() {
        return rylb;
    }

    public void setRylb(String rylb) {
        this.rylb = rylb == null ? null : rylb.trim();
    }

    public String getSfbys() {
        return sfbys;
    }

    public void setSfbys(String sfbys) {
        this.sfbys = sfbys == null ? null : sfbys.trim();
    }

    public String getZpdq() {
        return zpdq;
    }

    public void setZpdq(String zpdq) {
        this.zpdq = zpdq == null ? null : zpdq.trim();
    }

    public String getJyyz() {
        return jyyz;
    }

    public void setJyyz(String jyyz) {
        this.jyyz = jyyz == null ? null : jyyz.trim();
    }

    public String getSlcd() {
        return slcd;
    }

    public void setSlcd(String slcd) {
        this.slcd = slcd == null ? null : slcd.trim();
    }

    public String getJsjdj() {
        return jsjdj;
    }

    public void setJsjdj(String jsjdj) {
        this.jsjdj = jsjdj == null ? null : jsjdj.trim();
    }

    public String getJsjslcd() {
        return jsjslcd;
    }

    public void setJsjslcd(String jsjslcd) {
        this.jsjslcd = jsjslcd == null ? null : jsjslcd.trim();
    }

    public String getGwms() {
        return gwms;
    }

    public void setGwms(String gwms) {
        this.gwms = gwms == null ? null : gwms.trim();
    }

    public String getGzdd() {
        return gzdd;
    }

    public void setGzdd(String gzdd) {
        this.gzdd = gzdd == null ? null : gzdd.trim();
    }

    public Integer getCgrsn() {
        return cgrsn;
    }

    public void setCgrsn(Integer cgrsn) {
        this.cgrsn = cgrsn;
    }

    public Integer getCgrsnv() {
        return cgrsnv;
    }

    public void setCgrsnv(Integer cgrsnv) {
        this.cgrsnv = cgrsnv;
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
		return "ZjDwzpgzb [zpgzbh=" + zpgzbh + ", zpbh=" + zpbh + ", zpgz=" + zpgz + ", zpgzbm=" + zpgzbm + ", gwlb="
				+ gwlb + ", zrs=" + zrs + ", zprsn=" + zprsn + ", zprsnv=" + zprsnv + ", xbbx=" + xbbx + ", hjxz="
				+ hjxz + ", kssj=" + kssj + ", jssj=" + jssj + ", zxnl=" + zxnl + ", zdnl=" + zdnl + ", whcd=" + whcd
				+ ", ygxs=" + ygxs + ", zzyx=" + zzyx + ", zgyx=" + zgyx + ", hyzk=" + hyzk + ", jkzk=" + jkzk
				+ ", rylb=" + rylb + ", sfbys=" + sfbys + ", zpdq=" + zpdq + ", jyyz=" + jyyz + ", slcd=" + slcd
				+ ", jsjdj=" + jsjdj + ", jsjslcd=" + jsjslcd + ", gwms=" + gwms + ", gzdd=" + gzdd + ", cgrsn=" + cgrsn
				+ ", cgrsnv=" + cgrsnv + ", djyxq=" + djyxq + ", djsj=" + djsj + ", gdsj=" + gdsj + "]";
	}
    
}