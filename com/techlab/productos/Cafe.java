package com.techlab.productos;

public class Cafe extends Producto {
    private String nivelTueste;

    public Cafe(String nombre, double precioBase, int stock, String nivelTueste) {
        super(nombre, precioBase, stock);
        this.nivelTueste = nivelTueste;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("☕ Café: " + nombre + " | Precio: $" + precioBase + " | Stock: " + stock + " | Tueste: " + nivelTueste);
    }
}