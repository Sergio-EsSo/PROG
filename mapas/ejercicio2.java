package mapas;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        
        HashMap<Integer, String> m = new HashMap<Integer, String>();
        Scanner sc = new Scanner(System.in);

        m.put(924, "Paco Nejo");
        m.put(921, "Gregorio Espino");
        m.put(700, "Aitor Tilla");
        m.put(537, "Alan Brito");
        m.put(605, "Esteban Quito");

        //muestra el valor que corresponde a diferentes claves (si lo hay) !!!!!!!!!!
        System.out.println(m.get(921));
        System.out.println(m.get(605));
        System.out.println(m.get(888));

        int i=0;

        while(i<5){
            System.out.println("clave a introducir: ");
            int clave = Integer.parseInt(sc.nextLine());
            if(m.containsKey(clave));
            if(m.containsKey(clave)) System.out.println("Corresponde a: "+m.get(clave));
            else System.out.println("Nadie con esa clave");            
        }
        sc.close();
    }
}