<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>dwdj_3_updateBase</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/styles/css/common.css"
	rel="stylesheet" type="text/css">
	
<script type="text/javascript" src="../../../js/jquery-1.11.1.js"></script>
<script type="text/javascript">
	$(function(){
		//填写完单位法人码之后就可以确定单位是否存在了，存在之后就可以回显信息了
		$("#dwfrm").blur(function(){
			var frm=$("#dwfrm").val();
			$.getJSON("../../getCompany/"+frm,{},function(data){
				if(data!=null){
					if(confirm("用户已存在是否显示该用户")){
						//bio_rga_regioncode=230106000000, bio_bua_postcode=50228,
						//bio_orgtype=10, bio_id=2, bio_industry=G0200, bio_bua_address=哈尔滨香坊区, 
						//bio_shortname=宇信科技, bio_name=宇信科技有限公司, bio_con_fax=50292059,
						//bio_con_mail=50292059@163.com, bio_no=110, cdg_regtype=130}
						$("#dwbh").val(data.bio_id);//单位编号
						$("#dwqc").val(data.bio_name);//单位全称
						$("#dwjc").val(data.bio_shortname);//单位简称
						$("#dwxz").val(data.bio_orgtype);//单位性质
						$("#dwjjlx").val(data.cdg_regtype);//经济类型
						$("#dwhy").val(data.bio_industry);//单位行业
						$("#yzbm").val(data.bio_bua_postcode);//邮政编码
						$("#czjh").val(data.bio_con_fax);//电话
						$("#email").val(data.bio_con_mail);//邮箱
						
						//回显省/市的下拉列表
						$("#dwszs").load("../../regionCallBack/province/"+data.bio_rga_regioncode);
						//回显市/县
						$("#dwszq").load("../../regionCallBack/city/"+data.bio_rga_regioncode);
						//回显县/街道
						$("#dwszj").load("../../regionCallBack/village/"+data.bio_rga_regioncode);
						
						$("#lxdz").val(data.bio_bua_address);//经营地址
					}else{
						$("$dwfrm").val("");
					}
				}else{
					if($("#dwfrm").val()!=""){
						alert("该单位首次登记请仔细输入信息");
					}
				}		
			});
		});
		$("#bc").click(function(){
		var reg=/[a-zA-Z_0-9]$/
       	var regtoo=/[0-9]$/
       	var regthree=/[_a-z0-9]+@([_a-z0-9]+\.)+[a-z0-9]{2,3}$/;   
		if($("#dwfrm").val()==""){
				alert("单位法人码不能为空");
				return;
		}
		if($("#lxdz").val()==""){
			alert("经营地址不能为空");
			return;
		}
		if($("#dwqc").val()==""){
			alert("单位全称不能为空");
			return;
		}
		if($("#dwxz").val()==""){
			alert("单位性质不能为空");
			return;
		}
		if($("#dwjjlx").val()==""){
			alert("经济类型不能为空");
			return;
		}	
		if($("#dwhy").val()==""){
			alert("单位行业不能为空");
			return;
		}	
		if($("#dwszj").val()==""){
			alert("街区不能为空");
			return;
		}
		if(!reg.test(form1.dwfrm.value)){
		    alert("单位法人码不允许输入中文");
		    return;
		}
		if(form1.yzbm.value!=""&&!regtoo.test(form1.yzbm.value)){
		    alert("邮政编码只允许输入数字！");
		    return;
		}
		if(form1.czjh.value!=""&&!regtoo.test(form1.czjh.value)){
		    alert("传真机号只允许输入数字！");
		    return;
		}
		if(form1.email.value!=""&&!regthree.test(form1.email.value)){
		    alert("Email格式输入不正确，请重新输入！");
		    return;
		}
		$("#bc").attr("disabled",true);
			form1.submit();
	});
	});

</script>
<script type="text/javascript">
	$(function(){
		 $("#dwxz").load("../../companyType/1"); //单位性质
		 $("#dwjjlx").load("../../economicType/1"); //单位经济类型
		 $("#dwhy").load("../../companyIndustry/1");//单位行业下拉列表
		 $("#dwszs").load("../../region/province/1");//单位省(市)
		 $("#dwszs").change(function(){
			 $("#dwszq").load("../../region/city/"+$("#dwszs").val());//将你选中的省的id传过去，以便获得市(区)县
		 });
		 
		 $("#dwszq").change(function(){
			 $("#dwszj").load("../../region/village/"+$("#dwszq").val());//将你选中的市的id传过去，以便获得街、镇、乡
		 });
		 
		 $("#goBack").click(function(){
			 location.href="javascript:history.go(-1)";//后退一步
		 });
	});
</script>

