<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="x-admin-sm">
  
  <head>
    <meta charset="UTF-8">
    <title>供应商信息</title>

	<link rel="stylesheet" href="/Supermarket/static/css/font.css">
    <link rel="stylesheet" href="/Supermarket/static/css/xadmin.css">
    <script type="text/javascript" src="/Supermarket/static/jquery.min.js"></script>
    <script type="text/javascript" src="/Supermarket/static/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/Supermarket/static/js/xadmin.js"></script>
    <script type="text/javascript" src="/Supermarket/static/js/cookie.js"></script>

  </head>
  
<body>
        <div class="x-nav">
          <span class="layui-breadcrumb">
            <a href="">超市管理系统</a>
            <a href="">商品管理</a>
            <a>
              <cite>商品采购信息</cite></a>
          </span>
          <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" onclick="location.reload()" title="刷新">
            <i class="layui-icon layui-icon-refresh" style="line-height:30px"></i></a>
        </div>
        <div class="layui-fluid">
            <div class="layui-row layui-col-space15">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        
                        <div class="layui-card-header">
                            
                            <button class="layui-btn" onclick="x_admin_show('添加用户','./admin-add.html',600,400)"><i class="layui-icon"></i>新增供应商信息</button>
                        	<button class="layui-btn layui-btn-warm" onclick="delAll()"><i class="layui-icon"></i>修改供应商信息</button>
                        	<button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>删除供应商信息</button>
                        </div>
                        <div class="layui-card-body ">
                            <table class="layui-table layui-form">
                              <thead>
                                <tr>
                                  <th>
                                    <input type="checkbox" name=""  lay-skin="primary">
                                  </th>
                                  <th>供应商编号</th>
                                  <th>供应商名称</th>
                                  <th>供应商地址</th>
                                  <th>供应商邮编</th>
                                  <th>供应商生产产品的名称</th>
                       
                              </thead>
                              <tbody>
                                <tr>
                                  <td>
                                    <input type="checkbox" name=""  lay-skin="primary">
                                  </td>
                                  <td>1</td>
                                  <td>admin</td>
                                  <td>18925139194</td>
                                  <td>113664000@qq.com</td>
                                  <td>113664000@qq.com</td>
                                </tr>
                              </tbody>
                            </table>
                        </div>
                        
                    </div>
                </div>
            </div>
        </div> 
    </body>
    <script>
      layui.use(['laydate','form'], function(){
        var laydate = layui.laydate;
        var form = layui.form;
        
        //执行一个laydate实例
        laydate.render({
          elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
          elem: '#end' //指定元素
        });
      });

       /*用户-停用*/
      function member_stop(obj,id){
          layer.confirm('确认要停用吗？',function(index){

              if($(obj).attr('title')=='启用'){

                //发异步把用户状态进行更改
                $(obj).attr('title','停用')
                $(obj).find('i').html('&#xe62f;');

                $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
                layer.msg('已停用!',{icon: 5,time:1000});

              }else{
                $(obj).attr('title','启用')
                $(obj).find('i').html('&#xe601;');

                $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
                layer.msg('已启用!',{icon: 5,time:1000});
              }
              
          });
      }

      /*用户-删除*/
      function member_del(obj,id){
          layer.confirm('确认要删除吗？',function(index){
              //发异步删除数据
              $(obj).parents("tr").remove();
              layer.msg('已删除!',{icon:1,time:1000});
          });
      }



      function delAll (argument) {

        var data = tableCheck.getData();
  
        layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {icon: 1});
            $(".layui-form-checked").not('.header').parents('tr').remove();
        });
      }
    </script>
</html>
</html>