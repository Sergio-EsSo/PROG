package listas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        List<String> compis = new ArrayList<String>();
        compis.add("Yelmilena Polanco");
        compis.add("Jorge Freire");
        compis.add("Anxo Fonterosa");
        compis.add("Laura Sanrromán");
        compis.add("Manuel Céspedes");
        compis.add("Marcos Chamorro");

        System.out.println("Con forEnhanced");
        for(String puntero: compis)
            System.out.println(puntero);

        System.out.println("");

        System.out.println("Con forEach:");
        compis.forEach(jicho -> System.out.println(jicho));
    }
}