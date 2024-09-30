/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gudang;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author redmibook
 */
public class tambahdatabarangm extends javax.swing.JFrame {
    private DefaultTableModel model=null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k=new koneksi();

    /**
     * Creates new form
     */
    public tambahdatabarangm() {
        initComponents();
        k.connect();
        refreshTable();
    }
    
    class tambahbarangm extends tambahdatabarangm{
        int id_barang_masuk,jumlah,id_barang;
        String tanggal_masuk;
        
        public tambahbarangm() {
            this.id_barang= Integer.parseInt(idbarangbm.getText());           
            try {
                Date date = tanggalmasuk.getDate();
                DateFormat dateformat = new SimpleDateFormat("YYYY-MM-dd");
                this.tanggal_masuk = dateformat.format(date);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            this.jumlah= Integer.parseInt(textJumlahbm.getText());
        }
    }
        
        public void refreshTable() {
            model = new DefaultTableModel();
            model.addColumn("ID Barang Masuk");
            model.addColumn("ID Barang");
            model.addColumn("Jumlah");
            model.addColumn("Tanggal Masuk");
            tabelbm.setModel(model);
            try {
                this.stat = k.getKoneksi().prepareStatement("select * from barang_masuk ");
                this.rs = this.stat.executeQuery();
                while (rs.next()){
                    Object[] data = {
                        rs.getString("id_barang_masuk"),
                        rs.getString("id_barang"),
                        rs.getString("jumlah"),
                        rs.getString("tanggal_masuk")
                    };
                    model.addRow(data);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelbm = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tombolSimpanbm = new javax.swing.JButton();
        tombolGantibm = new javax.swing.JButton();
        tombolHapusbm = new javax.swing.JButton();
        idbarangbm = new javax.swing.JTextField();
        textJumlahbm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tanggalmasuk = new com.toedter.calendar.JDateChooser();
        btn_datab = new javax.swing.JButton();
        btn_datareg = new javax.swing.JButton();
        idbarangm = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("id Barang");

        tabelbm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelbm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbmMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelbm);

        jLabel5.setText("Jumlah Barang");

        tombolSimpanbm.setText("Simpan");
        tombolSimpanbm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolSimpanbmActionPerformed(evt);
            }
        });

        tombolGantibm.setText("Ganti");
        tombolGantibm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolGantibmActionPerformed(evt);
            }
        });

        tombolHapusbm.setText("Hapus");
        tombolHapusbm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolHapusbmActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("INPUT DATA BARANG MASUK");

        jLabel7.setText("tanggal masuk");

        btn_datab.setText("Input data barang >");
        btn_datab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_databActionPerformed(evt);
            }
        });

        btn_datareg.setText("< registrasi");
        btn_datareg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dataregActionPerformed(evt);
            }
        });

        idbarangm.setEnabled(false);
        idbarangm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbarangmActionPerformed(evt);
            }
        });

        jLabel8.setText("Id Barang Masuk");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4)
                                .addGap(0, 37, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(textJumlahbm, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(idbarangbm, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tanggalmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tombolSimpanbm)
                                .addGap(119, 119, 119)
                                .addComponent(tombolGantibm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tombolHapusbm))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_datareg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_datab))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(idbarangm, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idbarangm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idbarangbm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textJumlahbm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(tanggalmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolSimpanbm)
                    .addComponent(tombolGantibm)
                    .addComponent(tombolHapusbm))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_datareg)
                    .addComponent(btn_datab))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolHapusbmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolHapusbmActionPerformed
        // TODO add your handling code here:
        try {
            this.stat=k.getKoneksi().prepareStatement("delete from barang_masuk where id_barang_masuk=?");       
            stat.setInt(1, Integer.parseInt(idbarangm.getText()));
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_tombolHapusbmActionPerformed

    private void btn_databActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_databActionPerformed
        // TODO add your handling code here:
        tambahdatabarang reg=new tambahdatabarang();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_databActionPerformed

    private void btn_dataregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dataregActionPerformed
        // TODO add your handling code here:
        registrasi reg=new registrasi();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_dataregActionPerformed

    private void idbarangmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbarangmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idbarangmActionPerformed

    private void tombolSimpanbmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSimpanbmActionPerformed
        // TODO add your handling code here:
        try {
            tambahbarangm b=new tambahbarangm();
            this.stat=k.getKoneksi().prepareStatement("insert into barang_masuk values (?,?,?,?)");
            stat.setInt(1, 0);
            stat.setInt(2, b.id_barang);
            stat.setInt(3, b.jumlah);
            stat.setString(4, b.tanggal_masuk);
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tombolSimpanbmActionPerformed

    private void tombolGantibmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolGantibmActionPerformed
        // TODO add your handling code here:
        try {
            tambahbarangm b=new tambahbarangm();
            b.id_barang_masuk=Integer.parseInt(idbarangm.getText());
            this.stat=k.getKoneksi().prepareStatement("update barang_masuk set id_barang=?,"
                    + "jumlah=?,tanggal_masuk=? where id_barang_masuk=?");            
            stat.setInt(1, b.id_barang);
            stat.setInt(2, b.jumlah);
            stat.setString(3,b.tanggal_masuk);
            stat.setInt(4, b.id_barang_masuk);
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_tombolGantibmActionPerformed

    private void tabelbmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbmMouseClicked
        // TODO add your handling code here:
        idbarangm.setText(model.getValueAt(tabelbm.getSelectedRow(), 0).toString());
        idbarangbm.setText(model.getValueAt(tabelbm.getSelectedRow(), 1).toString());
        textJumlahbm.setText(model.getValueAt(tabelbm.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tabelbmMouseClicked

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
            java.util.logging.Logger.getLogger(tambahdatabarangm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambahdatabarangm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambahdatabarangm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambahdatabarangm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambahdatabarangm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_datab;
    private javax.swing.JButton btn_datareg;
    private javax.swing.JTextField idbarangbm;
    private javax.swing.JTextField idbarangm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelbm;
    private com.toedter.calendar.JDateChooser tanggalmasuk;
    private javax.swing.JTextField textJumlahbm;
    private javax.swing.JButton tombolGantibm;
    private javax.swing.JButton tombolHapusbm;
    private javax.swing.JButton tombolSimpanbm;
    // End of variables declaration//GEN-END:variables
}