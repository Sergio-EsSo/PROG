package mapas;

import java.util.HashMap;

public class ejercicio6 {

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
    }
}