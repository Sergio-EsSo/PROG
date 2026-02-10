package Ejercicios;

import java.util.Objects;
import java.util.Random;

public class CartaBaraja implements Comparable<CartaBaraja> {

	enum valores{
		AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY
	}
	enum palos{
		COPAS, ESPADAS, BASTOS, OROS
	}
	//atributos
	String valor;
	String palo;
	//constructor
	CartaBaraja(){
		Random random = new Random();
		valores[] arrayValores = valores.values(); 
		palos[] arrayPalos = palos.values();
		valor = arrayValores[random.nextInt(arrayValores.length)].name();
		palo = arrayPalos[random.nextInt(arrayPalos.length)].name();
	}
	@Override
	public int compareTo(CartaBaraja otra) {
	    // Comparamos los palos según su orden en el Enum (COPAS=0, ESPADAS=1, etc.)
	    int pEste = palos.valueOf(this.palo).ordinal();
	    int pOtro = palos.valueOf(otra.palo).ordinal();
	    if (pEste != pOtro) {
	        return Integer.compare(pEste, pOtro);
	    }
	    // Si el palo es el mismo, comparamos el orden de los valores
	    int vEste = valores.valueOf(this.valor).ordinal();
	    int vOtro = valores.valueOf(otra.valor).ordinal();
	    return Integer.compare(vEste, vOtro);
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
	public String getValor() {
		return valor;
	}
	public String getPalo() {
		return palo;
	}
}