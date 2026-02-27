package Discoteca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        discos[0] = new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
        discos[1] = new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46);
        discos[2] = new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);
    }
    private static void addDisco(){
        System.out.println("Hay que pedir los datos del disco:");
        System.out.println("hay que crear un disco nuevo");
        System.out.println("se añadirá a la colección antes del primero disco libre");

        boolean trovato=true;
        int pos=-1;
        do{
            pos++;
            if(discos[pos].getCodigo().equals("LIBRE")) trovato=false;
        }while(trovato);

        System.out.println("Por favor, introduzca los datos del disco.");
        //repetir??
        System.out.print("Codigo: ");
        String codigoIn = sc.nextLine();
        System.out.print("Autor: ");
        String autorIn = sc.nextLine();
        System.out.print("Titulo: ");
        String tituloIn = sc.nextLine();
        System.out.print("Genero: ");
        String generoIn = sc.nextLine();
        System.out.print("Duracion: ");
        Integer duracionIn = Integer.parseInt(sc.nextLine());

        discos[pos] = new Disco(codigoIn, autorIn, tituloIn, generoIn, duracionIn);
        System.out.println("Añadido disco a la colección");
    }
    public static int buscarCodigo(){
        System.out.print("Introduzca código existente: ");
        String code = sc.nextLine();
        for(int i=0; i<discos.length; i++){
            if(discos[i].getCodigo().equals(code)){
                return i;
            }
        }
        return -1;
    }
    public static void modificarDiscoExistente(){
        System.out.println("Hay que buscar por código el disco a modificar");
        System.out.println("una vez encontrado, se muestran los datos");
        System.out.println("y se piden de nuevo");

        int indice =  buscarCodigo();
        if(indice<discos.length){
            System.out.println("MOSTRAR DATOS DISCO");
            System.out.println();
        }
    }

    private static void cargarColeccion(){
        File fichero = new File("coleccion.obj");
        //Verificamos si el archivo existe antes de intentar leerlo
        if(!fichero.exists()){
            System.out.println("No hay archivo de guardado previo. Creando colección nueva...");
            crearColeccion(); //inicializamos el array con objetos vacíos
            mockDiscos();
            return;
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))){
            //leemos el objeto y hacemos el casting a Disco[]
            discos = (Disco[]) ois.readObject();
            System.out.println("Colección cargada con éxito");
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Error al cargar la colección: "+e.getMessage());
            //si algo falla, al menos inicializamos para que no seal null
            crearColeccion();
        }
    }
    private static void guardarColeccion(){
        //Usamos try-with-sources para que el archivo se cierre solo
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("coleccion.obj"))){
            //guardamos el array completo de un solo golpe
            oos.writeObject(discos);
            System.out.println("Colección guardada correctamente en coleccion.obj");
        } catch (IOException e){
            System.out.println("Error al guardar la colección: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int opcion=0;
        boolean bucle = true;
        //empezar
        if(discos.length==0){
            crearColeccion();
            mockDiscos();
        }else{
            //cargar automáticamente desde disco duro al empezar
            cargarColeccion();
        }
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
            System.out.println("5. Guardar colección");
            System.out.println("6. Cargar colección");
            System.out.println("7. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("\nLISTADO");
                    System.out.println("=======");
                    //método para listar
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
                case 5:
                    System.out.println("\nGuardar en el Almacenamiento");
                    System.out.println("======");
                    guardarColeccion();
                    break;
                case 6:
                    System.out.println("\nCargar desde Almacenamiento");
                    System.out.println("======");
                    cargarColeccion();
                    break;
                case 7:
                    System.out.println("Cao peschao");
                    bucle=false;
                    //guardo automaticamente la coleccion:
                    guardarColeccion();
                    break;
                default:
                    System.out.println("\nDAME UNA OPCIÓN REAL (cabezabuquismo)");

            } // switch
        } while (bucle==true);
        sc.close();
    }
}