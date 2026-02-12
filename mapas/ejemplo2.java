package mapas;

import java.util.ArrayList;

public class ejemplo2 {

    public static void main(String[] args) {

        ArrayList<String> colores = new ArrayList<String>();

        colores.add("rojo");
        colores.add("azul");
        colores.add("verde");
        colores.add("blanco");
        colores.add("amarillo");

        System.out.println("Contenido de la lista: ");
        for(int i=0; i<colores.size(); i++){
            System.out.println(colores.get(i));
        }

        System.out.println("Contenido de la lista OTRA VEZ: ");
        for(String lin : colores){
            System.out.println(lin);
        }        
    }
}