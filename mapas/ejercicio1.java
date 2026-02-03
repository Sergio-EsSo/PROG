package mapas;

import java.util.HashMap;
import java.util.Map;

public class ejercicio1 {

    public static void main(String[] args) {

        //creo mapa
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        //inserto valores
        m.put(924, "Paco Nejo");
        if(m.containsKey(921)) m.put(921, "Cindy Nero");
        m.put(921, "Gregorio Espino");
        m.put(700, "Aitor Tilla");
        m.put(537, "Alan Brito");
        m.put(605, "Esteban Quito");

        //visualización sin ORDENAR
        System.out.println("Los elementos de m son: \n"+m);

        //visualizacion por parejas recorriendo el mapa completo
        for(Map.Entry<Integer, String> par : m.entrySet()){
            System.out.println(par);
        }

    }

}