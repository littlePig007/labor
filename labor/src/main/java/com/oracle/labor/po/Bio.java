package com.oracle.labor.po;

//单位表
public class Bio {
    private Integer bioId;

    //单位法人码
    private String bioNo;
    //单位全称
    private String bioName;
    //单位简称
    private String bioShortname;
    //单位性质
    private String bioOrgtype;
    //经济类型
    private String cdgRegtype;
    //单位行业
    private String bioIndustry;
    //地区划分编码
    private String bioRgaRegioncode;
    //邮政编码
    private String bioBuaPostcode;
    //电话
    private String bioConFax;
    //联系邮箱
    private String bioConMail;
    //经营地址
    private String bioBuaAddress;

    public Integer getBioId() {
        return bioId;
    }

    public void setBioId(Integer bioId) {
        this.bioId = bioId;
    }

    public String getBioNo() {
        return bioNo;
    }

    public void setBioNo(String bioNo) {
        this.bioNo = bioNo == null ? null : bioNo.trim();
    }

    public String getBioName() {
        return bioName;
    }

    public void setBioName(String bioName) {
        this.bioName = bioName == null ? null : bioName.trim();
    }

    public String getBioShortname() {
        return bioShortname;
    }

    public void setBioShortname(String bioShortname) {
        this.bioShortname = bioShortname == null ? null : bioShortname.trim();
    }

    public String getBioOrgtype() {
        return bioOrgtype;
    }

    public void setBioOrgtype(String bioOrgtype) {
        this.bioOrgtype = bioOrgtype == null ? null : bioOrgtype.trim();
    }

    public String getCdgRegtype() {
        return cdgRegtype;
    }

    public void setCdgRegtype(String cdgRegtype) {
        this.cdgRegtype = cdgRegtype == null ? null : cdgRegtype.trim();
    }

    public String getBioIndustry() {
        return bioIndustry;
    }

    public void setBioIndustry(String bioIndustry) {
        this.bioIndustry = bioIndustry == null ? null : bioIndustry.trim();
    }

    public String getBioRgaRegioncode() {
        return bioRgaRegioncode;
    }

    public void setBioRgaRegioncode(String bioRgaRegioncode) {
        this.bioRgaRegioncode = bioRgaRegioncode == null ? null : bioRgaRegioncode.trim();
    }

    public String getBioBuaPostcode() {
        return bioBuaPostcode;
    }

    public void setBioBuaPostcode(String bioBuaPostcode) {
        this.bioBuaPostcode = bioBuaPostcode == null ? null : bioBuaPostcode.trim();
    }

    public String getBioConFax() {
        return bioConFax;
    }

    public void setBioConFax(String bioConFax) {
        this.bioConFax = bioConFax == null ? null : bioConFax.trim();
    }

    public String getBioConMail() {
        return bioConMail;
    }

    public void setBioConMail(String bioConMail) {
        this.bioConMail = bioConMail == null ? null : bioConMail.trim();
    }

    public String getBioBuaAddress() {
        return bioBuaAddress;
    }

    public void setBioBuaAddress(String bioBuaAddress) {
        this.bioBuaAddress = bioBuaAddress == null ? null : bioBuaAddress.trim();
    }

	@Override
	public String toString() {
		return "Bio [bioId=" + bioId + ", bioNo=" + bioNo + ", bioName=" + bioName + ", bioShortname=" + bioShortname
				+ ", bioOrgtype=" + bioOrgtype + ", cdgRegtype=" + cdgRegtype + ", bioIndustry=" + bioIndustry
				+ ", bioRgaRegioncode=" + bioRgaRegioncode + ", bioBuaPostcode=" + bioBuaPostcode + ", bioConFax="
				+ bioConFax + ", bioConMail=" + bioConMail + ", bioBuaAddress=" + bioBuaAddress + "]";
	}
    
}