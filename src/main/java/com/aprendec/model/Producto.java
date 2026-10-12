package com.aprendec.model;

import java.sql.Date;
import java.util.zip.DataFormatException;

public class Producto {
    private int id;
    private String nombre;
    private double cantidad;
    private double precio;
    private Date fechaCrear;
    private Date fechaActualizar;

    public Producto(String nombre, double precio, Date fechaCrear, Date fechaActualizar, double cantidad, int id) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaCrear = fechaCrear;
        this.fechaActualizar = fechaActualizar;
        this.cantidad = cantidad;
        this.id = id;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaCrear() {
        return fechaCrear;
    }

    public void setFechaCrear(Date fechaCrear) {
        this.fechaCrear = fechaCrear;
    }

    public Date getFechaActualizar() {
        return fechaActualizar;
    }

    public void setFechaActualizar(Date fechaActualizar) {
        this.fechaActualizar = fechaActualizar;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", fechaCrear=" + fechaCrear +
                ", fechaActualizar=" + fechaActualizar +
                '}';
    }
}
