/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.virtual;

import java.util.*;

/**
 *
 * @author CLARA
 */
public class Producto {
   private String Codigo;
    private int Cantidad;
    private String Marca;
    private String tipo;
    private double Precio;
    private ArrayList<Integer> CalificacionPonderada;
    private double CalificacionTotal;

    
    /*public Producto(int Codigo, int Cantidad, String Marca, String tipo) {
        this.Codigo = Codigo;
        this.Cantidad = Cantidad;
        this.Marca = Marca;
        this.tipo = tipo;
    }*/

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Integer> getCalificacionPonderada() {
        return CalificacionPonderada;
    }

    public void setCalificacionPonderada(ArrayList<Integer> CalificacionPonderada) {
        this.CalificacionPonderada = CalificacionPonderada;
    }

    public double getCalificacionTotal() {
        return CalificacionTotal;
    }

    public void setCalificacionTotal(double CalificacionTotal) {
        this.CalificacionTotal = CalificacionTotal;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    
    
}
