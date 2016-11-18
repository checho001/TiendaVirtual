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
    private ArrayList<Integer> CalificacionPonderada;
    private double CalificacionTotal;

    public Producto(int Codigo, int Cantidad, String Marca, String tipo) {
        this.Codigo = Codigo;
        this.Cantidad = Cantidad;
        this.Marca = Marca;
        this.tipo = tipo;
    }
    
    
}
