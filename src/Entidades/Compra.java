package Entidades;

import java.time.LocalDate;

public class Compra {
    private int id_compra;
    private Proveedor proveedor;
    private LocalDate fecha;
    private boolean estado;

    public Compra() {
    }

    public Compra(Proveedor proveedor, LocalDate fecha, boolean estado) {
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Compra(int id_compra, Proveedor proveedor, LocalDate fecha, boolean estado) {
        this.id_compra = id_compra;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Compra{" + "id_compra=" + id_compra + ", proveedor=" + proveedor + ", fecha=" + fecha + '}';
    }
    
}
