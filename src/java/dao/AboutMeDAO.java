/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.DBConnection;
import entity.AboutMe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author kynhanht
 */
public class AboutMeDAO {

    DBConnection dBConnection;

    public AboutMeDAO() throws Exception {
        try {
            dBConnection = new DBConnection();
        } catch (Exception e) {
            throw e;
        }
    }

    public AboutMe getAboutMe() throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        AboutMe aboutMe = null;
        try {
            con = dBConnection.getConnection();
            String query = "Select* from AboutMe";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String description = rs.getString("description");
                aboutMe = new AboutMe(name, description);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            dBConnection.close(con, ps, rs);
        }
        return aboutMe;

    }
}
