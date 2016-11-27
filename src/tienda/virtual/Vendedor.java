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
    private String marca;
    private double valorR; // por insatisfaccion.

   /* public Vendedor(double ValorExtra, double Ganancia, boolean Membrecia, double valorR, ArrayList<CarritoDeCompras> Factura, int numero, String Nick, String Pass, String marca) {
        super(Factura, numero, Nick, Pass);
        this.ValorExtra = ValorExtra;
        this.Ganancia = Ganancia;
        this.Membrecia = Membrecia;
        this.valorR = valorR;
        this.marca= marca;
    }*/
    
    public void enviarpromocion(Usuario usuario){
        
    }

    public double getValorExtra() {
        return ValorExtra;
    }

    public void setValorExtra(double ValorExtra) {
        this.ValorExtra = ValorExtra;
    }

    public double getGanancia() {
        return Ganancia;
    }

    public void setGanancia(double Ganancia) {
        this.Ganancia = Ganancia;
    }

    public boolean isMembrecia() {
        return Membrecia;
    }

    public void setMembrecia(boolean Membrecia) {
        this.Membrecia = Membrecia;
    }

    public double getValorR() {
        return valorR;
    }

    public void setValorR(double valorR) {
        this.valorR = valorR;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    
}
