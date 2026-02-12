package listas;

import java.util.ArrayList;
import java.util.Collections;

public class EjemploGato {

    public static void main(String[] args) {
        
        ArrayList<gato> g = new ArrayList<gato>();
        g.add(new gato("Rinzler", "negro", "negro"));
        g.add(new gato("Finn", "naranja", "naranja"));
        g.add(new gato("Winston", "gris", "persa"));
        g.add(new gato("Chandragupta", "marrón", "bengalí"));

        System.out.println(g);
        //ordenar
        Collections.sort(g);
        System.out.println("Ordenados por nombre: ");
        
    }
}
