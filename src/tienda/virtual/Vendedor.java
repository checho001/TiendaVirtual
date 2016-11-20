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
    
    
    
    //getter && setter
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

    public ArrayList<CarritoDeCompras> getFactura() {
        return Factura;
    }

    public void setFactura(ArrayList<CarritoDeCompras> Factura) {
        this.Factura = Factura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNick() {
        return Nick;
    }

    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
    
    
}
