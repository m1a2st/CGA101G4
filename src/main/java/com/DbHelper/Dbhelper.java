package com.DbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
	/**
	 * �M���Ω󴣨Ѹ�Ʈw�s�u����
	 */
public class Dbhelper {
	
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	// ��Ʈw�X��
	private static final String URL = "jdbc:mysql://104.199.153.224/Taiwan?serverTimezone=Asia/Taipei";
	// �n�s�u�쪺��Ʈw�a�}
	private static final String USER = "root";
	// ��Ʈw���ϥΪ̦W��
	private static final String PASSWORD = "rootitri";
	// ��Ʈw���n�J�K�X
	private static Connection conn = null;
	// ��Ʈw�s�u����A�ĥγ�ҼҦ��C
	static {
		try {
			Class.forName(driver);
			// ���J�X��
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// �Ω������Ʈw�s�u�����R�A��k�A���������I�s
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
	
	public void close(Connection conn) {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
