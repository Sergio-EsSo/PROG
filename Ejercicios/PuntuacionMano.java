package Ejercicios;

import java.util.ArrayList;

public interface PuntuacionMano {

    /*Escribe un programa que genere una secuencia de 5 cartas de la bajara sepañola y que sume los puntos segun
    el juego de la brisca. El valor de las cartas se debe guardar en una serie estructura HashMap que debe contener parejas.
    La secuencia de cartas debe ser una estructura de la clase ArrayList que contiene objetos de la clase carta. */

    public static void main(String[] args) {

        ArrayList<CartaBaraja> mano = new ArrayList<>();

		while(mano.size()<5) {
			CartaBaraja carta = new CartaBaraja();
			if (!mano.contains(carta)) {
				mano.add(carta);
			}
		}

        mano.sort((o1,o2) -> o1.compareTo(o2));

        System.out.println("puntúa tu mano.....");
        //System.out.println(mano);

        int total=0;
        for(CartaBaraja carta : mano){
            System.out.println(carta);
            total+= CartaBaraja.puntos.getOrDefault(carta.getValor(), 0);
        }
        System.out.println("Tienes "+total+" puntos");
    }
}