package Ejercicios;

import java.util.Scanner;

public class resuelto8 {

    //realiza un metodo esCapicua
    public static boolean esCapicua(int numero){
        boolean cap = false;
        String derecho = String.valueOf(numero);
        String reves = new StringBuilder(derecho).reverse().toString();
        int oremun = Integer.parseInt(reves);

        if(numero == oremun) cap = true;
        return cap;
    }

    public static void main(String[] args) {
        
        System.out.println("Dame un entero:");
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("Es capicua? "+esCapicua(num));
        sc.close();
    }
}