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
        //System.out.println(Arrays.toString(numeros));

        for(Float s: numeros){
            if(s<0) neg++;
            else pos++;
        }
        System.out.println("Número de negativos: "+neg);
        System.out.println("Número de positivos (incluído el 0): "+pos);

        float[] positivos = new float[pos], negativos = new float [neg];

        for(int i=0, j=0, k=0; i<numeros.length; i++){
            if(numeros[i]<0){
                negativos[j] = numeros[i];
                j++;
            }
            else{
                positivos[k] = numeros[i];
                k++;
            }
        }

        System.out.println("Positivos: "+Arrays.toString(positivos));
        System.out.println("Negativos: "+Arrays.toString(negativos));
    }
}