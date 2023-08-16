/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quipuxpunto3interface.models;

/**
 *
 * @author user
 */
public class jugador {
    // atributos de la clase jugador
    private String nombre;
    private String posicion;
    
    // constructor por defecto
    public jugador() {
    }
    
    // acceso a los atributos básicos de la clase jugador
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
}
