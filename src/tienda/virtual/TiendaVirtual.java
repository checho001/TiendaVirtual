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
public class TiendaVirtual {

  public HashMap<Integer,Usuario> Usuarios;
  public HashMap<Integer,Producto> Productos;
  public int contadorP;
  public int contadorU;
  
  
  public void RegistrarUsuario(Usuario usuario){
      this.Usuarios.put(this.contadorU, usuario);
      this.contadorU++;
  }
  public void RegistrarProducto(Producto producto){
      this.Productos.put(contadorP, producto);
      contadorP++;
  }
  
}
