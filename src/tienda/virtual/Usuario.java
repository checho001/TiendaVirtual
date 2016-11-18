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
public class Usuario {
    
    protected ArrayList<CarritoDeCompras> Factura;
    protected int numero;
    protected String Nick;
    protected String Pass;

    public Usuario(ArrayList<CarritoDeCompras> Factura, int numero, String Nick, String Pass) {
        this.Factura = Factura;
        this.numero = numero;
        this.Nick = Nick;
        this.Pass = Pass;
    }
    
    
    
    public void Comprar(){}

    public void ClasificacionProductos(){}
}
