<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="x-admin-sm">
    
    <head>
        <meta charset="UTF-8">
        <title>添加用户</title> 
        <link rel="stylesheet" href="/Supermarket/static/css/font.css">
        <link rel="stylesheet" href="/Supermarket/static/css/xadmin.css">
        <link rel="stylesheet" href="/Supermarket/static/lib/layui/css/layui.css">
        <script type="text/javascript" src="/Supermarket/static/lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="/Supermarket/static/js/xadmin.js"></script>
        <script type="text/javascript" src="/Supermarket/static/jquery.min.js"></script>
    </head>
    <body>
        <div class="layui-fluid">
            <div class="layui-row">
                <form id="addform" class="layui-form" action="useraddform" method="post">
                  <div class="layui-form-item">
                      <label for="username" class="layui-form-label">
                          <span class="x-red">*</span>登录名
                      </label>
                      <div class="layui-input-inline">
                          <input type="text" id="username" name="username" required="" lay-verify="required"
                          autocomplete="off" class="layui-input">
                      </div>
                      <div class="layui-form-mid layui-word-aux">
                          <span class="x-red">*</span>将会成为您唯一的登入名
                      </div>
                  </div>
                  <div class="layui-form-item">
                      <label for="phone" class="layui-form-label">
                          <span class="x-red">*</span>手机
                      </label>
                      <div class="layui-input-inline">
                          <input type="text" id="phone" name="phone" required="" lay-verify="phone"
                          autocomplete="off" class="layui-input">
                      </div>
                      <div class="layui-form-mid layui-word-aux">
                          <span class="x-red">*</span>将会成为您唯一的登入名
                      </div>
                  </div>
                  <div class="layui-form-item">
                      <label for="L_email" class="layui-form-label">
                          <span class="x-red">*</span>邮箱
                      </label>
                      <div class="layui-input-inline">
                          <input type="text" id="L_email" name="email" required="" lay-verify="email"
                          autocomplete="off" class="layui-input">
                      </div>
                      <div class="layui-form-mid layui-word-aux">
                          <span class="x-red">*</span>
                      </div>
                  </div>
                 
                  <div class="layui-form-item">
                      <label for="L_pass" class="layui-form-label">
                          <span class="x-red">*</span>密码
                      </label>
                      <div class="layui-input-inline">
                          <input type="password" id="L_pass" name="pass" required="" lay-verify="pass"
                          autocomplete="off" class="layui-input">
                      </div>
                      <div class="layui-form-mid layui-word-aux">
                          6到16个字符
                      </div>
                  </div>
                  <div class="layui-form-item">
                      <label for="L_repass" class="layui-form-label">
                          <span class="x-red">*</span>确认密码
                      </label>
                      <div class="layui-input-inline">
                          <input type="password" id="L_repass" name="repass" required="" lay-verify="repass"
                          autocomplete="off" class="layui-input">
                      </div>
                  </div>
                  <div class="layui-form-item">
                      <label for="L_repass" class="layui-form-label">
                      </label>
                      <button id="submitAdd" onclick="adduser()" class="layui-btn" type="submit">
                          		增加
                      </button>
                  </div>
              </form>
            </div>
        </div>
        
        <script type="text/javascript"> 
        $(function(){
        	$("#submitAdd").click(function(){
        	    
        		  var targetUrl = $("#addform").attr("action");    
        		  var data = $("#addform").serialize();     
        		   $.ajax({ 
        		    type:'post',  
        		    url:targetUrl, 
        		    cache: false,
        		    data:data,  //重点必须为一个变量如：data
        		    //dataType:'json', 
        		    success:function(data){      
        		      alert('success');
        		    },
        		    error:function(){ 
        		     alert("请求失败")
        		    }
        		   })
        		    
        		})
        });
        
        
        </script>
    </body>

</html>
