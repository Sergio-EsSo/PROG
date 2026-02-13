package listas;

import java.util.ArrayList;
import java.util.Collections;

public class EjemploGato {

    public static void main(String[] args) {

        //1. se crea la lista        
        ArrayList<gato> g = new ArrayList<gato>();
        g.add(new gato("Rinzler", "negro", "negro"));
        g.add(new gato("Finn", "naranja", "naranja"));
        g.add(new gato("Winston", "gris", "persa"));
        g.add(new gato("Chandragupta", "marrón", "bengalí"));
        g.add(new gato("Chandragupta", "marrón", "bengalí"));
        g.add(new gato("Chandragupta", "marrón", "bengalí"));
    
        System.out.println("--- Lista inicial ---\n"+g);
        //2. SORT
        Collections.sort(g);
        System.out.println("Orden normal (A-Z)\n"+g);        
        //3. REVERSE
        Collections.reverse(g);
        System.out.println("Orden invertido (Z-A)\n"+g);
        //4. SHUFFLE
        Collections.shuffle(g);
        System.out.println("Orden aleatorio\n"+g);
        //5. MIN y MAX
        gato primero = Collections.min(g);
        gato ultimo = Collections.max(g);
        System.out.println("El primero alfabéticamente: "+primero.getNombre());
        System.out.println("El último alfabéticamente: "+ultimo.getNombre());
        //6. FREQUENCY
        gato MuchoMichi = new gato("Chandragupta", "", "");
        int numFreq = Collections.frequency(g, MuchoMichi);
        System.out.println("\nNúmero de : "+numFreq);
        //7. REPLACEALL
        gato Dios = new gato("Michi Supremo", "Dorado", "Dios");
        Collections.replaceAll(g, new gato("Chandragupta", "", ""), Dios);
        System.out.println("\n---Tras el ReplaceAll---\n"+g);
        //8. BINARYSEARCH
        Collections.sort(g); //se ordena antes de buscar
        int pos = Collections.binarySearch(g, new gato("Winston", "", ""));
        System.out.println("Winston está en la posición: "+pos);
        //9. UNMODIFIABLELIST
        //no me dio para copiar UPS        
    }
}
