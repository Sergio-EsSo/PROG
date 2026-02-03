package mapas;

import java.util.TreeMap;

public class ejercicio4 {

    public static void main(String[] args) {

        TreeMap<Integer, String> m = new TreeMap<Integer, String>();

        m.put(924, "Paco Nejo");
        m.put(921, "Gregorio Espino");
        m.put(700, "Aitor Tilla");
        m.put(537, "Alan Brito");
        m.put(605, "Esteban Quito");

        System.out.println("Todas las entradas del diccionario extraídas con entrySet: ");
        System.out.println(m.entrySet());
    }
}