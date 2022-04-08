package com.TktOrder.model;

import java.sql.Timestamp;
import java.util.List;

public interface TktOrder_interface {
	//�s�W�@������q��
	public boolean createTktOrder(TktOrderVO tktOrderVO);
	//�d�ߥ�������q��
	public List<TktOrderVO> queryAllTktOrder();
	//�ھڷ|��Id�d�߲���q��
	public List<TktOrderVO> queryTktOrderByCustId(Integer custId);
	//�ھڤ���d�߲���q��
	public List<TktOrderVO> queryTktOrderByOrderDate(Timestamp orderDate);
	//�ھڤ@�Ӱ϶�������d�߲���q��
	public List<TktOrderVO> queryTktOrderByDateToDate(Timestamp startdate,Timestamp enddate);
}
