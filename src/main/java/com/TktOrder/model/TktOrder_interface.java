package com.TktOrder.model;

import java.sql.Timestamp;
import java.util.List;

public interface TktOrder_interface {
	//新增一筆票券訂單(有使用優惠券)
	public boolean insertTktOrder(TktOrderVO obj);
	//新增一筆票券訂單(未使用優惠券)
//	public boolean insertTktOrderNoCoupon(TktOrderVO obj);
	//查詢全部票券訂單
	public List<TktOrderVO> queryAllTktOrder();
	//根據會員Id查詢票券訂單
	public List<TktOrderVO> queryTktOrderByCustId(Integer custId);
	//根據日期來查詢的方法我覺得可以合併
		//根據日期查詢票券訂單
	public List<TktOrderVO> queryTktOrderByOrderDate(Timestamp orderDate);
		//根據一個區間的日期查詢票券訂單
	public List<TktOrderVO> queryTktOrderByDateToDate(Timestamp startdate,Timestamp enddate);
	//查詢所有票券訂單總共的金額
	public int queryTktOrderTtlPrice();
	//根據會員Id查詢票券訂單，總共金額
	public int quertTktOrderTtlPriceById(Integer custId);
	//根據日期來查詢票券訂單總共的金額
	public int queryTktOrderTtlPriceByDateToDate(Timestamp stardate,Timestamp enddate);
}
