/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Entidades.*;


/**
 *
 * @author extha
 */
public class ProductoData {
    
    private Connection con = null;

    public ProductoData() {
        con = Conexion.getConexion();
    }
    
    public void registrarProducto(Producto producto){
        String sql = "INSERT INTO producto (nombre, categoria, precio, stock, estado) VALUES (?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setString(2,producto.getCategoria());
            ps.setDouble(3,producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5,producto.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
             if (rs.next()){
                producto.setId_producto(rs.getInt(1));
                System.out.println("producto agregado con exito");
                JOptionPane.showMessageDialog(null, "Producto agregado con exito.");
            } else {
                 JOptionPane.showMessageDialog(null, "El producto no fue agregado.");
            }
             
            ps. close();
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto. Codigo: "+ex.getLocalizedMessage());
            
        }
    }
    
    public Producto buscarProducto (int id){
        Producto producto = new Producto();
        String sql = "SELECT nombre, categoria, precio, stock, estado FROM producto WHERE idProducto = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                producto.setId_producto(id);
                producto.setNombre(rs.getString("nombre"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock)"));
                producto.setEstado(rs.getBoolean("estado"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el producto.");
            }
            ps.close();
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos. Codigo: "+ ex.getLocalizedMessage());
        }
        
        return producto;
    }
    
    public Producto buscarProductosPorCategoria(String cate){
        String sql = "SELECT * FROM producto WHERE categoria = ?;";
        Producto pr = null;
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                pr.setNombre(rs.getString("nombre"));
                pr.setPrecio(rs.getDouble("precio"));
                pr.setStock(rs.getInt("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "No hay productos en esta categoria.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos. Codigo: " +ex.getLocalizedMessage());
        }
        
        return pr;
    }
    
    public Producto modificarProducto (Producto producto){
        String sql = "UPDATE producto SET nombre = ?, categoria = ?, precio = ?, stock = ?, estado = ? WHERE idProducto = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getCategoria());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5,producto.isEstado());
            int logro = ps.executeUpdate();
            if (logro == 1){
                JOptionPane.showMessageDialog(null, "Producto modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido modificar el producto\nO el producto indicado no existe.");
            }    
            
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a tabla Productos. Codigo: " +ex.getLocalizedMessage());
                    }
        return producto;
        }
    
    public void aumentarStock(int idProducto, DetalleCompra compra, int stock) {
        String sql = "UPDATE producto SET stock= ?  WHERE producto.idProducto = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, stock + compra.getCantidad());
            ps.setInt(2, idProducto);

            int logro = ps.executeUpdate();

            if (logro == 1) {
                JOptionPane.showMessageDialog(null, "Stock actualizado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Producto. Codigo: "+ ex.getLocalizedMessage());
        }
    }
    
    public void restarStock(int idProducto, DetalleVenta venta, int stock){
        String sql = "UPDATE producto SET stock = ? WHERE producto.idProducto = ?;";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, stock - venta.getCantidad());
            ps.setInt(2,idProducto);
            
            int logro = ps.executeUpdate();
            
            if (logro == 1){
                JOptionPane.showMessageDialog(null, "Stock actualizado correctamente.");
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar.");
            }
            
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder tabla Producto. Codigo: " +ex.getLocalizedMessage());
        }
    }
    
}
