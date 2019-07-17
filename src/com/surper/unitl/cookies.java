package com.surper.unitl;

import javax.servlet.http.Cookie;

public class cookies {
	//用于判断cookie是否存在
	public boolean HashCookie(Cookie[] cookies, String name) {
		// TODO Auto-generated method stub
		if((cookies!=null)) {
			for(Cookie c:cookies) {
				if(c.getName().equals(name)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	//用于返回cookie的值
	public String ValueCookie(Cookie[] cookies,String name) {
		if((cookies!=null)) {
			for(Cookie c:cookies) {
				if(c.getName().equals(name)) {
					String string = c.getValue();
					return string;
				}
			}
		}
		return null;
	}
}
