package com.surper.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.surper.dao.userDao;

@WebServlet(urlPatterns="/useraddform")
public class useraddform extends HttpServlet{
	userDao userdao = new userDao();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String useridentity = req.getParameter("useridentity");
		String name = req.getParameter("name");
		String sex = req.getParameter("sex");
		String jg = req.getParameter("jg");
		String birth = req.getParameter("birth");
		String xl = req.getParameter("xl");
		String marry = req.getParameter("marry");
		String card = req.getParameter("card");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		String desc = req.getParameter("desc");
		//插入用户信息表
		userdao.insert(username, password, useridentity);
		
		//插入用户详细信息表
		userdao.insertxx(name, sex, jg, birth, xl, marry, card, phone, address, desc);
		//插入用户权限表
		
		
	}
}
