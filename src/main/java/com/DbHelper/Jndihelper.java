package com.DbHelper;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.sql.DataSource;

public class Jndihelper {
	private static Connection conn = null;
	private static Context ctx = null;
	private static DataSource ds = null;

	public static Connection getConnection() throws Exception {
		if (conn == null) {
			try {
				ctx=new javax.naming.InitialContext();
				ds=(DataSource)ctx.lookup("java:comp/env/jdbc/TestDB2");
				conn=ds.getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return conn;
	}

}
