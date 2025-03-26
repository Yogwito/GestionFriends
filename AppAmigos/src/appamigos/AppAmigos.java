/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appamigos;

import appamigos.models.Aplicacion;
import appamigos.views.ventanaPrincipal;

/**
 *
 * @author Jj % Js
 */
public class AppAmigos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplicacion app = new Aplicacion();
        ventanaPrincipal ventana = new ventanaPrincipal();
        ventana.setVisible(true);
    }
    
}
