package com.wangtong.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;


public class DBUtils {
	
	private static PreparedStatement prepareStatement;
	private static ResultSet resultSet;
	private static DataSource dataSource;
	private static Connection connection=null;
	static{
		try {
		
			Properties properties = new Properties();
			InputStream inputStream = DBUtils.class.getClassLoader().getResourceAsStream("db.properties");
			properties.load(inputStream);
			dataSource = DruidDataSourceFactory.createDataSource(properties);
			connection = dataSource.getConnection();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/*
	 * 获取connection
	
	
	public static Connection getConnection(){
		
		try {
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	 */
	/*
	 * 曾，删，改   insert into test(username,passwords)values(?,?)       xxx,xxx
	 */
	public static boolean executeUpdate(String sql,Object[] objects) throws Exception{
		 prepareStatement = connection.prepareStatement(sql);
		for (int i=1;i<=objects.length;i++) {
			prepareStatement.setObject(i, objects[i-1]);
		}
		if (prepareStatement.executeUpdate()>0) {
			return true;
		}
		
		return false;
	}
	
	/*
	 * 查询方法
	 */
	public static ResultSet executeQuery(String sql,Object[] objects) throws Exception{
		prepareStatement = connection.prepareStatement(sql);
		
		if (objects !=null) {
			for (int i=1;i<=objects.length;i++) {
				prepareStatement.setObject(i, objects[i-1]);
			}
		}
		
		resultSet = prepareStatement.executeQuery();
		return resultSet;
		
	}
	
	
	/*
	 * 关闭
	 */
	public static void close(){
		
		if (resultSet !=null) {
			
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (prepareStatement !=null) {
			try {
				prepareStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (connection !=null) {
			
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	

}
