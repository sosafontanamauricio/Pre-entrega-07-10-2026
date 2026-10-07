import java.util.ArrayList;
import java.util.Arrays;

class clase3 {
    public static void main(String[] args) {
        
        System.out.println("--- 1. Manipulación de cadenas ---");
        String productoSucio = " té CHAi ";
        
        String resultadoFormateado = formatearNombre(productoSucio);
        
        System.out.println("Cadena original: '" + productoSucio + "'");
        System.out.println("Cadena formateada: '" + resultadoFormateado + "'");
        System.out.println("Longitud: " + resultadoFormateado.length());
        System.out.println("Primera letra: " + resultadoFormateado.charAt(0));
        System.out.println("¿Contiene la palabra 'Chai'?: " + resultadoFormateado.contains("Chai"));


        System.out.println("\n--- 2. Arrays estáticos ---");
        String[] productosArray = {"Café", "Mate", "Azúcar", "Yerba", "Galletitas"};
        System.out.println("Elementos del array: " + Arrays.toString(productosArray));
        
        
        System.out.println("⚠️ Conclusión arrays: Tienen tamaño estático y no permiten agregar elementos nuevos dinámicamente.");


        System.out.println("\n--- 3. ArrayList dinámico ---");
        ArrayList<String> listaProductos = new ArrayList<>();
        
        listaProductos.add("Café");
        listaProductos.add("Mate");
        listaProductos.add("Azúcar");
        listaProductos.add("Yerba");
        listaProductos.add("Galletitas");
        
        listaProductos.add("Leche");
        
        listaProductos.remove("Azúcar");
        
        boolean existeMate = listaProductos.contains("Mate");
        System.out.println("¿Existe 'Mate' en la lista?: " + existeMate);
        
        System.out.println("Lista final de productos: " + listaProductos);


        System.out.println("\n--- 4. Combinar cadenas y listas ---");
        ArrayList<String> productosDesprolijos = new ArrayList<>();
        productosDesprolijos.add(" té CHAi ");
        productosDesprolijos.add("CAFÉ verde");
        productosDesprolijos.add(" MATE cocido ");

        System.out.println("Lista antes de formatear: " + productosDesprolijos);
        
        ArrayList<String> productosProlijos = limpiarListaNombres(productosDesprolijos);
        System.out.println("Lista después de formatear: " + productosProlijos);
    }

    public static String formatearNombre(String texto) {
        String trimItem = texto.trim();
        String[] partes = trimItem.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String parte : partes) {
            if (!parte.isEmpty()) {
                String capitalizada = parte.substring(0, 1).toUpperCase() + parte.substring(1).toLowerCase();
                sb.append(capitalizada).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static ArrayList<String> limpiarListaNombres(ArrayList<String> lista) {
        ArrayList<String> listaLimpia = new ArrayList<>();
        for (String item : lista) {
            listaLimpia.add(formatearNombre(item));
        }
        return listaLimpia;
    }
}