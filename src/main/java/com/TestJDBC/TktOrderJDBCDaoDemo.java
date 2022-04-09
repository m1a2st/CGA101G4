package com.TestJDBC;

import java.sql.Timestamp;
import java.util.List;

import com.TktOrder.model.TktOrderJDBCDao;
import com.TktOrder.model.TktOrderVO;


//ら戳常临ゼ代刚
public class TktOrderJDBCDaoDemo {
	public static void main(String[] args) {
		TktOrderJDBCDao tktOrderJDBCDao = new TktOrderJDBCDao();

		// 穝糤掸布ㄩ璹虫(x)
		//java.lang.NullPointerException
		//璶琌Coupon_id
//		TktOrderVO tktOrderVO = new TktOrderVO(null, 10015, 420, null, 420, null, "http://yahoo.com.tw");
//		tktOrderJDBCDao.insertTktOrder(tktOrderVO);
		
		
		//琩高场布ㄩ璹虫
//		List<TktOrderVO> ls=tktOrderJDBCDao.queryAllTktOrder();
//		System.out.println(ls);
		
		//ノid琩高┮Τ布ㄩ璹虫
//		Integer custId=10015;
//		List<TktOrderVO> ls=tktOrderJDBCDao.queryTktOrderByCustId(custId);
//		System.out.println(ls);
		
		//ノら戳琩高赣ら戳┮Τ布ㄩ璹虫
//		Timestamp ts=
		
		//ノ琿戳丁琩高布ㄩ璹虫
		
		
		//琩高┮Τ布ㄩ璹虫羆肂
//		int ttlPrice=tktOrderJDBCDao.queryTktOrderTtlPrice();
//		System.out.println(ttlPrice);
		
        //沮穦Id琩高布ㄩ璹虫羆肂
//		int custId=10015;
//		int ttlPrice=tktOrderJDBCDao.quertTktOrderTtlPriceById(custId);
//		System.out.println(ttlPrice);
		
		//沮ら戳ㄓ琩高布ㄩ璹虫羆肂
		
		
		
		
		

	}

}
