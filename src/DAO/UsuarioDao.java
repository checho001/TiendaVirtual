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
import javax.swing.JOptionPane;
import tienda.virtual.Usuario;

/**
 *
 * @author CLARA
 */

import java.util.Scanner;
import javax.swing.JOptionPane;
import tienda.virtual.Vendedor;
import tienda.virtual.Usuario;
public class UsuarioDao {
    File file = new File("USUARIO.txt");
    public Usuario recibirdatosusuario()throws FileNotFoundException{
     String nick = JOptionPane.showInputDialog(null, "Nick");
     Usuario usuario1 = new Usuario();
     usuario1.setNick(nick);
    String pass = JOptionPane.showInputDialog(null, "Pass");
    usuario1.setPass(pass);
    return usuario1;
    }
    public void guardarusuario(Usuario usuario)throws FileNotFoundException{
    PrintWriter pu = new PrintWriter(new FileOutputStream(this.file,true));
    pu.write(usuario.getNick());
    pu.write(usuario.getPass());
    pu.flush();
    pu.close();
    }
    /* public void buscarvendedor(int membrecia)throws FileNotFoundException{
    Scanner su = new Scanner(this.file);
   while(su.hasNextInt()){
      int a = su.nextInt();
       if(a == membrecia){
           Vendedor v = new Vendedor();
           String nick = su.next();
           String pass=su.next();
           su.
       }
   }
    }*/
    
    
}
