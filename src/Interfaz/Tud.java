/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tud;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DELMIA
 */
public class Tud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("Penguins.jpg");
        frame.setIconImage(icon);
        JPanel panel = new JPanel();
                frame.getContentPane();
                panel.setBackground(Color.GREEN);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 120);
                Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                frame.setTitle("A Frame");
                frame.setVisible(true);
                frame.setLayout(new FlowLayout());
                JButton button1 = new JButton();
                button1.setText("A");
                button1.setBackground(Color.RED);
                frame.add(button1);
                
                JButton button2 = new JButton();
                button2.setText("B");
                button2.setBackground(Color.BLUE);
                frame.add(button2);
                        
                JLabel label=new JLabel("Type");
                JTextField field = new JTextField(5);
                frame.add(label);
                frame.add(field);
                //frame.pack();
        button1.addActionListener(new NewClass());
    }
    
}
