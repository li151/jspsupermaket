package com.surper.servlet;

import java.awt.image.ColorConvertOp;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.surper.dao.userDao;
import com.surper.pojo.userstaff;
import com.surper.unitl.cookies;



@WebServlet(urlPatterns="/login")
public class login extends HttpServlet{
	//创建userdao类
	userDao users = new userDao(); 
	cookies cks = new cookies();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("utf-8");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String remberme = req.getParameter("remberme");
		String names = null;
		String pwds = null;
		List<userstaff> list = users.login(username, password);
		for(userstaff us:list) {
			 names = us.getUsername();
			 pwds = us.getPassword();
		}
//		System.out.println("账号"+names+"密码"+pwds);
		//获取cookie对象
		Cookie[] cookies = req.getCookies();
//		System.out.println(username);
//		System.out.println(password);
//		System.out.println(remberme);

	    if((username == null) || (password == null)) {
	    	String cookieusername = cks.ValueCookie(cookies, "name");
	    	String cookiepassword = cks.ValueCookie(cookies, "pwd");
	    	//System.out.println("账号："+cookieusername+"密码："+cookiepassword);
	    	if((cookieusername!=null)&&(cookiepassword!=null)) {
	    		List<userstaff> lists = users.login(cookieusername, cookiepassword);
				for(userstaff us:lists) {
					 names = us.getUsername();
					 pwds = us.getPassword();
				}
	    	}
	    	
			//判断cookie中的用户名密码是否相同
			if(cks.HashCookie(cookies, "name")&&cks.HashCookie(cookies, "pwd")&&cks.ValueCookie(cookies, "name").equals(names)&&cks.ValueCookie(cookies, "pwd").equals(pwds)) {
				req.setAttribute("name", names);
				req.getRequestDispatcher("/WEB-INF/page/main.jsp").forward(req, resp);
			}else {
				//req.setAttribute("msg", "用户名或密码错误");
				//请求转发到登陆页面
				req.getRequestDispatcher("/WEB-INF/page/login.jsp").forward(req, resp);
			}
			
		}else if(username.equals(names)&&password.equals(pwds)) {
			if(remberme!=null) {
				if(!cks.HashCookie(cookies, "name")) {
					Cookie name = new Cookie("name", username);
					name.setMaxAge(60*60*24);
					resp.addCookie(name);
				}
				if(!cks.HashCookie(cookies, "pwd")) {
					Cookie pwd = new Cookie("pwd", password);
					pwd.setMaxAge(60*60*24);
					resp.addCookie(pwd);
				}
			}else {
				//不记住账号密码的情况
				if(cks.HashCookie(cookies, "name")) {
					Cookie name = new Cookie("name", "");
					name.setMaxAge(0);
					resp.addCookie(name);
				}
				if(cks.HashCookie(cookies, "pwd")) {
					Cookie pwd  = new Cookie("pwd", "");
					pwd.setMaxAge(0);
					resp.addCookie(pwd);
				}
			}
			req.setAttribute("name", username);
			//请求转发到主页面
			req.getRequestDispatcher("/WEB-INF/page/main.jsp").forward(req, resp);
		}else {
			String mString = "用户名或密码错误！";
			req.setAttribute("msg", mString);
			//请求转发到登陆页面
			req.getRequestDispatcher("/WEB-INF/page/login.jsp").forward(req, resp);
		}

	}
}
