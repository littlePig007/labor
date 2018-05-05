package com.oracle.labor.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.labor.dao.BioMapper;
import com.oracle.labor.dao.ZjDwzpdjbMapper;
import com.oracle.labor.dao.ZjDwzpgzbMapper;
import com.oracle.labor.po.Bio;
import com.oracle.labor.po.ZjDwzpdjb;
import com.oracle.labor.po.ZjDwzpgzb;

@Service
public class CompanyService {
	
	@Autowired
	BioMapper companyDao;
	
	//单位登记Dao
	@Autowired
	ZjDwzpdjbMapper companyRegisterDao;
	
	//单位工种Dao
	@Autowired
	ZjDwzpgzbMapper companyWorkDao;

	//李先军
	@Transactional
	public void saveCompany(Bio bio) {
		//通过判断bio的bio_id是否为null，得出是insert一个单位还是update一个单位
		if(bio.getBioId()==null) {
			companyDao.insert(bio);//是新建的单位
		}else {
			companyDao.updateByPrimaryKey(bio);//进行单位的数据更新
		}
	}
	
	//根据公司法人码获取数据
	//李先军
	@Transactional(readOnly=true)
	public Map<String,Object> selectByBioNo(String bioNo) {
		Map<String,Object> map= companyDao.selectByBioNo(bioNo);
		if(map==null) {
			map=new HashMap<String,Object>();
			map.put("existsCompany","公司不存在");
		}else {
			map.put("existsCompany","正确");
		}
		map.put("dwbh",0);//这个是为单位招聘登记的时候使用
		return map;
	}
	
	//在数据库中插入单位招聘的相应数据
	//李先军
	@Transactional
	public void postRecruitInfo(ZjDwzpdjb c,ZjDwzpgzb gz) {
		companyRegisterDao.insert(c);
		gz.setZpbh(c.getZpbh());
		companyWorkDao.insert(gz);
	}
	
}
