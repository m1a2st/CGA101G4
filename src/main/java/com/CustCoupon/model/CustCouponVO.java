package com.CustCoupon.model;

import java.sql.Timestamp;

public class CustCouponVO {
	private Integer custCopId;
	private Integer custId;
	private Integer copId;
	private Timestamp getDate;
	private Timestamp useDate;
	private Integer roomOrderId;
	private Integer discount;

	public CustCouponVO() {
		super();
	}

	public CustCouponVO(Integer custCopId, Integer custId, Integer copId, Timestamp getDate, Timestamp useDate, Integer roomOrderId, Integer discount) {
		super();
		this.custCopId = custCopId;
		this.custId = custId;
		this.copId = copId;
		this.getDate = getDate;
		this.useDate = useDate;
		this.roomOrderId = roomOrderId;
		this.discount = discount;
	}

	public Integer getCustCopId() {
		return custCopId;
	}

	public void setCustCopId(Integer custCopId) {
		this.custCopId = custCopId;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public Integer getCopId() {
		return copId;
	}

	public void setCopId(Integer copId) {
		this.copId = copId;
	}

	public Timestamp getGetDate() {
		return getDate;
	}

	public void setGetDate(Timestamp getDate) {
		this.getDate = getDate;
	}

	public Timestamp getUseDate() {
		return useDate;
	}

	public void setUseDate(Timestamp useDate) {
		this.useDate = useDate;
	}

	public Integer getRoomOrderId() {
		return roomOrderId;
	}

	public void setRoomOrderId(Integer roomOrderId) {
		this.roomOrderId = roomOrderId;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "CustCoupon [custCopId=" + custCopId + ", custId=" + custId + ", copId=" + copId + ", getDate=" + getDate
				+ ", useDate=" + useDate + ", roomOrderId=" + roomOrderId + ", discount=" + discount + "]";
	}

}
