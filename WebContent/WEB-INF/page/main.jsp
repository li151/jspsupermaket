<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  class="x-admin-sm">
<head>
	<meta charset="UTF-8">
	<title>超市信息管理系统</title>

    <link rel="stylesheet" href="/Supermarket/static/css/font.css">
	<link rel="stylesheet" href="/Supermarket/static/css/xadmin.css">
    <script type="text/javascript" src="/Supermarket/static/jquery.min.js"></script>
    <script type="text/javascript"src="https://cdn.bootcss.com/blueimp-md5/2.10.0/js/md5.min.js"></script>
    <script src="/Supermarket/static/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/Supermarket/static/js/xadmin.js"></script>
    <script type="text/javascript" src="/Supermarket/static/js/cookie.js"></script>
</head>
<body>
    <!-- 顶部开始 -->
    <div class="container">
        <div class="logo"><a href="#">大大明连锁超市</a></div>
        <div class="left_open">
            <i title="展开左侧栏" class="iconfont">&#xe699;</i>
        </div>
        
        <ul class="layui-nav right" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">${name}</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
              <dd><a onclick="x_admin_show('个人信息','http://www.baidu.com',200,200)">个人信息</a></dd>
              <dd><a onclick="x_admin_show('切换帐号','http://www.baidu.com')">修改密码</a></dd>
            </dl>
          </li>
          <li class="layui-nav-item to-index"><a href="./logout">退出登陆</a></li>
        </ul>
        
    </div>
    <!-- 顶部结束 -->
    
    <!-- 中部开始 -->
     <!-- 左侧菜单开始 -->
    <div class="left-nav">
      <div id="side-nav">
        <ul id="nav">
        <!-- 系统管理模块 -->
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ae;</i>
                    <cite>系统管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li date-refresh="1">
                        <a _href="./yhxx">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>用户信息</cite>
                            
                        </a>
                    </li >
                    <li>
                        <a _href="./bmxx">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>部门信息</cite>
                            
                        </a>
                    </li >
                    <li date-refresh="1">
                        <a _href="./dpxx">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>店铺信息</cite>
                            
                        </a>
                    </li>
                </ul>
            </li>
            
            <!-- 用户信息管理 -->
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b8;</i>
                    <cite>用户管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="./ygxx">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>员工信息</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="./ygkq">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>员工考勤</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="./yggz">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>员工工资</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <!-- 商品信息管理 -->
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe698;</i>
                    <cite>商品管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="./spxx">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>商品信息</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="./spcg">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>商品采购信息</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="./spxs">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>商品销售信息</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <!-- 供应商信息管理 -->
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe725;</i>
                    <cite>供应商管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="./gysxx">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>供应商信息</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="./gyslxr">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>供应商联系人信息</cite>
                        </a>
                    </li >
                </ul>
              </li>
                     
        </ul>
      </div>
    </div>
    <!-- <div class="x-slide_left"></div> -->
    <!-- 左侧菜单结束 -->
    <!-- 右侧主体开始 -->
    <div class="page-content">
        <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
          <ul class="layui-tab-title">
            <li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
          </ul>
          <div class="layui-unselect layui-form-select layui-form-selected" id="tab_right">
                <dl>
                    <dd data-type="this">关闭当前</dd>
                    <dd data-type="other">关闭其它</dd>
                    <dd data-type="all">关闭全部</dd>
                </dl>
          </div>
          <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='./zy' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
          </div>
          <div id="tab_show"></div>
        </div>
    </div>
    <div class="page-content-bg"></div>
    <!-- 右侧主体结束 -->
    <!-- 中部结束 -->
    <!-- 底部开始 -->
    <div class="footer">
        <div class="copyright">Copyright ©2019 会移动的代码</div>  
    </div>
    <!-- 底部结束 -->
    <script>
    
    </script>
</body>
</html>
