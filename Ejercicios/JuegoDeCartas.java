package Ejercicios;

import java.util.ArrayList;

public class JuegoDeCartas {

	public static void main(String[] args) {

		ArrayList<Carta> mano = new ArrayList<>();

		while(mano.size()<5) {
			Carta carta = new Carta();
			if (!mano.contains(carta)) {
				mano.add(carta);
			}
		}

		// ordena el arraylist con el metodo de comparacion declarado en carta
		mano.sort((cb1, cb2) -> cb1.compareTo(cb2));

		/*mano.sort((cb1, cb2) -> {
			int comPalo = (cb1.getPalo()).compareTo(cb2.getPalo());
			if (comPalo != 0) {
				return comPalo;
			}
			return (cb1.getValor().compareTo(cb2.getValor()));
		});*/

		// mano.sort(CartaBaraja::compareTo);

		System.out.println("Tu mano:");
		for (Carta carta : mano) {
			System.out.println(carta);
		}
	}
}