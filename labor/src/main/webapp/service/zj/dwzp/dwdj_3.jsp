<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>dwdj_3_insertzpgzxx</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/styles/css/common.css"
	rel="stylesheet" type="text/css">
<script src="<%=request.getContextPath()%>/js/commonjs.js"></script>

<script type="text/javascript" src="../../../js/jquery-1.11.1.js"></script>

<script type="text/javascript">
	$(function(){
	
		$.get("dwdj_1.do",{code:"whcd"},function(data){
			$("#whcd").html(data);
		});
		$.get("dwdj_1.do",{code:"ygxs"},function(data){
			$("#ygxs").html(data);
		});
		$.get("dwdj_1.do",{code:"hyzk"},function(data){
			$("#hyzk").html(data);
		});
		$.get("dwdj_1.do",{code:"jkzk"},function(data){
			$("#jkzk").html(data);
		});
		$.get("dwdj_1.do",{code:"rylb"},function(data){
			$("#rylb").html(data);
		});
		$.get("dwdj_1.do",{code:"zpdq"},function(data){
			$("#zpdq").html(data);
		});
		$.get("dwdj_1.do",{code:"jsjdj"},function(data){
			$("#jsjdj").html(data);
		});
		$.get("dwdj_1.do",{code:"jsjslcd"},function(data){
			$("#jsjslcd").html(data);
		});
		$.get("dwdj_1.do",{code:"jyyz"},function(data){
			$("#jyyz").html(data);
		});
		$.get("dwdj_1.do",{code:"yzslcd"},function(data){
			$("#yzslcd").html(data);
		});
		$.get("dwdj_1.do",{code:"gwlb"},function(data){
			$("#gwlb").html(data);
		});
		$.get("dwdj_1.do",{code:"hjxz"},function(data){
			$("#hjxz").html(data);
		});
		
		$.getJSON("dwdjInfo.do",{code:"dwbh",dwbh:$("#dwbh").val()},function(data){
			$("#dwlxr").val(data.dwlxr);
			$("#lxrsfzhm").val(data.lxrsfzhm);
			$("#lxrsj").val(data.lxrsj);
		});
	
	$("#bc").click(function(){
		var reg=/[a-zA-Z_0-9]$/
        
      var regtoo=/[0-9]$/
        
      var regthree=/[_a-z0-9]+@([_a-z0-9]+\.)+[a-z0-9]{2,3}$/;   
		if(form1.zpgz.value==""){
			alert("招聘工种不允许为空!");
				return;
		}
		if($("#dwlxr").val()==""){
			alert("单位经办人不能为空");
			return;
		}
		if($("#nars").val()==""&&$("#nvrs").val()==""&&$("#xbbx").val()==""){
			alert("请至少填写一项招聘人数");
			return;
		}
	
		if($("#ygxs").val()==""){
			alert("用工形式不能为空");
			return;
		}
		if(regtoo.test(form1.dwlxr.value)){
			alert("请正确填写经办人!");
			return;
		}
		if(form1.lxrsfzhm.value!=""&&!regtoo.test(form1.lxrsfzhm.value)){
		    alert("身份证格式输入不正确，请重新输入！");
		    return;
		}
		if(form1.lxrsj.value!=""&&!regtoo.test(form1.lxrsj.value)){
		    alert("手机格式输入不正确，请重新输入！");
		    return;
		}
		if(form1.fbkssj.value!=""&&!regtoo.test(form1.fbkssj.value)){
		    alert("开始时间格式输入不正确，请重新输入！");
		    return;
		}
		if(form1.fbjssj.value!=""&&!regtoo.test(form1.fbjssj.value)){
		    alert("结束时间格式输入不正确，请重新输入！");
		    return;
		}
		if(form1.nars.value!=""&&!regtoo.test(form1.nars.value)){
		    alert("招聘人数男只能输入数字，请重新输入！");
		    return;
		}
		if(form1.nvrs.value!=""&&!regtoo.test(form1.nvrs.value)){
		    alert("招聘人数女只能输入数字，请重新输入！");
		    return;
		}
		if(form1.xbbx.value!=""&&!regtoo.test(form1.xbbx.value)){
		    alert("招聘人数不限只能输入数字，请重新输入！");
		    return;
		}
		if(form1.zxnl.value!=""&&!regtoo.test(form1.zxnl.value)){
		    alert("开始年龄只能输入数字，请重新输入！");
		    return;
		}
		
		if(form1.zdnl.value!=""&&!regtoo.test(form1.zdnl.value)){
		    alert("截止年龄只能输入数字，请重新输入！");
		    return;
		}
		if(form1.zdyx.value!=""&&!regtoo.test(form1.zdyx.value)){
		    alert("开始月薪只能输入数字，请重新输入！");
		    return;
		}
		if(form1.zgyx.value!=""&&!regtoo.test(form1.zgyx.value)){
		    alert("结束月薪只能输入数字，请重新输入！");
		    return;
		}
		if($("#nars").val()==""){
			$("#nars").val("0");
		}
		if($("#nvrs").val()==""){
			$("#nvrs").val("0");
		}
		if($("#xbbx").val()==""){
			$("#xbbx").val("0");
		}
		form1.submit();
		});
	
	});
