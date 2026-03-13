package Repaso;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1A {

    public static void main(String[] args) {

        Random rn = new Random();
        float[] numeros = new float[50];

        for(int i=0; i<numeros.length; i++){
            numeros[i] = rn.nextFloat(-100,100);
        }
        int neg=0, pos=0;

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        for(Float s: numeros){
            if(s<0) neg++;
            else pos++;
        }
        System.out.println("Número de negativos: "+neg);
        System.out.println("Número de positivos (incluído el 0): "+pos);

        int[] positivos = new int[pos], negativos = new int[neg];

        for(int i=0, j=0, k=0; i<numeros.length; i++){
            if(numeros[i]<0){
                negativos[j] = (int) numeros[i];
                j++;
            }
            else{
                positivos[k] = (int) numeros[i];
                k++;
            }
        }
        System.out.println("Positivos: "+Arrays.toString(positivos));
        System.out.println("Negativos: "+Arrays.toString(negativos));

        int par=0, nones=0;

        for(float n: positivos){
            if(n%2==0) par++;
            else nones++;
        }

        int[] pares = new int[par], impares = new int[nones];

        for(int i=0, j=0, k=0; i<positivos.length; i++){
            if(positivos[i]%2==0){
                pares[j] = (int) positivos[i];
                j++;
            }
            else{
                impares[k] = (int) positivos[i];
                k++;
            }
        }
        System.out.println("Pares positivos: "+Arrays.toString(pares));
        System.out.println("Impares positivos: "+Arrays.toString(impares));
    }
}