package com.TktItem.model;

import java.util.List;

public interface TktItem_interface {
	//�s�W�@������q�����
	public boolean insertTktItem(TktItemVO obj);
	//�ھڭq��Id���X�Ҧ�������q�����
	public List<TktItemVO> queryTktItemByTktOrderId(Integer tktOrderId);
	//�ھڲ���q��id�β���id�ӧ�ﲼ��q����Ӫ��ϥμƶq
	public boolean updateTktItemUsedByTKTId(Integer tktOrderId,Integer tktId,Integer used);
	//�ھڲ���q��id�β���id�ӹﲼ����פε���
	public boolean updateTktItemScoreContentByTktId(Integer tktOrderId,Integer tktId,Integer score,String content);
	//�d�ߩҦ��ۦP���骺����
	public List<String> queryAllTktItemConTentByTktId(Integer tktId);
	//�d��5��������ר̷ӵ������C�ƦC
	public List<String> queryFiveTktItemContentByScore(Integer tktId);
	//�d�ߩҦ��ۦP����id���`����
	public int queryTktItemTllScoreByTktId(Integer tktId);
	//�d�ߩҦ��ۦP���骺�`�����H��
	public int queryTktItemTtlPeopleByTktId(Integer tktId);
		
	
	

}
