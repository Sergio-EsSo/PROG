package listas;

import java.util.HashMap;
import java.util.Random;
import java.util.Objects;

public class Ecologico implements Comparable<Ecologico> {

    public static HashMap<String, Float> productosEco = new HashMap<String, Float>();

    static String[] productos = {"avena", "garbanzos", "tomate", "jengibre", "quinoa", "guisantes"};
    
    public static void precios(){
        productosEco.put("avena", 2.21f);
        productosEco.put("garbanzos", 2.39f);
        productosEco.put("tomate", 1.59f);
        productosEco.put("jengibre", 3.13f);
        productosEco.put("quinoa", 4.5f);
        productosEco.put("guisantes", 1.6f);
    }
    String producto;
    int cantidad;

    Ecologico(){
        Random r = new Random();
        this.producto = productos[r.nextInt(6)];
    }
    Ecologico(String producto){
        this.producto = producto;
    }
    Ecologico(String producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }
    public String getProducto() {
        return this.producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    @Override
    public int hashCode() {
        return Objects.hash(cantidad, producto);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ecologico other = (Ecologico) obj;
        if (producto == null) {
            if (other.producto != null)
                return false;
        } else if (!producto.equals(other.producto))
            return false;
        return true;
    }
    @Override
    public int compareTo(Ecologico o){
        return this.getProducto().compareTo(o.getProducto());
    }
}