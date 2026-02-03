package mapas;

import java.util.HashMap;
import java.util.Map;

public class ejercicio3 {

    public static void main(String[] args) {

        HashMap<Integer, String> m = new HashMap<Integer, String>();

        m.put(924, "Paco Nejo");
        m.put(921, "Gregorio Espino");
        m.put(700, "Aitor Tilla");
        m.put(537, "Alan Brito");
        m.put(605, "Esteban Quito");

        System.out.println("Todas las entradas del diccionario extraídas con entrySet: ");
        System.out.println(m.entrySet());

        System.out.println("\nEntradas del diccionario extraídas una a una: ");

        for(Map.Entry<Integer, String> pareja: m.entrySet()){
            System.out.println(pareja);
        }     
    }
}