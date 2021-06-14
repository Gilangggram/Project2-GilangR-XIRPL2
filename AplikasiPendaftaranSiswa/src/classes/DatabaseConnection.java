/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilang
 */
public class DatabaseConnection {
    public static Connection getConnection(String host, String port, String username, String password, String db) {
        String konString = "jdbc:mysql://" + host + ":" + port + "/" + db;
        Connection koneksi = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(konString, username, password);
            System.out.println("Koneksi Berhasil");
        } catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Koneski Database Error");
            koneksi = null;
        }
        
        return koneksi;
    }

    public static com.sun.jdi.connect.spi.Connection getKoneksi(String localhost, String string, String root, String gilang_r24, String db_sekolah) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}