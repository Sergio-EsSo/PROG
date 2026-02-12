package mapas;

import java.util.ArrayList;

public class ejemplo6 {

    public static void main(String[] args) {
        
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("rojo");
        colores.add("azul");
        colores.add("verde");
        colores.add("amarillo");
        colores.add("turquesa");
        colores.add("magenta");

        System.out.println("Contenido del vector: ");
        System.out.println(colores);

        colores.removeIf(palabra -> palabra.startsWith("a"));
        System.out.println("Contenido de la lista después de borrar las palabras que empiezan"+
            " la letra \"a\": ");
        System.out.println(colores);
    }
}