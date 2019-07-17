<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

  <meta charset="utf-8">

  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

  <title>超市信息管理系统</title>

  <link rel="stylesheet" href="/Supermarket/static/lib/layui/css/layui.css">
  
  <script type="text/javascript" src="/Supermarket/static/jquery.min.js"></script>

<style>

.window{  

    width: 400px;  
	height:400px;
    position: absolute;  

    margin-left: -200px;  

    margin-top: -80px;  
    
    top: 30%;  

    left: 48%;  

    display: block;  

    z-index: 2000;  

     background: #ffffff;

    padding: 20 0;

} 

</style>

</head>

<body style="background: #D5D5D5;">

	<div class="window">
	
	<h1 style="text-align: center;color: #3CC48D;margin-top: 50px;">超市管理系统登陆</h1>
	
		<form class="layui-form layui-form-pane1" action="login" method="post">
		
			<div class="layui-form-item" style="margin-right: 100px;margin-top: 30px;">
		    	<label class="layui-form-label">用户名</label>
		    	<div class="layui-input-block">
		     		<input type="text" name="username" lay-verify="required|title" lay-reqText="用户名不能为空" required placeholder="请输入用户名" autocomplete="off" class="layui-input" >
		    	</div>
			</div>
			
			<div class="layui-form-item">
		    	<label class="layui-form-label">密码</label>
		    	<div class="layui-input-inline">
		      		<input type="password" name="password" lay-verify="required|pass" placeholder="请输入密码" autocomplete="off" class="layui-input">
		    	</div>
		    </div>
		    
			<div class="layui-form-item" pane>
			    <div class="layui-input-block">
			      <input type="checkbox" name="remberme" lay-skin="primary" title="记住我">
			    </div>
			 </div>
			 
			<div class="layui-form-item">
				<div class="layui-input-block">
					<button class="layui-btn" type="submit">登陆</button>
					<button type="reset" class="layui-btn layui-btn-primary">重置</button>
				</div>
			</div>
		</form>
	</div>


<script src="/Supermarket/static/lib/layui/layui.js"></script>

<!-- <script src="../build/lay/dest/layui.all.js"></script> -->

<script>
$(function() {
	var ss = '${msg}';
	if((ss!==null)&&(ss!=='')){
		alert(ss);
	}
	
	var cookie = document.cookie;
	var cs = cookie.split(";");
	for(var i = 0;i<cs.length;i++){
		var c = cs[i];
		c = c.trim();
		if(c.indexOf("name=")==0){
			$('input[name=username]').val(c.substring("name=".length));
			$('input[name=remberme]').attr('checked',true);
		}
		if(c.indexOf("pwd=")==0){
			$('input[name=password]').val(c.substring("pwd=".length));
		}
	}
	
})
layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  
  //自定义验证规则
  form.verify({
    title: function(value){
      if(value.length < 2){
        return '标题也太短了吧';
      }
    }
    ,pass: [/(.+){6,12}$/, '密码必须6到12位']
    ,money: [
      /^\d+\.\b\d{2}\b$/
      ,'金额必须为小数保留两位'
    ]
  });
  
  //日期
  laydate.render({
    elem: '#date'
  });
  

  
  //事件监听
  form.on('select', function(data){
    console.log('select: ', this, data);
  });
  
  form.on('select(quiz)', function(data){
    console.log('select.quiz：', this, data);
  });
  
  form.on('select(interest)', function(data){
    console.log('select.interest: ', this, data);
  });
  
  
  
  form.on('checkbox', function(data){
    console.log(this.checked, data.elem.checked);
  });
  
  form.on('switch', function(data){
    console.log(data);
  });
  
  
  //监听提交
  form.on('submit(*)', function(data){
    console.log(data)
    //alert(JSON.stringify(data.field));
    return false;
  });
  
});

</script>
</body>

</html>