package com.techlab.productos;

import com.techlab.excepciones.StockInsuficienteException;

public abstract class Producto {
    protected String nombre;
    protected double precioBase;
    protected int stock;

    public Producto(String nombre, double precioBase, int stock) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public void reducirStock(int cantidad) {
        if (cantidad > stock) {
            throw new StockInsuficienteException("⚠️ Error de Stock: No hay suficientes unidades de " + nombre + ". Stock actual: " + stock + ", solicitado: " + cantidad);
        }
        stock -= cantidad;
    }

    public abstract void mostrarInformacion();
}