package listas;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Ecologico.precios();

        HashMap<String, Integer> cesta = new HashMap<>();

        System.out.println("Bienvenido a su compra online");
        while(true){
            System.out.print("Producto: ");
            String prod = sc.nextLine().trim().toLowerCase();
            
            if(prod.equals("fin")) break;

            if(Ecologico.productosEco.containsKey(prod)){
                System.out.print("Cantidad: ");
                int cant = Integer.parseInt(sc.nextLine());
                //se guadra
                cesta.put(prod, cesta.getOrDefault(prod, 0)+cant);
            }
            else{
                System.out.println("Producto no disponible.");
            }
        }

        float total = 0f;
        System.out.println("\n");        
        System.out.println("Producto  Precio  Cantidad  Subtotal");
        System.out.println("------------------------------------");
        for(String nombre : cesta.keySet()){
            float precioUd = Ecologico.productosEco.get(nombre);
            int cantidad = cesta.get(nombre);
            float subtotal = precioUd*cantidad;
            total+=subtotal;
            System.out.println(nombre+"  "+precioUd+"  "+cantidad+
            "  "+subtotal);
        }
        System.out.println("------------------------------------");
        System.out.println("TOTAL: "+total);
        sc.close();        
    }
}