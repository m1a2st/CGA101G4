package com.TestJDBC;

import java.util.ArrayList;
import java.util.List;

import com.News.model.NewsJDBCDao;
import com.News.model.NewsVO;

public class NewsJDBCDaoDemo {
	public static void main(String[] args) {
		NewsJDBCDao newsJDBCDao=new NewsJDBCDao();
		//�s�W�@�����
//		NewsVO newsVO=new NewsVO(null, "test4", "This is the fourth context.", null, "C:\\Users\\Tibame_T14\\Desktop\\items\\FC_Bayern.png");
//		newsJDBCDao.insertNews(newsVO);
		
		//�ק�@�����
//		NewsVO newsVO1=new NewsVO(1, "test", "This is the first first context.", null, "C:\\Users\\Tibame_T14\\Desktop\\items\\FC_Bayern.png");
//		newsJDBCDao.updateNewsById(newsVO1);
		
		//�ǥ�Id�d�ߤ@�����
//		Integer newId=2;
//		NewsVO newsVO=new NewsVO();
//		newsVO=newsJDBCDao.queryNewsById(newId);
//		System.out.println(newsVO);
		
		//�d�ߥ������
//		List<NewsVO> ls=newsJDBCDao.queryAllNews();
//		System.out.println(ls);
		
		//�R�����
//		newsJDBCDao.deleteNewsById(1);
		
		//�ǥѼ��D�d�߸��
		String test="test";
		List<NewsVO> ls=newsJDBCDao.queryNewsByTitle(test);
		System.out.println(ls);
		
		
		
		
		
	}
}
