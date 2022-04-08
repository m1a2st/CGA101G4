package com.TktOrder.model;

import java.sql.Timestamp;

public class TktOrderVO {
	private Integer tktOrderId;
	private Integer custId;
	private Integer originalPrice;
	private Timestamp orderDate;
	private Integer ttlPrice;
	private Integer custCopId;
	private String qrCode;

	public TktOrderVO() {
	}

	public TktOrderVO(Integer tktOrderId, Integer custId, Integer originalPrice, Timestamp orderDate, Integer ttlPrice,
			Integer custCopId, String qrCode) {
		super();
		this.tktOrderId = tktOrderId;
		this.custId = custId;
		this.originalPrice = originalPrice;
		this.orderDate = orderDate;
		this.ttlPrice = ttlPrice;
		this.custCopId = custCopId;
		this.qrCode = qrCode;
	}

	public Integer getTktOrderId() {
		return tktOrderId;
	}

	public void setTktOrderId(Integer tktOrderId) {
		this.tktOrderId = tktOrderId;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public Integer getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Integer originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getTtlPrice() {
		return ttlPrice;
	}

	public void setTtlPrice(Integer ttlPrice) {
		this.ttlPrice = ttlPrice;
	}

	public Integer getCustCopId() {
		return custCopId;
	}

	public void setCustCopId(Integer custCopId) {
		this.custCopId = custCopId;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	@Override
	public String toString() {
		return "TktOrderVO [tktOrderId=" + tktOrderId + ", custId=" + custId + ", originalPrice=" + originalPrice
				+ ", orderDate=" + orderDate + ", ttlPrice=" + ttlPrice + ", custCopId=" + custCopId + ", qrCode="
				+ qrCode + "]";
	}


}
