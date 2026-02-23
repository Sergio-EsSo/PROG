package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Ejercicio7 {

    /*La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa un botón siguiendo la siguiente pauta: 
    o bien coincide el valor con la moneda anteriormente generada 
    - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros 
    - o bien coincide la posición – cara o cruz. 
    Simula, mediante un programa, la generación de 6 monedas aleatorias siguiendo la pauta correcta. 
    Cada moneda generada debe ser una instancia de la clase Moneda y la secuencia se debe ir almacenando en una lista.
     */

    public static void main(String[] args) {
        //se crean las monedas
        Eurocoin.cargarContar();
        List<Eurocoin> monedas = new ArrayList<>();
        
        for(int i=0; i<6; i++){
            Eurocoin euro = new Eurocoin();
            System.out.println(euro);
            monedas.add(euro);
        }
        //ORDEÑAMIENTO
        Collections.sort(monedas);
        System.out.println("\nordenado");
        monedas.forEach(coin -> System.out.println(coin));

        float total=0f;
        //y cuanta pasta hay en la coleccion de monedas
        for(int i=0; i<6; i++){ //con un foreach también sirve
            Eurocoin euro = monedas.get(i); //y te ahorras esto
            //System.out.println(euro); //se ahorra esto o se duplica la impresión
            total+= Eurocoin.contar.get(euro.getValor());
        }
        System.out.println("\ntotal dinero: "+total);
    }
}