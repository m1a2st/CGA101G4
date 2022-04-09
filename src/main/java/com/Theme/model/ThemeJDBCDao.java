package com.Theme.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.DbHelper.Dbhelper;

public class ThemeJDBCDao implements Theme_interface {
	private static Connection conn = Dbhelper.getConnection();

	@Override
	public boolean insertTheme(ThemeVO obj) {
		int count = 0;
		String sql = "insert into THEME(title,content,img) values(?,?,?)";
		try (PreparedStatement prep = conn.prepareStatement(sql)) {
			prep.setString(1, obj.getTitle());
			prep.setString(2, obj.getContent());
			prep.setString(3, obj.getImg());
			prep.addBatch();
			count = prep.executeUpdate();
			System.out.println("success " + count);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
	public List<ThemeVO> queryAllTheme() {
		List<ThemeVO> ls = new ArrayList<ThemeVO>();
		String sql = "select theme_id,title,content,create_date,img from THEME;";
		try (PreparedStatement prep = conn.prepareStatement(sql)) {
			ResultSet rs = prep.executeQuery();
			while (rs.next()) {
				Integer themeId = (Integer) rs.getInt("theme_id");
				String title = rs.getString("title");
				String content = rs.getString("content");
				Timestamp createDate = rs.getObject("create_date", Timestamp.class);
				String img = rs.getString("img");
				ThemeVO themeVO = new ThemeVO(themeId, title, content, createDate, img);
				ls.add(themeVO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
	public ThemeVO queryThemeById(Integer themeId) {
		ThemeVO themeVO = new ThemeVO();
		String sql = "select theme_id,title,content,create_date,img from THEME where theme_id=?;";
		try (PreparedStatement prep = conn.prepareStatement(sql)) {
			prep.setInt(1, themeId);
			ResultSet rs = prep.executeQuery();
			if (rs.next()) {
				themeVO.setThemeId(rs.getInt("theme_id"));
				themeVO.setTitle(rs.getString("title"));
				themeVO.setContent(rs.getString("content"));
				themeVO.setDate(rs.getObject("create_date", Timestamp.class));
				themeVO.setImg(rs.getString("img"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return themeVO;
	}

	@Override
	public List<ThemeVO> queryThemeByTitle(String title) {
		List<ThemeVO> ls = new ArrayList<ThemeVO>();
		String sql = "select theme_id,title,content,create_date,img from THEME where title like ?;";
		try (PreparedStatement prep = conn.prepareStatement(sql)) {
			prep.setString(1, "%" + title + "%");
			ResultSet rs = prep.executeQuery();
			while (rs.next()) {
				Integer themeId = rs.getInt("theme_id");
				String queryTitle = rs.getString("title");
				String content = rs.getString("content");
				Timestamp createDate = rs.getObject("create_date", Timestamp.class);
				String img = rs.getString("img");
				ThemeVO themeVO = new ThemeVO(themeId, queryTitle, content, createDate, img);
				ls.add(themeVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
	public boolean updateThemeById(ThemeVO obj) {
		int count = 0;
		String sql = "update THEME set title=?,content=?,img=? where theme_id=?;";
		try (PreparedStatement prep = conn.prepareStatement(sql)) {
			prep.setString(1, obj.getTitle());
			prep.setString(2, obj.getContent());
			prep.setString(3, obj.getImg());
			prep.setInt(4, obj.getThemeId());
			count = prep.executeUpdate();
			System.out.println("success " + count);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
	public boolean deleteThemeById(Integer themeId) {
		int count = 0;
		String sql = "delete from THEME where theme_id=?";
		try (PreparedStatement prep = conn.prepareStatement(sql)) {
			prep.setInt(1, themeId);
			count = prep.executeUpdate();
			System.out.println("success " + count);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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

}
