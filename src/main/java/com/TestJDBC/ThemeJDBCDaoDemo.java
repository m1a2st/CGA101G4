package com.TestJDBC;

import java.util.ArrayList;
import java.util.List;

import com.Theme.model.ThemeJDBCDao;
import com.Theme.model.ThemeVO;

public class ThemeJDBCDaoDemo {
	public static void main(String[] args) {
		ThemeJDBCDao themeJDBCDao=new ThemeJDBCDao();
		//�s�W�@�����
//		ThemeVO themeVO=new ThemeVO(null, "�x�֥@�ɳ��Ͱʪ���", "�ߧY�w�q�x�֥@�ɳ��Ͱʪ�������A���X�W�ޤ��b�g�B���V���B���Z�B���ߡB�켯�h�s...���Ӧۥ��y���j�w�B�W�L2000�h�쪺�ʪ��B�͡A�{���󴣨Ѱʪ����Ѥp�ǰ�@������~�S��C�������Ǥ��C�ֳ]�I�γ̷s�}�����u���ұШ|���ߡv�A�Y��u��n�x�W�̤j�B���Ȭw�Ĥ@�y�B�������X�]�����b�}��ʪ���Ͼy�O", null, "asdasda");
//		themeJDBCDao.insertTheme(themeVO);
		
		//�ק�@�����
//		ThemeVO themeVO=new ThemeVO(3, "�x�֥@�ɳ��Ͱʪ���", "�ߧY�w�q�x�֥@�ɳ��Ͱʪ�������A���X�W�ޤ��b�g�B���V���B���Z�B���ߡB�켯�h�s...���Ӧۥ��y���j�w�B�W�L2000�h�쪺�ʪ��B�͡A�{���󴣨Ѱʪ����Ѥp�ǰ�@������~�S��C�������Ǥ��C�ֳ]�I�γ̷s�}�����u���ұШ|���ߡv�A�Y��u��n�x�W�̤j�B���Ȭw�Ĥ@�y�B�������X�]�����b�}��ʪ���Ͼy�O", null, "change");
//		themeJDBCDao.updateThemeById(themeVO);
		
		//�ǥ�Id�d�ߤ@�����
//		Integer themeId=3;
//		ThemeVO themeVO=themeJDBCDao.queryThemeById(themeId);
//		System.out.println(themeVO);
		
		//�d�ߥ������
//		List<ThemeVO> ls=new ArrayList<ThemeVO>();
//		ls=themeJDBCDao.queryAllTheme();
//		System.out.println(ls);
		
		//�R�����
//		themeJDBCDao.deleteThemeById(1);
		
		//�ǥѼ��D�d�߸��
		String test ="�@��";
		List<ThemeVO> ls=themeJDBCDao.queryThemeByTitle(test);
		System.out.println(ls);
		
		
		
		
		
		
		
	}

}