</script>
<script type="text/javascript">
	$(function(){
		//填写完单位法人码之后就可以确定单位是否存在了,不存在提示去注册单位
		$("#dwfrm").blur(function(){
			var frm=$("#dwfrm").val();
			//为了简便，复用之前的代码，实际上为了性能，只需验证该单位法人码是否存在即可
			$.getJSON("../../getCompany/"+frm,function(data){
				$("#greentx").html(data.existsCompany);
				$("#dwbh").val(data.dwbh);
			});
		});
	});
	
</script>

<script type="text/javascript">
	$(function(){
		 $("#zpgz").load("../../workType/1");//工种workType
		 $("#gwlb").load("../../postType/1")//岗位类别gwlb
		 $("#hjxz").load("../../houseHoldType/1"); //户籍性质
		 $("#whcd").load("../../educationLevel/1");//教育等级educationLevel
		 $("#ygxs").load("../../employType/10");//用工形式employType，为了前端页面下拉项显示空白，所以选10，其他的同样的道理
		 $("#hyzk").load("../../marriageType/10");//婚姻marriageType
		 $("#jkzk").load("../../healthState/10"); //健康状态healthState
		 $("#rylb").load("../../personnelType/1"); //人员类别personnelType
		 $("#zpdq").load("../../region/province/1");//招聘 地区，显示省/市
		 $("#jsjdj").load("../../computerGrade/10"); //computerGrade
		 $("#jsjslcd").load("../../proficiency/10"); //熟练程度proficiency
		 $("#jyyz").load("../../language/100"); //language
		 $("#slcd").load("../../proficiency/10"); //熟练程度proficiency
		 
	});
</script>

