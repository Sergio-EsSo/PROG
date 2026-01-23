package Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class resuelto9 {

    //crea una clase busquedabin que busque un valor array ordenado utilizando busqueda binaria
    //el metodo muestra las posiciones (min max) y la intermedia

    public static void main(String[] args) {
        
        int[] numeros = new int[50];
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<numeros.length; i++){
            numeros[i] = 1+rnd.nextInt(99);
        }
        System.out.println("Array desordenado");
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);
        System.out.println("Array ordenado");
        System.out.println(Arrays.toString(numeros));

        System.out.println("TRAS ordenar dame el número a buscar: ");
        int num = Integer.parseInt(sc.nextLine());

        //metodo de busqueda binaria
        int indice = Arrays.binarySearch(numeros, num);
        if(indice >= 0) System.out.println("ENcontrado el valor "+num+" en el índice "+indice);
        else System.out.println("NO encontrado el valor "+num+ " y se insertaría en la posición (sin signo) "+indice);


        sc.close();
    }

}