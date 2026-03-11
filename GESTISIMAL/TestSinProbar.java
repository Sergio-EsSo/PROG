package GESTISIMAL;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSinProbar {

    static Almacen almacen = new Almacen();
    static Scanner entrada = new Scanner(System.in);
    private static Menu menu = new Menu("----MENÚ GESTISIMAL----", new String[] { "Listado", "Alta", "Baja",
            "Modificación", "Entada de mercancía", "Salida de mercancía", "Guardar almacén", "Cargar almacén", "Salir" });
    private static String archivo = "almacen.obj";

    public static void main(String[] args) throws Exception {

        int opcion;
        //INICIALIZAR
        if(almacen.vacio()){
            almacenDePrueba();
        }
        else{
            cargarAlmacen();
        }
        //MENU
        do {
            opcion = menu.gestionar();
            
            switch (opcion) {
                case 1:
                    System.out.println(almacen);
                    break;
                case 2:
                    annadir();
                    break;
                case 3:
                    baja();
                    break;
                case 4:
                    modificar();
                    break;
                case 5:
                    entradaAlmacen();
                    break;
                case 6:
                    salidaAlmacen();
                    break;
                case 7:
                    guardarAlmacen();
                    break;
                case 8:
                    cargarAlmacen();
                    break;
                default:
                    System.out.println("Gracias por usar Gestisimal.");
                    return;
            }
        } while (true);
    }

    private static void almacenDePrueba() {
        try {
            almacen.annadir("1", 11, 11, 11);
            almacen.annadir("1", 22, 22, 22);
            almacen.annadir("33", 11, 11, 33);
            almacen.annadir("44", 11, 11, 44);
            almacen.annadir("55", 11, 11, 55);
        } catch (Exception e) {
            System.out.println("ESTO NO DEBE APARECERRRRRRRRRRRRRRRRR");
        }
    }

    /**
     * Método añadir en el que se le pedirá al usuario los datos del artículo.
     * 
     * @throws Exception
     */
    private static void annadir() throws Exception {

        try {
            System.out.println("--AÑADIR ARTÍCULO--");
            String descripcion = Teclado.leerCadena("Introduzca la descripción del artículo:");
            double precioCompra = Teclado.leerDecimal("Introduzca el precio de compra del artículo:");
            double precioVenta = Teclado.leerDecimal("Introduzca el precio de venta del artículo:");
            int stock = Teclado.leerEntero("Introduzca el stock del artículo:");

            almacen.annadir(descripcion, precioCompra, precioVenta, stock); // Con almacen.annadir usamos el metodo
                                                                            // creado en
                                                                            // Almacen.
            System.out.println("Artículo añadido.");
        } catch (Exception e) {
            System.err.println("No se ha podido dar de alta al artículo. " + e.getMessage());// Si hay un error salta la
            entrada.nextLine();
        }
    }

    /**
     * Método para dar de baja un artículo de la lista.
     * 
     * @throws CodigoNoValidoException
     * @throws NoEsEnteroException
     * @throws ArticuloNoExisteException
     */
    private static void baja() throws CodigoNoValidoException, NoEsEnteroException {
        try {
            int codigo = Teclado.leerEntero("Introduce el código del artículo a eliminar.");
            if (almacen.baja(codigo))
                System.out.println("Artículo eliminado.");
            else
                System.err.println(
                        "El artículo no se ha podido eliminar. No existe un artículo con ese código en el almacen.");
        } catch (NoEsEnteroException n) {
            System.err.println(n.getMessage());
        }
    }

    /**
     * Método para modificar los atributos de un artículo.
     * 
     * @throws StockNegativoException
     * @throws PrecioCompraNegativoException
     * @throws PrecioVentaNegativoException
     * @throws NoEsEnteroException
     * @throws NoEsDecimalException
     */
    private static void modificar()
            throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException,
            NoEsEnteroException, NoEsDecimalException {

        try {
            System.out.println("--MODIFICAR ARTÍCULO--");
            int codigo = Teclado.leerEntero("Introduce el código del artículo a eliminar.");
            Articulo articulo = almacen.get(codigo);
            System.out.println(articulo);

            String descripcion = Teclado.leerCadena("Introduzca la descripción del artículo:");
            double precioCompra = Teclado.leerDecimal("Introduzca el precio de compra del artículo:");
            double precioVenta = Teclado.leerDecimal("Introduzca el precio de venta del artículo:");
            int stock = Teclado.leerEntero("Introduzca el stock del artículo:");

            almacen.set(articulo, descripcion, precioCompra, precioVenta, stock);
        } catch (ArticuloNoExisteException | PrecioCompraNegativoException | PrecioVentaNegativoException
                | StockNegativoException | NoEsDecimalException | NoEsEnteroException e) {
            System.err.println("No se ha podido modificar el artículo." + e.getMessage());
            entrada.nextLine();
        }

    }

    /**
     * Método para aumentar el stock de un artículo.
     * 
     * @throws NoEsEnteroException
     * @throws StockNegativoException
     * @throws CantidadNegativaException
     */
    private static void entradaAlmacen() throws NoEsEnteroException, StockNegativoException {
        try {
            System.out.println("--INCREMENTAR STOCK--");
            int codigo = Teclado.leerEntero("Introduce el código del artículo a eliminar.");
            Articulo articulo = almacen.get(codigo);
            System.out.println(articulo);

            int cantidad = Teclado.leerEntero("Introduzca el número de artículos a aumentar del stock del almacen.");
            almacen.incrementar(codigo, cantidad);
        } catch (ArticuloNoExisteException | CantidadNegativaException e) {
            System.err.println("No se ha podido incrementar el stock del artículo." + e.getMessage() + "\n");
        }
    }

    /**
     * Método para disminuir el stock de un artículo, este no puede ser negativo.
     * 
     * @throws NoEsEnteroException
     * @throws StockNegativoException
     * @throws CantidadNegativaException
     */
    private static void salidaAlmacen() throws NoEsEnteroException, CantidadNegativaException {
        try {
            System.out.println("--DECREMENTAR STOCK--");
            int codigo = Teclado.leerEntero("Introduce el código del artículo a eliminar.");
            Articulo articulo = almacen.get(codigo);
            System.out.println(articulo);

            int cantidad = Teclado.leerEntero("Introduzca el número de artículos a eliminar del stock del almacen.");
            almacen.decrementar(codigo, cantidad);
        } catch (ArticuloNoExisteException | StockNegativoException | CantidadNegativaException e) {
            System.err.println("No se ha podido decrementar el stock del artículo." + e.getMessage() + "\n");
        }
    }
    
    //NOVEDADES!!
    private static void guardarAlmacen() throws Exception{
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))){
            System.out.println("--GUARDAR ALMACEN--");
            oos.writeObject(almacen);
            System.out.println("Almacén correctamente guardado en almacen.obj");
        }
        catch(IOException e){
            System.out.println("Error al guardar el almacén: "+e.getMessage());
        }
    }
    private static void cargarAlmacen() throws Exception{
        File fichero = new File("almacen.obj");
        if(!fichero.exists()){
            System.out.println("No hay archivo de guardado previo. Creando colección nueva...");
            almacenDePrueba();
            return;
        }        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            System.out.println("--GUARDAR ALMACEN--");
            almacen = (Almacen) ois.readObject();
            System.out.println("Colección cargada con éxito");            
        } 
        catch (Exception e) {
            System.out.println("Error al cargar la colección: "+e.getMessage());
        }
    }
}