/*
 * Clase principal que inicia la aplicación de gestión de amigos.
 */
package appamigos;

import appamigos.models.Aplicacion;
import appamigos.views.ventanaPrincipal;

/**
 * Clase principal que ejecuta la aplicación de gestión de amigos.
 * Se encarga de inicializar la lógica de la aplicación y mostrar la ventana principal.
 * 
 * @author Jj & Js
 */
public class AppAmigos {

    /**
     * Método principal que inicia la ejecución del programa.
     * 
     * @param args Argumentos de línea de comandos (no utilizados en esta aplicación).
     */
    public static void main(String[] args) {
        // Crear una instancia de la aplicación que maneja los datos de los amigos
        Aplicacion app = new Aplicacion();
        
        // Crear e iniciar la ventana principal de la aplicación
        ventanaPrincipal ventana = new ventanaPrincipal();
        ventana.setVisible(true);
    }
}
