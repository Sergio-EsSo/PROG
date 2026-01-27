package Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class propuesto2 {

    public static int[] insertionSort(int[] numeros){
        for(int i=0; i<numeros.length; i++){
            int numeroAinsertar = numeros[i];
            int j = i;
            while(j>0 && numeroAinsertar<numeros[j-1]){
                numeros[j] = numeros[j-1];
                j--;
            }
            numeros[j] = numeroAinsertar;
        }
        return numeros;            
    }

    public static void main(String[] args) {
        
        int[] original = new int[100];
        int[] ordenado = new int[100];

        Random random = new Random();
        for(int i=0; i<original.length; i++){
            original[i] = random.nextInt(200);
        }
        System.out.println("Original: "+Arrays.toString(original));

        ordenado=insertionSort(original);

        System.out.println("Ordenado: "+Arrays.toString(ordenado));
    }
}
