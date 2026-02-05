package mapas;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        
        HashMap<Integer, String> m = new HashMap<Integer, String>();
        Scanner sc = new Scanner(System.in);

        m.put(924, "Paco Nejo");
        m.put(921, "Gregorio Espino");
        m.put(700, "Aitor Tilla");
        m.put(537, "Alan Brito");
        m.put(605, "Esteban Quito");

        System.out.println("Porfa introduce un código: ");
        int codigo = Integer.parseInt(sc.nextLine());
        
        if(m.containsKey(codigo)){
            System.out.print("El código "+codigo+" corresponde a ");
            System.out.println(m.get(codigo));
        }
        else{
            System.out.println("No existe");
        }

        sc.close();
    }
}