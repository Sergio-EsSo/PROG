package mapas;

import java.util.ArrayList;

public class ejemplo4 {

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

        colores.set(2, "esmeralda");

        System.out.println("Contenido del vector ahora:");
        System.out.println(colores);
    }
}