<script>
	function doInsert(){
		if(form1.zpgz.value==""){
			alert("职业名称不能为空!");
			return;
		}
		if(form1.xbbx.value==""&&form1.nvrs.value==""&&form1.nars.value==""){
			alert("招聘人数不能为空!");
			return;
		}
		if(form1.ygxs.value==""){
			alert("用工形式不能为空!");
			return;
		}
		if(form1.fwcslx.options[form1.fwcslx.selectedIndex].value=="2"){
			if(form1.fwcs.value==""){
				alert("您已经选择了自定义服务次数,请填写服务次数");
				return;
			}
		}
		if(!testNum(form1.fwcs.value)){
			alert("服务次数需为数字!");
			return;
		}
		form1.bc.disabled=true;
		form1.fh.disabled=true;
		form1.action="<%=request.getContextPath()%>/ldlsc/dw/dwdj.do?method=insertZpgzxx";
		form1.submit();
	}
	function setZymc(){
		var rtValue;
		var dx=(screen.height/2-85)+"";
   		var dy=(screen.width/2-200)+"";
   		
		rtValue=window.showModalDialog("<%=request.getContextPath()%>/common/choosegz_ModalDialog_qyc.jsp",null,"dialogTop="+dx+";dialogLeft="+dy+";dialogHeight=170px;dialogWidth=400px;help=no;fullscreen=1;status=no;center=yes");
		if(rtValue!=undefined&&rtValue!=""){
			document.all.zpgztd.removeChild(form1.zpgz);
			document.all.zpgztd.innerHTML="<select name=\"zpgz\" style=\"WIDTH: 100%\" onclick=\"setZymc()\">"+rtValue+"</select>";
		}
	}
	
	function setZyjn(){
	
		var rtValue;
		var dx=(screen.height/2-85)+"";
   		var dy=(screen.width/2-200)+"";
		rtValue=window.showModalDialog("<%=request.getContextPath()%>/common/choosegz_ModalDialog_qyc.jsp","工种选择","dialogTop="+ dx+ ";dialogLeft="+ dy+ ";dialogHeight=170px;dialogWidth=400px;help=no;fullscreen=1;status=no;center=yes");
		if (rtValue != undefined && rtValue != "") {
			document.all.zpjntd.removeChild(form1.jyzyjn);
			document.all.zpjntd.innerHTML = "<select name=\"jyzyjn\" style=\"WIDTH: 100%\" onclick=\"setZyjn()\">"+ rtValue + "</select>";
		}
	}
	/*
	function operateZprs(){
		if(form1.xbbx.value==""&&(form1.nvrs.value!=""||form1.nars.value!="")){
			document.all.xbbxtd.removeChild(form1.xbbx);
			document.all.xbbxtd.innerHTML="<INPUT name=\"xbbx\" size=\"8\" style=\"WIDTH: 100%\" maxlength=\"3\" readonly>";
		}else if(form1.xbbx.value!=""&&(form1.nvrs.value==""&&form1.nars.value=="")){
			document.all.narstd.removeChild(form1.nars);
			document.all.narstd.innerHTML="<INPUT name=\"nars\" size=\"8\" style=\"WIDTH: 100%\" maxlength=\"3\" readonly>";
			document.all.nvrstd.removeChild(form1.nvrs);
			document.all.nvrstd.innerHTML="<INPUT name=\"nvrs\" size=\"8\" style=\"WIDTH: 100%\" maxlength=\"3\" readonly>";
		}else if(form1.xbbx.value==""&&form1.nvrs.value==""&&form1.nars.value=="")){
			document.all.xbbxtd.removeChild(form1.xbbx);
			document.all.xbbxtd.innerHTML="<INPUT name=\"xbbx\" size=\"8\" style=\"WIDTH: 100%\" maxlength=\"3\" onblur=\"operateZprs();\">";
			document.all.narstd.removeChild(form1.nars);
			document.all.narstd.innerHTML="<INPUT name=\"nars\" size=\"8\" style=\"WIDTH: 100%\" maxlength=\"3\" onblur=\"operateZprs();\">";
			document.all.nvrstd.removeChild(form1.nvrs);
			document.all.nvrstd.innerHTML="<INPUT name=\"nvrs\" size=\"8\" style=\"WIDTH: 100%\" maxlength=\"3\" onblur=\"operateZprs();\">";
		}
	}
	 */
	function operateFwcs() {
		if (form1.fwcslx.options[form1.fwcslx.selectedIndex].value == "1") {
			document.all.fwcstd.removeChild(form1.fwcs);
			document.all.fwcstd.innerHTML = "<input name=\"fwcs\" style=\"WIDTH: 100%\" maxlength=\"4\" value=\"10\" readonly>";
		} else if (form1.fwcslx.options[form1.fwcslx.selectedIndex].value == "2") {
			document.all.fwcstd.removeChild(form1.fwcs);
			document.all.fwcstd.innerHTML = "<input name=\"fwcs\" style=\"WIDTH: 100%\" maxlength=\"4\" value=\"\">";
		}
	}
