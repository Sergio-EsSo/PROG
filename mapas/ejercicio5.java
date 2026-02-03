package mapas;

import java.util.HashMap;
import java.util.Map;

public class ejercicio5 {

    public static void main(String[] args) {
        
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        m.put(924, "Paco Nejo");
        m.put(921, "Gregorio Espino");
        m.put(700, "Aitor Tilla");
        m.put(537, "Alan Brito");
        m.put(605, "Esteban Quito");

        System.out.println("Hash no guarda el orden");
        System.out.println("Todas las entradas (PAREJAS) del diccionario extraídas con entrySet:");
        System.out.println(m.entrySet());

        System.out.println("Para verlo ordenado sin user TREE puedo usar la API stream para hacer un recorrido...");
        m.entrySet() //se obtienen las parejas del mapa
        .stream() //se inicializa
        .sorted(Map.Entry.comparingByKey()) //organiza según la key
        .forEach(entry -> System.out.println(entry.getKey()+": "+entry.getValue())); //imprime
    }
}