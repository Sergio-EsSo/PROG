package Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class InterseccionListas {

    /*Contexto: Tienes dos arrays de IDs de productos, almacenA y almacenB. Ambos arrays están ordenados de forma ascendente.
    Tu tarea es encontrar qué productos están presentes en ambos almacenes.
    El Desafío: Escribe un método que devuelva un nuevo array con los elementos comunes (intersección) de ambos arrays, sin duplicados.
    Restricciones: * No puedes usar estructuras de datos adicionales como HashSet o ArrayList */

    public static int[] interseccionesRecio(int[] arr1, int[]arr2){ //el array al mejor precio
        
        int menor=0;

        if(arr1.length<arr2.length) menor = arr1.length;
        else menor=arr2.length;

        int[] temp = new int[menor]; //array interseccion cuya longitud es el "techo" máximo (temporal)

        int i=0, j=0, k=0;

        while(i<arr1.length && j<arr2.length){ //recorrer los arrays para ver que elementos coinciden entre si
            if(arr1[i]==arr2[j]){
                if(k==0 || temp[k-1] != arr1[i]){
                    temp[k] = arr1[i];
                    k++;
                }
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]) i++; //si el elemento es menor, es garantizado que no se encuentre en el otro array; no hay intersección y se sigue
            else j++; //lo mismo, pero al revés
        }//fin del bucle

        int[] erseccion = new int[k];

        for(int c=0; c<k; c++){
            erseccion[c] = temp[c];
        }

        return erseccion;
    }


    public static void main(String[] args) {

        Random rnd = new Random();

        int a = rnd.nextInt(20);
        int b = rnd.nextInt(20);

        int[] almacenA = new int[a];
        int[] almacenB = new int[b];

        for(int i=0; i<almacenA.length; i++) almacenA[i] = 1+rnd.nextInt(100);
        Arrays.sort(almacenA);
        System.out.println("Almacen A: "+Arrays.toString(almacenA));

        for(int i=0; i<almacenB.length; i++) almacenB[i] = 1+rnd.nextInt(100);
        Arrays.sort(almacenB);
        System.out.println("Almacen B: "+Arrays.toString(almacenB));

        int[] simpleto = interseccionesRecio(almacenA, almacenB);
        System.out.println("Intersección: "+Arrays.toString(simpleto));
    }
}