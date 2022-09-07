/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import database.DattabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.lop;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class lopDAO {

    public int themlop(lop lop) {
        Connection con = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = " insert into [Quanlysinhvien].[dbo].[lop](malop,tenlop) values(?,?)";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            sttm.setString(1, lop.getMalop());
            sttm.setString(2, lop.getTenlop());
            //dua dữ liệu vào 
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

    public int sualoptheomalop(lop lop) {
        Connection con = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = " update [Quanlysinhvien].[dbo].[lop] set tenlop=? where malop=?";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            sttm.setString(2, lop.getMalop());
            sttm.setString(1, lop.getTenlop());
            if (sttm.executeUpdate() > 0) {
                System.out.println("sua thanh cong");
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

    public int xoaloptheoma(String malop) {
        Connection con = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "  delete [Quanlysinhvien].[dbo].[lop] where malop=?";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            sttm.setString(1, malop);
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

    public List<lop> laytoanbodanhsachlop() {
        List<lop> listlop = new ArrayList<>();
        Connection con = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = " select *  FROM [Quanlysinhvien].[dbo].[lop] ";
            con = DattabaseUtils.getDBConnect();
            sttm = con.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                lop lop = new lop();
                lop.setMalop(rs.getString(1));
                lop.setTenlop(rs.getString(2));
                listlop.add(lop);
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
        return listlop;
    }

    public List<lop> laytoanbodanhsachloptheoma(String malop) {
        List<lop> listlop = new ArrayList<>();
        Connection con = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select* from [Quanlysinhvien].[dbo].[lop] where malop like '%" + malop + "%'";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            rs = sttm.executeQuery();
            while (rs.next()) {
                lop lop = new lop();
                lop.setMalop(rs.getString(1));
                lop.setTenlop(rs.getString(2));
                //tìm thấy sẽ thêm vào
                listlop.add(lop);
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
        return listlop;
    }

    public lop layloptheoma(String masv) {

        Connection con = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        lop sv = new lop();
        try {
            String sSQL = "   select* from [Quanlysinhvien].[dbo].[lop] where malop=?";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            sttm.setString(1, masv);
            rs = sttm.executeQuery();
            while (rs.next()) {
                sv.setMalop(rs.getString(1));
                sv.setTenlop(rs.getString(2));

                return sv;
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

}
