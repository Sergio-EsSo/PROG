package listas;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Eurocoin implements Comparable<Eurocoin> {

    String[] valores = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "20 céntimos", "50 céntimos", "1 euro", "2 euros"};
    String[] lados = {"cara", "cruz"};

    String valor;
    String lado;

    Eurocoin(){
        Random rn = new Random();
        this.valor = valores[rn.nextInt(8)];
        this.lado = lados[rn.nextInt(2)];
    }
    public String getValor(){
        return valor;
    }
    public void setValor(String valor){
        this.valor = valor;
    }
    public String getLado(){
        return lado;
    }
    public void setLado(String lado){
        this.lado = lado;
    }
    @Override
    public String toString(){
        return valor+" - "+lado;
    }
    @Override
    public int hashCode(){
        return Objects.hash(lado, valor);
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null) return false;
        if(getClass() != obj.getClass()) return false;
        Eurocoin other = (Eurocoin) obj;
        return Objects.equals(lado, other.lado) && Objects.equals(valor, other.valor);
    }
    @Override
    public int compareTo(Eurocoin o){
        int miPosicion = Arrays.asList(valores).indexOf(this.valor);
        int suPosicion = Arrays.asList(valores).indexOf(o.valor);

        if(miPosicion != suPosicion)
            return Integer.compare(miPosicion, suPosicion);
        else //si el valor es igual, comparamos el lado (cara/cruz)
            return this.lado.compareTo(o.getLado());
    }
}