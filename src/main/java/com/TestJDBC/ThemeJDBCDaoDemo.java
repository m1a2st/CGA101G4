package com.TestJDBC;

import java.util.ArrayList;
import java.util.List;

import com.Theme.model.ThemeJDBCDao;
import com.Theme.model.ThemeVO;

public class ThemeJDBCDaoDemo {
	public static void main(String[] args) {
		ThemeJDBCDao themeJDBCDao=new ThemeJDBCDao();
		//新增一筆資料
//		ThemeVO themeVO=new ThemeVO(null, "頑皮世界野生動物園", "立即預訂頑皮世界野生動物園門票，拜訪超萌水豚君、長頸鹿、企鵝、藪貓、科摩多龍...等來自全球五大洲、超過2000多位的動物朋友，現場更提供動物知識小學堂劇場＆戶外特色遊戲場＆室內遊樂設施及最新開幕的「環境教育中心」，即刻徜徉南台灣最大、全亞洲第一座、不受圍籬設限的半開放動物園區魅力", null, "asdasda");
//		themeJDBCDao.insertTheme(themeVO);
		
		//修改一筆資料
//		ThemeVO themeVO=new ThemeVO(3, "頑皮世界野生動物園", "立即預訂頑皮世界野生動物園門票，拜訪超萌水豚君、長頸鹿、企鵝、藪貓、科摩多龍...等來自全球五大洲、超過2000多位的動物朋友，現場更提供動物知識小學堂劇場＆戶外特色遊戲場＆室內遊樂設施及最新開幕的「環境教育中心」，即刻徜徉南台灣最大、全亞洲第一座、不受圍籬設限的半開放動物園區魅力", null, "change");
//		themeJDBCDao.updateThemeById(themeVO);
		
		//藉由Id查詢一筆資料
//		Integer themeId=3;
//		ThemeVO themeVO=themeJDBCDao.queryThemeById(themeId);
//		System.out.println(themeVO);
		
		//查詢全部資料
//		List<ThemeVO> ls=new ArrayList<ThemeVO>();
//		ls=themeJDBCDao.queryAllTheme();
//		System.out.println(ls);
		
		//刪除資料
//		themeJDBCDao.deleteThemeById(1);
		
		//藉由標題查詢資料
		String test ="世界";
		List<ThemeVO> ls=themeJDBCDao.queryThemeByTitle(test);
		System.out.println(ls);
		
		
		
		
		
		
		
	}

}
