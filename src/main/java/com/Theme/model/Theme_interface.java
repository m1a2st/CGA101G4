package com.Theme.model;

import java.util.List;

public interface Theme_interface {
	//�s�W�@�����ʥD�D
	public boolean insertTheme(ThemeVO obj);
	//�j�M���������ʥD�D
	public List<ThemeVO> queryAllTheme();
	//�ھ�id�ӷj�M���ʥD�D
	public ThemeVO queryThemeById(Integer themeId);
	//�ھ�title�ӷj�M���ʥD�D
	public List<ThemeVO> queryThemeByTitle(String title);
	//�ھ�id��s���ʥD�D
	public boolean updateThemeById(ThemeVO obj);
	//�R�����ʥD�D
	public boolean deleteThemeById(Integer themeId);

}
