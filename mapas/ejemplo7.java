package mapas;

import java.util.ArrayList;

public class ejemplo7 {

    public static void main(String[] args) {  

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(20);
        numeros.add(4);
        numeros.add(17);
        numeros.add(67);
        numeros.add(33);

        System.out.println("Contenido de la lista: ");
        System.out.println(numeros);
        numeros.removeIf(numero -> numero < 10);
        System.out.println("Contenido de la lista después de borrar los menores de 10");
        System.out.println(numeros);
    }
}