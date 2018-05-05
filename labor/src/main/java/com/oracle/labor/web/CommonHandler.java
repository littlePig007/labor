package com.oracle.labor.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.labor.common.codetable.ComputergradeOperation;
import com.oracle.labor.common.codetable.EducationallevelOperation;
import com.oracle.labor.common.codetable.EmploytypeOperation;
import com.oracle.labor.common.codetable.HealthstateOperation;
import com.oracle.labor.common.codetable.IndustryOperation;
import com.oracle.labor.common.codetable.LanguageOperation;
import com.oracle.labor.common.codetable.MarriageOperation;
import com.oracle.labor.common.codetable.NationOperation;
import com.oracle.labor.common.codetable.OrgtypeOperation;
import com.oracle.labor.common.codetable.PersonneltypeOperation;
import com.oracle.labor.common.codetable.ProficiencyOperation;
import com.oracle.labor.common.codetable.RegioncodeOperation;
import com.oracle.labor.common.codetable.RegtypeOperation;
import com.oracle.labor.common.codetable.RprtypeOperation;
import com.oracle.labor.common.codetable.SpecialtyOperation;
import com.oracle.labor.common.codetable.ZjdgwlbOperation;

@Controller
public class CommonHandler {

		
	//获得民族的下拉列表 ;
	@ResponseBody
	@RequestMapping(value="/service/nations/{value}",produces="text/html;charset=UTF-8")
	public String getNations(@PathVariable("value") String value) {
		return NationOperation.getOption(value);
	}
	
	//获得单位性质的下拉列表，在单位登记的时候会使用
	//这个Operator会返回<option/>，所以注意使用
	@ResponseBody   //这个注解代表会将返回的信息放在返回体中，而不是SpringMVC映射
	@RequestMapping(value="/service/companyType/{value}",produces="text/html;charset=UTF-8")
	public String getCompanyType(@PathVariable("value") String value) {
		return OrgtypeOperation.getOption(value);
	}
	
	//获得经济类型的下拉列表，在单位登记的时候会使用
	@ResponseBody
	@RequestMapping(value="/service/economicType/{value}",produces="text/html;charset=UTF-8")
	public String getEconomicType(@PathVariable("value") String value) {
		return RegtypeOperation.getOption(value);
	}
	
	
	//获得单位行业的下拉列表，在单位登记的时候会使用
	@ResponseBody
	@RequestMapping(value="/service/companyIndustry/{value}",produces="text/html;charset=UTF-8")
	public String getCompanyIndustry(@PathVariable("value") String value) {
		return IndustryOperation.getOption(value);
	}	
	
	//获得全国行政区划的下拉列表，在单位登记的时候会使用
	//range表示你想要获取的区域，有province、city、village
	//value表示你选中的上一级的id，那么当新注册单位的时候，获取province就没有任何意义了，但是获取city、village就用上了
	@ResponseBody
	@RequestMapping(value="/service/region/{range}/{value}",produces="text/html;charset=UTF-8")
	public String getRegion(@PathVariable("range") String range,@PathVariable("value") String value) {
		String regex;
		if(range.equals("province")) {
			return RegioncodeOperation.getProvince();
		}else if(range.equals("city")) {
			 if(value.startsWith("11")){//北京牛逼，比较特殊所以要特殊处理
					regex = "("+value.substring(0,2)+")(0[1-9]{1}|[1-9]{1}[\\d]{1})[\\d]{2}[0]{6}";
				}else{
					regex = "("+value.substring(0,2)+")(0[1-9]{1}|[1-9]{1}[\\d]{1})[0]{8}";
				}
		}else {//village
			if(value.startsWith("11")){
				regex = "("+value.substring(0,6)+")(00[1-9]{1}|0[1-9]{1}[\\d]{1}|[1-9]{1}[\\d]{2})[0]{3}";
			}else{
				regex = "("+value.substring(0,4)+")(0[1-9]{1}|[1-9]{1}[\\d]{1})[0]{6}";
			}
		}
		return RegioncodeOperation.getOptionByRegex(regex);//获得相应的city下拉项
	}
	
	@ResponseBody
	@RequestMapping(value="/service/regionCallBack/{region}/{id}",produces="text/html;charset=UTF-8")
	public String getRegionCallBack(@PathVariable("region") String region,@PathVariable("id") String id) {
		return RegioncodeOperation.getSelectedRegion(id, region);
	}
	
	//工种 SpecialtyOperation
	@ResponseBody
	@RequestMapping(value="/service/workType/{value}",produces="text/html;charset=UTF-8")
	public String getWorkType(@PathVariable("value") String value) {
		return SpecialtyOperation.getHy();
	}
	
	//岗位类别ZjdgwlbOperation.java
	@ResponseBody
	@RequestMapping(value="/service/postType/{value}",produces="text/html;charset=UTF-8")
	public String getJobType(@PathVariable("value") String value) {
		return ZjdgwlbOperation.getOption(value);
	}
	
	//户籍性质
	@ResponseBody
	@RequestMapping(value="/service/houseHoldType/{value}",produces="text/html;charset=UTF-8")
	public String getHouseHoldType(@PathVariable("value") String value) {
		return RprtypeOperation.getOption(value);
	}
	
	
	//教育等级EducationallevelOperation.java
	@ResponseBody
	@RequestMapping(value="/service/educationLevel/{value}",produces="text/html;charset=UTF-8")
	public String getEducationLevel(@PathVariable("value") String value) {
		return EducationallevelOperation.getOption(value);
	}
	
	//EmploytypeOperation用工形式
	@ResponseBody
	@RequestMapping(value="/service/employType/{value}",produces="text/html;charset=UTF-8")
	public String getEmployType(@PathVariable("value") String value) {
		return EmploytypeOperation.getOption(value);
	}
	
	
	//MarriageOperation.java
	@ResponseBody
	@RequestMapping(value="/service/marriageType/{value}",produces="text/html;charset=UTF-8")
	public String getMarriageType(@PathVariable("value") String value) {
		return MarriageOperation.getOption(value);
	}
	
	
	//HealthstateOperation.java
	@ResponseBody
	@RequestMapping(value="/service/healthState/{value}",produces="text/html;charset=UTF-8")
	public String getHealthState(@PathVariable("value") String value) {
		return HealthstateOperation.getOption(value);
	}
	
	//PersonneltypeOperation人员类别
	@ResponseBody
	@RequestMapping(value="/service/personnelType/{value}",produces="text/html;charset=UTF-8")
	public String getPersonnelType(@PathVariable("value") String value) {
		return PersonneltypeOperation.getOption(value);
	}
	
	//ComputergradeOperation.java
	@ResponseBody
	@RequestMapping(value="/service/computerGrade/{value}",produces="text/html;charset=UTF-8")
	public String getComputerGrade(@PathVariable("value") String value) {
		return ComputergradeOperation.getOption(value);
	}
	
	//熟练程度ProficiencyOperation
	@ResponseBody
	@RequestMapping(value="/service/proficiency/{value}",produces="text/html;charset=UTF-8")
	public String getProficiency(@PathVariable("value") String value) {
		return ProficiencyOperation.getOption(value);
	}
	
	//LanguageOperation
	@ResponseBody
	@RequestMapping(value="/service/language/{value}",produces="text/html;charset=UTF-8")
	public String getLanguage(@PathVariable("value") String value) {
		return LanguageOperation.getOption(value);
	}	
	
	
	
	
}
