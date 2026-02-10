package Ejercicios;

import java.util.ArrayList;

public class JuegoBaraja {

    public static void main(String[] args) {

        ArrayList<Carta> mano = new ArrayList<Carta>();

        for(int i=0; i<5; i++){
            Carta carta = new Carta();
            if(!mano.contains(carta)){
                System.out.println(carta);
                mano.add(carta);
            }
        }

        mano.sort((cb1, cb2) ->  cb1.compareTo(cb2));

        System.out.println("Mira tu mano.......");
        for(Carta carta : mano){
            System.out.println(carta);
        }
    }
}