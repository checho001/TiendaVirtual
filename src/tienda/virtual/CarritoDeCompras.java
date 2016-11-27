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
public class CarritoDeCompras {
    private int diafecha;
    private int Mesfecha;
    private ArrayList<Producto> Compras;
    private double CostoTotal;

    public CarritoDeCompras(int diafecha, int Mesfecha) {
        this.diafecha = diafecha;
        this.Mesfecha = Mesfecha;
        ArrayList<Producto> Compras = new ArrayList<>();
    }
    public void añadircompra(Producto p, int i){
        for(int j=0; i>j ; i--){
               if(i>p.getCantidad()){
                   throw new ArithmeticException("Numero Excedido ");
               }else{
                   this.Compras.add(p);
        p.setCantidad((p.getCantidad())-1);
        this.CostoTotal+=p.getPrecio();
               }
        }
    }
    public void RemoverProductos(Producto p,int i){
 for (Producto Compra : this.Compras) {
 if(p.getCodigo().equals(Compra.getCodigo())){
 if(i>Compra.getCantidad()){
throw new ArithmeticException("Numero Excedido ");
 }else{
 this.Compras.remove(Compra);
  this.CostoTotal -= i*Compra.getPrecio();
  p.setCantidad((p.getCantidad())+1);
                 }
             }
         }
     
     }

    public int getDiafecha() {
        return diafecha;
    }

    public void setDiafecha(int diafecha) {
        this.diafecha = diafecha;
    }

    public int getMesfecha() {
        return Mesfecha;
    }

    public void setMesfecha(int Mesfecha) {
        this.Mesfecha = Mesfecha;
    }

    public ArrayList<Producto> getCompras() {
        return Compras;
    }

    public void setCompras(ArrayList<Producto> Compras) {
        this.Compras = Compras;
    }

    public double getCostoTotal() {
        return CostoTotal;
    }

    public void setCostoTotal(double CostoTotal) {
        this.CostoTotal = CostoTotal;
    }

    
}
