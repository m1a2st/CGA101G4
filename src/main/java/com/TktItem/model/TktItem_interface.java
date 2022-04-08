package com.TktItem.model;

import java.util.List;

public interface TktItem_interface {
	//新增一筆票券訂單明細
	public int insertTktItem(TktItemVO tktItem);
	//根據訂單Id取出所有的票券訂單明細
	public List<TktItemVO> queryTktItemByTktId(Integer tktId);
	//根據票券訂單id來更改票券訂單明細的狀態
	public int updateTktItemStatusByTKTId();
	//根據票券訂單id來對票券評論及評分
	public int updateTktItemScoreContentByTktId();
	//查詢所有相同票券的評論
	public List<TktItemVO> queryAllTktItemConTentByTktId(Integer tktId);
	//查尋5筆票券評論依照評價高低排列
	public List<TktItemVO> queryFiveTktItemContentByScore();

}
