package com.TestJDBC;

import java.sql.Timestamp;
import java.util.List;

import com.TktOrder.model.TktOrderJDBCDao;
import com.TktOrder.model.TktOrderVO;


//��������٥�����
public class TktOrderJDBCDaoDemo {
	public static void main(String[] args) {
		TktOrderJDBCDao tktOrderJDBCDao = new TktOrderJDBCDao();

		// �s�W�@������q��(x)
		//java.lang.NullPointerException
		//�D�n�OCoupon_id
//		TktOrderVO tktOrderVO = new TktOrderVO(null, 10015, 420, null, 420, null, "http://yahoo.com.tw");
//		tktOrderJDBCDao.insertTktOrder(tktOrderVO);
		
		
		//�d�ߥ�������q��
//		List<TktOrderVO> ls=tktOrderJDBCDao.queryAllTktOrder();
//		System.out.println(ls);
		
		//�ΫȤHid�d�ߩҦ�����q��
//		Integer custId=10015;
//		List<TktOrderVO> ls=tktOrderJDBCDao.queryTktOrderByCustId(custId);
//		System.out.println(ls);
		
		//�Τ@�Ӥ���d�߸Ӥ���Ҧ�����q��
//		Timestamp ts=
		
		//�Τ@�q�����d�߲���q��
		
		
		//�d�ߩҦ�����q���`�@�����B
//		int ttlPrice=tktOrderJDBCDao.queryTktOrderTtlPrice();
//		System.out.println(ttlPrice);
		
        //�ھڷ|��Id�d�߲���q��A�`�@���B
//		int custId=10015;
//		int ttlPrice=tktOrderJDBCDao.quertTktOrderTtlPriceById(custId);
//		System.out.println(ttlPrice);
		
		//�ھڤ���Ӭd�߲���q���`�@�����B
		
		
		
		
		

	}

}
