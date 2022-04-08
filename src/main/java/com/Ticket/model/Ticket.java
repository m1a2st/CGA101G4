package com.Ticket.model;

import java.sql.Timestamp;
public class Ticket {
	private Integer tktId;
	private String tktName;
	private Integer originalAmount;
	private Integer price;
	private Timestamp startdate;
	private Timestamp enddate;
	private Integer ttlScore;
	private Integer ttlPeople;
	private String locate;
	private String instruction;
	private String address;
	private String notice;
	private String howUse;
	private String canxPolicy;
	private String status;
	private Integer soldAmount;
	private String kind;		

	public Ticket(Integer tktId, String tktName, Integer originalAmount, Integer price, Timestamp startdate,
			Timestamp enddate, Integer ttlScore, Integer ttlPeople, String locate, String instruction,
			String address, String notice, String howUse, String canxPolicy, String status, Integer soldAmount,
			String kind) {
		super();
		this.tktId = tktId;
		this.tktName = tktName;
		this.originalAmount = originalAmount;
		this.price = price;
		this.startdate = startdate;
		this.enddate = enddate;
		this.ttlScore = ttlScore;
		this.ttlPeople = ttlPeople;
		this.locate = locate;
		this.instruction = instruction;
		this.address = address;
		this.notice = notice;
		this.howUse = howUse;
		this.canxPolicy = canxPolicy;
		this.status = status;
		this.soldAmount = soldAmount;
		this.kind = kind;
	}
	
	public Ticket() {
		super();
	}

	public Integer getTktId() {
		return tktId;
	}

	public void setTktId(Integer tktId) {
		this.tktId = tktId;
	}

	public String getTktName() {
		return tktName;
	}

	public void setTktName(String tktName) {
		this.tktName = tktName;
	}

	public Integer getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(Integer originalAmount) {
		this.originalAmount = originalAmount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Timestamp getStartdate() {
		return startdate;
	}

	public void setStartdate(Timestamp startdate) {
		this.startdate = startdate;
	}

	public Timestamp getEnddate() {
		return enddate;
	}

	public void setEnddate(Timestamp enddate) {
		this.enddate = enddate;
	}

	public Integer getTtlScore() {
		return ttlScore;
	}

	public void setTtlScore(Integer ttlScore) {
		this.ttlScore = ttlScore;
	}

	public Integer getTtlPeople() {
		return ttlPeople;
	}

	public void setTtlPeople(Integer ttlPeople) {
		this.ttlPeople = ttlPeople;
	}

	public String getLocate() {
		return locate;
	}

	public void setLocate(String locate) {
		this.locate = locate;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getHowUse() {
		return howUse;
	}

	public void setHowUse(String howUse) {
		this.howUse = howUse;
	}

	public String getCanxPolicy() {
		return canxPolicy;
	}

	public void setCanxPolicy(String canxPolicy) {
		this.canxPolicy = canxPolicy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getSoldAmount() {
		return soldAmount;
	}

	public void setSoldAmount(Integer soldAmount) {
		this.soldAmount = soldAmount;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Ticket [tktId=" + tktId + ", tktName=" + tktName + ", originalAmount=" + originalAmount + ", price="
				+ price + ", startdate=" + startdate + ", enddate=" + enddate + ", ttlScore=" + ttlScore
				+ ", ttlPeople=" + ttlPeople + ", locate=" + locate + ", instruction=" + instruction + ", address="
				+ address + ", notice=" + notice + ", howUse=" + howUse + ", canxPolicy=" + canxPolicy + ", status="
				+ status + ", soldAmount=" + soldAmount + ", kind=" + kind + "]";
	}
	
	
	
}
