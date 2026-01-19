package Trimestre2;

public class EjemploSplit {

    public static void main(String[] args) {
        //Una cadena de más de 10 palabras
        String frase = "Aprender a programar en Java requiere práctica constante y mucha paciencia diaria";

        //Usamos split(" ") para obtener un array donde cada palabra sea un elemento
        String[] palabrasArray = frase.split(" ");

        //Mostramos el resultado
        System.out.println("Número de palabras encontradas: "+palabrasArray.length);

        System.out.println("--- Contenido del Array ---");
        for(int i=0; i<palabrasArray.length; i++){
            System.out.println("Posición ["+i+"]: "+palabrasArray[i]);
        }
    }
}