</script>
</head>
<body>
	<form method="post" name="form1" action="../../postRecruitInfo">
		<input type="hidden" name="dwdj" value="dwdj3" /> <input
			type="hidden" name="dwbh" id="dwbh"
			value=<%=request.getSession().getAttribute("dwbh")%>>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td>
					<table width="98%" border="0" align="center" cellpadding="0"
						cellspacing="0">
						<tr>
							<td height="20" valign="bottom"><img
								src="<%=request.getContextPath()%>/styles/images/right/now.gif"
								width="11" height="12"> 当前位置：职业介绍 &gt; 单位登记 &gt; 新增招聘工种信息
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
							<td valign="bottom">招聘信息[公司名称法人码]</td>
						</tr>
					</table>
					<table width="98%" border="0" cellpadding="0" cellspacing="1">
						<tr class="line2">
							<td align="right" width="13%"><span class="redtxt">*</span>法人码</td>
							<td align="right" width="20%"><INPUT name="dwfrm" id="dwfrm"
								style="WIDTH: 100%" maxlength="32">
								<!-- dwbh,写这个的目的是dwbh是Integer类型的，而不写使用SpringMVC会出现问题-->
								<input type="hidden" name="dwbh"  id="dwbh"/>
							</td>
							
							<td align="left" width="20%">
								<span id="greentx"></span>
							</td>
						
							<td align="right" width="13%"><span class="redtxt">*</span>经办人</td>
							<td align="right" width="20%"><INPUT name="dwlxr" id="dwlxr"
								style="WIDTH: 100%" maxlength="32">
							</td>
						</tr>		
						<tr class="line2">		
							<td align="right" width="13%">身份证</td>
							<td align="right" width="20%"><INPUT name="lxrsfzhm"
								id="lxrsfzhm" style="WIDTH: 100%" maxlength="32"></td>
								
							<td align="right" width="20%">
							</td>
								
							<td align="right" width="13%">手机</td>
							<td align="right" width="20%"><input name="lxrsj" id="lxrsj"
								style="WIDTH: 100%" maxlength="11"></td>
						<tr>
							<td colspan="6" valign="bottom"
								background="<%=request.getContextPath()%>/styles/images/right/dsline.gif"
								height="8"><img
								src="<%=request.getContextPath()%>/styles/images/index/spacer.gif">
							</td>
						</tr>
						<tr class="line2">
							<td align="right"><span class="redtxt">*</span>招聘工种</td>
							<td id="zpgztd"><select name="zpgz" id="zpgz"
								style="WIDTH: 100%" onclick=setZymc();>
									<!--弹出ModalDialog-->
							</select></td>
							<td align="right">岗位名称</td>
							<td align="left"><INPUT name="zpgzbm" style="WIDTH: 100px"
								maxlength="16"></td>
							<td align="right">岗位类别</td>
							<!-- 登记默认岗位类别为日常招聘岗位 -->
							<td><select id="gwlb" name="gwlb" style="WIDTH: 100px">

							</select></td>
						</tr>
						<tr class="line1">
							<td align="right"><span class="redtxt">*</span>招聘人数</td>
							<td colspan="3">男 <INPUT name="zprsn" id="zprsn" size="1">
								女 <INPUT name="zprsnv" id="zprsnv" size="1"> 不限 <INPUT
								name="xbbx" id="xbbx" size="1">
							</td>
							<td align="right">户籍性质</td>
							<td><select id="hjxz" name="hjxz" style="WIDTH: 100%">

							</select></td>
						</tr>
						<tr class="line2">
							<td align="right" width="140">开始时间</td>
							<td><textarea name="kssj" style="WIDTH: 100%" class='mask'
									rows="1" cols="10" ></textarea></td>

							<td align="right">截至时间</td>
							<td><textarea name="jssj" style="WIDTH: 100%" class='mask'
									rows="1" cols="10" ></textarea></td>
							<td align="right">年龄</td>
							<td>
								<table width="100%" border="0" cellpadding="0" cellspacing="0">
									<tr>
										<td width="45%"><INPUT name="zxnl" style="WIDTH: 100%"
											maxlength="2"></td>
										<td width="10%">至</td>
										<td width="45%"><INPUT name="zdnl" style="WIDTH: 100%"
											maxlength="2"></td>
									</tr>
								</table>
							</td>
						</tr>
						<tr class="line1">
							<td align="right" width="140">文化程度</td>
							<td><select id="whcd" name="whcd" style="WIDTH: 100%">
							</select></td>

							<td align="right"><span class="redtxt">*</span>用工形式</td>
							<td><select id="ygxs" name="ygxs" style="WIDTH: 100%">

							</select></td>

							<td align="right">月薪</td>
							<td>
								<table width="100%" border="0" cellpadding="0" cellspacing="0">
									<tr>
										<td width="45%"><INPUT name="zzyx" style="WIDTH: 100%"
											maxlength="5" onblur="checkJe(this);"></td>
										<td width="10%">至</td>
										<td width="45%"><INPUT name="zgyx" style="WIDTH: 100%"
											maxlength="5" onblur="checkJe(this);"></td>
									</tr>
								</table>
							</td>

						</tr>
						<tr class="line2">
							<td align="right">婚姻状况</td>
							<td><select id="hyzk" name="hyzk" style="WIDTH: 100%">

							</select></td>
							<td align="right">健康状况</td>
							<td><select id="jkzk" name="jkzk" style="WIDTH: 100%">

							</select></td>
							<td align="right">招用应届生</td>
							<td><select name="sfbys" style="WIDTH: 100%">
									<option value=""></option>
									<option value="1">是</option>
									<option value="0">否</option>
							</select></td>
						</tr>
						<tr class="line2">
							<td align="right">人员类别</td>
							<td><select id="rylb" name="rylb" style="WIDTH: 100%">

							</select></td>
							<td align="right">招聘地区</td>
							<td><select id="zpdq" name="zpdq" style="WIDTH: 100%">

							</select></td>
							<td align="right"></td>
							<td></td>

						</tr>

						<tr class="line1">
							<td align="right">计算机等级</td>
							<td><select id="jsjdj" name="jsjdj" style="WIDTH: 100%">

							</select></td>
							<td align="right">熟练程度</td>
							<td><select id="jsjslcd" name="jsjslcd" style="WIDTH: 100%">

							</select></td>
						</tr>
						<tr class="line2">
							<td align="right">具有外语</td>
							<td><select id="jyyz" name="jyyz" style="WIDTH: 100%">

							</select></td>
							<td align="right">熟练程度</td>
							<td><select id="slcd" name="slcd" style="WIDTH: 100%">

							</select></td>

						</tr>
						<tr class="line1">
							<td align="right">工作地点</td>
							<td colspan="5"><INPUT name="gzdd" style="WIDTH: 100%">
							</td>

						</tr>
						<tr class="line2">
							<td align="right">岗位描述</td>
							<td><textarea name="gwms" style="width: 152"></textarea></td>
						</tr>

					</table>
			<tr>
				<td>
					<TABLE width="100%" border=0 cellPadding=0 cellSpacing=1
						class="tablebody" align="center">
						<tr height="15px">
							<td></td>
						</tr>
						<TR align="center">
							<TD class="line2"><input name="postRecruitInfo" id="postRecruitInfo" type="submit"
								class="BUTTONs3" value="保 存"> &nbsp;&nbsp; <INPUT
								name="fh" type="submit" class="BUTTONs3" value="返 回"></TD>
						</TR>
					</TABLE>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
