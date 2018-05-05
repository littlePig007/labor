package com.oracle.labor.web;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.labor.po.Bio;
import com.oracle.labor.po.ZjDwzpdjb;
import com.oracle.labor.po.ZjDwzpgzb;
import com.oracle.labor.service.CompanyService;

@Controller
public class CompanyHandler {
	
	@Autowired
	CompanyService companySerive;
	
	@RequestMapping("/service/saveCompany")
	public String saveCompany(Bio bio) {//bio代表一个Company
		companySerive.saveCompany(bio);
		return "redirect:../common/successful.jsp";
	}
	
	//通过公司法人码获取到的数据
	//李先军
	@RequestMapping("/service/getCompany/{bioNo}")
	@ResponseBody
	public Map<String,Object> getCompanyByBioNo(@PathVariable("bioNo")String bioNo) {//bioNo代表单位的法人码		
		Map<String,Object> map=companySerive.selectByBioNo(bioNo);
		System.out.println(map);
		return map;
	}
	
	/*
	 *单位发布招聘信息
	 *李先军
	 */
	@RequestMapping("/service/postRecruitInfo")
	public String postRecruitInfo(ZjDwzpdjb c,ZjDwzpgzb gz,@RequestParam("dwfrm")String bioNo) {//单位招聘、单位招聘工种
		System.out.println("公司法人码为："+bioNo+"前端直接获取的数据");
		System.out.println(c);
		System.out.println(gz);
		//根据单位法人码，获得单位编号
		Map<String,Object> map=companySerive.selectByBioNo(bioNo);
		System.out.println("根据法人码获取到的Map,看一下是否存在单位编号"+map);
		Integer dwbh=(Integer) map.get("bio_id");//单位编号
		System.out.println("单位编号是"+dwbh);
		c.setDwbh(dwbh);//设置单位登记表的单位编号
		c.setDjsj(new Date());//登记时间
		//有效期
		c.setDjyxq((int)((gz.getJssj().getTime() - gz.getKssj().getTime()) / (1000*3600*24)));
		gz.setZpbh(c.getZpbh());//设置工种表的招聘编号
		gz.setDjsj(new Date());//登记时间
		gz.setDjyxq((int)((gz.getJssj().getTime() - gz.getKssj().getTime()) / (1000*3600*24)));
		//将招聘的男、女、性别不限加起来，记录总人数
		gz.setZrs(gz.getZprsn()+gz.getZprsnv()+gz.getXbbx());
		//单位编号、是否冻结、冻结有效期、登记时间、归档时间
		//招聘编号、成功人数男、成功人数女、登记有效期、登记时间、归档时间
		companySerive.postRecruitInfo(c, gz);
		System.out.println(c);
		System.out.println(gz);
		return "redirect:../common/successful.jsp";
	}
}
