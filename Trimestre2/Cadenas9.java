package Trimestre2;

public class Cadenas9 {

    public static void main(String[] args) {
        
        int edad1=6;
        String str=String.valueOf(edad1);
        System.out.println(str);

        float edad2=6;
        str=String.valueOf(edad2);
        System.out.println(edad2);

        long edad3=6;
        str=String.valueOf(edad3);
        System.out.println(edad3);

        double edad4=6.7;
        str=String.valueOf(edad4);
        System.out.println(str);

        double numero = Double.parseDouble(str);
        System.out.println("El número recuperado de la cadena es: "+2*numero);
    }
}