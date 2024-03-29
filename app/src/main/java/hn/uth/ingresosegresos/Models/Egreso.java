package hn.uth.ingresosegresos.Models;

public class Egreso {
    private long id;
    private double monto;
    private String descripcion;
    private String fecha;

    private String tipo;

    public Egreso(long id, double monto, String descripcion, String fecha, String tipo) {
        this.id = id;
        this.monto = monto;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public long getId() {
        return id;
    }

    public double getMonto() {
        return monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }
}
