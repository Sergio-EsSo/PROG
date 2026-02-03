package Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class propuesto8 {

    public static void main(String[] args) {
        
        Random rnd = new Random();
        int[] aleatorios = new int[1000];

        for(int i=0; i<aleatorios.length; i++){
            aleatorios[i] = rnd.nextInt(500);
        }

        System.out.println("Desordenado: "+Arrays.toString(aleatorios));

        Arrays.sort(aleatorios);

        int[] altos = new int[10];

        altos = Arrays.copyOfRange(aleatorios, 990, 1000);
        System.out.println("los 10 más altos son....");
        System.out.println(Arrays.toString(altos));
    }
}