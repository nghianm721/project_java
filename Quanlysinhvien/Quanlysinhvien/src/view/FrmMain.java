/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.net.URI;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import model.UserDAO;
import view.Doithongtin;

/**
 *
 * @author Admin
 */
public class FrmMain extends javax.swing.JFrame {

    private sinhvien sv;
    private Doithongtin th;
    private lophoc lop;
    private diem diem;
    private Dangky use;
    
    public FrmMain() {
        initComponents();
        setLocationRelativeTo(null);
        showthongtin();
        dieukien();
        this.setTitle("PHẦN MỀM QUẢN LÝ SINH VIÊN");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnsv = new javax.swing.JButton();
        btndiem = new javax.swing.JButton();
        btndangky = new javax.swing.JButton();
        btnthongbao = new javax.swing.JButton();
        lbtk = new javax.swing.JLabel();
        lbrole = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tbmain = new javax.swing.JTabbedPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        hethong = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        thoat = new javax.swing.JMenuItem();
        ql = new javax.swing.JMenu();
        qlsv = new javax.swing.JMenuItem();
        qldiem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        qlthongtin = new javax.swing.JMenuItem();
        qlhuongdan = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 42)); // NOI18N
        jLabel2.setText("CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        btnsv.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnsv.setText("Quản lý sinh viên");
        btnsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsvActionPerformed(evt);
            }
        });

        btndiem.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btndiem.setText("Quản lý điểm");
        btndiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiemActionPerformed(evt);
            }
        });

        btndangky.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btndangky.setText("Quản lý tài khoản");
        btndangky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangkyActionPerformed(evt);
            }
        });

        btnthongbao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnthongbao.setText("Quản lý lớp học");
        btnthongbao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthongbaoActionPerformed(evt);
            }
        });

        lbtk.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbtk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbrole.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbrole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setBackground(new java.awt.Color(51, 204, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbtk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbrole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
            .addComponent(btndiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnsv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnthongbao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btndangky))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btndangky, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnthongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsv, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btndiem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbtk, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lbrole, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
        );

        jMenuBar2.setBackground(new java.awt.Color(255, 51, 204));

        hethong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        hethong.setText("HỆ THỐNG");
        hethong.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Đăng xuất");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        hethong.add(jMenuItem1);

        thoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        thoat.setText("Thoát ");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });
        hethong.add(thoat);

        jMenuBar2.add(hethong);

        ql.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.png"))); // NOI18N
        ql.setText("QUẢN LÝ");
        ql.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        qlsv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        qlsv.setText("Sinh Viên");
        qlsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qlsvActionPerformed(evt);
            }
        });
        ql.add(qlsv);

        qldiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        qldiem.setText("Điểm");
        qldiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qldiemActionPerformed(evt);
            }
        });
        ql.add(qldiem);

        jMenuBar2.add(ql);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Help.png"))); // NOI18N
        jMenu1.setText("TRỢ GIÚP");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        qlthongtin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        qlthongtin.setText("Thay đổi mật khẩu");
        qlthongtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qlthongtinActionPerformed(evt);
            }
        });
        jMenu1.add(qlthongtin);

        qlhuongdan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        qlhuongdan.setText("Hướng dẫn");
        qlhuongdan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qlhuongdanActionPerformed(evt);
            }
        });
        jMenu1.add(qlhuongdan);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbmain))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbmain, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void dieukien() {
        if (UserDAO.nguoidangnhap.getRole().equals("user")) {
            btndangky.setEnabled(false);        
        }
    }

    public void showthongtin() {
        lbtk.setText("Tài khoản: " + UserDAO.nguoidangnhap.getUsername());
        lbrole.setText("Quyền: " + UserDAO.nguoidangnhap.getRole());
    }
    private void btnsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsvActionPerformed
        // TODO add your handling code here:
        btnsv.setBackground(Color.CYAN);
        btnsv.setOpaque(true);
        if (sv == null) {
            sv = new sinhvien();
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/User.png"));
            tbmain.addTab("Sinh Viên", icon, sv, "Sinh Viên");
        }
        tbmain.setSelectedComponent(sv);
        btndangky.setBackground(Color.WHITE);
        btndiem.setBackground(Color.WHITE);
        btnthongbao.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnsvActionPerformed

    private void btndiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiemActionPerformed
        // TODO add your handling code here:
        btndiem.setBackground(Color.CYAN);
        btndiem.setOpaque(true);
        if (diem == null) {
            diem = new diem();
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/List.png"));
            tbmain.addTab(" Điểm", icon, diem, "Điểm");
        }
        tbmain.setSelectedComponent(diem);
        btndangky.setBackground(Color.WHITE);
        btnsv.setBackground(Color.WHITE);
        btnthongbao.setBackground(Color.WHITE);
    }//GEN-LAST:event_btndiemActionPerformed

    private void btndangkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangkyActionPerformed
        // TODO add your handling code here:
        btndangky.setBackground(Color.CYAN);
        btndangky.setOpaque(true);
        if (use == null) {
            use = new Dangky();
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/Home.png"));
            tbmain.addTab("User", icon, use, "User");
        }
        tbmain.setSelectedComponent(use);
        btnsv.setBackground(Color.WHITE);
        btndiem.setBackground(Color.WHITE);
        btnthongbao.setBackground(Color.WHITE);
    }//GEN-LAST:event_btndangkyActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        LoginDialog lg = new LoginDialog();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void qlhuongdanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qlhuongdanActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/nghiaminh2001"));

        } catch (Exception ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_qlhuongdanActionPerformed

    private void qlthongtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qlthongtinActionPerformed
        // TODO add your handling code here:
        th = new Doithongtin(this, true);
        th.setVisible(true);
    }//GEN-LAST:event_qlthongtinActionPerformed

    private void btnthongbaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthongbaoActionPerformed
        // TODO add your handling code here:
        btnthongbao.setBackground(Color.CYAN);
        btnthongbao.setOpaque(true);
        if (lop == null) {
            lop = new lophoc();
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/Notes.png"));
            tbmain.addTab("Lớp Học", icon, lop, "Lớp Học");
        }
        tbmain.setSelectedComponent(lop);
        btnsv.setBackground(Color.WHITE);
        btndiem.setBackground(Color.WHITE);
        btndangky.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnthongbaoActionPerformed

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_thoatActionPerformed

    private void qlsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qlsvActionPerformed
        // TODO add your handling code here:
        btnsv.setBackground(Color.CYAN);
        btnsv.setOpaque(true);
        if (sv == null) {
            sv = new sinhvien();
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/User.png"));
            tbmain.addTab("Sinh Viên", icon, sv, "Sinh Viên");
        }
        tbmain.setSelectedComponent(sv);
        btndangky.setBackground(Color.WHITE);
        btndiem.setBackground(Color.WHITE);
        btnthongbao.setBackground(Color.WHITE);

    }//GEN-LAST:event_qlsvActionPerformed

    private void qldiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qldiemActionPerformed
        // TODO add your handling code here:
        btndiem.setBackground(Color.CYAN);
        btndiem.setOpaque(true);
        if (diem == null) {
            diem = new diem();
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/List.png"));
            tbmain.addTab(" Điểm", icon, diem, "Điểm");
        }
        tbmain.setSelectedComponent(diem);

        btndangky.setBackground(Color.WHITE);
        btnsv.setBackground(Color.WHITE);
        btnthongbao.setBackground(Color.WHITE);
    }//GEN-LAST:event_qldiemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndangky;
    private javax.swing.JButton btndiem;
    private javax.swing.JButton btnsv;
    private javax.swing.JButton btnthongbao;
    private javax.swing.JMenu hethong;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbrole;
    private javax.swing.JLabel lbtk;
    private javax.swing.JMenu ql;
    private javax.swing.JMenuItem qldiem;
    private javax.swing.JMenuItem qlhuongdan;
    private javax.swing.JMenuItem qlsv;
    private javax.swing.JMenuItem qlthongtin;
    private javax.swing.JTabbedPane tbmain;
    private javax.swing.JMenuItem thoat;
    // End of variables declaration//GEN-END:variables

}
