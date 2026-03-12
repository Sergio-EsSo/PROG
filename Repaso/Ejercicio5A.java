package Repaso;

public class Ejercicio5A {

    public static void main(String[] args) {

        String caden1 = "Hola, soy de Cantabria";
        String caden2 = "Pero necesito cuarenta pesetas";

        String caden3 = mezclar(caden1, caden2);
        System.out.println(caden1);
        System.out.println(caden2);
        System.out.println("---------------");
        System.out.println(caden3);        
    }

    public static String mezclar(String ca1, String ca2){
        StringBuilder sb = new StringBuilder();

        int largo = Math.max(ca1.length(), ca2.length());

        for(int i=0; i<largo; i++){
            if(i<ca1.length()) sb.append(ca1.charAt(i));
            if(i<ca2.length()) sb.append(ca2.charAt(i));
        }
        return sb.toString();
    }
}