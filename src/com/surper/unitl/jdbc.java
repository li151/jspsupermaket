package com.surper.unitl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
	
	public static void main(String[] args) {
		Connection con=null;
		Statement statement=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//创建连接驱动
			long strat  = System.currentTimeMillis();
			Class.forName("oracle.jdbc.OracleDriver");
			//创建连接数据库字符串
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:supermarket", "system", "lhq123");
			
			long end = System.currentTimeMillis();
			
			System.out.println((end-strat)+"ms");
//			PreparedStatement pStatement = con.prepareStatement(sql)
//			statement = con.createStatement();
//			String sql = "insert into userstaff(userid,username,password,mdpassword,useridentity) values"
//					+ "(01,'admin','admin123','0ca175b9c0f726a831d895e269332461','管理员')";
//			statement.execute(sql);
//			ResultSet rSet = 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();					
				}

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if(statement!=null) {
					statement.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(con!=null) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
