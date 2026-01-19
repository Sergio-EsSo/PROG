package Trimestre2;

public class Cadenas5 {

    public static void main(String[] args) {
        
        String cad1 = "EMMA";
        String cad2 = "MARIA";

        //compareTo = objeto String - "cadena" en ASCII
        System.out.println(cad1.compareTo("emma")); //negativo
        System.out.println(cad1.compareTo("EMMA")); //cero
        System.out.println(cad1.compareTo("EMMA MORENO")); //negativo
        System.out.println(cad2.compareTo("MARIA AMPARO")); //negativo
        System.out.println(cad2.compareTo("MAREA")); //positivo
    }
}