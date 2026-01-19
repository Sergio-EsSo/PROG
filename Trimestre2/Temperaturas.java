package Trimestre2;
import java.util.Arrays;
import java.util.Scanner;

public class Temperaturas {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //declara
        int[] temperaturas1;
        //inicializa
        temperaturas1 = new int[10];

        System.out.println(Arrays.toString(temperaturas1));

        for(int i=0; i<temperaturas1.length; i++){
            System.out.println("Dame un entero para el índice: "+i);
            temperaturas1[i]=Integer.parseInt(sc.nextLine());
        }

        System.out.println(Arrays.toString(temperaturas1));
        //1. Clonación: crea un objeto NUEVO en una dirección de memoria DISTINTA
        int[] temperaturas2 = (int[]) temperaturas1.clone();
        //2. Referencia: Ambas variables apuntan al MISMO objeto en memoria
        int[] temperaturas3 = temperaturas1;
        //Comparación entre t1 y t2 (Clon)
        if(temperaturas1.equals(temperaturas2)) System.out.println("temperaturas1 == temperaturas2");
        else System.out.println("temperaturas1 != temperaturas2");
        //Comparación entre t1 y t3 (Referencia)
        if(temperaturas1.equals(temperaturas3)) System.out.println("temperatura1 == temperatura3");
        else System.out.println("temperatura1 != temperatura3");

        System.out.println("tem1");
        System.out.println(Arrays.toString(temperaturas1));
        System.out.println("tem2");
        System.out.println(Arrays.toString(temperaturas2));
        System.out.println("tem3");
        System.out.println(Arrays.toString(temperaturas3));

        sc.close();
    }
}
