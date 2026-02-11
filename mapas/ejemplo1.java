package mapas;

import java.util.ArrayList;

public class ejemplo1 {

    public static void main(String[] args) {
        
        ArrayList<String> colores = new ArrayList<String>();

        System.out.println("Número de elementos: "+colores.size());
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");

        System.out.println("Número de elementos: "+colores.size());
        colores.add("blanco");

        System.out.println("Número de elementos: "+colores.size());

        System.out.println("El elemento en la posición 0 es: "+colores.get(0));
        System.out.println("El elemento en la posición 3 es: "+colores.get(3));

        colores.forEach(colo -> System.out.println("El color es: "+colo+" y está en la posición: "+colores.indexOf(colo)));
    }

}
