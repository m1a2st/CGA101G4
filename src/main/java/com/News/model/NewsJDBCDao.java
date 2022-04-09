package com.News.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.DbHelper.Dbhelper;

public class NewsJDBCDao implements News_interface {

	@Override
	public boolean insertNews(NewsVO obj) {
		int count = 0;
		String sql = "insert into NEWS(title,content,img) values(?,?,?);";
		try (Connection conn = Dbhelper.getConnection(); 
				PreparedStatement prep = conn.prepareStatement(sql);) {
			prep.setString(1, obj.getTitle());
			prep.setString(2, obj.getContent());
			prep.setString(3, obj.getImg());
			prep.addBatch();
			count = prep.executeUpdate();
			System.out.println("success " + count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count != 0;
	}

	@Override
	public List<NewsVO> queryAllNews() {
		List<NewsVO> ls = new ArrayList<NewsVO>();
		String sql = "select news_id,title,content,create_date,img from NEWS;";
		try (Connection conn = Dbhelper.getConnection();
				PreparedStatement prep = conn.prepareStatement(sql)) {
			ResultSet rs = prep.executeQuery();
			while (rs.next()) {
				Integer newsId = (Integer) rs.getInt("news_id");
				String title = rs.getString("title");
				String content = rs.getString("content");
				Timestamp createDate = rs.getObject("create_date", Timestamp.class);
				String img = rs.getString("img");
				NewsVO newsVO = new NewsVO(newsId, title, content, createDate, img);
				ls.add(newsVO);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return ls;
	}

	@Override
	public NewsVO queryNewsById(Integer newsId) {
		NewsVO newsVO = new NewsVO();
		String sql = "select news_id,title,content,create_date,img from NEWS where news_id=?;";
		try (Connection conn = Dbhelper.getConnection();
				PreparedStatement prep = conn.prepareStatement(sql)) {
			prep.setInt(1, newsId);
			ResultSet rs = prep.executeQuery();
			if (rs.next()) {
				newsVO.setNewsId(rs.getInt("news_id"));
				newsVO.setTitle(rs.getString("title"));
				newsVO.setContent(rs.getString("content"));
				newsVO.setCreateDate(rs.getObject("create_date", Timestamp.class));
				;
				newsVO.setImg(rs.getString("img"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 
		return newsVO;
	}

	@Override
	public List<NewsVO> queryNewsByTitle(String title) {
		List<NewsVO> ls = new ArrayList<NewsVO>();
		String sql = "select news_id,title,content,create_date,img from NEWS where title like ?;";
		try (Connection conn = Dbhelper.getConnection();
				PreparedStatement prep = conn.prepareStatement(sql)) {
			prep.setString(1, "%" + title + "%");
			ResultSet rs = prep.executeQuery();
			while (rs.next()) {
				Integer newsId = rs.getInt("news_id");
				String queryTitle = rs.getString("title");
				String content = rs.getString("content");
				Timestamp createDate = rs.getObject("create_date", Timestamp.class);
				String img = rs.getString("img");
				NewsVO newsVO = new NewsVO(newsId, queryTitle, content, createDate, img);
				ls.add(newsVO);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 
		return ls;
	}

	@Override
	public boolean updateNewsById(NewsVO obj) {
		int count = 0;
		String sql = "update NEWS set title=?,content=?,img=? where news_id=?;";
		try (Connection conn = Dbhelper.getConnection();
				PreparedStatement prep = conn.prepareStatement(sql)) {
			prep.setString(1, obj.getTitle());
			prep.setString(2, obj.getContent());
			prep.setString(3, obj.getImg());
			prep.setInt(4, obj.getNewsId());
			count = prep.executeUpdate();
			System.out.println("success " + count);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return count != 0;
	}

	@Override
	public boolean deleteNewsById(Integer newsId) {
		int count = 0;
		String sql = "delete from NEWS where news_id=?";
		try (Connection conn = Dbhelper.getConnection();
				PreparedStatement prep = conn.prepareStatement(sql)) {
			prep.setInt(1, newsId);
			count = prep.executeUpdate();
			System.out.println("success " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count != 0;
	}

}
