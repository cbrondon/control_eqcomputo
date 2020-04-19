/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import com.mysql.jdbc.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JOptionPane;

public class CallStoredProcedures {

    String equipo, program, design, construction;
    int sem, aux = 0;

    public int getAux() {
        return aux;
    }

    public static void main(String[] args) throws SQLException {
        CallStoredProcedures llamar = new CallStoredProcedures();
    }

    protected void añadirEquipo(String numinvent, String estado, String numserie, String ram, String rom, String procesador, String marca, String dpto) throws SQLException {
        conexion conex = new conexion();
        try (Connection conect = conex.Conexion()) {

            CallableStatement sp = conect.prepareCall("{CALL añadir_equipo(?,?,?,?,?,?,?,?,?)}");

            sp.setString("inventNumero", numinvent);
            sp.setString("estado", estado);
            sp.setString("numeroSerie", numserie);
            sp.setString("memRam", ram);
            sp.setString("memRom", rom);
            sp.setString("procesador", procesador);
            sp.setString("marca", marca);
            sp.setString("depto", dpto);
            sp.registerOutParameter("mensaje", Types.VARCHAR);
            sp.execute();
            String resul = sp.getString("mensaje");
            conect.close();
            JOptionPane.showMessageDialog(null, resul);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta es : " + e.getMessage());
        }
        
    }

    protected String ingresar(String correo, String contraseña) throws SQLException {
        conexion conex = new conexion();
        String resul = null;
        try (Connection conect = conex.Conexion()) {

            CallableStatement sp = conect.prepareCall("{CALL ingresar(?,?,?)}");

            sp.setString("email", correo);
            sp.setString("password", contraseña);
            sp.registerOutParameter("mensaje", Types.VARCHAR);
            sp.execute();
            resul = sp.getString("mensaje");
            conect.close();
            //JOptionPane.showMessageDialog(null, resul);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta es : " + e.getMessage());
        }
        return resul;
    }
    
    protected void mostrarequipos(String equipo,String fecha,String depto) throws SQLException{
        conexion conex = new conexion();
        ResultSet rs = null;
        try (Connection conect = conex.Conexion()) {
         
            CallableStatement sp = conect.prepareCall("{CALL mostrarequipos(?,?,?,?)}");

            sp.setString("eq", equipo);
            sp.setString("fech", fecha);
            sp.setString("depto", depto);
            sp.registerOutParameter("mensaje", Types.VARCHAR);
            sp.execute();
            String resul = sp.getString("mensaje");
            conect.close();
            //JOptionPane.showMessageDialog(null, resul);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta es : " + e.getMessage());
        }
        
    }
    
}
