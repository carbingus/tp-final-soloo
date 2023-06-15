package Entidades;

public class Cliente {
    private int id_cliente;
    private String apellido;
    private String nombre;
    private String domicilio;
    private int dni;
    private String telefono;
    private boolean estado;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String domicilio, int dni, String telefono, boolean estado) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Cliente(int id_cliente, String nombre, String apellido, String domicilio, int dni, String telefono, boolean estado) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telefono = telefono;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", apellido=" + apellido + ", nombre=" + nombre + ", domicilio=" + domicilio + ", dni=" + dni + ", telefono=" + telefono + ", estado=" + estado + '}';
    }


    
}
