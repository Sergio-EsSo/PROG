package Ejercicios;

public class ProblemaResuelto {

    public static boolean esCapicua(int dato) {
        String derecho = String.valueOf(dato);
        String reves = new StringBuilder(derecho).reverse().toString();

        if(derecho.equals(reves)) return true;
        else return false;
    }

    public static void main(String[] args) {
        
        System.out.println("303 es capicua? "+esCapicua(303));
    }
}
