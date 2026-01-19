package Trimestre2;

public class Bilder2 {

    public static void main(String[] args) {
        
        StringBuffer nombre = new StringBuffer("EMMA");
        String apellidos = new String(" MORENO");

        nombre.insert(nombre.length(), apellidos);
        System.out.println(nombre);

        StringBuffer nombre2 = new StringBuffer("RAUL JESUS TURRION");
        nombre2 = nombre2.delete(4, 10); //borrar del [4,10)
        System.out.println(nombre2);

        StringBuffer nombre3 = new StringBuffer("RAUL JESUS TURRION");
        String turri = nombre3.substring(0, 4)+nombre3.substring(10);
        System.out.println("y sale: "+turri);

        StringBuffer nombre4 = new StringBuffer("TURRION");
        nombre4.append(0);
    }
}
