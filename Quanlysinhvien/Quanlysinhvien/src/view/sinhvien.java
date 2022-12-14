/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.SinhVien;
import model.SinhVienDAO;
import model.lop;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.Number;

/**
 *
 * @author Admin
 */
public class sinhvien extends javax.swing.JPanel {

    SinhVienDAO sinhviendao = new SinhVienDAO();
    ButtonGroup rdg = new ButtonGroup();
    DefaultTableModel model;
    List<SinhVien> listsv = new ArrayList<>();
    String timkiem = "";
    private int selectedIndex;

    /**
     * Creates new form sinhvien
     */
    public sinhvien() {
        initComponents();
        laydulieu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnreset1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbsinhvien = new javax.swing.JTable();
        btntimkiem = new javax.swing.JButton();
        txttimkiem = new javax.swing.JTextField();
        btnthemmoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btndtxuatexcel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtmasv = new javax.swing.JTextField();

        btnreset1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnreset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnreset1.setText("L??m m???i");
        btnreset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset1ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(51, 204, 255));

        tbsinhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "M?? L???p", "T??n L???p", "MSSV", "H??? v?? T??n ", "Gi???i T??nh", "S??? ??i???n Tho???i", "Email", "?????a Ch???"
            }
        ));
        tbsinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbsinhvienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbsinhvienMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tbsinhvien);

        btntimkiem.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btntimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N
        btntimkiem.setText("T??m ki???m");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        txttimkiem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttimkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttimkiemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txttimkiemMouseEntered(evt);
            }
        });
        txttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimkiemActionPerformed(evt);
            }
        });

        btnthemmoi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnthemmoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add.png"))); // NOI18N
        btnthemmoi.setText("Th??m sinh vi??n m???i");
        btnthemmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemmoiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("M?? l???p h???c:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("DANH S??CH SINH VI??N");

        btnsua.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit.png"))); // NOI18N
        btnsua.setText("S???a");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnxoa.setText("X??a");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnreset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnreset.setText("L??m m???i danh s??ch");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btndtxuatexcel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btndtxuatexcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excel.png"))); // NOI18N
        btndtxuatexcel.setText("Xu???t danh s??ch sinh vi??n");
        btndtxuatexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndtxuatexcelActionPerformed(evt);
            }
        });

        txtmasv.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(578, 578, 578)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btntimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btndtxuatexcel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnthemmoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnthemmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndtxuatexcel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public void laydulieu() {
        listsv.clear();
        listsv = sinhviendao.laydanhsachsv();
        model = (DefaultTableModel) tbsinhvien.getModel();
        model.setRowCount(0);
        for (SinhVien sv : listsv) {
            Object rowData[] = new Object[8];
            rowData[0] = sv.getLop().getMalop();
            rowData[1] = sv.getLop().getTenlop();
            rowData[2] = sv.getMasv();
            rowData[3] = sv.getTensv();
            rowData[4] = sv.isGioitinh() ? "Nam" : "N???";
            rowData[5] = sv.getSdt();
            rowData[6] = sv.getEmail();
            rowData[7] = sv.getDiachi();
            model.addRow(rowData);
        }
    }

    public void laydulieutheomasv() {
        listsv.clear();
        listsv = sinhviendao.laydanhsachsvtheomalop(timkiem);
        model = (DefaultTableModel) tbsinhvien.getModel();
        model.setRowCount(0);
        for (SinhVien sv : listsv) {
            Object rowData[] = new Object[8];
            rowData[0] = sv.getLop().getMalop();
            rowData[1] = sv.getLop().getTenlop();
            rowData[2] = sv.getMasv();
            rowData[3] = sv.getTensv();
            rowData[4] = sv.isGioitinh() ? "Nam" : "N???";
            rowData[5] = sv.getSdt();
            rowData[6] = sv.getEmail();
            rowData[7] = sv.getDiachi();
            model.addRow(rowData);
        }
    }
    private void tbsinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbsinhvienMouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) tbsinhvien.getModel();
        txttimkiem.setText(model.getValueAt(tbsinhvien.getSelectedRow(), 0).toString());
        txtmasv.setText(model.getValueAt(tbsinhvien.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tbsinhvienMouseClicked

    private void tbsinhvienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbsinhvienMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbsinhvienMouseEntered

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
        // TODO add your handling code here:
        if (txttimkiem.getText().equals("")) {
            laydulieu();
            JOptionPane.showMessageDialog(this, "H??y nh???p m?? s??? sinh vi??n tr?????c nh??");

        } else {
            timkiem = txttimkiem.getText();
            laydulieutheomasv();
        }

    }//GEN-LAST:event_btntimkiemActionPerformed

    private void txttimkiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttimkiemMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimkiemMouseEntered

    private void txttimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttimkiemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimkiemMouseClicked

    private void btnthemmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemmoiActionPerformed
        // TODO add your handling code here:
        Themsv sv = new Themsv();
        sv.setVisible(true);
    }//GEN-LAST:event_btnthemmoiActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        selectedIndex = tbsinhvien.getSelectedRow();
        if (listsv.size() == 0) {
            JOptionPane.showMessageDialog(this,
                    "H??y nh???p th??m sinh vi??n r???i s???a!");
        } else if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this,
                    "H??y ch???n d??ng c?? sinh vi??n c???n s???a r???i ???n S???a!");
        } else { // chon dong can sua va nhan nut
            Suasv edit = new Suasv();
            edit.setEditData(listsv.get(selectedIndex));
            edit.setVisible(true);
        }

    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed

        if (txttimkiem.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "B???n ch??a ch???n masv ????? x??a");
        } else if (sinhviendao.xoasvtheomasv(txtmasv.getText()) > 0) {
            JOptionPane.showMessageDialog(this, "X??a th??nh c??ng");
            laydulieu();
            this.txttimkiem.setText(null);
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void txttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimkiemActionPerformed

    private void btnreset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnreset1ActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        laydulieu();
    }//GEN-LAST:event_btnresetActionPerformed

    private void btndtxuatexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndtxuatexcelActionPerformed
        int dong = tbsinhvien.getRowCount();
        if (dong <= 0) {
            return;
        }
        try {
            JFileChooser savefile = new JFileChooser();
            int result = savefile.showSaveDialog(btndtxuatexcel);
            if (result != JFileChooser.APPROVE_OPTION) {
                return;
            }
            File fileToSave = savefile.getCurrentDirectory();
            String link = fileToSave.getPath();
            String ten = savefile.getSelectedFile().getName();
            String linksave = link + "\\" + ten + ".xls";

            WritableWorkbook workbook = Workbook.createWorkbook(new File(linksave));
            WritableSheet sheet = workbook.createSheet("TH??NG TIN SINH VI??N ", 0);
            sheet.addCell(new Label(0, 0, "M?? L???p"));
            sheet.addCell(new Label(1, 0, "T??n L???p"));
            sheet.addCell(new Label(2, 0, "M?? S??? Sinh Vi??n"));
            sheet.addCell(new Label(3, 0, "H??? v?? T??n"));
            sheet.addCell(new Label(4, 0, "Gi???i T??nh"));
            sheet.addCell(new Label(5, 0, "S??T"));
            sheet.addCell(new Label(6, 0, "Email"));
            sheet.addCell(new Label(7, 0, "?????a ch???"));

            for (int i = 1; i <= dong; i++) {
                sheet.addCell(new Label(0, i, tbsinhvien.getValueAt(i - 1, 0).toString()));
                sheet.addCell(new Label(1, i, tbsinhvien.getValueAt(i - 1, 1).toString()));
                sheet.addCell(new Label(2, i, tbsinhvien.getValueAt(i - 1, 2).toString()));
                sheet.addCell(new Label(3, i, tbsinhvien.getValueAt(i - 1, 3).toString()));
                sheet.addCell(new Label(4, i, tbsinhvien.getValueAt(i - 1, 4).toString()));
                sheet.addCell(new Label(5, i, tbsinhvien.getValueAt(i - 1, 5).toString()));
                sheet.addCell(new Label(6, i, tbsinhvien.getValueAt(i - 1, 6).toString()));
                sheet.addCell(new Label(7, i, tbsinhvien.getValueAt(i - 1, 7).toString()));
            }
            workbook.write();
            workbook.close();
            JOptionPane.showMessageDialog(this, "Xu???t file th??nh c??ng!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "L???i: " + e);
        }
    }//GEN-LAST:event_btndtxuatexcelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndtxuatexcel;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnreset1;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthemmoi;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbsinhvien;
    private javax.swing.JTextField txtmasv;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
