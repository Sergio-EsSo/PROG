package Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class resuelto2 {

    //un array o vector con 50 posiciones con números entre el 1 y el 100 ordenado con metodo burbuja

    public static int[] bulbujah(int[] Paco){

        int[] aux = Paco;
        for(int i=1; i<aux.length; i++){
            for(int j=0; j<aux.length-i; j++){
                if(aux[j]>aux[j+1]){
                    int temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    public static void main(String[] args) {
        
        int[] array = new int[50];
        Random rand = new Random();

        for(int i=0; i<array.length; i++){
            array[i] = rand.nextInt(100);
        }

        System.out.println("Array: "+Arrays.toString(array));
        //array = bulbujah(array);
        System.out.println("Ordenado: "+Arrays.toString(bulbujah(array)));

        //por la patilla o algo, no sé

        for(int i=0; i<array.length; i++){
            array[i] = rand.nextInt(100);
        }

        System.out.println("Array (otra vez): "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Ordenado (por magia): "+Arrays.toString(array));

    }

}
