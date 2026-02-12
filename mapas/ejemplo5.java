package mapas;

import java.util.ArrayList;

public class ejemplo5 {

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

        //añado
        colores.add(1, "zafiro");
        System.out.println("Contenido de la lista ahora:");
        System.out.println(colores);
    }
}