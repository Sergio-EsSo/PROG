package Trimestre2;

public class Ejercicio4A {

    public static void main(String[] args) {
        
        int[] precipitaciones = new int[12];

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        System.out.println(meses[8]);
        for(int i=0; i<precipitaciones.length; i++){
            precipitaciones[i]=i*100;
        }

    }
}
