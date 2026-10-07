import com.techlab.productos.Producto;
import com.techlab.productos.Te;
import com.techlab.productos.Cafe;
import com.techlab.excepciones.ProductoNoEncontradoException;
import com.techlab.excepciones.StockInsuficienteException;

import java.util.ArrayList;
import java.util.List;

public class clase8 {
    
    public static Producto buscarProductoPorNombre(List<Producto> catalogo, String nombreBuscado) throws ProductoNoEncontradoException {
        for (Producto p : catalogo) {
            if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
                return p;
            }
        }
        throw new ProductoNoEncontradoException("❌ Producto no encontrado en el catálogo: '" + nombreBuscado + "'");
    }

    public static void main(String[] args) {
        List<Producto> catalogo = new ArrayList<>();
        catalogo.add(new Te("Té Verde Sencha", 4500.0, 10, "Verde Orgánico"));
        catalogo.add(new Cafe("Café Colombia Supremo", 8000.0, 5, "Intenso Tueste Medio"));

        System.out.println("=== 1. Prueba de Excepciones en Búsquedas (try-catch) ===");
        try {
            Producto encontrado = buscarProductoPorNombre(catalogo, "Café Colombia Supremo");
            System.out.println("¡Búsqueda exitosa!");
            encontrado.mostrarInformacion();

            System.out.println("\nIntentando buscar un producto inexistente...");
            Producto noExiste = buscarProductoPorNombre(catalogo, "Mate Cocido");
            noExiste.mostrarInformacion();

        } catch (ProductoNoEncontradoException e) {
            System.out.println("⚠️ Capturada la excepción: " + e.getMessage());
        }

        System.out.println("\n=== 2. Prueba de Excepciones Personalizadas de Stock ===");
        Producto te = catalogo.get(0);
        te.mostrarInformacion();

        try {
            System.out.println("Intentando vender 3 unidades...");
            te.reducirStock(3);
            System.out.println("Venta exitosa. Stock restante: " + te.getStock());

            System.out.println("\nIntentando vender 20 unidades (más del stock disponible)...");
            te.reducirStock(20);

        } catch (StockInsuficienteException e) {
            System.out.println("⚠️ Capturada la excepción de stock: " + e.getMessage());
        }
    }
}