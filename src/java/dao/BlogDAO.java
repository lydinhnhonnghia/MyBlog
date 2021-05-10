/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.DBConnection;
import entity.Blog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kynhanht
 */
public class BlogDAO {

    DBConnection dBConnection;

    public BlogDAO() throws Exception {
        try {
            dBConnection = new DBConnection();
        } catch (Exception e) {
            throw e;
        }
    }

    public Blog getBlogById(int id) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Blog blog = null;
        try {
            conn = dBConnection.getConnection();
            String query = "select* from Blog where id=?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            while (rs.next()) {
                String name = rs.getString("name");
                String description = rs.getString("description");
                String picture = dBConnection.getImagePath() + rs.getString("picture");
                String quote = rs.getString("quote");
                String author = rs.getString("author");
                String iconPicture = dBConnection.getImagePath() + rs.getString("iconPicture");
                java.sql.Date dateSql = rs.getDate("publishedDate");
                Date date = new java.sql.Date(dateSql.getTime());
                String publishedDate = sdf.format(date);
                String type = rs.getString("type");
                blog = new Blog(id, name, description, picture, quote, author, iconPicture, publishedDate, type);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            dBConnection.close(conn, ps, rs);
        }
        return blog;
    }

    public int getTotalBlog() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int rows = 0;
        try {
            String query = "select count(*) from Blog";
            conn = dBConnection.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                rows = rs.getInt(1);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            dBConnection.close(conn, ps, rs);
        }
        return rows;
    }

    public int getTotalPages() throws Exception {
        if (getTotalBlog() % 3 == 0) {
            return getTotalBlog() / 3;
        }
        return getTotalBlog() / 3 + 1;
    }

    public List<Blog> getBlogByPage(int page) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Blog> blogs = null;
        SimpleDateFormat sdf = null;
        try {
            conn = dBConnection.getConnection();
            String query = "select b.* "
                    + "from (select *,ROW_NUMBER() Over(Order by id) RN  from Blog ) b "
                    + "where RN between ? and ?";
            int from = (page - 1) * 3 + 1;
            int to = page * 3;
            ps = conn.prepareStatement(query);
            ps.setInt(1, from);
            ps.setInt(2, to);
            rs = ps.executeQuery();
            blogs = new ArrayList<>();
            sdf = new SimpleDateFormat("dd-MM-yyyy");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String picture = dBConnection.getImagePath() + rs.getString("picture");
                String quote = rs.getString("quote");
                String author = rs.getString("author");
                String iconPicture = dBConnection.getImagePath() + rs.getString("iconPicture");
                java.sql.Date dateSql = rs.getDate("publishedDate");
                Date date = new java.sql.Date(dateSql.getTime());
                String publishedDate = sdf.format(date);
                String type = rs.getString("type");
                Blog blog = new Blog(id, name, description, picture, quote, author, iconPicture, publishedDate, type);
                blogs.add(blog);

            }
        } catch (Exception e) {
            throw e;
        } finally {
            dBConnection.close(conn, ps, rs);
        }
        return blogs;
    }

    public List<Blog> getTop3Blog() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Blog> blogs = null;
        SimpleDateFormat sdf = null;
        try {
            conn = dBConnection.getConnection();
            String query = "Select top 3* from Blog";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            blogs = new ArrayList<>();
            sdf = new SimpleDateFormat("dd-MM-yyyy");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String picture = dBConnection.getImagePath() + rs.getString("picture");
                String quote = rs.getString("quote");
                String author = rs.getString("author");
                String iconPicture = dBConnection.getImagePath() + rs.getString("iconPicture");
                java.sql.Date dateSql = rs.getDate("publishedDate");
                Date date = new java.sql.Date(dateSql.getTime());
                String publishedDate = sdf.format(date);
                String type = rs.getString("type");
                Blog blog = new Blog(id, name, description, picture, quote, author, iconPicture, publishedDate, type);
                blogs.add(blog);

            }
        } catch (Exception e) {
            throw e;
        } finally {
            dBConnection.close(conn, ps, rs);
        }
        return blogs;
    }
}
