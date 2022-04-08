package com.Coupon.model;

import java.sql.Date;

public class CouponVO {
	private Integer copId;
	private String copName;
	private String introduce;
	private Integer discount;
	private Date startdate;
	private Date enddate;
	private String img;
	private String status;
	
	public CouponVO(Integer copId, String copName, String introduce, Integer discount, Date startdate, Date enddate,
			String img, String status) {
		super();
		this.copId = copId;
		this.copName = copName;
		this.introduce = introduce;
		this.discount = discount;
		this.startdate = startdate;
		this.enddate = enddate;
		this.img = img;
		this.status = status;
	}
	
	public CouponVO() {
		super();
	}

	public Integer getCopId() {
		return copId;
	}

	public void setCopId(Integer copId) {
		this.copId = copId;
	}

	public String getCopName() {
		return copName;
	}

	public void setCopName(String copName) {
		this.copName = copName;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Coupon [copId=" + copId + ", copName=" + copName + ", introduce=" + introduce + ", discount=" + discount
				+ ", startdate=" + startdate + ", enddate=" + enddate + ", img=" + img + ", status=" + status + "]";
	}
	
	
}
