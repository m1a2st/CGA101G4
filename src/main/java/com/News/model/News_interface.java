package com.News.model;

import java.util.List;

public interface News_interface {
	//�s�W�@���̷s����
	public boolean insertNews(NewsVO obj);
	//�j�M�������̷s����
	public List<NewsVO> queryAllNews();
	//�ھ�id�ӷj�M�̷s����
	public NewsVO queryNewsById(Integer newsId);
	//�ھ�title�ӷj�M�̷s����
	public List<NewsVO> queryNewsByTitle(String title);
	//�ھ�id��s�̷s����
	public boolean updateNewsById(NewsVO obj);
	//�R���̷s����
	public boolean deleteNewsById(Integer newsId);	

}
