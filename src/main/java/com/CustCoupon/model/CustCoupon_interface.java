package com.CustCoupon.model;

import java.sql.Timestamp;
import java.util.List;

public interface CustCoupon_interface {
	//�s�W�@���ȤH���u�f��
	public boolean insertCustCoupon(CustCouponVO custCoupon);
	//�d�߬Y�@�ӫȤH�Ҿ֦����u�f��
	public List<CustCouponVO> queryCustCouponById(Integer customerId);
	//�d�߬Y�@�ӫȤH�w�ϥΪ��u�f��
	public List<CustCouponVO> queryCustCouponUsedById(Integer customerId,String status);
	//�d�߬Y�@�ӫȤH���ϥΪ��u�f��
	public List<CustCouponVO> queryCustCouponUnusedById(Integer customerId,String status);
	//���w�ϥ��u�f�骺���A��(�ﲼ��)
	public boolean updateCustCouponStatusByTktOrderId(Integer tktOrderId,String status);
	//���w�ϥ��u�f�骺���A��(��q��)
	public boolean updateCustCouponStatusByRoomOrderId(Integer roomOrderId,String status);
	//�]�ϥδ����w�L�ӧ���u�f�骺���A
	public boolean updateCustCouponStatusByEnddate(Timestamp enddate,String status);

}
