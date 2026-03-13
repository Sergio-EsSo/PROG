package Repaso;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1B {

    public static void quicksort(double[] arr, int izq, int der){
        if(izq < der){
            int indicePivote = particion(arr, izq, der);
            quicksort(arr, izq, indicePivote-1);
            quicksort(arr, indicePivote+1, der);
        }
    }
    private static int particion(double[] array, int izq, int der){
        double pivote = array[der];
        int i = (izq-1);

        for(int j=izq; j<der; j++){
            if(array[j] <= pivote){
                i++;
                //intercambio O swap
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        //Pivote en la posición final
        double temp = array[i+1];
        array[i+1] = array[der];
        array[der] = temp;

        return i+1;
    }

    public static void main(String[] args) {

        Random rn = new Random();
        double[] arr = new double[60];

        for(int i=0; i<arr.length; i++){
            arr[i] = rn.nextDouble(-200,200);
        }

        System.out.println(Arrays.toString(arr));

        quicksort(arr, 0, arr.length-1);

        int neg=0, pos=0;

        for(double n: arr){
            if(n<0) neg++;
            else pos++;
        }
        double[] negativos = new double[neg], positivos = new double[pos];
        
        for(int i=0, j=0, k=0; i<arr.length; i++){
            if(arr[i]<0){
                negativos[j]=arr[i];
                j++;
            }
            else{
                positivos[k]=arr[i];
                k++;
            }
        }

        System.out.println("Negativos: "+Arrays.toString(negativos));
        System.out.println("Positivos: "+Arrays.toString(positivos));        

        int par=0, impar=0;

        for(double p: negativos){
            if(p%2!=0) impar++;
            else par++;
        }

        int[] pares = new int[par], impares = new int[impar];

        for(int i=0, j=0, k=0; i<negativos.length; i++){
            if(negativos[i]%2!=0){
                impares[j]= (int) negativos[i];
                j++;
            }
            else{
                pares[k]= (int) negativos[i];
                k++;
            }
        }

        System.out.println("Pares negativos: "+Arrays.toString(pares));
        System.out.println("Impares negativos: "+Arrays.toString(impares));        
    }
}