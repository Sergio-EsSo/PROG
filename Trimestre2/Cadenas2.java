package Trimestre2;

public class Cadenas2 {

    public static void main(String[] args) {
        
        char[] letras = {'H','o','l','a'};
        String saludo = new String(letras);

        byte[] bytes = {74, 97, 118, 97};
        String leng = new String(bytes);

        char[] datos = {'a','b','c','d','e','f'};
        String subcadena = new String(datos, 2, 3); //desde [2], +3: cde

        System.out.println(saludo);
        System.out.println(leng);
        System.out.println(subcadena);

        //Inversion
    }
}