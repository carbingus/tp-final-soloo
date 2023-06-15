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


public class DetalleCompraData {
    
    private Connection con = null;
    private ProductoData prodData = new ProductoData();


    public DetalleCompraData() {
        con = Conexion.getConexion();
    }
    
    public void realizarPedido(DetalleCompra comp, int id_compra, int id_producto){
        String sql = "INSERT INTO detallecompra (cantidad, precioCosto, idCompra, idProducto) VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, comp.getCantidad());
            ps.setDouble(2, comp.getPrecioCosto());
            ps.setInt(3, id_compra);
            ps.setInt(4, id_producto);
            
            ps.executeUpdate();
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                comp.setId_detalle(rs.getInt(1));
                prodData.aumentarStock(id_producto, comp, id_compra);
                JOptionPane.showMessageDialog(null, "El pedido se ha guardado exitosamente.");
                
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla DetalleCompra. Codigo: " + ex.getLocalizedMessage());
        }
    }
}
