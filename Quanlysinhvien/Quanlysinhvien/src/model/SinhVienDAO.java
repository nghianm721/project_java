/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.DattabaseUtils;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SinhVienDAO {

    public int themsv(SinhVien sv) {
        Connection con = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = " insert into [Quanlysinhvien].[dbo].[SinhVien](masv,tensv,gioitinh,sdt,email,diachi,malop) values(?,?,?,?,?,?,?)";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            sttm.setString(1, sv.getMasv());
            sttm.setString(2, sv.getTensv());
            sttm.setBoolean(3, sv.isGioitinh());
            sttm.setString(4, sv.getSdt());
            sttm.setString(5, sv.getEmail());
            sttm.setString(6, sv.getDiachi());
            sttm.setString(7, sv.getLop().getMalop());
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

    public int suasvtheoma(SinhVien sv) {
        Connection con = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = " update [Quanlysinhvien].[dbo].[SinhVien] set tensv=?,"
                    + "gioitinh=?,sdt=?,email=?,diachi=? where masv=?";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            //sttm.setString(7, sv.getLop().getMalop());
            sttm.setString(6, sv.getMasv());
            sttm.setString(1, sv.getTensv());
            sttm.setBoolean(2, sv.isGioitinh());
            sttm.setString(3, sv.getSdt());
            sttm.setString(4, sv.getEmail());
            sttm.setString(5, sv.getDiachi());
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

    public int xoasvtheomasv(String masv) {
        Connection con = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "  delete [Quanlysinhvien].[dbo].[SinhVien] where masv=?";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            sttm.setString(1, masv);
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

    public SinhVien laysvtheomasv(String masv) {
        Connection con = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        SinhVien sv = new SinhVien();
        try {
            String sSQL = "   SELECT dbo.SinhVien.malop,dbo.lop.tenlop,dbo.SinhVien.masv, dbo.SinhVien.tensv, dbo.SinhVien.gioitinh,dbo.SinhVien.sdt, dbo.SinhVien.email,dbo.SinhVien.diachi "
                    + "FROM  dbo.SinhVien INNER JOIN dbo.lop ON dbo.SinhVien.malop = dbo.lop.malop where SinhVien.masv=?";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            sttm.setString(1, masv);
            rs = sttm.executeQuery();
            while (rs.next()) {
                sv.setLop(new lop(rs.getString(1), rs.getString(2)));
                sv.setMasv(rs.getString(3));
                sv.setTensv(rs.getString(4));
                sv.setGioitinh(rs.getBoolean(5));
                sv.setSdt(rs.getString(6));
                sv.setEmail(rs.getString(7));
                sv.setDiachi(rs.getString(8));
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

    public SinhVien laysvkhongcanlop(String masv) {
        Connection con = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        SinhVien sv = new SinhVien();
        try {
            String sSQL = "SELECT*FROM SinhVien where masv=?";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            sttm.setString(1, masv);
            rs = sttm.executeQuery();
            while (rs.next()) {
                lop s = new lop();
                s.setMalop(rs.getString(1));
                sv.setLop(s);
                sv.setMasv(rs.getString(2));
                sv.setTensv(rs.getString(3));
                sv.setGioitinh(rs.getBoolean(4));
                sv.setSdt(rs.getString(5));
                sv.setEmail(rs.getString(6));
                sv.setDiachi(rs.getString(7));
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

    public List<SinhVien> laydanhsachsv() {
        List<SinhVien> ls = new ArrayList<>();
        Connection con = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT dbo.SinhVien.malop,dbo.lop.tenlop,dbo.SinhVien.masv, dbo.SinhVien.tensv, dbo.SinhVien.gioitinh,dbo.SinhVien.sdt, dbo.SinhVien.email,dbo.SinhVien.diachi "
                    + "FROM  dbo.SinhVien INNER JOIN dbo.lop ON dbo.SinhVien.malop = dbo.lop.malop ";
            con = DattabaseUtils.getDBConnect();
            sttm = con.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setLop(new lop(rs.getString(1), rs.getString(2)));
                sv.setMasv(rs.getString(3));
                sv.setTensv(rs.getString(4));
                sv.setGioitinh(rs.getBoolean(5));
                sv.setSdt(rs.getString(6));
                sv.setEmail(rs.getString(7));
                sv.setDiachi(rs.getString(8));
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

    public List<SinhVien> laydanhsachsvtheomalop(String malop) {
        List<SinhVien> ls = new ArrayList<>();
        Connection con = null;
        // dung lam gi
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "   SELECT dbo.SinhVien.malop,dbo.lop.tenlop,dbo.SinhVien.masv, dbo.SinhVien.tensv, dbo.SinhVien.gioitinh,dbo.SinhVien.sdt, dbo.SinhVien.email,dbo.SinhVien.diachi "
                    + "FROM  dbo.SinhVien INNER JOIN dbo.lop ON dbo.SinhVien.malop = dbo.lop.malop and SinhVien.malop like '%" + malop + "%' ";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            rs = sttm.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                lop s = new lop();
                s.setMalop(rs.getString(1));
                s.setTenlop(rs.getString(2));
                sv.setLop(s);
                sv.setMasv(rs.getString(3));
                sv.setTensv(rs.getString(4));
                sv.setGioitinh(rs.getBoolean(5));
                sv.setSdt(rs.getString(6));
                sv.setEmail(rs.getString(7));
                sv.setDiachi(rs.getString(8));
                //tìm thấy sẽ thêm vào
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

    public List<SinhVien> laydanhsachsvtheomasvgandung(String masv) {
        List<SinhVien> ls = new ArrayList<>();
        Connection con = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "  SELECT dbo.SinhVien.malop,dbo.lop.tenlop,dbo.SinhVien.masv, dbo.SinhVien.tensv, dbo.SinhVien.gioitinh,dbo.SinhVien.sdt, dbo.SinhVien.email,dbo.SinhVien.diachi "
                    + "FROM  dbo.SinhVien INNER JOIN dbo.lop and masv like '%" + masv + "%' ";
            con = DattabaseUtils.getDBConnect();
            sttm = con.prepareStatement(sSQL);
            rs = sttm.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                lop s = new lop();
                s.setMalop(rs.getString(1));
                s.setTenlop(rs.getString(2));
                sv.setLop(s);
                //  sv.setLop(new lop(rs.getString(1), rs.getString(2)));
                sv.setMasv(rs.getString(3));
                sv.setTensv(rs.getString(4));
                sv.setGioitinh(rs.getBoolean(5));
                sv.setSdt(rs.getString(6));
                sv.setEmail(rs.getString(7));
                sv.setDiachi(rs.getString(8));
                //tìm thấy sẽ thêm vào
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
}
