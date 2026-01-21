package ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class MergeSort2 {

    public static String[] mergeSort(String array[]){

        if(array.length > 1){
            int elements1 = array.length/2;
            int elements2 = array.length - elements1;

            String arr1[] = new String[elements1];
            String arr2[] = new String[elements2];

            for(int i=0; i<elements1; i++){
                arr1[i] = array[i];
            }
            for(int i=elements1; i<elements1+elements2; i++){
                arr2[i-elements1] = array[i];
            }
            //recursividad
            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);

            int i=0, j=0, k=0;
            while(arr1.length != j && arr2.length != k){

                if(arr1[j].compareTo(arr2[k]) <0){
                    array[i] = arr1[j];
                    i++;
                    j++;
                }
                else{
                    array[i] = arr2[k];
                    i++;
                    k++;
                }
            }

            while(arr1.length != j){
                array[i] = arr1[j];
                i++;
                j++;
            }
            while(arr2.length != k) {
                array[i] = arr2[k];
                i++;
                k++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
          
        String[] hombres = {
            "Adrián", "Agustín", "Alberto", "Alejandro", "Andrés",
            "Ángel", "Antonio", "Arturo", "Axel", "Brais", "Bruno", "Carlos",
            "Daniel", "Darío", "David", "Diego", "Dominic", "Dylan",
            "Eduardo", "Elías", "Emiliano", "Emilio", "Emmanuel", "Enrique", "Enzo", "Erik",
            "Facundo", "Federico", "Felipe", "Fernando", "Francisco", "Gabriel", "Gael",
            "Héctor", "Hugo", "Ignacio", "Iker", "Isaac", "Ismael", "Iván", "Jacobo",
            "Javier", "Jerónimo", "Jesús", "Joaquín", "Jorge", "José", "Kevin",
            "Lorenzo", "Lucas", "Luciano", "Luis", "Manuel", "Marco", "Marcos", "Mario",
            "Martín", "Mateo", "Miguel", "Nicolás", "Noé", "Oliver", "Oscar",
            "Pablo", "Patricio", "Pedro", "Raúl","Rodrigo", "Rubén",
            "Samuel", "Santiago", "Sebastián", "Sergio", "Simón"
        };
        String[] mujeres = {
            "Abigail", "Adriana", "Ainhoa", "Aitana", "Alba", "Alejandra",
            "Amalia", "Amanda", "Ana", "Andrea", "Antonia", "Araceli", "Ariadna",
            "Bárbara", "Beatriz", "Belén", "Berta", "Bianca", "Blanca", "Camila", "Carla", "Carmela", "Carmen",
            "Carolina", "Cecilia", "Celia", "Clara", "Claudia", "Constanza", "Cristina", "Daniela", "Delfina",
            "Diana", "Dolores", "Elena", "Elisa", "Elizabeth", "Eloísa", "Elsa", "Emilia", "Emma", "Estefanía",
            "Esther", "Eugenia", "Eva", "Fabiana", "Fátima",
            "Guadalupe", "Helena", "Inés", "Irene", "Isidora", "Ivana",
            "Josefina", "Juana", "Julia", "Julieta", "Laura", "Leonor", "Leticia", "Leyre", "Lola", "Lorena",
            "Lucía", "Luisa", "Luna", "Luz", "Magdalena", "Malena", "María",
            "Mariana", "Marina", "Mónica", "Natalia", "Nayara", "Nerea",
            "Noelia", "Noemí", "Nuria", "Olivia", "Patricia", "Pilar", "Raquel",
            "Rebeca", "Regina", "Renata", "Rocío", "Rosa", "Rosalía", "Sabrina", "Sandra",
            "Sara", "Silvia", "Sofía", "Sonia", "Susana", "Tania", "Teresa",
            "Verónica", "Victoria", "Virginia", "Ximena", "Yolanda", "Zoe"
        };
        // creamos array de 100 posiciones
        String mixedNames[] = new String[100];
        Random rand = new Random();
        // rellenamos los 100
        for(int i=0; i<mixedNames.length; i++){
            int genero = rand.nextInt(2); //decidimos si es hombre (0) o mujer (1)
            int indexName = rand.nextInt(33); //se elige un nombre al azar de la lista correspondiente
            if(genero == 0) mixedNames[i] = hombres[indexName];
            else mixedNames[i] = mujeres[indexName];
        }

        System.out.println(Arrays.toString(mixedNames));

        mixedNames = mergeSort(mixedNames);

        System.out.println(Arrays.toString(mixedNames));
    }
}