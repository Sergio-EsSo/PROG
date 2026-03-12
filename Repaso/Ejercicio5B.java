package Repaso;

public class Ejercicio5B {

    public static void main(String[] args) {

        String cadena = "Como los platanos azules ojo piojo clase de 2022";
        String[] partida = cadena.split("[ ]");
        //System.out.println(cadena);
        for(String s: partida)
            System.out.print(s+" ");
        System.out.println("\nTiene "+partida.length+" palabras");
        for(int i=partida.length; i>0; i--){
            System.out.print(partida[i-1]+" ");
        }        
    }
}