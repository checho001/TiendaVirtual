/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import gestionarchivos.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELMIA
 */
public class USUARIODAO {
    
    private File archivo;

    public USUARIODAO(File archivo) {
        this.archivo = archivo;
    }
    
    public boolean guardar(Usuario usuario) throws FileNotFoundException{
        
        PrintWriter pw = new PrintWriter(new FileOutputStream(this.archivo,true));
        pw.write(usuario.getNombre()+",");
        pw.write(usuario.getNick()+",");
        pw.write(usuario.getEdad()+",");
        pw.write(usuario.getCorreo()+",");
        pw.write(usuario.getClave()+"\n");
        pw.flush();
        pw.close();
        return true;
    }
    public ArrayList<Usuario>listartodo() throws FileNotFoundException{
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Scanner l=new Scanner(this.archivo);
        l.useDelimiter(",");
        while(l.hasNext()){
             Usuario usuario=new Usuario();
        usuario.setNombre(l.next());
         usuario.setNick(l.next());
         usuario.setEdad(Integer.parseInt(l.next()));
         usuario.setCorreo(l.next());
        usuario.setClave(l.next()); 
        usuarios.add(usuario);
        }
        return usuarios;
    }
}
