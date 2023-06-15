/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Entidades.*;
import AccesoADatos.*;
/**
 *
 * @author extha
 */
public class CompraData {
    
    private Connection con = null;

    public CompraData() {
        con = Conexion.getConexion();
    }
    
    public void registrarCompra(Compra compra, int idProveedor) {

        String sql = " INSERT INTO compra (idProveedor, fecha) VALUES (?,?) ";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idProveedor);
            ps.setDate(2, Date.valueOf(compra.getFecha()));

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            while (rs.next()) {
                compra.setId_compra(rs.getInt("idCompra"));
                JOptionPane.showMessageDialog(null, "Compra guardada");
            }

            
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Compra. Codigo: "+ ex.getMessage());

        }

    }
   
}
