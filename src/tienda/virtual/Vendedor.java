/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.virtual;

import java.util.ArrayList;

/**
 *
 * @author CLARA
 */
public class Vendedor extends Usuario{
    private double ValorExtra;
    private double Ganancia;
    private boolean Membrecia;
    private double valorR; // por insatisfaccion.

    public Vendedor(double ValorExtra, double Ganancia, boolean Membrecia, double valorR, ArrayList<CarritoDeCompras> Factura, int numero, String Nick, String Pass) {
        super(Factura, numero, Nick, Pass);
        this.ValorExtra = ValorExtra;
        this.Ganancia = Ganancia;
        this.Membrecia = Membrecia;
        this.valorR = valorR;
    }
    
    
}
