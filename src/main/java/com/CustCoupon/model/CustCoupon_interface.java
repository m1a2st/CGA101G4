package com.CustCoupon.model;

import java.sql.Timestamp;
import java.util.List;

public interface CustCoupon_interface {
	//穝糤兵纔磃ㄩ
	public int insertCustCoupon(CustCouponVO custCoupon);
	//琩高琘┮局Τ纔磃ㄩ
	public List<CustCouponVO> queryCustCouponById(Integer customerId);
	//琩高琘ㄏノ纔磃ㄩ
	public List<CustCouponVO> queryCustCouponUsedById(Integer customerId,String status);
	//琩高琘ゼㄏノ纔磃ㄩ
	public List<CustCouponVO> queryCustCouponUnusedById(Integer customerId,String status);
	//эㄏノ纔磃ㄩ篈(癸布ㄩ)
	public int updateCustCouponStatusByTktOrderId(Integer tktOrderId,String status);
	//эㄏノ纔磃ㄩ篈(癸璹┬)
	public int updateCustCouponStatusByRoomOrderId(Integer roomOrderId,String status);
	//ㄏノ戳筁τэ纔磃ㄩ篈
	public int updateCustCouponStatusByEnddate(Timestamp enddate,String status);

}
