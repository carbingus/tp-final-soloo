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

public class ClienteData {
    
    private Connection con = null;

    public ClienteData() {
        con = Conexion.getConexion();
    }
    
    public void guardarCliente(Cliente cliente){
        String sql = "INSERT INTO cliente (nombre, apellido, domicilio, documento, telefono, estado)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getNombre()); // asignamos nombre
            ps.setString(2, cliente.getApellido()); //asignamos apellido
            ps.setString(3, cliente.getDomicilio()); // asignamos domicilio
            ps.setInt(4, cliente.getDni());
            ps.setString(5, cliente.getTelefono()); //asignamos telefono
            ps.setBoolean(6, cliente.isEstado());
            ps.executeUpdate(); // le decimos al PreparedStatement que introduzca los datos a la BD
            ResultSet rs = ps.getGeneratedKeys(); // pedimos las keys generadas para poder utilizarlas
            if (rs.next()) { // verificamos se pueda agregar un cliente en el siguiente lugar disponible
                cliente.setId_cliente(rs.getInt(1)); //id incremental generado automaticamente por DB
                JOptionPane.showMessageDialog(null, "Cliente añadido con exito.");
            } else { // el cliente no se pudo añadir
                JOptionPane.showMessageDialog(null, "El cliente no fue añadido.");
            }

            ps.close();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Clientes "+ex.getLocalizedMessage());
            //aca nos indica si hubo un error
        }
        }
    
    public Cliente buscarCliente (int id){
        Cliente cliente = new Cliente();
        String sql = "SELECT nombre, apellido, domicilio, telefono, documento, estado FROM cliente WHERE idCliente = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                cliente.setId_cliente(id);
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setDni(rs.getInt("documento"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setEstado(rs.getBoolean("estado"));
                
            } else{
                JOptionPane.showMessageDialog(null, "No existe el cliente.");
            }
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Clientes. Codigo: " + ex.getLocalizedMessage());
        }
        return cliente;
    }
    
    public Cliente modificarCliente(Cliente cliente){
        String sql = "UPDATE cliente SET nombre = ?, apellido = ?, domicilio = ?, documento = ?, telefono = ?, estado = ? WHERE  idCliente = ?";
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3,cliente.getDomicilio());
            ps.setInt(4, cliente.getDni());
            ps.setString(5, cliente.getTelefono());
            ps.setBoolean(6,cliente.isEstado());
            ps.setInt(7,cliente.getId_cliente());
            int logro = ps.executeUpdate();
            
            if (logro == 1){
                JOptionPane.showMessageDialog(null, "Cambios efectuados exitosamente.");
           } else{
                JOptionPane.showMessageDialog(null, "El cliente indicado no existe");
            } 
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Clientes. Codigo: " + ex.getLocalizedMessage());
        }
        return cliente;
            
        }
    
    public List<Cliente> listarClientes(){
        List<Cliente> clientes = new ArrayList<>();
        try{
            String sql = "SELECT * FROM cliente";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Cliente cliente = new Cliente();
                
                cliente.setId_cliente(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setDni(rs.getInt("documento"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setEstado(rs.getBoolean("estado"));
                clientes.add(cliente);
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a tabla Cliente. Codigo: " + ex.getLocalizedMessage());
            
        }
        return clientes;
    }
        
        public Cliente buscarClientePorDni(int dni){
            Cliente cliente = null;
            String sql = "SELECT idCliente, nombre, apellido, domicilio, documento, telefono, estado"
                    + " FROM cliente WHERE documento = ?";
            PreparedStatement ps = null;
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1,dni);
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()){
                    cliente = new Cliente();
                    cliente.setId_cliente(rs.getInt("idCliente"));
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setApellido(rs.getString("apellido"));
                    cliente.setDomicilio(rs.getString("domicilio"));
                    cliente.setTelefono(rs.getString("telefono"));
                    cliente.setEstado(rs.getBoolean("estado"));
                    
                } else {
                    JOptionPane.showMessageDialog(null, "El DNI indicado no pertenece a un cliente dentro de"
                            + "\nla base de datos, verifique que ha ingresado un documento correcto");
                }
                ps.close();
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null,"Error al acceder a tabla Clientes. Codigo: " +ex.getLocalizedMessage());
            }
            return cliente;
        }
        
        public void eliminarCliente(int id){
            try{
                String sql = "UPDATE cliente SET estado = 0 WHERE idCliente = ?;";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                int fila = ps.executeUpdate();
                ps.close();
                if (fila == 1){
                    JOptionPane.showMessageDialog(null, "EL cliente fue desactivado correctamente.");
                }
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a tabla Cliente. Codigo: " + ex.getLocalizedMessage());
            }
        }
            
        public void restaurarCliente(int id){
            try{
                String sql = "UPDATE cliente SET estado = 1 WHERE idCliente =?;";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                int fila = ps.executeUpdate();
                ps.close();
                if (fila == 1)
                    JOptionPane.showMessageDialog(null, "El cliente fue reactivado exitosamente");

            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a tabla Cliente. Codigo: " + ex.getLocalizedMessage());
            }
        }
    }


