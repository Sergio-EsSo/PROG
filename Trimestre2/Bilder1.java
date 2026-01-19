package Trimestre2;

public class Bilder1 {

    public static void main(String[] args) {

        StringBuffer nombre = new StringBuffer("Renso");
        StringBuffer apellidos = new StringBuffer(80);
        //StringBuffer direccion = new StringBuffer();

        System.out.println(nombre.length());
        System.out.println(nombre.capacity());

        System.out.println(apellidos.length());
        System.out.println(apellidos.capacity());

        String otrosapellidos = new String(" Moreno Pérez ");
        //añade al string bilder nombre la cadena otrosapellidos
        nombre.append(otrosapellidos);
        nombre.append(" porque no saben preonunsiar el peruano");

        System.out.println(nombre);

        nombre.reverse(); //se le da la vuelta

        nombre.toString();

        String experimento_finalizado = nombre.toString();

        System.out.println(experimento_finalizado);

    }
}