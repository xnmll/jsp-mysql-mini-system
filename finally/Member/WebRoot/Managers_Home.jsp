<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">
<title>渭南石羊企业生猪养殖信息系统</title>
<link href="index/css/default.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"
	href="index/js/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="index/js/themes/icon.css" />
<script type="text/javascript" src="index/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="index/js/jquery.easyui.pack.js"></script>

<script type="text/javascript" src='index/js/outlook2.js'>
	
</script>

<script type="text/javascript">
	var _menus = {
		"menus" : [ {
			"menuid" : "1",
			"icon" : "icon-sys",
			"menuname" : "供应商管理",
			"menus" : [ {
				"menuname" : "猪苗供应商",
				"icon" : "icon-users",
				"url" : "store_zhumiao.html"
			}, {
				"menuname" : "饲料供应商",
				"icon" : "icon-users",
				"url" : "store_siliao.html"
			}, {
				"menuname" : "药品供应商",
				"icon" : "icon-users",
				"url" : "store_yaopin.html"
			} ]
		}, {
			"menuid" : "2",
			"icon" : "icon-sys",
			"menuname" : "猪只管理",
			"menus" : [ {
				"menuname" : "猪只购入合同",
				"icon" : "icon-remove",
				"url" : "zhuzhi_contract.html"
			}, {
				"menuname" : "销售情况",
				"icon" : "icon-remove",
				"url" : "zhuzhi_xiaoshou.html"
			} , {
				"menuname" : "死亡记录",
				"icon" : "icon-remove",
				"url" : "zhuzhi_siwang.html"
			}, {
				"menuname" : "生病记录",
				"icon" : "icon-remove",
				"url" : "zhuzhi_shengbing.html"
			}, {
				"menuname" : "喂养记录",
				"icon" : "icon-remove",
				"url" : "zhuzhi_weiyang.html"
			}]
		}, {
			"menuid" : "3",
			"icon" : "icon-sys",
			"menuname" : "猪场管理",
			"menus" : [ {
				"menuname" : "饲料领用",
				"icon" : "icon-remove",
				"url" : "zhuchang_siliao.html"
			}, {
				"menuname" : "药品领用",
				"icon" : "icon-remove",
				"url" : "zhuchang_yaopin.html"
			}, {
				"menuname" : "物料采用",
				"icon" : "icon-remove",
				"url" : "zhuchang_wuliao.html"
			}, {
				"menuname" : "猪场职工信息",
				"icon" : "icon-remove",
				"url" : "zhuchang_zhigong.html"
			}  ]
		}, {
			"menuid" : "4",
			"icon" : "icon-sys",
			"menuname" : "客户管理",
			"menus" : [ {
				"menuname" : "客户信息管理",
				"icon" : "icon-users",
				"url" : "client_clientinfo.html"
			}]
		} ]
	};


	$(function() {

		openPwd();
		//
		$('#editpass').click(function() {
			$('#w').window('open');
		});

		$('#btnEp').click(function() {
			serverLogin();
		})

		$('#btnCancel').click(function() {
			closePwd();
		})

		$('#loginOut').click(function() {
			alert("dmeo");
			$.messager.confirm('系统提示', '您确定要退出本次登录吗?', function(r) {

				if (r) {
					location.href = 'login.jsp';
				}
			});

		})

	});
</script>

</head>
<body class="easyui-layout" style="overflow-y: hidden" scroll="no">
	<noscript>
		<div
			style="position: absolute; z-index: 100000; height: 2046px; top: 0px; left: 0px; width: 100%; background: white; text-align: center;">
			<img src="index/images/noscript.gif" alt='抱歉，请开启脚本支持！' />
		</div>
	</noscript>
	<div region="north" split="true" border="false"
		style="overflow: hidden; height: 30px; background: url(index/images/layout-browser-hd-bg.gif) #7f99be repeat-x center 50%; line-height: 20px; color: #fff; font-family: Verdana, 微软雅黑, 黑体">
		<span style="float: right; padding-right: 20px;" class="head">欢迎
			<font color="red"><%=session.getAttribute("adminName")%></font> <a href="#" id="loginOut">安全退出</a>
		</span> <span style="padding-left: 10px; font-size: 16px;"><img
			src="index/images/blocks.gif" width="20" height="20"
			align="absmiddle" />渭南石羊企业生猪养殖信息系统</span>
	</div>
	<div region="south" split="true"
		style="height: 30px; background: #D2E0F2;"></div>
	<div region="west" split="true" title="导航菜单" style="width: 180px;"
		id="west">
		<div class="easyui-accordion" fit="true" border="false">
			<!--  导航内容 -->

		</div>

	</div>
	<div id="mainPanle" region="center"
		style="background: #eee; overflow-y: hidden">
		<div id="tabs" class="easyui-tabs" fit="true" border="false">
			<div title="欢迎使用" style="padding: 20px; overflow: hidden;" id="home">

				<h1>欢迎使用</h1>
				<h1>渭南石羊企业生猪养殖信息系统</h1>
				<p>左侧为菜单栏</p>

			</div>
		</div>
	</div>



	<div id="mm" class="easyui-menu" style="width: 150px;">
		<div id="mm-tabclose">关闭</div>
		<div id="mm-tabcloseall">全部关闭</div>
		<div id="mm-tabcloseother">除此之外全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-tabcloseright">当前页右侧全部关闭</div>
		<div id="mm-tabcloseleft">当前页左侧全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-exit">退出</div>
	</div>


</body>
</html>