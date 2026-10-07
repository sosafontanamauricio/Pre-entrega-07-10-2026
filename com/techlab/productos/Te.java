package com.techlab.productos;

public class Te extends Producto {
    private String tipoHoja;

    public Te(String nombre, double precioBase, int stock, String tipoHoja) {
        super(nombre, precioBase, stock);
        this.tipoHoja = tipoHoja;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("🍵 Té: " + nombre + " | Precio: $" + precioBase + " | Stock: " + stock + " | Hoja: " + tipoHoja);
    }
}