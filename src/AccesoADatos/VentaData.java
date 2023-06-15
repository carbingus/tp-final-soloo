/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author extha
 */
public class VentaData {
    private Connection con = null;   
    private ProductoData prodData;

    public VentaData() {
        con = Conexion.getConexion();
    }
    
    public void registrarVenta(Venta venta, int id_cliente){
        String sql = "INSERT INTO venta (fecha, idCliente) VALUES (?, ?);";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(venta.getFecha()));
            ps.setInt(2, id_cliente);
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            while (rs.next()){
                venta.setId_venta(rs.getInt("idVenta"));
                JOptionPane.showMessageDialog(null, "Venta guardada.");
                
            }
            ps.close();
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Ventas. Codigo: "+ ex.getLocalizedMessage());
        }
        
    }
    
         public List<Venta> obtenerVentas(){
         List <Venta> ventas = new ArrayList<>();
         
         try {
            String sql = "SELECT * FROM venta;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Venta vend;

            while (rs.next()){
                vend = new Venta();
                vend.setId_venta(rs.getInt("idVenta"));
                vend.setFecha(rs.getDate("fecha").toLocalDate());
                
                Cliente c = new Cliente();
                c.setId_cliente(rs.getInt("idCliente"));
                vend.setCliente(c);
                
                ventas.add(vend);
            }
            ps.close();
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a tabla Venta. Codigo: "+ex.getLocalizedMessage());

            }
         return ventas;
     }
    
    
}
