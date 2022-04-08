package com.DbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
	/**
	 * 專門用於提供資料庫連線的類
	 */
public class Dbhelper {
	
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	// 資料庫驅動
	private static final String URL = "jdbc:mysql://104.199.153.224/Taiwan?serverTimezone=Asia/Taipei";
	// 要連線到的資料庫地址
	private static final String USER = "root";
	// 資料庫的使用者名稱
	private static final String PASSWORD = "rootitri";
	// 資料庫的登入密碼
	private static Connection conn = null;
	// 資料庫連線物件，採用單例模式。
	static {
		try {
			Class.forName(driver);
			// 載入驅動
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 用於獲取資料庫連線物件的靜態方法，直接由類呼叫
	public static Connection getConnection() {
		if (conn == null) {
			try {
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}
