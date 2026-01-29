package Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class propuesto7b {

    /*Reto: Fusión Eficiente de Arrays Ordenados
    Contexto: Se te proporcionan dos arreglos de números enteros, arr1 y arr2,
    los cuales ya se encuentran ordenados de forma ascendente.
    Desafío: Implementa una función (metodo) que combibe ambos arreglos en un único nuevo arreglo, manteniendo el orden ascendente en todo momento.*/

    /*PISTAS:
        Debes recorrere ambos arreglos simultáneamente utilizando punteros o índices independientes.
        
        En cada paso, debes comparar los elementos actuales de cada arreglo y copiar el menor al arreglo resultante🥀
        
        Asegúrate de gestionar correctamente los casos en los que un arreglo es más largo que el otro o cuando uno de ellos está vacío.*/

        public static int[] apretujaOrdenado(int[] arr1, int[] arr2){

            int[] mezcla = new int[arr1.length+arr2.length];
            //1. recorrer ambos simultaneamente
            int i=0, j=0, k=0;
            while(i<arr1.length && j<arr2.length){ //no me sale con un FOR así que lo cambié a un WHILE
                //2. comparar uno de la primera con uno de la segunda y colocar en la mezcla
                if(arr1[i]<arr2[j]) {
                    mezcla[k] = arr1[i];
                    i++;
                }
                else{
                    mezcla[k] = arr2[j];
                    j++;
                }
                k++;
            }//fin bucle WHILE

            while(i<arr1.length){
                mezcla[k] = arr1[i];
                i++;
                k++;
            }
            while (j<arr2.length) {
                mezcla[k] = arr2[j];
                j++;
                k++;
            }
            System.out.println("indice i: "+i);
            System.out.println("indice j: "+j);
            System.out.println("indice k: "+k);

            return mezcla;
        }

        public static void main(String[] args) {
            
            //genera dos arrays
            int[] uno = new int[6];
            int[] otro = new int[7];

            //se rellenan
            Random rnd = new Random();
            for(int i=0; i<uno.length; i++) uno[i] = rnd.nextInt(20);
            Arrays.sort(uno);
            System.out.println(Arrays.toString(uno));

            for(int i=0; i<otro.length; i++) otro[i] = rnd.nextInt(20);
            Arrays.sort(otro);
            System.out.println(Arrays.toString(otro));

            int[] completo = apretujaOrdenado(uno, otro);
            System.out.println("Juntado y ordenado: "+Arrays.toString(completo));
        }
}
