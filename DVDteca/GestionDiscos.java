package DVDteca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class GestionDiscos {

    public static Scanner sc;
    //el número de discos es flexible
    public static List<Disco> discos = new ArrayList<Disco>();
    //no necesito crear coleccion;
    public static void mockDiscos(){
        // Carga varios discos
        discos.add(new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
        discos.add(new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46));
        discos.add(new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));
    }
        @SuppressWarnings("unchecked") // Esto quita la línea amarilla 
    private static void cargarColeccion(){
        File fichero = new File("coleccion.obj");
        //Verificamos si el archivo existe antes de intentar leerlo
        if(!fichero.exists()){
            System.out.println("No hay archivo de guardado previo. Creando colección nueva...");
            //inicializamos un arraylist con tres discos
            mockDiscos();
            return;
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))){
            //leemos el objeto y hacemos el casting a Disco[]
            discos = (List<Disco>) ois.readObject();
            Collections.sort(discos);
            System.out.println("Colección cargada con éxito");
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Error al cargar la colección: "+e.getMessage());
            //si algo falla, al menos inicializamos para que no seal null
            mockDiscos();
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
    private static void addDisco(){
        System.out.println("Por favor, introduzca los datos del disco.");
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

        discos.add(new Disco(codigoIn, autorIn, tituloIn, generoIn, duracionIn));
        System.out.println("Añadido disco a la colección");
    }
    public static int buscarCodigo(){
        System.out.print("Introduzca código existente: ");
        String code = sc.nextLine();
        for(int i=0; i<discos.size(); i++){
            if(discos.get(i).getCodigo().equalsIgnoreCase(code)){
                return i;
            }
        }
        return -1;
    }
    private static void borrarDiscoExistente() {
        int indice = buscarCodigo();
        if(indice==-1){
            System.out.println("Código no encontrado");
        }
        else{
            System.out.println("MOSTRAR DATOS DISCO");
            System.out.println(discos.get(indice).toString());
            System.out.println("Y ahora a modificar.....");

            System.out.print("Deseas borrar este disco? (S/N) ");
            String opcion1 = sc.nextLine();
            if(opcion1.equalsIgnoreCase("s")){
                System.out.print("Estas seguro? (S/N) ");
                String opcion2 = sc.nextLine();
                if(opcion2.equalsIgnoreCase("s")){
                    discos.remove(indice); //discos.remove(objeto) sirve
                    System.out.println("Disco BORRADO");
                }
                else{
                    System.out.println("Disco NO borrado");
                }
            }
            else{
                System.out.println("Disco NO borrado");
            }
        }
    }
    public static void modificarDiscoExistente(){

        int indice =  buscarCodigo();
        if(indice==-1){
            System.out.println("Código no encontrado");
        }
        else{
            Disco d = discos.get(indice);
            System.out.println("MOSTRAR DATOS DISCO");
            System.out.println(d.toString());
            System.out.println("Y ahora a modificar.....");

            System.out.println("Si no escribes nada, no se modifica el valor mostrado");

            System.out.print("Código ("+d.getCodigo()+"): ");
            String codigoIn = sc.nextLine();
            if(!codigoIn.isBlank()) d.setCodigo(codigoIn);

            System.out.print("Autor ("+d.getAutor()+"): ");
            String autorIn = sc.nextLine();
            if(!autorIn.isBlank()) d.setAutor(autorIn);

            System.out.print("Título ("+d.getTitulo()+"): ");
            String tituloIn = sc.nextLine();
            if(!tituloIn.isBlank()) d.setTitulo(tituloIn);

            System.out.print("Género ("+d.getGenero()+"): ");
            String generoIn = sc.nextLine();
            if(!generoIn.isBlank()) d.setGenero(generoIn);

            System.out.print("Duración ("+d.getDuracion()+"): ");
            String duracionIn = sc.nextLine();
            if(!duracionIn.isBlank()) d.setDuracion(Integer.parseInt(duracionIn));
        }
        System.out.println("\nDisco actualizado correctamente");
    }

    public static void main(String[] args) {
        int opcion =0;
        boolean seguir = true;
        sc = new Scanner(System.in);

        //empezar
        if(discos.isEmpty()){
            mockDiscos();
            cargarColeccion();
        }
        else{
            //cargar automáticamente desde disco duro al empezar
        }
        //menu
        do{
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
                    Collections.sort(discos);
                    for (Disco d : discos)
                        System.out.println(d);
                    System.out.println("Tienes una colección con "+discos.size()+" discos");
                    break;
                case 2:
                    System.out.println("\nNUEVO DISCO");
                    System.out.println("===========");
                    addDisco();
                    break;
                case 3:
                    System.out.println("\nMODIFICAR");
                    System.out.println("===========");
                    //modificarDiscoExistente();
                    break;
                case 4:
                    System.out.println("\nBORRAR");
                    System.out.println("======");
                    borrarDiscoExistente();
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
                    seguir=false;
                    //guardo automaticamente la coleccion:
                    guardarColeccion();
                    break;
                default:
                    System.out.println("\nDAME UNA OPCIÓN REAL (cabezabuquismo)");

            } // switch
        }while(seguir==true);
    }
}