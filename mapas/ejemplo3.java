package mapas;

import java.util.ArrayList;

public class ejemplo3 {

    public static void main(String[] args) {

        ArrayList<String> colores = new ArrayList<String>();

        colores.add("rojo");
        colores.add("azul");
        colores.add("verde");
        colores.add("blanco");
        colores.add("amarillo");

        System.out.println("Contenido de la lista OTRA VEZ: ");
        for(String lin : colores){
            System.out.println(lin);
        }  
        
        if(colores.contains("blanco")){
            System.out.println("El blanco está en la lista de colores");
        }

        colores.remove("blanco");

        for(String lin : colores){
            System.out.println(lin);
        } 

        colores.remove(2);

        for(String lin : colores){
            System.out.println(lin);
        } 
    }
}
