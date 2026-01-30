package Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class NombresRepetidos {

    public static void main(String[] args) {
        
        String[] nombres = {"Alejandro", "Segismundo", "Fulgencio", "Ignacio", "Daniel", "Luis", "Ángel", "Hugo", "Samuel",
            "Ismael", "Elena", "Martina", "Javier", "Sara", "Victoria", "Carla", "María", "Lupita", "Winston", "Antonio", "Berta"
        };

        Random rnd = new Random();

        String[] array1 = new String[6+rnd.nextInt(7)]; // six seven mencionado oh my god en plan holy shit !!!!1 11!!!!!
        String[] array2 = new String[5+rnd.nextInt(5)];

        System.out.println("Array1 tamaño: "+array1.length);
        System.out.println("Array2 tamaño: "+array2.length);

        for(int i=0; i<array1.length; i++){
            String nuevo;
            do{
                nuevo = nombres[rnd.nextInt(nombres.length)];
            }while(prueba(array1, nuevo, i));
            array1[i]=nuevo;
        }
        for(int i=0; i<array2.length; i++){
            String nuevo;
            do{
                nuevo = nombres[rnd.nextInt(nombres.length)];
            }while(prueba(array2, nuevo, i));
            array2[i]=nuevo;
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println("Array 1: "+Arrays.toString(array1));
        System.out.println("Array 2: "+Arrays.toString(array2));

        String[] interseccion = interseccionesRecio(array1, array2);
        System.out.println("Intersección: "+Arrays.toString(interseccion));
    }

    public static String[] interseccionesRecio(String[] arr1, String[]arr2){ //el array al mejor precio
        
        int menor=Math.min(arr1.length, arr2.length);
        String[] temp = new String[menor]; //array interseccion cuya longitud es el "techo" máximo (temporal)

        int i=0, j=0, k=0;

        while(i<arr1.length && j<arr2.length){ //recorrer los arrays para ver que elementos coinciden entre si
            if(arr1[i].equals(arr2[j])){
                if(k==0 || !temp[k-1].equals(arr1[i])){
                    temp[k] = arr1[i];
                    k++;
                }
                i++;
                j++;
            }
            else if(arr1[i].compareTo(arr2[j]) < 0) i++; //si el elemento es menor, es garantizado que no se encuentre en el otro array; no hay intersección y se sigue
            else j++; // 1compareTo2 > 0, idem, pero al reves
        }//fin del bucle

        String[] erseccion = new String[k];

        for(int c=0; c<k; c++){
            erseccion[c] = temp[c];
        }

        return erseccion;
    }

    public static boolean prueba(String[] arr, String nombre, int cantidad){
        for(int i=0; i<cantidad; i++){
            if(arr[i] != null && arr[i].equals(nombre)) return true;
        }
        return false;
    }
}