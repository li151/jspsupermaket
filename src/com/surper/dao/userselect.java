package com.surper.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

import com.surper.pojo.userstaff;
import com.surper.unitl.jdbcUnitl;

public class userselect {
	static Connection conn = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	
	public static List<userstaff> userselect() {
		List<userstaff> lists = new ArrayList<userstaff>();
		try {
			conn = jdbcUnitl.getConnection();
			String sql = "select * from userstaff";
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				userstaff userstaffs = new userstaff(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5));
				lists.add(userstaffs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//关闭连接
		jdbcUnitl.close(conn, ps, rs);
		
		return lists;
	}
	
	
}
