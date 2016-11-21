/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DAO.USUARIODAO;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author DELMIA
 */
public class Vista {
    private USUARIODAO dao;

    public Vista(USUARIODAO dao) {
        this.dao = new USUARIODAO(new File("usuario.txt"));
    }
    
    public void memu(){
        String opcion =JOptionPane.showInputDialog(null, "1. crear. 2.listas");
        if(opcion.equals("1")){
            String nombre = JOptionPane.showInputDialog(null, "nombre");
            String nick = JOptionPane.showInputDialog(null, "nombre");
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "nombre"));
            String correo = JOptionPane.showInputDialog(null, "nombre");
            String clave = JOptionPane.showInputDialog(null, "nombre");
            Usua
        }else if(opcion.equals("2")){
            
        }
    }
    
}
