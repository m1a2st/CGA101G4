package com.TktItem.model;

import java.util.List;

public interface TktItem_interface {
	//�s�W�@������q�����
	public int insertTktItem(TktItemVO tktItem);
	//�ھڭq��Id���X�Ҧ�������q�����
	public List<TktItemVO> queryTktItemByTktId(Integer tktId);
	//�ھڲ���q��id�ӧ�ﲼ��q����Ӫ����A
	public int updateTktItemStatusByTKTId();
	//�ھڲ���q��id�ӹﲼ����פε���
	public int updateTktItemScoreContentByTktId();
	//�d�ߩҦ��ۦP���骺����
	public List<TktItemVO> queryAllTktItemConTentByTktId(Integer tktId);
	//�d�M5��������ר̷ӵ������C�ƦC
	public List<TktItemVO> queryFiveTktItemContentByScore();

}
