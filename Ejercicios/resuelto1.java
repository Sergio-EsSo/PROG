package Ejercicios;

import java.util.Arrays;

public class resuelto1 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][8];
        for(int i=0; i<5; i++){
            for(int j=0; j<8; j++){
                matriz[i][j] = i+j;
            }
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<8; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        //como hago para usar Arrays.toString para sacar la matriz?
        System.out.println();
        System.out.println(Arrays.deepToString(matriz));

        //autonomía
        System.out.println("Berberechos");
        for(int i=0; i<matriz.length; i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
    }

}
