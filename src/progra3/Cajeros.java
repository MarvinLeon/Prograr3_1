/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra3;

/**
 *
 * @author user
 */
public class Cajeros {

    public int getCajeroID() {
        return cajeroID;
    }

    public void setCajeroID(int cajeroID) {
        this.cajeroID = cajeroID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTienda() {
        return tienda;
    }

    public void setTienda(int tienda) {
        this.tienda = tienda;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isLogeado() {
        return logeado;
    }

    public void setLogeado(boolean logeado) {
        this.logeado = logeado;
    }

    public Cajeros(int cajeroID, String nombre, String apellido, int tienda, boolean activo, boolean logeado) {
        this.cajeroID = cajeroID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tienda = tienda;
        this.activo = activo;
        this.logeado = logeado;
    }
    public int cajeroID;
    public String nombre;
    public String apellido;
    public int tienda;
    public boolean activo;
    public boolean logeado;
}
