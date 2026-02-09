package Ejercicios;

import java.util.ArrayList;

public class JuegoDeCartas {

    public static void main(String[] args) {
        
        ArrayList<Carta> mano = new ArrayList<Carta>();

        for(int i=0; i<5; i++){
            Carta carta = new Carta();
            //System.out.println(carta);
            mano.add(carta);
        }

        mano.sort((o1, o2) -> o1.compareTo(o2));

        System.out.println("Mira tu mano: ");
        //System.out.println(mano);
        for(Carta carta : mano){
            System.out.println(carta);
        }
    }
}