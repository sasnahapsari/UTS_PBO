
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class frmMain extends javax.swing.JFrame {
    
    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtPetugas = new javax.swing.JTextField();
        txtResi = new javax.swing.JTextField();
        txtNOPOL = new javax.swing.JTextField();
        txtKendaraan = new javax.swing.JTextField();
        TanggalKeluar = new com.toedter.calendar.JDateChooser();
        TanggalMasuk = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        count = new javax.swing.JButton();
        total = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Delete = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Penitipan Kendaraan Maju Mundur");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 60);

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menjaga kendaraan dengan sepenuh jiwa");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 50, 420, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 120);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data Pengunjung");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 220, 30);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 30, 400, 10);
        jPanel2.add(txtPetugas);
        txtPetugas.setBounds(160, 40, 180, 40);
        jPanel2.add(txtResi);
        txtResi.setBounds(160, 100, 180, 40);
        jPanel2.add(txtNOPOL);
        txtNOPOL.setBounds(160, 160, 180, 40);
        jPanel2.add(txtKendaraan);
        txtKendaraan.setBounds(160, 220, 180, 40);
        jPanel2.add(TanggalKeluar);
        TanggalKeluar.setBounds(160, 340, 180, 40);
        jPanel2.add(TanggalMasuk);
        TanggalMasuk.setBounds(160, 280, 180, 40);

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nama Petugas");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 40, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("No. Resi");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 100, 120, 30);

        jLabel7.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NoPol");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 160, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jenis Kendaraan");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 220, 150, 30);

        jLabel9.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tanggal Masuk");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 280, 120, 30);

        jLabel10.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tanggal Keluar");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 340, 120, 30);

        count.setText("Hitung");
        count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countActionPerformed(evt);
            }
        });
        jPanel2.add(count);
        count.setBounds(270, 400, 73, 23);

        total.setEditable(false);
        jPanel2.add(total);
        total.setBounds(70, 390, 170, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 130, 350, 440);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(null);

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel3.add(Delete);
        Delete.setBounds(360, 20, 73, 23);

        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        jPanel3.add(Print);
        Print.setBounds(530, 20, 73, 23);

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel3.add(Clear);
        Clear.setBounds(190, 20, 73, 23);

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel3.add(Save);
        Save.setBounds(30, 20, 73, 23);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(360, 130, 640, 60);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(null);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NamaPetugas", "No.Resi", "NoPol", "JenisKendaraan", "TanggalMasuk", "TanggalKeluar", "Harga"
            }
        ));
        jScrollPane1.setViewportView(tblData);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 620, 300);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(360, 200, 640, 380);

        setBounds(0, 0, 1019, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String Masuk = dateformat.format(TanggalMasuk.getDate());
        String Keluar = dateformat.format(TanggalKeluar.getDate());
        SimpleDateFormat tglFormat=new SimpleDateFormat("dd");
        Integer tglMasuk=Integer.parseInt(tglFormat.format(TanggalMasuk.getDate()));
        Integer tglKeluar=Integer.parseInt(tglFormat.format(TanggalKeluar.getDate()));
        
        
        if (txtPetugas.getText().equals("") || txtResi.getText().equals("") || txtNOPOL.getText().equals("") ||
                txtKendaraan.getText().equals("") || Masuk.equals("") || Keluar.equals("")||total.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Ddata", "Error",
            JOptionPane.WARNING_MESSAGE);
        } else {
            Integer lama=tglKeluar-tglMasuk;
            int hasil;
            hasil = lama * 3000;
            total.setText(String.valueOf(lama));
            
            String SQL = "INSERT INTO pelanggan(NamaPetugas,No_Resi,NoPol,JenisKendaraan,TglMasuk,TglKeluar,Harga)"
           + "VALUES ('"+txtPetugas.getText()
            +"','"+txtResi.getText() 
            +"','"+txtNOPOL.getText() 
            +"','"+txtKendaraan.getText() 
            +"','"+tglMasuk 
            +"','"+tglKeluar
            +"','"+total.getText()+"')";
            int status = KoneksiDB.execute(SQL); 
            if(status == 1){
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "SUKSES",
                        JOptionPane.INFORMATION_MESSAGE);
                try {
                    selectData();
                } catch (SQLException ex) {
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Ditambahkan", "GAGAL",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_SaveActionPerformed
    private void selectData() throws SQLException {
        String kolom[] = {"NamaPetugas","No.Resi","NoPol","JenisKendaraan","TanggalMasuk","TanggalKeluar","Harga"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM pelanggan";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try{
            while(rs.next()){
                String NamaPetugas = rs.getString(1);
                String NoResi = rs.getString(2);
                String NoPol = rs.getString(3);
                String JenisKendaraan = rs.getString(4);
                String TanggalMasuk = rs.getString(5);
                String TanggalKeluar = rs.getString(6);
                String Harga = rs.getString(7);
                String data[] = {NamaPetugas,NoResi,NoPol,JenisKendaraan,TanggalMasuk,TanggalKeluar,Harga};
                dtm.addRow(data);
            }
        } catch(SQLException ex){
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblData.setModel(dtm);
    }
    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        txtPetugas.setText("");
        txtResi.setText("");
        txtNOPOL.setText("");
        txtKendaraan.setText("");
        TanggalKeluar.setDate(null);
        TanggalMasuk.setDate(null);
        total.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            String Nopol = tblData.getValueAt(baris, 2).toString();
            String SQL = "DELETE FROM pelanggan WHERE NoPol='"+Nopol+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data Berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Biodata Siswa SMK Telkom Malang");
        MessageFormat footer = new MessageFormat("Page {0,number,integer} ");
        try {
            tblData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat tglFormat=new SimpleDateFormat("dd");
        Integer tglMasuk=Integer.parseInt(tglFormat.format(TanggalMasuk.getDate()));
        Integer tglKeluar=Integer.parseInt(tglFormat.format(TanggalKeluar.getDate()));
        Integer lama=tglKeluar-tglMasuk;
        int hasil,a;
        hasil = lama * 3000;
        total.setText(String.valueOf(lama));       
        a = lama * 3000;
        total.setText(""+lama+" * " + 3000+" = "+hasil);
    }//GEN-LAST:event_countActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Print;
    private javax.swing.JButton Save;
    private com.toedter.calendar.JDateChooser TanggalKeluar;
    private com.toedter.calendar.JDateChooser TanggalMasuk;
    private javax.swing.JButton count;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField total;
    private javax.swing.JTextField txtKendaraan;
    private javax.swing.JTextField txtNOPOL;
    private javax.swing.JTextField txtPetugas;
    private javax.swing.JTextField txtResi;
    // End of variables declaration//GEN-END:variables

    
}
