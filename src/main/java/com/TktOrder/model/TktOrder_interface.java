package com.TktOrder.model;

import java.sql.Timestamp;
import java.util.List;

public interface TktOrder_interface {
	//�s�W�@������q��(���ϥ��u�f��)
	public boolean insertTktOrder(TktOrderVO obj);
	//�s�W�@������q��(���ϥ��u�f��)
//	public boolean insertTktOrderNoCoupon(TktOrderVO obj);
	//�d�ߥ�������q��
	public List<TktOrderVO> queryAllTktOrder();
	//�ھڷ|��Id�d�߲���q��
	public List<TktOrderVO> queryTktOrderByCustId(Integer custId);
	//�ھڤ���Ӭd�ߪ���k��ı�o�i�H�X��
		//�ھڤ���d�߲���q��
	public List<TktOrderVO> queryTktOrderByOrderDate(Timestamp orderDate);
		//�ھڤ@�Ӱ϶�������d�߲���q��
	public List<TktOrderVO> queryTktOrderByDateToDate(Timestamp startdate,Timestamp enddate);
	//�d�ߩҦ�����q���`�@�����B
	public int queryTktOrderTtlPrice();
	//�ھڷ|��Id�d�߲���q��A�`�@���B
	public int quertTktOrderTtlPriceById(Integer custId);
	//�ھڤ���Ӭd�߲���q���`�@�����B
	public int queryTktOrderTtlPriceByDateToDate(Timestamp stardate,Timestamp enddate);
}
