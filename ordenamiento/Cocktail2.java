package ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class Cocktail2 {

    public static void main(String[] args) {
        
        float[] notas = new float[100]; //se declara el array de tantas posiciones (100)
        Random random = new Random();

        for(int i=0; i<notas.length; i++){ //nextFloat() genera entre 0.0 y 1.0, multiplicamos por 10 para que sea de 0.0 a 10.0
            notas[i] = random.nextFloat()*10;
        }
        
        System.out.println("--- Desordenadiño ---");
        System.out.println(Arrays.toString(notas));

        notas = cocktail(notas);

        System.out.println("--- Ordenadiño ---");
        System.out.println(Arrays.toString(notas));

    }

    public static float[] cocktail(float[] numbers) {
        
        boolean swapped = true;
        int i=0, j=numbers.length-1;
        while(i<j && swapped){
            swapped = false;
            for(int k=i; k<j; k++){
                if(numbers[k] > numbers[k+1]){
                    float temp = numbers[k];
                    numbers[k] = numbers[k+1];
                    numbers[k+1] = temp;
                    swapped = true;
                }
            }
            j--;
            if(swapped){
                swapped = false;
                for(int k=j; k>i; k--){
                    if(numbers[k] < numbers[k-1]){
                        float temp = numbers[k];
                        numbers[k] = numbers[k-1];
                        numbers[k-1] = temp;
                        swapped = true;
                    }
                }
            }
            i++;
        }
        return numbers;
    }
}
