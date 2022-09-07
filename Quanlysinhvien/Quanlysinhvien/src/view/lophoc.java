/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.lop;
import model.lopDAO;

/**
 *
 * @author Admin
 */
public class lophoc extends javax.swing.JPanel {

    DefaultTableModel model;
    List<lop> List = new ArrayList<>();
    lopDAO lopDAO = new lopDAO();
    private int selectedIndex;
    String timkiem = "";
    /**
     * Creates new form lophoc
     */
    public lophoc() {
        initComponents();
        hienthiduieu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblop = new javax.swing.JTable();
        btnthemmoi = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        txttimkiem = new javax.swing.JTextField();
        btnxoa = new javax.swing.JButton();
        btntimkiem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnreset = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 204, 255));

        tblop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Lớp", "Tên Lớp"
            }
        ));
        tblop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblopMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblop);

        btnthemmoi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnthemmoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add.png"))); // NOI18N
        btnthemmoi.setText("Thêm lớp mới");
        btnthemmoi.setPreferredSize(new java.awt.Dimension(107, 37));
        btnthemmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemmoiActionPerformed(evt);
            }
        });

        btnsua.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit.png"))); // NOI18N
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.setPreferredSize(new java.awt.Dimension(107, 37));
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btntimkiem.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btntimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N
        btntimkiem.setText("Tìm kiếm");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("DANH SÁCH LỚP HỌC");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Mã lớp học:");

        btnreset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnreset.setText("Làm mới danh sách");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnthemmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(575, 575, 575)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btntimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btntimkiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnthemmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoa, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
  public void hienthiduieu() {
        List.clear();
        List = lopDAO.laytoanbodanhsachlop();
        model = (DefaultTableModel) tblop.getModel();
        model.setRowCount(0);
        for (lop g : lopDAO.laytoanbodanhsachlop()) {
            Object[] rowData = new Object[2];
            rowData[0] = g.getMalop();
            rowData[1] = g.getTenlop();
            model.addRow(rowData);
        }
    }

    public void hienthiduieutheoma() {
        List.clear();
        List = lopDAO.laytoanbodanhsachloptheoma(timkiem);
        model = (DefaultTableModel) tblop.getModel();
        model.setRowCount(0);
        for (lop g : lopDAO.laytoanbodanhsachloptheoma(timkiem)) {
            Object[] rowData = new Object[2];
            rowData[0] = g.getMalop();
            rowData[1] = g.getTenlop();
            model.addRow(rowData);
        }
    }
    private void btnthemmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemmoiActionPerformed
        // TODO add your handling code here:
        Themlop sv = new Themlop();
        sv.setVisible(true);
    }//GEN-LAST:event_btnthemmoiActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        selectedIndex = tblop.getSelectedRow();
        if (List.size() == 0) {
            JOptionPane.showMessageDialog(this,
                    "Hãy nhập thêm lớp học rồi sửa!");
        } else if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this,
                    "Hãy chọn dòng có lớp học cần sửa rồi ấn Sửa!");
        } else { // chon dong can sua va nhan nut
            Sualop edit = new Sualop();
            edit.setEditData(List.get(selectedIndex));
            edit.setVisible(true);
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void tblopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblopMouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) tblop.getModel();
        txttimkiem.setText(model.getValueAt(tblop.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_tblopMouseClicked

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        if (txttimkiem.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn mã lớp để xóa");
        } else if (lopDAO.xoaloptheoma(txttimkiem.getText()) > 0) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            hienthiduieu();
            this.txttimkiem.setText(null);
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
        // TODO add your handling code here:
        if (txttimkiem.getText().equals("")) {
            hienthiduieu();
            JOptionPane.showMessageDialog(this, "Hãy nhập mã lớp trước nhé!");
        } else {
            timkiem = txttimkiem.getText();
            hienthiduieutheoma();
        }
    }//GEN-LAST:event_btntimkiemActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        hienthiduieu();
    }//GEN-LAST:event_btnresetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthemmoi;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblop;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}