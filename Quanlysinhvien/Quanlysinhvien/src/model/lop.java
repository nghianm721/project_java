/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class lop {
    String malop,tenlop;
    
    public String getMalop() {
        return malop;
    }
    
    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public lop() {
    }

    public lop(String malop, String tenlop) {
        this.malop = malop;
        this.tenlop = tenlop;
    }
    
    
}
