package org.example.logic;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    //relaciones
    private String nombre;
    private List<Jugador> jugadorList;
    private List<Partido> partidoList;

    //getters y setters


    //constructores
    public Equipo(String nombre, List<Jugador> jugadorList, List<Partido> partidoList) {
        this.nombre = nombre;
        this.jugadorList = new ArrayList<Jugador>();
        this.partidoList = new ArrayList<Partido>();
    }

    //metodos

    public void agregarJugador(Jugador jugador) {
        jugadorList.add(jugador);
    }

    public void agregarPartido(Partido partido) {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }

    public List<Partido> getPartidoList() {
        return partidoList;
    }

    public void setPartidoList(List<Partido> partidoList) {
        this.partidoList = partidoList;
    }
}




