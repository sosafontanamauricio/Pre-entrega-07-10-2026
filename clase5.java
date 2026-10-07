class Cliente {
    String nombre;
    String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void mostrarCliente() {
        System.out.println("Cliente: " + nombre + " | Email: " + email);
    }
}

class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock + " unidades");
    }

    public double calcularDescuentoGeneral() {
        double descuento = this.precio * 0.10;
        return this.precio - descuento;
    }
}

public class clase5 {
    public static void main(String[] args) {
        
        System.out.println("=== 1 y 4. Clases, Objetos y Constructores (Cliente) ==p");
        Cliente cliente1 = new Cliente("Sofía Pérez", "sofia@email.com");
        Cliente cliente2 = new Cliente("Lucas Gómez", "lucas@email.com");
        Cliente cliente3 = new Cliente("Valentina Ríos", "valentina@email.com");

        cliente1.mostrarCliente();
        cliente2.mostrarCliente();
        cliente3.mostrarCliente();


        System.out.println("\n=== 2. Métodos en la clase Producto ===");
        Producto prod1 = new Producto("Café Molido 500g", 4500.0, 20);
        Producto prod2 = new Producto("Yerba Mate 1kg", 3200.0, 15);

        prod1.mostrarInformacion();
        prod2.mostrarInformacion();


        System.out.println("\n=== 3. Más métodos: Descuento general del 10% ===");
        double precioFinal1 = prod1.calcularDescuentoGeneral();
        double precioFinal2 = prod2.calcularDescuentoGeneral();

        System.out.println("Precio original de " + prod1.nombre + ": $" + prod1.precio + " | Con 10% OFF: $" + precioFinal1);
        System.out.println("Precio original de " + prod2.nombre + ": $" + prod2.precio + " | Con 10% OFF: $" + precioFinal2);
        
        Producto prod3 = new Producto("Chai Especial", 6000.0, 8);
        System.out.println("Precio original de " + prod3.nombre + ": $" + prod3.precio + " | Con 10% OFF: $" + prod3.calcularDescuentoGeneral());
    }
}