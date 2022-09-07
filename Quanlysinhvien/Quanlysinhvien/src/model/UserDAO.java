/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.DattabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author Admin
 */
public class UserDAO {

    public List<User> laydanhsachtk() {
        List<User> ls = new ArrayList<>();
        Connection con = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "  select *  FROM [Quanlysinhvien].[dbo].[User]";
            con = DattabaseUtils.getDBConnect();
            sttm = con.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                User sv = new User();
                sv.setUsername(rs.getString(1));
                sv.setPassword(rs.getString(2));
                sv.setRole(rs.getString(3));
                sv.setEmail(rs.getString(4));
                ls.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Eror:" + e.toString());
        } finally {
            try {
                rs.close();
                sttm.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return ls;
    }

    public int XoaUserTheoTk(String username) {
        Connection con = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "delete [Quanlysinhvien].[dbo].[User] where username=?";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            sttm.setString(1, username);
            if (sttm.executeUpdate() > 0) {
                System.out.println("xoa thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Eror:" + e.toString());
        } finally {
            try {
                con.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return -1;
    }

    public List<User> laydanhsachtaikhoantheotk(String username) {
        List<User> ls = new ArrayList<User>();
        Connection con = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;

        try {
            String sSQL = "select *  FROM [Quanlysinhvien].[dbo].[User] where username like '%" + username + "%' ";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            // sttm.setString(0, username);
            rs = sttm.executeQuery();
            while (rs.next()) {
                User ee = new User();
                ee.setUsername(rs.getString(1));
                ee.setPassword(rs.getString(2));
                ee.setRole(rs.getString(3));
                ee.setEmail(rs.getString(4));
                ls.add(ee);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                con.close();
                rs.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return ls;
    }

    public User getUserByID(String username) {
        Connection con = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        User ee = new User();
        try {
            String sSQL = "select *  FROM [Quanlysinhvien].[dbo].[User] where username= ?";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            sttm.setString(1, username);
            rs = sttm.executeQuery();
            while (rs.next()) {
                ee.setUsername(rs.getString(1));
                ee.setPassword(rs.getString(2));
                ee.setRole(rs.getString(3));
                ee.setEmail(rs.getString(4));
                return ee;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                con.close();
                rs.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return null;
    }
    public static User nguoidangnhap;

    public boolean kiemtradangnhap(String username, String password) {
        User user = getUserByID(username);
        if (user != null) {
            //ton tai 
            if (user.getPassword().equals(password)) {
                nguoidangnhap = user;
                return true;
            }
        }
        return false;
    }

    public int themtk(User user) {
        Connection con = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = " insert into [Quanlysinhvien].[dbo].[User](username,password,role,email) values(?,?,?,?)";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            sttm.setString(1, user.getUsername());
            sttm.setString(2, user.getPassword());
            sttm.setString(3, user.getRole());
            sttm.setString(4, user.getEmail());
            if (sttm.executeUpdate() > 0) {
                System.out.println("thêm thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Eror:" + e.toString());
        } finally {
            try {
                con.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return -1;
    }

    public int SuaUserTheoTk(User sv) {
        Connection con = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = " update [Quanlysinhvien].[dbo].[User] set password=?,role=?,email=? where username=?";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            sttm.setString(4, sv.getUsername());
            sttm.setString(1, sv.getPassword());
            sttm.setString(2, sv.getRole());
            sttm.setString(3, sv.getEmail());

            if (sttm.executeUpdate() > 0) {
                System.out.println("add thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Eror:" + e.toString());
        } finally {
            try {
                con.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return -1;

    }

    public int doimk(User sv) {
        Connection con = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = " UPDATE [User] SET password = ?,role=?,email=? WHERE username = ?";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            sttm.setString(1, sv.getPassword());
            sttm.setString(3, sv.getUsername());
            sttm.setString(2, sv.getRole());
            sttm.setString(4, sv.getEmail());
            if (sttm.executeUpdate() > 0) {
                System.out.println("Đổi thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Eror:" + e.toString());
        } finally {
            try {
                con.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return -1;

    }

}
