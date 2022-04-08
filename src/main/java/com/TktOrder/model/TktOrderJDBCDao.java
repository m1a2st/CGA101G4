package com.TktOrder.model;

import java.sql.Connection;
import java.sql.Timestamp;
import java.util.List;

import com.DbHelper.Dbhelper;

public class TktOrderJDBCDao implements TktOrder_interface{
	private static Connection conn=Dbhelper.getConnection();

	@Override
	public boolean createTktOrder(TktOrderVO tktOrderVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TktOrderVO> queryAllTktOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TktOrderVO> queryTktOrderByCustId(Integer custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TktOrderVO> queryTktOrderByOrderDate(Timestamp orderDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TktOrderVO> queryTktOrderByDateToDate(Timestamp startdate, Timestamp enddate) {
		// TODO Auto-generated method stub
		return null;
	}

}
