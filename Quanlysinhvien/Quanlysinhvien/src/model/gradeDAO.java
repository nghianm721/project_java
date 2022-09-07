/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import database.DattabaseUtils;

/**
 *
 * @author Admin
 */
public class gradeDAO {

    public List<grade> laydanhsachdiem() {
        List<grade> ls = new ArrayList<>();
        Connection con = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = " SELECT dbo.grade.masv, dbo.SinhVien.tensv, dbo.grade.Toan, dbo.grade.Java, dbo.grade.TiengAnh "
                    + "FROM  dbo.grade INNER JOIN dbo.SinhVien ON dbo.grade.masv = dbo.SinhVien.masv";
            con = DattabaseUtils.getDBConnect();
            sttm = con.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                grade g = new grade();
                g.setStudent(new SinhVien(rs.getString(1), rs.getString(2)));
                g.setToan(rs.getDouble(3));
                g.setJava(rs.getDouble(4));
                g.setTiengAnh(rs.getDouble(5));
                ls.add(g);
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

    public List<grade> laydanhsachdiemtheomasv(String masv) {
        List<grade> ls = new ArrayList<>();
        Connection con = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;

        try {
            String sSQL = " SELECT dbo.grade.masv, dbo.SinhVien.tensv, dbo.grade.Toan, dbo.grade.Java, dbo.grade.TiengAnh "
                    + "FROM  dbo.grade INNER JOIN dbo.SinhVien ON dbo.grade.masv = dbo.SinhVien.masv and SinhVien.masv like '%" + masv + "%' ";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            // sttm.setString(1, masv);
            rs = sttm.executeQuery();
            while (rs.next()) {
                grade g = new grade();
                SinhVien d = new SinhVien();
                d.setMasv(rs.getString(1));
                d.setTensv(rs.getString(2));
                g.setStudent(d);
                //  g.setStudent(new SinhVien(rs.getString(1), rs.getString(2)));
                g.setToan(rs.getDouble(3));
                g.setJava(rs.getDouble(4));
                g.setTiengAnh(rs.getDouble(5));
                ls.add(g);
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

    public grade getgradebymasv(String masv) {

        Connection con = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;

        try {
            String sSQL = "SELECT dbo.grade.masv, dbo.SinhVien.tensv, dbo.grade.Toan, dbo.grade.Java, dbo.grade.TiengAnh FROM  dbo.grade INNER JOIN dbo.SinhVien ON dbo.grade.masv = dbo.SinhVien.masv where grade.masv=?";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            sttm.setString(1, masv);
            rs = sttm.executeQuery();
            while (rs.next()) {
                grade g = new grade();
                // SinhVien d = new SinhVien();
                //d.setMasv(rs.getString(masv));
                g.setStudent(new SinhVien(rs.getString(1), rs.getString(2)));
                g.setToan(rs.getDouble(3));
                g.setJava(rs.getDouble(4));
                g.setTiengAnh(rs.getDouble(5));

                return g;
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
        return null;
    }

    public int themdiem(grade diem) {
        PreparedStatement preparedsttm = null;
        Connection con = null;
        try {
            String sSQLInsert = "insert into grade (masv,Toan,Java,TiengAnh) values(?,?,?,?)";
            con = DattabaseUtils.getDBConnect();
            preparedsttm = con.prepareStatement(sSQLInsert);
            preparedsttm.setString(1, diem.getStudent().getMasv());
            preparedsttm.setDouble(2, diem.getToan());
            preparedsttm.setDouble(3, diem.getJava());
            preparedsttm.setDouble(4, diem.getTiengAnh());
            if (preparedsttm.executeUpdate() > 0) {
                System.out.println("add thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("error" + e.toString());
        } finally {
            try {
                con.close();
                preparedsttm.close();
            } catch (SQLException e) {
            }
        }
        return -1;
    }

    public int suadiem(grade diem) {
        PreparedStatement preparedsttm = null;
        Connection conn = null;
        try {
            String sSQLInsert = "UPDATE grade SET Toan = ?,Java= ?,TiengAnh = ? WHERE masv = ?";
            conn = DattabaseUtils.getDBConnect();
            preparedsttm = conn.prepareStatement(sSQLInsert);
            preparedsttm.setString(4, diem.getStudent().getMasv());
            preparedsttm.setDouble(1, diem.getToan());
            preparedsttm.setDouble(2, diem.getJava());
            preparedsttm.setDouble(3, diem.getTiengAnh());
            if (preparedsttm.executeUpdate() > 0) {
                System.out.println("cap nhat thanh công");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("error" + e.toString());
        } finally {
            try {
                conn.close();
                preparedsttm.close();
            } catch (SQLException e) {

            }
        }
        return -1;
    }

    public int xoadiemtheomasv(String masv1) {
        PreparedStatement preparedsttm = null;
        Connection conn = null;
        try {
            String sSQLInsert = "DELETE FROM grade WHERE masv=?";
            conn = DattabaseUtils.getDBConnect();
            preparedsttm = conn.prepareStatement(sSQLInsert);
            preparedsttm.setString(1, masv1);
            if (preparedsttm.executeUpdate() > 0) {
                System.out.println("xoa thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("error" + e.toString());
        } finally {
            try {
                conn.close();
                preparedsttm.close();
            } catch (SQLException e) {

            }
        }
        return -1;
    }

}
