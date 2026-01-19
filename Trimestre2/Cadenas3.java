package Trimestre2;

import java.util.Arrays;

public class Cadenas3 {

    public static void main(String[] args) {
        //definimos objetos
        String cadena1 = "Hola";
        String cadena2 = "Java";
        //conversion .toCharArray()
        char[] array1 = cadena1.toCharArray();
        char[] array2 = cadena2.toCharArray();
        //impresion
        System.out.println("Primer carácter del array: "+array1[0]);
        System.out.println("Último carácter del array: "+array2[array2.length-1]);

        System.out.println(Arrays.toString(array1));
    }
}
