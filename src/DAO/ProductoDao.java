/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import tienda.virtual.Producto;

/**
 *
 * @author CLARA
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import tienda.virtual.Producto;

public class ProductoDao {
    File file = new File("PRODUCTO.txt");
    
    public Producto recibirdatosproducto()throws FileNotFoundException{
     String cod = JOptionPane.showInputDialog(null, "Codigo");
     Producto producton = new Producto();
     producton.setCodigo(cod);
    int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad"));
    producton.setCantidadinicial(cantidad);
    producton.setCantidad(cantidad);
    String marca= JOptionPane.showInputDialog(null, "Marca");
    producton.setMarca(marca);
    String tipo= JOptionPane.showInputDialog(null, "Tipo");
    producton.setTipo(tipo);
    double precio= Double.parseDouble(JOptionPane.showInputDialog(null, "Codigo"));
    producton.setPrecio(precio);
    return producton;
    }
    public void guardarproducto(Producto producto)throws FileNotFoundException{
    PrintWriter pp = new PrintWriter(new FileOutputStream(this.file,true));
    pp.write(producto.getCantidad());
    pp.write(producto.getCodigo());
    pp.write(producto.getMarca());
    pp.write(producto.getTipo());
    int a = (int)Math.floor(producto.getPrecio());
    pp.write(a);
    pp.flush();
    pp.close();
    }
     public void leerproductos()throws FileNotFoundException{
    Scanner sp = new Scanner(this.file);
   while(sp.hasNext()){
       
   }
    }
    
    
}
