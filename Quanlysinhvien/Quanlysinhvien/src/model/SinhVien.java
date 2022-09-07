/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String masv;
    private String tensv;
    private boolean gioitinh;
    private String sdt;
    private String email;
    private String diachi;  
    private lop lop;

    public SinhVien() {
    }
    public SinhVien(String masv, String tensv) {
        this.masv = masv;
        this.tensv = tensv;
    }

    public SinhVien(String masv, String tensv, boolean gioitinh,String sdt, String email, String diachi,lop lop) {
        this.masv = masv;
        this.tensv = tensv;      
        this.gioitinh = gioitinh;
        this.sdt= sdt;
        this.email=email;
        this.diachi = diachi;   
        this.lop=lop;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
     public lop getLop() {
        return lop;
    }

    public void setLop(lop lop) {
        this.lop = lop;
    }
}
