

package models;

import java.util.ArrayList;
import java.util.List;

// definición de la clase equipo
public class equipo {
    
    // atributos de la clase equipo
    private String nombre;
    private String estadio;
    private int titulos;
    private final List<jugador> titulares= new ArrayList<>();
    private final List<jugador> suplentes= new ArrayList<>();
    
    // constructor por defecto
    public equipo() {
    }
    
    
    // acceso a los atributos básicos de la clase equipo: nombre, estadio, titulos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }
    
    
    /**
     * 
     * @param nombre: nombre del jugador a ingresat a la lista de titulares
     * @param pos: posicion del jugador para adicionar a la lista de titulares
     * clea un objeto de la clase jugador y lo adiciona a la lista de jugadores titulares de la clase euipo
     */
    public void agregarTitular(String nombre, String pos){
        // instancia de la clase jugador
        jugador j1= new jugador();
        // set de los datos del jugador
        j1.setNombre(nombre);
        j1.setPosicion(pos);
        // adicion a la lista de titulares
        this.titulares.add(j1);
    }
    
    /**
     * 
     * @param nombre: nombre del jugador a ingresat a la lista de suplentes
     * @param pos: posicion del jugador para adicionar a la lista de titulares
     * clea un objeto de la clase jugador y lo adiciona a la lista de jugadores suplentes de la clase euipo
     */
    public void agregarSuplente(String nombre, String pos){
        // instancia de la clase jugador
        jugador j1= new jugador();
        // set de los datos del jugador
        j1.setNombre(nombre);
        j1.setPosicion(pos);
        // adicion a la lista de titulares
        this.suplentes.add(j1);
    }
    
    /**
     * 
     * @return cadena con el reporte básico según lineamientos de la prueba
     * concatena el valor de los atributos requeridos para el reporte básico: nombre, titulos y cantidad de jugadores del equipo
     */
    public String reportebasico(){
        return "---- Reporte básico ---- \r\n Nombre del equipo : " + this.getNombre() 
                + "\r\n títulos ganados: " + this.getTitulos() 
                + "\r\n Cantidad total de jugadores: " + totalJugadores();
    }
    
    /**
     * 
     * @return cadena con el reporte detallado según lineamientos de la prueba
     * concatena el valor de los atributos requeridos para el reporte detallado: nombre del equipo, y lista los jugadores titulares y suplentes
     */
    public String reporteDetallado(){
        
        String reporte = "Jugadores Titulares : ";
        // ciclo para listar los jugadores titulares, concatena nombre y posición de cada integrante, recorriendo la lista titulares  
        for (int i=0; i<this.titulares.size();i++ ){
            reporte = reporte + "\n\r - " + this.titulares.get(i).getNombre() + " (" + this.titulares.get(i).getPosicion() + ")";
        }
        reporte = reporte + "\n\r Jugadores Suplentes : ";
        // ciclo para listar los jugadores suplentes, concatena nombre y posición de cada integrante, recorriendo la lista suplentes
        for (int i=0; i<this.suplentes.size();i++ ){
            reporte = reporte + "\n\r - " + this.suplentes.get(i).getNombre() + " (" + this.suplentes.get(i).getPosicion() + ")";
        }
        return "---- Reporte detallado ---- \r\n Nombre del equipo : " + this.getNombre() + "\r\n" + reporte;
    }

    // calcula el total de jugadores, sumando el tamaño de las listas  titulares y suplentes de la clase equipo
    private String totalJugadores() {
        return Integer.toString(this.titulares.size() + this.suplentes.size());
    }
}
