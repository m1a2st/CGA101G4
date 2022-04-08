package com.News.model;

import java.sql.Timestamp;

public class News {
	private int newsId;
	private String title;
	private String content;
	private Timestamp createDate;
	private String img;
	public News() {
		super();
	}
	public News(int newsId, String title, String content, Timestamp createDate, String img) {
		super();
		this.newsId = newsId;
		this.title = title;
		this.content = content;
		this.createDate = createDate;
		this.img = img;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", title=" + title + ", content=" + content + ", createDate=" + createDate + ", img="
				+ img + "]";
	}
	
}
