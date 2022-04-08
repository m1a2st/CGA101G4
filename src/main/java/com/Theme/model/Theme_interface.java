package com.Theme.model;

import java.util.List;

public interface Theme_interface {
	//新增一條活動主題
	public boolean insertTheme(ThemeVO obj);
	//搜尋全部的活動主題
	public List<ThemeVO> queryAllTheme();
	//根據id來搜尋活動主題
	public ThemeVO queryThemeById(Integer themeId);
	//根據title來搜尋活動主題
	public List<ThemeVO> queryThemeByTitle(String title);
	//根據id更新活動主題
	public boolean updateThemeById(ThemeVO obj);
	//刪除活動主題
	public boolean deleteThemeById(Integer themeId);

}
