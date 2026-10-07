import java.util.ArrayList;

class Cliente {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        setEmail(email); 
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("❌ [Validación Cliente] Error: El email '" + email + "' no es válido (debe contener '@').");
        }
    }

    public void mostrarCliente() {
        System.out.println("Cliente: " + nombre + " | Email: " + (email != null ? email : "Sin email válido"));
    }
}

class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;
    
    private static int totalProductosCreados = 0;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        setCantidadEnStock(cantidadEnStock);
        totalProductosCreados++;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getCantidadEnStock() { return cantidadEnStock; }

    public void setCantidadEnStock(int cantidadEnStock) {
        if (cantidadEnStock >= 0) {
            this.cantidadEnStock = cantidadEnStock;
        } else {
            System.out.println("❌ [Validación Producto] Error: No se permite asignar stock negativo (" + cantidadEnStock + ") a " + this.nombre);
        }
    }

    public static int getTotalProductosCreados() {
        return totalProductosCreados;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + cantidadEnStock);
    }
}

class Carrito {
    private ArrayList<Producto> productosEnCarrito;

    public Carrito() {
        this.productosEnCarrito = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productosEnCarrito.add(producto);
        System.out.println("🛒 Producto agregado: " + producto.getNombre());
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productosEnCarrito) {
            total += p.getPrecio();
        }
        return total;
    }

    public void mostrarCarrito() {
        System.out.println("--- Contenido del Carrito ---");
        for (Producto p : productosEnCarrito) {
            System.out.println("   • " + p.getNombre() + " - $" + p.getPrecio());
        }
    }
}

public class clase6 {
    public static void main(String[] args) {
        
        System.out.println("=== 1. Encapsulamiento y Validaciones (Cliente) ===");
        Cliente cliente1 = new Cliente("Martín Gómez", "martin@email.com");
        cliente1.mostrarCliente();
        
        System.out.println("Intentando actualizar con un email sin '@'...");
        cliente1.setEmail("martin-email.com");
        cliente1.mostrarCliente();


        System.out.println("\n=== 2. Variables Estáticas y Control de Stock (Producto) ===");
        Producto prod1 = new Producto("Café Colombia", 5000.0, 15);
        Producto prod2 = new Producto("Té Verde Orgánico", 2800.0, 30);
        Producto prod3 = new Producto("Alfartesanos", 1200.0, 50);

        // Mostramos el contador estático global
        System.out.println("📊 Total de productos creados en el sistema (static): " + Producto.getTotalProductosCreados());

        System.out.println("Intentando asignar stock negativo (-10) a " + prod1.getNombre() + "...");
        prod1.setCantidadEnStock(-10);
        System.out.println("Stock actual verificado: " + prod1.getCantidadEnStock() + " (se mantuvo intacto)");


        System.out.println("\n=== 3. Colaboración entre Clases (Carrito de Compras) ===");
        Carrito miCarrito = new Carrito();
        miCarrito.agregarProducto(prod1);
        miCarrito.agregarProducto(prod2);
        miCarrito.agregarProducto(prod3);

        System.out.println();
        miCarrito.mostrarCarrito();
        System.out.println("-----------------------------");
        System.out.println("💰 Monto Total del Carrito: $" + miCarrito.calcularTotal());
    }
}