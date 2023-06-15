package Entidades;

public class Proveedor {
    private int id_proveedor;
    private String razonSocial;
    private String domicilio;
    private String telefono;
    private boolean estado;

    public Proveedor() {
    }

    public Proveedor(String razonSocial, String domicilio, String telefono, boolean estado) {
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Proveedor(int id_proveedor, String razonSocial, String domicilio, String telefono, boolean estado) {
        this.id_proveedor = id_proveedor;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }


    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
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
        return "Proveedor{" + "id_Proveedor=" + id_proveedor + ", razonSocial=" + razonSocial + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
}
