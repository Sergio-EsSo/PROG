package Trimestre2;

import java.util.StringTokenizer;

public class Tokenizer {

    public static void main(String[] args) {
        
        String parrafo = "Hola, me llamo Luca, soy una persona algo timida y vivio en el piso dos.";

        StringTokenizer st = new StringTokenizer(parrafo, " ,.");
        int toques = st.countTokens();

        System.out.println("--- Desglosando párrafo ---");

        while (st.hasMoreTokens()) {
            System.out.println("Palabra: "+st.nextToken());
        }

        System.out.println("Total de elementos procesados: "+toques);
    }
}