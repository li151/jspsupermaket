package com.surper.unitl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 这个是jdbc连接驱动封装
 * @author lhql
 *
 */
public class jdbcUnitl {
	public static Connection getConnection() {
		//创建连接驱动
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//创建连接数据库字符串
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:supermarket", "system", "lhq123"); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(Connection conn,PreparedStatement ps,ResultSet rs) {
		try {
			if(rs!=null) {
				rs.close();					
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if(ps!=null) {
				ps.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(conn!=null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
