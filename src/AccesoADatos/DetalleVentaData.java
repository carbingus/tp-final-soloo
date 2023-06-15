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



public class DetalleVentaData {
    
    private Connection con = null;
    private ProductoData prodData = new ProductoData();
//    private ClienteData cliData = new ClienteData();

    public DetalleVentaData() {
        con = Conexion.getConexion();
    }
    
     public void realizarVenta(DetalleVenta vent, int id_venta, int id_producto){
        String sql = "INSERT INTO detalleventa (cantidad, precioVenta, idVenta, idProducto) VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, vent.getCantidad());
            ps.setDouble(2, vent.getPrecioVenta());
            ps.setInt(3, id_venta);
            ps.setInt(4, id_producto);
            
            ps.executeUpdate();
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                vent.setId_detalleVenta(rs.getInt(1));
                prodData.restarStock(id_producto, vent, id_venta);
                JOptionPane.showMessageDialog(null, "Los detalles de venta se han guardado exitosamente.");
                
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla DetalleVenta. Codigo: " + ex.getLocalizedMessage());
        }
    }
     
     public void registrarVenta(Venta venta, int idCliente){
         String sql = "INSERT INTO venta(fecha, idCliente) VALUES (?, ?);";
         try{
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             ps.setDate(1, Date.valueOf(venta.getFecha()));
             ps.setInt(2, idCliente);
             
             ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();
             
             while (rs.next()){
                 venta.setId_venta(rs.getInt("isVenta"));
                 JOptionPane.showMessageDialog(null, "Venta registrada.");
             }
             ps.close();
         
             
         }catch (SQLException ex){
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta. Codigo: " +ex.getLocalizedMessage());
             
         }
            
     }
}