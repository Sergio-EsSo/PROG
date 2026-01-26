package Ejercicios;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class resuelto9SINREP {
    
    public static int buscabin(int[] a, int valor, int min, int max){
        //CASO LIMITE --> NO ENCUENTRA NADA
        if(min==max){
            System.out.println("SALIDA PORQUE MIN=MAX");
            return -1;
        }
        int mitad = (min+max)/2;
        System.out.println("min: "+min+", a[min]: "+a[min]+", max: "+max+", a[max]: "+a[max]+", mitad: "+mitad+", "+a[mitad]);

        if(valor==a[mitad]) return mitad;
        if(valor==a[min]) return min;
        if(valor==a[max]) return max;

        if(valor > a[mitad]) return buscabin(a, valor, mitad+1, max);
        else return buscabin(a, valor, min, mitad-1);
    }

    public static int[] rellena(int[] numeros){
        Random random = new Random();

        int total = numeros.length;
        int contador = 0;
        while(contador<total){ 
            // Genera valor para colocar en posicion contador
            int valor = 1+random.nextInt(99);
            boolean repetido=false; // a priori no está repetido
                for (int i = 0; i <= contador; i++) {
                    if (valor == numeros[i]) {
                        System.out.println("Repe...");
                        repetido = true;
                        break;
                    }
                }
                if (!repetido) {
                    System.out.println("Insertado "+valor);
                    numeros[contador] = valor; // en contado el valor
                    contador++;
                }
            }; //Fin while
        return numeros;
    }

    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        numeros = rellena(numeros);
        System.out.println("Array desordenado");
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);
        System.out.println("Array ordenado");
        System.out.println(Arrays.toString(numeros));

        System.out.println("TRAS ordenar dame el número a buscar: ");
        int num = Integer.parseInt(sc.nextLine());

        //metodo de busqueda binaria
        int indice = buscabin(numeros, num, 0, numeros.length-1);
        if(indice >= 0) System.out.println("ENcontrado el valor "+num+" en el índice "+indice);
        else System.out.println("NO encontrado el valor "+num+ " y se insertaría en la posición (sin signo) "+indice);


        sc.close();
    }

}
