package com.surper.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionListener;

import org.apache.coyote.Request;

import com.sun.org.apache.regexp.internal.recompile;
import com.surper.dao.userselect;
import com.surper.pojo.userstaff;

@WebServlet(urlPatterns="/yhxx")
public class yhxx extends HttpServlet{

	userselect userselects = new userselect();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<userstaff> list = new ArrayList<userstaff>();
		System.out.println("你好");
		list = userselects.userselect();
		for(userstaff sUserstaff:list) {
			System.out.println(sUserstaff.getUserid());
		}
		HttpSession usersession = req.getSession();
		
		usersession.setAttribute("userselect", list);
		req.getRequestDispatcher("/WEB-INF/page/system/yhxx.jsp").forward(req, resp);
	}
}
