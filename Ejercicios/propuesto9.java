package Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class propuesto9 {

    public static void main(String[] args) {

        Random rnd = new Random();
        int[] aleatorios = new int[100];

        for(int i=0; i<aleatorios.length; i++){
            aleatorios[i] = 10+rnd.nextInt(71);
        }
        System.out.println(Arrays.toString(aleatorios));

        //SIN ORDENAR

        int max = aleatorios[0], min = aleatorios[0];
        int total=0;

        for(Integer i : aleatorios){
            if(i>max) max=i;
            if(i<min) min=i;
            total+=i;
        }
        System.out.println("Máximo es: "+max);
        System.out.println("Mínimo es: "+min);
        System.out.println("Media es: "+(double)(total/aleatorios.length));

        Map<Integer, Integer> cuenta = new HashMap<Integer, Integer>();

        //mapa completo desde 10 a 80 sin inicializar
        for(int i=10; i<81; i++){
            cuenta.put(i, 0);
        }
        //ver entero
        for(Map.Entry<Integer,Integer> pareja: cuenta.entrySet()){
            System.out.println(pareja);
        }
        //contar
        for(Integer i: aleatorios){
            int valor=cuenta.get(i);
            cuenta.put(i, valor+1);
        }

        for(Map.Entry<Integer,Integer> pareja: cuenta.entrySet()){
            System.out.print(pareja.getKey()+"-->");
            System.out.println(pareja.getValue());
        }
        //buscar la moda
        int moda=aleatorios[0];
        int repe=0;
        for(Map.Entry<Integer,Integer> pareja: cuenta.entrySet()){
            if(pareja.getValue()>repe) {
                repe=pareja.getValue();
                moda=pareja.getKey();
            }
        }

        System.out.println("Moda es: "+moda);
    }
}