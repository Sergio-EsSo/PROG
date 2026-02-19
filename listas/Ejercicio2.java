package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {

        Random mero = new Random();
        int elementos = 10+mero.nextInt(11);
        System.out.println("El numero de elementos de la lista es: "+elementos);

        List<Integer> numeros = new ArrayList<Integer>();

        for(int i=0; i<elementos; i++){
            numeros.add(mero.nextInt(100));
        }
        
        int pequeño = Collections.min(numeros);
        int grande = Collections.max(numeros);

        System.out.println("El mayor es: "+grande);
        System.out.println("El menor es: "+pequeño);

        int suma = 0;
        for(int i=0; i<elementos; i++){
            suma+=numeros.get(i);
        }
        System.out.println("La suma es: "+suma);
        System.out.println("La media es: "+((double)suma/elementos));
        //idem pero de otra manera
        //int adicion;
        //numeros.forEach(item -> adicion+=item);

        int[] acumulador = {0};
        //truco para poder omodificar la viarbale dentro de la lambda

        numeros.forEach(n -> acumulador[0]+=n);
        int añade = acumulador[0];
        double promedio = (double)añade/numeros.size();

        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+promedio);

        System.out.println("Con Streams para 2DAM");

        int adition = numeros.stream()
                        .mapToInt(Integer::intValue)
                        .sum();
        System.out.println("La suma es: "+adition);
        System.out.println("El promedio es: "+promedio);
    }
}