package DVDteca;

import java.io.Serializable;
import java.util.Objects;

public class Disco implements Serializable, Comparable<Disco> {

	//para poder GUARDAR objetos, se implementa una interfaz llamada serializable
    //atributos
	private String codigo = "LIBRE";
	private String autor;
	private String titulo;
	private String genero;
	private int duracion; // duración total en minutos

	//constructor?????
    public Disco(String codigo, String autor, String titulo, String genero, int duracion){
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
    public Disco(String autor, String titulo, String genero, int duracion){
        //el código está a merced del destino
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
    public Disco(){}
	//get set
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		String cadena = "\n------------------------------------------";
		cadena += "\nCódigo: " + this.codigo;
		cadena += "\nAutor: " + this.autor;
		cadena += "\nTítulo: " + this.titulo;
		cadena += "\nGénero: " + this.genero;
		cadena += "\nDuración: " + this.duracion;
		cadena += "\n------------------------------------------";
		return cadena;
	}	
	//1. método equals: para que la arraylist sepa encontrar discos por código
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disco disco = (Disco) o;
        return Objects.equals(codigo, disco.codigo); // Si solo el código identifica al disco
    }
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	@Override
    public int compareTo(Disco otro) {
        return this.codigo.compareTo(otro.getCodigo());
    }
}