package listas;

import java.util.Random;

public class Eurocoin {

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
        return valor+", "+lado;
    }

}
