/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {

    Connection conect = null;

    protected Connection Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "123456");

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexión fallida" + e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e.getCause());
            System.out.println(e.getClass());
            System.out.println(e.getLocalizedMessage());
        }
        return conect;

    }

}
