package ordenamiento;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        
        int[] datos = {2, 5, 0, 9, 3, 1, 8, 4, 7, 6, 2, 5, 9, 0, 3, 1, 4, 7, 8, 2};
        quicksort(datos, 0, datos.length-1);
        System.out.println("Datos ordenados: \n"+Arrays.toString(datos));
    }

    public static void quicksort(int[] arr, int izq, int der){
        if(izq < der){
            int indicePivote = particion(arr, izq, der);
            quicksort(arr, izq, indicePivote-1);
            quicksort(arr, indicePivote+1, der);
        }
    }

    private static int particion(int[] array, int izq, int der){

    }
}
