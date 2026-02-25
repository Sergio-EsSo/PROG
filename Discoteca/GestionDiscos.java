package Discoteca;

import java.util.Scanner;

public class GestionDiscos {

    public static Disco[] discos = new Disco[100];

    public static Scanner sc;

    public static void crearColeccion(){
        for(int i=0; i<discos.length; i++){
            discos[i] = new Disco();
        }
    }
    public static void mockDiscos(){
         // Carga varios discos
        discos[0] = new Disco(
        "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
        discos[1] = new Disco(
        "FGHQ64", "Metallica", "Black album", "hard rock", 46);
        discos[2] = new Disco(
        "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);
    }
    private static void addDisco(){
        System.out.println("Hay que pedir los datos del disco:");
        System.out.println("hay que crear un disco nuevo");
        System.out.println("se añadirá a la colección antes del primero disco libre");
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int opcion=0;
        //empezar
        crearColeccion();
        mockDiscos();

        do {
            System.out.println("\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("\nLISTADO");
                    System.out.println("=======");

                    for (Disco d : discos) {
                        if (!d.getCodigo().equals("LIBRE")) {
                            System.out.println(d);
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nNUEVO DISCO");
                    System.out.println("===========");
                    addDisco();
                    break;

                case 3:
                    System.out.println("\nMODIFICAR");
                    System.out.println("===========");
                    break;

                case 4:
                    System.out.println("\nBORRAR");
                    System.out.println("======");
                    break;

                default:
                    System.out.println("\nDAME UNA OPCIÓN REAL (cabezabuquismo)");

            } // switch
        } while (opcion != 5);

        System.out.println("Cao peschao");
        sc.close();
    }
}