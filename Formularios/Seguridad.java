/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Seguridad {
    Login L = new Login();
    Menu M = new Menu();
    Olvido O = new Olvido();

    String mensa;
    
        public void ValidarUsuario(String usuarios[], String user, String pwd, int intentos){
      boolean encontrado = false;
      try{
                for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equalsIgnoreCase(user)&& usuarios[i+1].equals(pwd)) {
                
                mensa = "Bienbenido " + user;
                encontrado = true;
                M.setVisible(true);
                L.setVisible(false);
                   
                JOptionPane.showMessageDialog(null, mensa, "Inicio de Sección",JOptionPane.INFORMATION_MESSAGE);
                intentos = 0;
             // L.setIntentos(intentos);
             
                break;
          } 
        } if (encontrado == false) {
            mensa = "Clave y/o usuarios erroneos van " + intentos + " intentos fallidos";
            JOptionPane.showMessageDialog(null, mensa, "Inicio de Sección",JOptionPane.ERROR_MESSAGE);
        }
        if(intentos > 2){
               JOptionPane.showMessageDialog(null, "Tres intentos fallidos, esto se cerrara", "Inicio de Sección",JOptionPane.ERROR_MESSAGE);
               System.exit(0);
        }
                }catch(Exception ex){
                  mensa = "Clave y/o usuarios erroneos van " + intentos + " intentos fallidos";
           JOptionPane.showMessageDialog(null, mensa, "Inicio de Sección",JOptionPane.ERROR_MESSAGE);
      }
    }
        
            public void Registrar(String usuario, String pwd, String email){
        try{
            FileWriter fw = new FileWriter("Datos.txt");
            BufferedWriter bfw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bfw);
            
            pw.println(usuario);
            pw.println(pwd);
            pw.println(email);
            pw.close();
            
        }catch(Exception e){
            JOptionPane.showInputDialog(null,e);
        }
    }
            
            public void RecuperarUsuario(String usuarios[],String email, String user, String pwd, int intentos){
      boolean encontrado = false;
      try{
                for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equalsIgnoreCase(email)&& usuarios[i+1].equals(user) && usuarios[i+1].equals(pwd)) {
                
                mensa = "Bienbenido " + user;
               // M.setVisible(true);
                //L.setVisible(false);
//                Menu m = new Menu();
//                m.setVisible(true);
                
                encontrado = true;
                JOptionPane.showMessageDialog(null, mensa, "Inicio de Sección",JOptionPane.INFORMATION_MESSAGE);
                intentos = 0;
            //    L.setIntentos(intentos);
                break;
            } 
                
  
        } if (encontrado == false) {
            mensa = "Clave y/o usuarios erroneos van " + intentos + " intentos fallidos";
            
            JOptionPane.showMessageDialog(null, mensa, "Inicio de Sección",JOptionPane.ERROR_MESSAGE);
        }
        if(intentos > 2){
               JOptionPane.showMessageDialog(null, "Tres intentos fallidos, esto se cerrara", "Inicio de Sección",JOptionPane.ERROR_MESSAGE);
               System.exit(0);
        }
        
              }catch(Exception ex){
                  mensa = "Clave y/o usuarios erroneos van " + intentos + " intentos fallidos";
           JOptionPane.showMessageDialog(null, mensa, "Inicio de Sección",JOptionPane.ERROR_MESSAGE);
      }
    }
}
