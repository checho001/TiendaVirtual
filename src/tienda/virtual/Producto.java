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
    private int Codigo;
    private int Cantidad;
    private String Marca;
    private String tipo;
    private String nombre;
    private double Costo;
    private ArrayList<Integer> CalificacionPonderada;
    private double CalificacionTotal;

    public Producto(int Codigo, int Cantidad, String Marca, String tipo, String nombre, double Costo) {
        this.Codigo = Codigo;
        this.Cantidad = Cantidad;
        this.Marca = Marca;
        this.tipo = tipo;
        this.nombre = nombre;
        this.Costo = Costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    
   
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
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

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }
    
    
}
