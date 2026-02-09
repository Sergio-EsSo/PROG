package Ejercicios;

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
    public String getValor(){return this.valor;}
    public void setValor(String val){this.valor = val;}
    public String getPalo(){return this.palo;}
    public void setPalo(String pal){this.palo = pal;}
    @Override
    public String toString(){return this.valor+" de "+this.palo;}
    @Override
    public int compareTo(Carta o){
        Carta c = (Carta) o;
        return (this.getPalo()).compareTo(c.getPalo());
    }
}