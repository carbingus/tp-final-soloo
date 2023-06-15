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
import Entidades.Proveedor;

/**
 *
 * @author extha
 */
public class ProveedorData {
    
    private Connection con = null;

    public ProveedorData() {
        con = Conexion.getConexion();
    }
    public void guardarProveedor(Proveedor proveedor){
        // TODO:
        String sql = "INSERT INTO proveedor (razonSocial, domicilio, telefono, estado) VALUES ( ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,proveedor.getRazonSocial());
            ps.setString(2,proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setBoolean(4, proveedor.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                proveedor.setId_proveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proveedor agregado con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido agregar el proveedor.");
            }
            ps.close();
            
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a tabla Proveedor. Codigo: " + ex.getLocalizedMessage());
        }
        
        
    }
    public Proveedor modificarProveedor(Proveedor proveedor){
        // TODO:
        String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono = ?, estado = ? WHERE idProveedor = ?";
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setBoolean(4, proveedor.isEstado());
            int logro = ps.executeUpdate();
            
            if (logro == 1){
                JOptionPane.showMessageDialog(null, "Datos cambiados correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Los cambios indicados no pueden realizarse\nO el proveedor indicado no existe.");
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Proveedor. Codigo: "+ ex.getLocalizedMessage());
        }
        return proveedor;
    }
    
    public List<Proveedor> listarProveedor(int id){
        List<Proveedor> proveedores = new ArrayList<>();

        try{
            String sql = "SELECT * FROM proveedor";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Proveedor proveedor = new Proveedor();
                
                proveedor.setId_proveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedores.add(proveedor);
            }
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Proveedor. Codigo: " + ex.getLocalizedMessage());
        }
        
        return proveedores;
    }
    
    public Proveedor buscarProveedor(int id){
        Proveedor proveedor = new Proveedor();
        String sql = "SELECT razonSocial, domicilio, telefono, estado FROM proveedor WHERE idProveedor = ?;";
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                proveedor.setId_proveedor(id);
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setEstado(rs.getBoolean("estado"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el proveedor indicado.");
            }
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Proveedor. Codigo: " +ex.getLocalizedMessage());
        }
        return proveedor;
    }
    
    public Proveedor buscarProveedorPorTelefono(String telefono){
        Proveedor proveedor = new Proveedor();
        String sql = "SELECT * FROM proveedor where telefono = ?;";
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, telefono);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
//                proveedor.setId_proveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "El telefono indicado no pertenece a un Proveedor en\nla base de datos.");
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Proveedor. Codigo: " +ex.getLocalizedMessage());
        }
        return proveedor;
    }
    
}
