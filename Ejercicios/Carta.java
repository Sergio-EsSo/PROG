package Ejercicios;

import java.util.Objects;
import java.util.Random;

public class Carta implements Comparable<Carta>{

    enum valores{
        AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY           
    }
    enum palos{
        OROS, COPAS, ESPADAS, BASTOS
    }
    //atributos
    String valor;
    String palo;
    //constructor
    Carta(){
        Random rn = new Random();

        valores[] ArrayValores = valores.values();
        palos[] ArrayPalos = palos.values();

        this.valor = ArrayValores[rn.nextInt(ArrayValores.length)].name();
        this.palo = ArrayPalos[rn.nextInt(ArrayPalos.length)].name();
    }
    public String getValor(){
        return this.valor;
    }
    public String getPalo(){
        return this.palo;
    }
    @Override
    public String toString(){
        return this.valor+" de "+this.palo;
    }
    @Override
    public int compareTo(Carta otra){
        int comparacionPalo = (this.palo).compareTo(otra.palo);
        if(comparacionPalo!=0) return comparacionPalo;
        return this.valor.compareTo(otra.valor);
    }
    @Override
    public int hashCode(){
        return Objects.hash(palo, valor);
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null) return false;
        if(getClass()!=obj.getClass()) return false;
        Carta otra = (Carta) obj;
        return Objects.equals(palo, otra.palo) && Objects.equals(valor, otra.valor);
    }
}