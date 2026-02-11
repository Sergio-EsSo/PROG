package Ejercicios;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public class CartaBaraja implements Comparable<CartaBaraja> {

	public static HashMap<valores, Integer> puntos = new HashMap<>();

	static{	
		puntos.put(valores.DOS, 0);
		puntos.put(valores.TRES, 10);
		puntos.put(valores.CUATRO, 0);
		puntos.put(valores.CINCO, 0);
		puntos.put(valores.SEIS, 0);
		puntos.put(valores.SIETE, 0);
		puntos.put(valores.SOTA, 2);
		puntos.put(valores.CABALLO, 3);
		puntos.put(valores.REY, 4);
		puntos.put(valores.AS, 11);
	}

	enum valores{
		AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY
	}
	enum palos{
		COPAS, ESPADAS, BASTOS, OROS
	}
	//atributos
	valores valor;
	palos palo;
	//constructor
	public CartaBaraja(){
		Random random = new Random();
		valor = valores.values()[random.nextInt(valores.values().length)];
		palo = palos.values()[random.nextInt(palos.values().length)];
	}
	@Override
	public int compareTo(CartaBaraja otra) {
	    // Comparamos los palos según su orden en el Enum (COPAS=0, ESPADAS=1, etc.)
	    if (this.palo != otra.palo) {
	        return Integer.compare(this.palo.ordinal(), otra.palo.ordinal());
	    }
	    // Si el palo es el mismo, comparamos el orden de los valores
	    return Integer.compare(this.palo.ordinal(), otra.palo.ordinal());
	}
	@Override
	public int hashCode() {
		return Objects.hash(palo, valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartaBaraja otra = (CartaBaraja) obj;
		return Objects.equals(palo, otra.palo) && Objects.equals(valor, otra.valor);
	}
	public valores getValor() {
		return valor;
	}
	public palos getPalo() {
		return palo;
	}
	@Override
	public String toString() {
		// Esto es lo que Java usará cuando hagas System.out.println(carta)
		return this.valor + " de " + this.palo;
	}
}