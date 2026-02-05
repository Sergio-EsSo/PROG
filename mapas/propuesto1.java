package mapas;

import java.util.HashMap;
import java.util.Scanner;

public class propuesto1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String user="";
        String passwd="";
        HashMap<String,String> registro = new HashMap<String, String>();
        registro.put("Pepe Vázquez", "Ad1234");
        registro.put("Lucía Méndez", "Lm5678");
        registro.put("Carlos Ruiz", "Cr9012");
        registro.put("Marta Sánchez", "Ms3456");
        registro.put("Javier López", "Jl7890");
        registro.put("Elena García", "Eg2345");
        registro.put("Andrés Castro", "Ac6789");

        int i=0;
        while (i<3) {

            System.out.println("Nombre de usuario: ");
            user = sc.nextLine();
            System.out.println("Contraseña: ");
            passwd = sc.nextLine();

            if(registro.containsKey(user.trim())){
                if(passwd.trim().equals(registro.get(user.trim()))) {
                    System.out.println("HAS INGRESADO EN EL AREA 67!!!");
                    i=67;
                } 
                else {
                    System.out.println("Ususario o contraseña incorrectos");
                    i++;
                }
            }
            else {
                System.out.println("Usuario o contraseña incorrectos");
                i++;
            }
            if(i==3) System.out.println("Baneado por CABEZABUQUE");
        }
        sc.close();
    }
}