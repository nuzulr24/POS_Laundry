/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author KangKoder
 */
public class Mainconfig {
    
    public Connection con;
    public Statement st;
    public ResultSet rs;
    
    public void koneksi() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/db_laundry", "root", "");
            st= con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }

    
    
}
