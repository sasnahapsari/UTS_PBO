
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class KoneksiDB {
    
    static int execute(String SQL) {
        int status = 0;
        Connection koneksi = setKoneksi();
        try {
        Statement st = (Statement) koneksi.createStatement();
        status = st.executeUpdate(SQL);
        } catch (SQLException ex) {
        Logger.getLogger(KoneksiDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    private static Connection setKoneksi() {
        String konString = "jdbc:mysql://localhost:3306/tb_penitipan";
    Connection koneksi = null;
    try {
    Class.forName("com.mysql.jdbc.Driver");
    koneksi = (Connection) DriverManager.getConnection(konString,"root","");
    System.out.println("Koneksi Berhasil");
    } catch (ClassNotFoundException ex) {
    Logger.getLogger(KoneksiDB.class.getName()).log(Level.SEVERE, null, ex);
    System.out.println("Koneksi Gagal");
    } catch (SQLException ex) {
    Logger.getLogger(KoneksiDB.class.getName()).log(Level.SEVERE, null, ex);
    System.out.println("Koneksi Gagal");
    }
    return koneksi;
    }
    public static ResultSet executeQuery(String SQL) {
    ResultSet rs = null;
    Connection koneksi = setKoneksi();
    try {
    Statement st = (Statement) koneksi.createStatement();
    rs = st.executeQuery(SQL);
    } catch (SQLException ex) {
    Logger.getLogger(KoneksiDB.class.getName()).log(Level.SEVERE, null, ex);
    }
    return rs;
    }
    static Object GetConnection() {
    throw new UnsupportedOperationException("Not supported yet.");
    }
}
