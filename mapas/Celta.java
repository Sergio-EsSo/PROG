package mapas;

import java.util.TreeMap;

public class Celta {

    public static void main(String[] args) {

        TreeMap<Integer, String> m = new TreeMap<Integer, String>();

        m.put(3, "asd");
        m.put(2, "sad");
        m.put(1, "Yago Aspas");
        m.put(4, "das");
        m.put(5, "Blas");

        System.out.println("Todas las entradas del diccionario extraídas con entrySet: ");
        System.out.println(m.entrySet());

        System.out.println("Viva Vigo???????"); // hecho con mucha prisa y presión
    }

}