</head>
<body>
	<form name="form1" action="../../saveCompany" method="post">
		<input type="hidden" name="dwdj" value="dwdj2" /> 
		<input type="hidden" name="bioId" id="dwbh" />
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td>
					<table width="98%" border="0" align="center" cellpadding="0"
						cellspacing="0">
						<tr>
							<td height="20" valign="bottom"><img
								src="<%=request.getContextPath()%>/styles/images/right/now.gif"
								width="11" height="12"> 当前位置：职业介绍 &gt; 单位登记 &gt; 新增单位基本信息
							</td>
						</tr>
						<tr>
							<td valign="bottom"
								background="<%=request.getContextPath()%>/styles/images/right/dsline.gif"
								height="8"><img
								src="<%=request.getContextPath()%>/styles/images/index/spacer.gif">
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td align="center" valign="top">
					<table width="98%" border="0" cellpadding="0" cellspacing="0"
						class="title">
						<tr>
							<td width="30">
								<table border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td><img
											src="<%=request.getContextPath()%>/styles/css/bb_d.gif">
										</td>
									</tr>
								</table>
							</td>
							<td valign="bottom">
								基本信息&nbsp;&nbsp;&nbsp;[提示：单位登记有效期为12天,使用修改功能可以延长有效期12天]</td>
						</tr>
					</table>
			<tr>
				<td align="center" valign="top">
					<table width="98%" border="0" cellspacing="0" cellpadding="0"
						style="display: block">

						<tr>
							<td valign="top">
								<table width="100%" border="0" cellspacing="1" cellpadding="0">
									<tr class="line2">
										<td width="13%" align="right"><span class="redtxt">*</span>单位法人码</td>
										<td width="18%"><input name="bioNo" id="dwfrm"
											style="WIDTH: 100%" maxlength="32">
										</td>
											
										<td width="13%" align="right"><span class="redtxt">*</span>单位全称</td>
										<td width="20%"><INPUT name="bioName" id="dwqc"
											style="WIDTH: 100%" maxlength="64" value=""
											onkeyup=copyValue();>
										</td>
											
											
										<td width="14%" align="right">单位简称</td>
										<td width="20%"><INPUT name="bioShortname" id="dwjc"
											style="width: 100%" maxlength="32" value="">
										</td>
									</tr>
									<tr class="line1">
										<td align="right"><span class="redtxt">*</span>单位性质</td>
										<td width="18%">
											<select id="dwxz" name="bioOrgtype" style="width: 100%"></select>
										</td>
										<td align="right"><span class="redtxt">*</span>经济类型</td>
										<td><select id="dwjjlx" name="cdgRegtype" style="WIDTH: 100%">


										</select></td>
										<td align="right"><span class="redtxt">*</span>单位行业</td>
										<td>
											<select id="dwhy" name="bioIndustry" style="WIDTH: 100%"></select>
										</td>
									</tr>
									<tr class="line2">
										<td align="right">邮政编码</td>
										<td><input name="bioBuaPostcode" id="yzbm" style="WIDTH: 100%"
											maxlength="32"></td>
										<td align="right">传真机号</td>
										<td><input name="bioConFax" id="czjh" style="WIDTH: 100%"
											maxlength="32" value=""></td>
										<td align="right">Email</td>
										<td><INPUT name="bioConMail" id="email" style="WIDTH: 100%"
											maxlength="64" value=""></td>
									</tr>
									<tr class="line1">
										<td align="right"><span class="redtxt">*</span>注册省(市)</td>
										<td>
											<select id="dwszs" name="dwszs" style="WIDTH: 100%"
												onchange="initCity()"> 
												<!-- ${Regioncode }   -->
											</select>
										</td>
										<td align="right">市(区\县)</td>
										<td id="sqx"><select id="dwszq" name="dwszq"
											style="WIDTH: 100%" onchange="initVillage()">
										</select></td>
										<td align="right">街(镇\乡)</td>
										<td id="jzx"><select id="dwszj" name="bioRgaRegioncode"
											style="WIDTH: 100%">
										</select></td>
									</tr>
									<tr class="line2">
										<td align="right"><span class="redtxt">*</span>经营地址</td>
										<td colspan="5"><input name="bioBuaAddress" id="lxdz"
											style="WIDTH: 100%" maxlength="64" value=""></td>
									</tr>

								</table>
							</td>
						</tr>
					</table> <br>
					<table width="100%" border=0 cellPadding=0 cellSpacing=1
						class="tablebody" align="center">
						<tr align="center">
							<td class="line2">
								<input id="saveCompany" type="submit" class="BUTTONs3" value="保 存"> &nbsp;&nbsp; 
								<input id="goBack" type="button" class="BUTTONs3" value="返 回">
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>