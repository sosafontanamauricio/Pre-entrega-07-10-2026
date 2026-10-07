import java.util.ArrayList;

interface Descontable {
    void aplicarDescuento(double porcentaje);
}

abstract class Producto {
    protected String nombre;
    protected double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public abstract double calcularPrecioFinal();

    public void mostrarInformacion() {
        System.out.println("🛒 Producto: " + nombre + " | Precio Base: $" + precioBase);
    }
}

class Te extends Producto implements Descontable {
    private String tipoHoja;
    private double descuentoAplicado;

    public Te(String nombre, double precioBase, String tipoHoja) {
        super(nombre, precioBase);
        this.tipoHoja = tipoHoja;
        this.descuentoAplicado = 0.0;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase - descuentoAplicado;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        this.descuentoAplicado = precioBase * (porcentaje / 100.0);
        System.out.println("🍵 Descuento del " + porcentaje + "% aplicado a " + nombre);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("   ↳ Tipo de Hoja: " + tipoHoja + " | Precio Final: $" + calcularPrecioFinal());
    }
}

class Cafe extends Producto implements Descontable {
    private String nivelTueste;
    private double descuentoAplicado;

    public Cafe(String nombre, double precioBase, String nivelTueste) {
        super(nombre, precioBase);
        this.nivelTueste = nivelTueste;
        this.descuentoAplicado = 0.0;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase - descuentoAplicado;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        this.descuentoAplicado = precioBase * (porcentaje / 100.0);
        System.out.println("☕ Descuento del " + porcentaje + "% aplicado a " + nombre);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("   ↳ Nivel de Tueste: " + nivelTueste + " | Precio Final: $" + calcularPrecioFinal());
    }
}

public class clase7 {
    public static void main(String[] args) {
        
        System.out.println("=== 1 y 2. Herencia, Clases Abstractas y Polimorfismo ===");
        
        ArrayList<Producto> catalogo = new ArrayList<>();
        
        Te teVerde = new Te("Té Verde Sencha", 4500.0, "Verde Orgánico");
        Cafe cafeColumbia = new Cafe("Café Colombia Supremo", 8000.0, "Intenso Tueste Medio");
        Te teNegro = new Te("Té Negro Earl Grey", 4200.0, "Negro Clásico");

        catalogo.add(teVerde);
        catalogo.add(cafeColumbia);
        catalogo.add(teNegro);

        for (Producto p : catalogo) {
            p.mostrarInformacion();
            System.out.println("--------------------------------------------------");
        }


        System.out.println("\n=== 3. Uso de Interfaces (Descontable) y super / override ===");
        
        teVerde.aplicarDescuento(10.0);
        cafeColumbia.aplicarDescuento(15.0);

        System.out.println("\n--- Catálogo Actualizado con Descuentos Aplicados ---");
        for (Producto p : catalogo) {
            p.mostrarInformacion();
            System.out.println("--------------------------------------------------");
        }
    }
}