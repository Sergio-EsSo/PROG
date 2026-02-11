package mapas;

import java.util.ArrayList;
import java.util.List;

public class ListaModerna {

    public static void main(String[] args) {
        // 1. Crear un Vector de Strings
        // El 10 es la capacidad inicial, el 5 es cuánto aumenta si se llena
        List<String> listaSuper = new ArrayList<>();

        // 2. Añadir elementos
        listaSuper.add("Leche");
        listaSuper.add("Huevos");
        listaSuper.add("Pan");
        listaSuper.add("Café");

        // 3. Insertar en una posición específica
        listaSuper.add("Fruta");
        listaSuper.add("Segarro");

        // 4. Eliminar un elemento
        listaSuper.remove("Huevos");

        // 5. Recorrer el Vector
        System.out.println("--- Lista de la Compra ---");
        for (String item : listaSuper) {
            System.out.println("Producto: " + item);
        }

        // 6. Datos curiosos del Vector
        System.out.println("\n--- Info del Vector ---");
        System.out.println("Tamaño actual (elementos): " + listaSuper.size());
        System.out.println("Capacidad total del contenedor: " + listaSuper.size());
    }
}