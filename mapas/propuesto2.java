package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class propuesto2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String,String> diccionario = new HashMap<String, String>();
        diccionario.put("Casa", "House");
        diccionario.put("Puerta", "Door");
        diccionario.put("Perro", "Dog");
        diccionario.put("Gato", "Cat");
        diccionario.put("Libro", "Book");
        diccionario.put("Ventana", "Window");
        diccionario.put("Mesa", "Table");
        diccionario.put("Silla", "Chair");
        diccionario.put("Coche", "Car");
        diccionario.put("Aparcao", "Done");
        diccionario.put("Agua", "Water");
        diccionario.put("Comida", "Food");
        diccionario.put("Sol", "Sun");
        diccionario.put("Luna", "Moon");
        diccionario.put("Calle", "Street");
        diccionario.put("Ciudad", "City");
        diccionario.put("Amigo", "Friend");
        diccionario.put("Desbrozadora", "Brushcutter");
        diccionario.put("Escuela", "School");
        diccionario.put("Reloj", "Clock");
        diccionario.put("Cama", "Bed");
        diccionario.put("Otorrinolaringologo", "Otolaryngologist");

        System.out.println("---Contenido del Diccionario---");
        for(Map.Entry<String,String> entrada : diccionario.entrySet()){
            System.out.println(entrada.getKey()+" en inglés es: "+entrada.getValue());
        }

        System.out.println(diccionario.keySet());

        String[] palabras = diccionario.keySet().toArray(new String[0]);
        System.out.println(palabras);
        String buscar = palabras[new Random().nextInt(palabras.length)];

        System.out.println("\nBúsqueda de '"+buscar+"': "+diccionario.get(buscar));
        if(diccionario.containsKey(buscar)){
            System.out.println("Traducción: "+diccionario.get(buscar));
        }
        else{
            System.out.println("La palabra no se encuentra en el diccionario");
        }

        sc.close();        
    }
}