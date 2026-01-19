package Trimestre2;

import java.util.Arrays;

public class Cadenas1 {

    public static void main(String[] args) {
        
        char[] nombre1 = {'p', 'e', 'p', 'e'};
        char[] nombre2 = {112, 101, 112, 101};
        char[] nombre3 = new char[4];

        System.out.println(Arrays.toString(nombre1));
        System.out.println(Arrays.toString(nombre2));
        System.out.println(Arrays.toString(nombre3));

        //conversion char[] => objeto String
        String cadena1 = new String(nombre1);
        System.out.println(cadena1);

        String cadena2 = String.valueOf(nombre2);
        System.out.println(cadena2);

        String cadena3 = "";
        for(int i=0; i<nombre3.length; i++){
            cadena3+=nombre3[i];
        }
        System.out.println(cadena3);

    }
}
