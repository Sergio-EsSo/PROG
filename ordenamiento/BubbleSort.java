package ordenamiento;

import java.util.Arrays;

public class BubbleSort {

    public static int[] burbuja(int[] array){

        int[] aux = array;
        for(int i=1; i<aux.length; i++){
            for(int j=0; j<aux.length-i; j++){
                if(aux[j]>aux[j+1]){ //si el índice siguiente es menor al actual, se le da un voltio
                    int temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    public static double[] burbuja(double[] array){

        double[] aux = array;
        for(int i=1; i<aux.length; i++){
            for(int j=0; j<aux.length-i; j++){
                if(aux[j]>aux[j+1]){ //si el índice siguiente es menor al actual, se le da un voltio
                    double temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        return aux;
    }

    public static void main(String[] args) {
        
        int[] datos = {2, 5, 0, 9, 3, 1, 8, 4, 7, 6, 2, 5, 9, 0, 3, 1, 4, 7, 8, 2};
        System.out.println(Arrays.toString(datos));
        datos = burbuja(datos);
        System.out.println(Arrays.toString(datos));

        double[] masDatos = {
            1.5, 4.2, 0.8, 9.1, 3.3,
            1.9, 8.4, 5.2, 7.8, 9.4,
            8.9, 7.7, 5.1, 3.4, 4.4
        };
        System.out.println(Arrays.toString(masDatos));
        masDatos = burbuja(masDatos);
        System.out.println(Arrays.toString(masDatos));
    }
}
