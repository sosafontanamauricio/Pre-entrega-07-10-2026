import java.util.Arrays;

public class clase4 {
    public static void main(String[] args) {
        
        System.out.println("=== 1. Creación de Funciones ===");
        double precioBase = 1000.0;
        double precioConImp1 = calcularImpuesto(precioBase, 21.0); // 21% de IVA
        double precioConImp2 = calcularImpuesto(500.0, 10.5);   // 10.5% de impuesto
        
        System.out.println("Precio base: $" + precioBase + " con impuesto: $" + precioConImp1);
        System.out.println("Precio base: $500.0 con impuesto: $" + precioConImp2);


        System.out.println("\n=== 2. Parámetros y Argumentos ===");
        calcularPrecioFinal(200.0, 10.0, 30); 
        calcularPrecioFinal(200.0, 10.0, 60); 

        int[] stockProductos = {15, 40, 100};
        System.out.println("Stock antes de reponer: " + Arrays.toString(stockProductos));
        
        reponerStock(stockProductos, 1, 25);
        System.out.println("Stock después de reponer: " + Arrays.toString(stockProductos));


        System.out.println("\n=== 3. Sobrecarga de Métodos ===");
        mostrarMensaje("¡Bienvenido a TalentoLab! Disfruta tu 15% de descuento.");
        mostrarMensaje("Gracias por tu compra frecuente, aplicamos envío gratis.", 4050);


        System.out.println("\n=== 4. Modularización ===");
        ejecutarProcesoCatalogo();
    }

    public static double calcularImpuesto(double precio, double porcentaje) {
        return precio + (precio * porcentaje / 100);
    }

    public static void calcularPrecioFinal(double precio, double descuento, int cantidad) {
        if (cantidad > 50) {
            System.out.println("¡Cantidad mayor a 50! Descuento incrementado al " + descuento + "%");
        }
        double total = (precio - (precio * descuento / 100)) * cantidad;
        System.out.println("Cantidad: " + cantidad + " | Total a pagar: $" + total);
    }

    public static void reponerStock(int[] stock, int indice, int cantidadExtra) {
        if (indice >= 0 && indice < stock.length) {
            stock[indice] += cantidadExtra;
            System.out.println("-> Se repusieron " + cantidadExtra + " unidades en el producto de la posición " + indice);
        }
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println("[CLIENTE NUEVO] " + mensaje);
    }

    public static void mostrarMensaje(String mensaje, int codigoCliente) {
        System.out.println("[CLIENTE RECURRENTE - ID: " + codigoCliente + "] " + mensaje);
    }

    public static void ejecutarProcesoCatalogo() {
        
        System.out.println("Ejecutando validación y formateo modular del catálogo...");
        String[] catalogo = {"Café", "Mate", "Chai"};
        for (String producto : catalogo) {
            System.out.println("   - Verificado: " + producto.toUpperCase());
        }
    }
}