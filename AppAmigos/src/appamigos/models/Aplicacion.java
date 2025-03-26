/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appamigos.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jj & Js
 */
public class Aplicacion {
    private List<Amigo> amigos;

    public Aplicacion() {
        this.amigos = new ArrayList<>();
    }

    public boolean agregarAmigo(Amigo amigo) throws Exception {
        // Validate empty fields
        if (amigo.getNombre().isEmpty() || amigo.getTelefono().isEmpty() || amigo.getCorreoElectronico().isEmpty()) {
            throw new Exception("❌ All fields are required.");
        }

        // Validate email
        if (!amigo.getCorreoElectronico().contains("@")) {
            throw new Exception("❌ Invalid email format. Must contain '@'.");
        }

        // Validate phone number
        if (!amigo.getTelefono().startsWith("606") && !amigo.getTelefono().startsWith("30")) {
            throw new Exception("❌ Invalid phone number. Must start with '606' or '30'.");
        }

        // Check for duplicate
        for (Amigo a : amigos) {
            if (a.getCorreoElectronico().equals(amigo.getCorreoElectronico())) {
                throw new Exception("❌ A friend with this email already exists.");
            }
        }

        // Add the friend
        amigos.add(amigo);
        return true;
    }

    public Amigo buscarAmigo(String correoElectronico) throws Exception {
        for (Amigo amigo : amigos) {
            if (amigo.getCorreoElectronico().equals(correoElectronico)) {
                return amigo;
            }
        }
        throw new Exception("❌ Friend not found.");
    }

    public void mostrarAcercaDe() {
        System.out.println("Contact Manager App");
        System.out.println("Subject: Programming Fundamentals");
        System.out.println("University: UAM");
        System.out.println("Developed by: [Your Name]");
    }
    
    public void mostrarContactos() {
        if (amigos.isEmpty()) {
            System.out.println("No hay contactos registrados.");
            return;
        }
        System.out.println("Lista de contactos:");
        for (int i = 0; i < amigos.size(); i++) {
            Amigo amigo = amigos.get(i);
            System.out.println("Nombre: " + amigo.getNombre() + 
                               " | Teléfono: " + amigo.getTelefono() + 
                               " | Correo: " + amigo.getCorreoElectronico());
        }
    }
    
    public List<Amigo> getAmigos() {
        return amigos;
    }


    
    
}
