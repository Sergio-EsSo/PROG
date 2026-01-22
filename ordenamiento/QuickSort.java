package ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    //1e6 posiciones (un millón)
    //

    public static void main(String[] args) {
        
        int[] datos = {2, 5, 0, 9, 3, 1, 8, 4, 7, 6, 2, 5, 9, 0, 3, 1, 4, 7, 8, 2};
        quicksort(datos, 0, datos.length-1);
        System.out.println("Datos ordenados: \n"+Arrays.toString(datos));

        int[] numeros = new int[1000000];
        Random rand = new Random();
        for(int i=0; i<numeros.length; i++){
            numeros[i] = rand.nextInt(100);
        }
        //ordenadito
        quicksort(numeros, 0, numeros.length-1);
        System.out.println(Arrays.toString(numeros));
    }

    public static void quicksort(int[] arr, int izq, int der){
        if(izq < der){
            int indicePivote = particion(arr, izq, der);
            quicksort(arr, izq, indicePivote-1);
            quicksort(arr, indicePivote+1, der);
        }
    }

        private static int particion(int[] array, int izq, int der){
        int pivote = array[der];
        int i = (izq-1);

        for(int j=izq; j<der; j++){
            if(array[j] <= pivote){
                i++;
                //intercambio O swap
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        //Pivote en la posición final
        int temp = array[i+1];
        array[i+1] = array[der];
        array[der] = temp;

        return i+1;
    }
}
