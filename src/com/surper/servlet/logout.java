package com.surper.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.surper.unitl.cookies;

@WebServlet(urlPatterns="/logout")
public class logout extends HttpServlet{
	cookies cks = new cookies();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie[] cookies = req.getCookies();
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
		
		req.getRequestDispatcher("/WEB-INF/page/login.jsp").forward(req, resp);
	}
}
