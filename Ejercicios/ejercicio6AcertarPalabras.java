package Ejercicios;

import java.util.HashMap;
//import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ejercicio6AcertarPalabras {

    public static HashMap<String,String> diccionario;

    public static HashMap<String, String> generaDiccionario(){

        diccionario = new HashMap<String, String>();

        diccionario.put("Incertidumbre", "Uncertainty");
        diccionario.put("Inconmensurable", "Incommensurable");
        diccionario.put("Yuxtaposición", "Juxtaposition");
        diccionario.put("Efímero", "Ephemeral");
        diccionario.put("Desoxirribonucleico", "Deoxyribonucleic");
        diccionario.put("Anestesiología", "Anesthesiology");
        diccionario.put("Epidemiología", "Epidemiology");
        diccionario.put("Fotosíntesis", "Photosynthesis");
        diccionario.put("Psicoterapeuta", "Psychotherapist");
        diccionario.put("Andamio", "Scaffolding");
        diccionario.put("Destornillador", "Screwdriver");
        diccionario.put("Engranaje", "Gear");
        diccionario.put("Yunque", "Anvil");
        diccionario.put("Tragaluz", "Skylight");
        diccionario.put("Compromiso", "Commitment");
        diccionario.put("Desvergonzado", "Shameless");
        diccionario.put("Acontecimiento", "Event");
        diccionario.put("Imprescindible", "Essential");
        diccionario.put("Enajenación", "Alienation");
        diccionario.put("Electroencefalografista", "Electroencephalographist");

        /*System.out.println("---Contenido del Diccionario---");
        for(Map.Entry<String,String> entrada : diccionario.entrySet()){
            System.out.println(entrada.getKey()+" en inglés es: "+entrada.getValue());
        }*/
        return diccionario;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //creamos el diccionario
        generaDiccionario();

        //veo las palabras en castellano Keys
        System.out.println(diccionario.keySet());

        //genero un array estático de palabras en castellano con el keySet
        String[] palabras = diccionario.keySet().toArray(new String[0]);

        int aciertos = 0;

        //generamos palabras aleatorias
        for(int i=0; i<5; i++){
            int indice = new Random().nextInt(palabras.length);
            String palabra = palabras[indice];
            System.out.println("Traduce la siguiente palabra al inglés: "+palabra);
            String respuesta = sc.nextLine();
            if(respuesta.equalsIgnoreCase(diccionario.get(palabra))) aciertos++;
        }

        System.out.println("Has acertado "+aciertos+" veces!!!!!");

        if(aciertos==0) System.out.println("Menudo fucking disaster eres pedazo de CABEZABUQUE");

        sc.close();
    }
}
