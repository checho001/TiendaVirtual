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
public class ProductoDao {
    File file = new File("PRODUCTO.txt");
    
    public void guardarusuario(Producto producto)throws FileNotFoundException{
    PrintWriter pp = new PrintWriter(new FileOutputStream(this.file,true));
    pp.write(producto.getCantidad());
    pp.write(producto.getCodigo());
    pp.write(producto.getMarca());
    pp.write(producto.getTipo());
    pp.flush();
    pp.close();
    }
     public void leerproductos()throws FileNotFoundException{
    Scanner sp = new Scanner(this.file);
   while(sp.hasNext()){
       
   }
    }
    
    
}
