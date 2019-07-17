package com.surper.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.surper.pojo.userstaff;
import com.surper.unitl.jdbcUnitl;

/**
 * 这个是用于登陆模块的
 * @author lhql
 *
 */
public class userDao {
    static Connection conn = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	/**
	 * 该方法是用于登陆的
	 */
	public static List<userstaff> login(String username,String password) {
		List<userstaff> list = new ArrayList<userstaff>();
		try {
		//连接数据库驱动
		conn = jdbcUnitl.getConnection();
		//写sql语句
		String sql = "select * from userstaff where username=? and password=?";
		
		ps = conn.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		rs = ps.executeQuery();
		
		while(rs.next()) {
			userstaff userstaffs = new userstaff(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			list.add(userstaffs);
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//关闭资源
		jdbcUnitl.close(conn, ps, rs);
		return list;
	}
	
	/**
	 * 这是插入用户信息表
	 */
	public static void insert(String username,String password,String useridentity) {
		try {
			conn = jdbcUnitl.getConnection();
			UUID uuid = UUID.randomUUID();
			String uuids = uuid.toString().replace("-", "");
			String sql = "insert into userstaff(username,password,mdpassword,useridentity) values (?,?,?,?) ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, uuids);
			ps.setString(4, useridentity);
		    ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		    e.printStackTrace();
		}finally {
			jdbcUnitl.close(conn, ps, rs);
		}
		
	}
	
	/***
	 * 
	 * 这是插入用户详细信息表
	 */
	public static void insertxx(String name,String sex,String jg,Date birth,String xl,String marry,String card,String phone,String address,String desc  ) {
		try {
			conn = jdbcUnitl.getConnection();
			String sql = "insert into staff(staname,stasex,stajg,staBirth,staedu," + 
					"stamarry,stacard,staphone,staadress,stadesc,stacretime) values(?,?,?,?,?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, sex);
			ps.setString(3, jg);
			ps.setDate(4, (java.sql.Date) birth);
			ps.setString(5, xl);
			ps.setString(6, marry);
			ps.setString(7, card);
			ps.setString(8, phone);
			ps.setString(9, address);
			ps.setString(10, desc);
			ps.setDate(11, (java.sql.Date) new Date());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			jdbcUnitl.close(conn, ps, rs);
		}
		
	}
	
	/**
	 * 
	 * 这是插入用户权限表
	 */
	public static void insertqx() {
		
		try {
			conn = jdbcUnitl.getConnection();
			String sql = "";
			ps = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			jdbcUnitl.close(conn, ps, rs);
		}
	}
	
	/**
	 * 用于修改密码
	 */
	public static void alterpwd() {
		
	}
	
	/**
	 * 用于查看个人信息
	 */
}
