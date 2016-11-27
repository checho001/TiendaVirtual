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
private HashMap<Integer,Vendedor> Vendedor;
  private  HashMap<Integer,Usuario> Usuarios;
  private ArrayList<Producto> Productos;

    public TiendaVirtual() {
        HashMap<TreeMap<String,String>,Producto> CarritodeCompras= new HashMap<>();
    }
 public void RegistrarUsuario(Usuario usuario){
  
  }
  public void RegistrarProducto(Producto producto){
  
  }
      public double CalcularGananciasV(int membrecia, int diainicial, int mesinicial, int diafinal, int mesfinal){
     String marca = Vendedor.get(membrecia).getMarca();
     double ganancia=0;
     for(Usuario s: this.Usuarios.values() ){
         for(CarritoDeCompras cd: s.getFactura() ){
         if(cd.getMesfecha()>=mesinicial && cd.getMesfecha()<=mesfinal){
             if(cd.getDiafecha()>=diainicial && cd.getDiafecha()<=diafinal){
              for(Producto ps : cd.getCompras()){
                if(ps.getMarca().equals(marca)){
                   ganancia+= ps.getPrecio();
                }
               }
              }
             }
            }
           } return ganancia;
      }
      public ArrayList<Producto> ListarProductosv(int membrecia, int diainicial, int mesinicial, int diafinal, int mesfinal){
     String marca = Vendedor.get(membrecia).getMarca();
     ArrayList <Producto>p=new ArrayList<>();
     for(Usuario s: this.Usuarios.values() ){
         for(CarritoDeCompras cd: s.getFactura() ){
         if(cd.getMesfecha()>=mesinicial && cd.getMesfecha()<=mesfinal){
             if(cd.getDiafecha()>=diainicial && cd.getDiafecha()<=diafinal){
              for(Producto ps : cd.getCompras()){
                if(ps.getMarca().equals(marca)){
                  p.add(ps);
                }
               }
              }
             }
            }
           } return p;
      }
      public TreeMap <Integer ,Usuario> ClientesEspeciales(int membrecia){
     String marca = Vendedor.get(membrecia).getMarca();
     TreeMap <Integer ,Usuario>us=new TreeMap<>();
     int count=0;
     for(Usuario s: this.Usuarios.values() ){
         for(CarritoDeCompras cd: s.getFactura() ){
              for(Producto ps : cd.getCompras()){
                if(ps.getMarca().equals(marca)){
                   count++;
              }
                if(count!=0){
                    us.put(count, s);
                }
             }
            }
           }return us;
      }
public ArrayList<Producto> FiltroListarproductos (String filtro, Double precio){
    ArrayList<Producto> ps=new ArrayList<>();
    for(Producto p: this.Productos){
        if(filtro!=null){
       if(p.getCodigo().equals(filtro) || p.getMarca().equals(filtro) || p.getTipo().equals(filtro)){
           ps.add(p);
       }
        }
         if(precio!=null){
       if(p.getPrecio()>=(precio*(1.3)) && p.getPrecio()<=(precio*(0.7))){
           ps.add(p);
       }
        }
    }return ps;
}
public void añadircantidadproducto(String codigo, int cantidad){
    for(Producto p: this.Productos){
        if(p.getCodigo().equals(codigo)){
            p.setCantidadinicial(cantidad);
            p.setCantidad(cantidad);
        }
    }
}
public void ProductosmasVendidos(){
    TreeMap<Integer,Producto> pmv=new TreeMap<>();
    for(Producto p:this.Productos){
       int a = p.getCantidad()-p.getCantidadinicial();
       pmv.put(a, p);
    }
}
}

      
  

