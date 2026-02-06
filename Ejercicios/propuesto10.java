package Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.List;

public class propuesto10 {

    /*programa en el que cree un vector de 100 posicicones con números aleatorios entre 1 y 100
      Una vez creado el vector el programa deberá ordenar el vector y mostras los números entre 1 y 100 
      sin haber sido almacenados*/

    public static void main(String[] args) {
        
        int[] enteros = new int[100];
        Random random = new Random();
        
        for(int i=0; i<enteros.length; i++) enteros[i] = 1+random.nextInt(100);

        System.out.println(Arrays.toString(enteros));
        Arrays.sort(enteros);
        System.out.println(Arrays.toString(enteros));

        //recoge en alguna estructura de almacenamiento los que no estan o muestralos
        
        //lista de enteros flexible o array list viene de collection
        List<Integer> faltantes = new ArrayList<Integer>();

        for(int i=0; i<enteros.length; i++){
            if(!busquedaNumero(enteros, i)){
                faltantes.add(i);
                System.out.println(i);
            }
        }

        System.out.println("No salen en la once hoy");
        System.out.println(faltantes);
    }

    public static boolean busquedaNumero(int[] enteros, int numero){
        int indice = Arrays.binarySearch(enteros, numero);
        if(indice >= 0){
            return true;
        }else{
            return false;
        }
    }
}
