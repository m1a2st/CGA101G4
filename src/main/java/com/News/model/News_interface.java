package com.News.model;

import java.util.List;

public interface News_interface {
	//穝糤兵程穝
	public boolean insertNews(NewsVO obj);
	//穓碝场程穝
	public List<NewsVO> queryAllNews();
	//沮idㄓ穓碝程穝
	public NewsVO queryNewsById(Integer newsId);
	//沮titleㄓ穓碝程穝
	public List<NewsVO> queryNewsByTitle(String title);
	//沮id穝程穝
	public boolean updateNewsById(NewsVO obj);
	//埃程穝
	public boolean deleteNewsById(Integer newsId);	

}
