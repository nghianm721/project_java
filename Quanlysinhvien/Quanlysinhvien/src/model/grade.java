/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DecimalFormat;

/**
 *
 * @author Admin
 */
public class grade {

    private int id;

   
    private String masv ;
    private SinhVien Student;
    private double Toan;
    private double Java;
    private double TiengAnh;
    private double diemtb;
 public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SinhVien getStudent() {
        return Student;
    }

    public void setStudent(SinhVien Student) {
        this.Student = Student;
    }

    public double getToan() {
        return Toan;
    }

    public void setToan(double Toan) {
        this.Toan = Toan;
    }

    public double getJava() {
        return Java;
    }

    public void setJava(double Java) {
        this.Java = Java;
    }

    public double getTiengAnh() {
        return TiengAnh;
    }

    public void setTiengAnh(double TiengAnh) {
        this.TiengAnh = TiengAnh;
    }
    
    public double getDiemtb() {
     //  DecimalFormat df = new DecimalFormat("#.##");
  //     double a= ((getToan() + getJava3() + getTiengAnh()) / 3);
   //    System.out.println(df.format(a));
        return (getToan() + getJava() + getTiengAnh()) / 3;
    }

    public String getXeploai() {
        String xl = "";
        double tbc = getDiemtb();
        if (tbc > 8) {
            xl = "Giỏi";

        } else if (tbc > 7) {
            xl = "Khá";
        } else if (tbc >= 5) {
            xl = "Trung Bình";

        } else {
            xl = "Yếu";
        }
        return xl;
    }

    public void setDiemtb(double diemtb) {
        this.diemtb = diemtb;
    }

    public grade(int id, String masv,SinhVien Student, double Toan, double Java, double TiengAnh, double diemtb) {
        this.id = id;
        this.masv=masv;
        this.Student = Student;
        this.Toan = Toan;
        this.Java = Java;
        this.TiengAnh = TiengAnh;
        this.diemtb = diemtb;
    }

    public grade() {
    }

}
