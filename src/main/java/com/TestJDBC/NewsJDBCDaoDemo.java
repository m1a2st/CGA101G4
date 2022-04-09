package com.TestJDBC;

import java.util.ArrayList;
import java.util.List;

import com.News.model.NewsJDBCDao;
import com.News.model.NewsVO;

public class NewsJDBCDaoDemo {
	public static void main(String[] args) {
		NewsJDBCDao newsJDBCDao=new NewsJDBCDao();
		//新增一筆資料
//		NewsVO newsVO=new NewsVO(null, "test4", "This is the fourth context.", null, "C:\\Users\\Tibame_T14\\Desktop\\items\\FC_Bayern.png");
//		newsJDBCDao.insertNews(newsVO);
		
		//修改一筆資料
//		NewsVO newsVO1=new NewsVO(1, "test", "This is the first first context.", null, "C:\\Users\\Tibame_T14\\Desktop\\items\\FC_Bayern.png");
//		newsJDBCDao.updateNewsById(newsVO1);
		
		//藉由Id查詢一筆資料
//		Integer newId=2;
//		NewsVO newsVO=new NewsVO();
//		newsVO=newsJDBCDao.queryNewsById(newId);
//		System.out.println(newsVO);
		
		//查詢全部資料
//		List<NewsVO> ls=newsJDBCDao.queryAllNews();
//		System.out.println(ls);
		
		//刪除資料
//		newsJDBCDao.deleteNewsById(1);
		
		//藉由標題查詢資料
		String test="test";
		List<NewsVO> ls=newsJDBCDao.queryNewsByTitle(test);
		System.out.println(ls);
		
		
		
		
		
	}
}
