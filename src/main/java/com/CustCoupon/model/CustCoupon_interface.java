package com.CustCoupon.model;

import java.sql.Timestamp;
import java.util.List;

public interface CustCoupon_interface {
	//�s�W�@���ȤH���u�f��
	public boolean insertCustCoupon(CustCouponVO obj);
	//�d�߬Y�@�ӫȤH�Ҿ֦����u�f��
	public List<CustCouponVO> queryCustCouponById(Integer custId);
	//�d�߬Y�@�ӫȤH�w�ϥ�(���ϥ�)(�w�L��)���u�f��
	public List<CustCouponVO> queryCustCouponUsedById(Integer custId,String status);
	//���w�ϥ��u�f�骺���A��(�ﲼ��)
	public boolean updateCustCouponStatusByTktOrderId(Integer custId,Integer tktOrderId,String status);
	//���w�ϥ��u�f�骺���A��(��q��)
	public boolean updateCustCouponStatusByRoomOrderId(Integer custId,Integer roomOrderId,String status);
	//�]�ϥδ����w�L�ӧ���u�f�骺���A(������Join)
	public boolean updateCustCouponStatusByEnddate(Integer custId,Timestamp enddate,String status);

}
