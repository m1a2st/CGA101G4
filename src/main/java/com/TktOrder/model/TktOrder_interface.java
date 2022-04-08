package com.TktOrder.model;

import java.sql.Timestamp;
import java.util.List;

public interface TktOrder_interface {
	//新增一筆票券訂單
	public boolean createTktOrder(TktOrderVO tktOrderVO);
	//查詢全部票券訂單
	public List<TktOrderVO> queryAllTktOrder();
	//根據會員Id查詢票券訂單
	public List<TktOrderVO> queryTktOrderByCustId(Integer custId);
	//根據日期查詢票券訂單
	public List<TktOrderVO> queryTktOrderByOrderDate(Timestamp orderDate);
	//根據一個區間的日期查詢票券訂單
	public List<TktOrderVO> queryTktOrderByDateToDate(Timestamp startdate,Timestamp enddate);
}
