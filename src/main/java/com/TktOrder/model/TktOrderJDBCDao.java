package com.TktOrder.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.DbHelper.Dbhelper;

public class TktOrderJDBCDao implements TktOrder_interface {
	private static Connection conn = Dbhelper.getConnection();

	@Override
	public boolean insertTktOrder(TktOrderVO obj) {
		int count = 0;
		String sql = "insert into TKT_ORDER(cust_id,original_price,ttl_price,cust_cop_id,qrcode)"
				+ " values(?,?,?,?,?);";
		try (PreparedStatement prep = conn.prepareStatement(sql)) {
			prep.setInt(1, obj.getCustId());
			prep.setInt(2, obj.getOriginalPrice());
			prep.setInt(3, obj.getTtlPrice());
			// 包裝類沒有值為0的存在
			prep.setInt(4, obj.getCustCopId());
			prep.setString(5, obj.getQrCode());
			count = prep.executeUpdate();
			System.out.println("success " + count);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return count != 0;
	}

	@Override
	public List<TktOrderVO> queryAllTktOrder() {
		List<TktOrderVO> ls = new ArrayList<TktOrderVO>();
		String sql = "select tkt_order_id,cust_id,original_price,orderdate,"
				+ "ttl_price,cust_cop_id,qrcode from TKT_ORDER;";
		try (PreparedStatement prep = conn.prepareStatement(sql)) {
			ResultSet rs = prep.executeQuery();
			while (rs.next()) {
				Integer tktOrderId = rs.getInt("tkt_order_id");
				Integer custId = rs.getInt("cust_id");
				Integer originalPrice = rs.getInt("original_price");
				Timestamp orderdate = rs.getObject("orderdate", Timestamp.class);
				Integer ttlPrice = rs.getInt("ttl_price");
				Integer custCopId = rs.getInt("cust_cop_id");
				String qrcode = rs.getString("qrcode");
				TktOrderVO tktOrderVO = new TktOrderVO(tktOrderId, custId, originalPrice, orderdate, ttlPrice,
						custCopId, qrcode);
				ls.add(tktOrderVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ls;
	}

	@Override
	public List<TktOrderVO> queryTktOrderByCustId(Integer custId) {
		List<TktOrderVO> ls = new ArrayList<TktOrderVO>();
		String sql = "select tkt_order_id,cust_id,original_price,orderdate,"
				+ "ttl_price,cust_cop_id,qrcode from TKT_ORDER where cust_id=?;";
		try (PreparedStatement prep = conn.prepareStatement(sql)) {
			prep.setInt(1, custId);
			ResultSet rs = prep.executeQuery();
			while (rs.next()) {
				Integer tktOrderId = rs.getInt("tkt_order_id");
				Integer querycustId = rs.getInt("cust_id");
				Integer originalPrice = rs.getInt("original_price");
				Timestamp orderdate = rs.getObject("orderdate", Timestamp.class);
				Integer ttlPrice = rs.getInt("ttl_price");
				Integer custCopId = rs.getInt("cust_cop_id");
				String qrcode = rs.getString("qrcode");
				TktOrderVO tktOrderVO = new TktOrderVO(tktOrderId, querycustId, originalPrice, orderdate, ttlPrice,
						custCopId, qrcode);
				ls.add(tktOrderVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ls;
	}

	@Override
	public List<TktOrderVO> queryTktOrderByOrderDate(Timestamp orderDate) {
		List<TktOrderVO> ls=new ArrayList<TktOrderVO>();
		String date="";
		String sql = "select tkt_order_id,cust_id,original_price,orderdate,"
				+ "ttl_price,cust_cop_id,qrcode from TKT_ORDER where orderdate like=?;";
		try (PreparedStatement prep = conn.prepareStatement(sql)) {
			prep.setString(1,"%"+date+"%");
			ResultSet rs=prep.executeQuery();
			while(rs.next()) {
				Integer tktOrderId = rs.getInt("tkt_order_id");
				Integer querycustId = rs.getInt("cust_id");
				Integer originalPrice = rs.getInt("original_price");
				Timestamp orderdate = rs.getObject("orderdate", Timestamp.class);
				Integer ttlPrice = rs.getInt("ttl_price");
				Integer custCopId = rs.getInt("cust_cop_id");
				String qrcode = rs.getString("qrcode");
				TktOrderVO tktOrderVO = new TktOrderVO(tktOrderId, querycustId, originalPrice, orderdate, ttlPrice,
						custCopId, qrcode);
				ls.add(tktOrderVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ls;
	}

	@Override
	public List<TktOrderVO> queryTktOrderByDateToDate(Timestamp startdate, Timestamp enddate) {
		List<TktOrderVO> ls=new ArrayList<TktOrderVO>();
		String sql = "select tkt_order_id,cust_id,original_price,orderdate,"
				+ "ttl_price,cust_cop_id,qrcode from TKT_ORDER where orderdate between ? and ?;";
		try (PreparedStatement prep = conn.prepareStatement(sql)) {
			prep.setObject(1, startdate);
			prep.setObject(2, enddate);
			ResultSet rs=prep.executeQuery();
			while(rs.next()) {
				Integer tktOrderId = rs.getInt("tkt_order_id");
				Integer querycustId = rs.getInt("cust_id");
				Integer originalPrice = rs.getInt("original_price");
				Timestamp orderdate = rs.getObject("orderdate", Timestamp.class);
				Integer ttlPrice = rs.getInt("ttl_price");
				Integer custCopId = rs.getInt("cust_cop_id");
				String qrcode = rs.getString("qrcode");
				TktOrderVO tktOrderVO = new TktOrderVO(tktOrderId, querycustId, originalPrice, orderdate, ttlPrice,
						custCopId, qrcode);
				ls.add(tktOrderVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ls;
	}

	@Override
	public int queryTktOrderTtlPrice() {
		int totalPrice=0;
		String sql = "select sum(ttl_price) as ttlprice from TKT_ORDER;";
		try (PreparedStatement prep = conn.prepareStatement(sql)) {
			ResultSet rs=prep.executeQuery();
			if(rs.next()) {
				totalPrice=rs.getInt("ttlprice");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return totalPrice;
	}

	@Override
	public int quertTktOrderTtlPriceById(Integer custId) {
		int ttlPrice=0;
		String sql = "select sum(ttl_price) as ttlprice from TKT_ORDER where cust_id=?;";
		try (PreparedStatement prep = conn.prepareStatement(sql)) {
			prep.setInt(1, custId);
			ResultSet rs=prep.executeQuery();
			if(rs.next()) {
				ttlPrice=rs.getInt("ttlprice");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ttlPrice;
	}

	@Override
	public int queryTktOrderTtlPriceByDateToDate(Timestamp stardate, Timestamp enddate) {
		int ttlPrice=0;
		String sql = "select sum(ttl_price) as ttlprice from TKT_ORDER where order_date between ? and ?;";
		try (PreparedStatement prep = conn.prepareStatement(sql)) {
			prep.setObject(1, stardate);
			prep.setObject(2, enddate);
			ResultSet rs=prep.executeQuery();
			if(rs.next()) {
				ttlPrice=rs.getInt("ttlprice");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ttlPrice;
	}

}
