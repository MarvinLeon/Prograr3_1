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
public class Tiendas {

    public int getTiendaID() {
        return tiendaID;
    }

    public void setTiendaID(int tiendaID) {
        this.tiendaID = tiendaID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public boolean isLogeado(){
        return logeado;
    }
    
    public void setLoeagdo (boolean logeado){
        this.logeado = logeado;
    }
    public Tiendas(int tiendaID, String nombre, String direccion, String gerente, String telefono, boolean activa, boolean logeado) {
        this.tiendaID = tiendaID;
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerente = gerente;
        this.telefono = telefono;
        this.activa = activa;
        this.logeado = logeado;
    }
    public int tiendaID;
    public String nombre;
    public String direccion;
    public String gerente;
    public String telefono;
    public boolean activa;
    public boolean logeado;
}
