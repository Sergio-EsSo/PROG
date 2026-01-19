package Trimestre2;

public class Cadenas6 {

    public static void main(String[] args) {
        
        String cad1 = "EMMA";
        String cad2 = new String("EMMA");

        //comparar el CONTENIDO
        if(cad1.equals(cad2)) System.out.println("SON IGUALES");
        else System.out.println("SON DIFERENTES");

        //comparar la REFERENCIA (ubicación de memoria)
        if(cad1 == cad2) System.out.println("SON IGUALES");
        else System.out.println("SON DIFERENTES");

        //
        String cad3 = cad1;

        //comparar el CONTENIDO
        if(cad1.equals(cad3)) System.out.println("SON IGUALES");
        else System.out.println("SON DIFERENTES");

        //comparar la REFERENCIA (ubicación de memoria)
        if(cad1 == cad3) System.out.println("SON IGUALES");
        else System.out.println("SON DIFERENTES");
    }
}
