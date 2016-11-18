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
    
    private String Fecha;
    private ArrayList<Producto> Compras;
    private double CostoTotal;

    public void AgregarProducto(Producto producto,int i){
        
        this.Compras.add(producto);
        this.CostoTotal += i*producto.getCosto();
    }
    
    public void RemoverProductos(Producto p,int i){
        for (Producto Compra : this.Compras) {
            if(p.getNombre().equals(Compra.getNombre())){
                if(i>Compra.getCantidad()){
                    throw new ArithmeticException("Numero Excedido ");
                }else{
                    Producto a = new Producto(Compra.getCodigo(), Compra.getCantidad()-i, Compra.getMarca(), Compra.getTipo(), Compra.getNombre(), Compra.getCosto());
                    this.Compras.remove(Compra);
                    this.Compras.add(a);
                    this.CostoTotal -= i*a.getCosto();
                }
            }
        }
    
    }
}
