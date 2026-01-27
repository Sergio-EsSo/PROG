package Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class propuesto7 {

    //Realiza un metodo que tomo como parametros de entrada dos arrays de enteros y devuelva como salida
    //un unico array con los elementes de los anteriores arrays ordenados de forma ascendente.

    public static int[] insertionSort(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            int copia = numbers[i]; 
            int j=i;
            while(j>0 && copia < numbers[j-1]){
                numbers[j] = numbers[j-1];
                j--;
            }
            numbers[j] = copia;
        }
        return numbers;
    }

    public static int[] juntaYOrdena(int[] arr1, int arr2[]){
        int[] completo = new int[arr1.length+arr2.length];
        for(int i=0; i<arr1.length; i++) //de 0 a 69
            completo[i] = arr1[i];

        for(int j=arr1.length; j<completo.length; j++) //de 70 a 129
            completo[j] = arr2[j-arr1.length];

        return insertionSort(completo);
    }

    public static void main(String[] args) {
        
        //genera dos arrays
        int[] uno = new int[70];
        int[] otro = new int[60];

        Random rnd = new Random();
        for(int i=0; i<uno.length; i++) uno[i] = rnd.nextInt(350);
        System.out.println(Arrays.toString(uno));

        for(int i=0; i<otro.length; i++) otro[i] = rnd.nextInt(525);
        System.out.println(Arrays.toString(otro));

        int[] completo = juntaYOrdena(uno, otro);
        System.out.println("Juntado y ordenado: "+Arrays.toString(completo));
    }

}
