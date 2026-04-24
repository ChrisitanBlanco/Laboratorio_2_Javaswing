/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Chriss
 */

public class Persona {

    private String userName;
    private String correo;
    private String contrasena;
    private String rol; 

    public Persona(String userName, String correo, String contrasena, String rol) {
        this.userName = userName;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rol = rol;
    }

   
    public String getUserName() {
        return userName;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getRol() {
        return rol;
    }

   
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
    public Object[] toArray() {
        return new Object[]{
            userName,
            correo,
            contrasena,
            rol
        };
    }
}