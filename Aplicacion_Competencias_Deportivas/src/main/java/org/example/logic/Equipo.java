package org.example.logic;
import java.util.List;

public class Equipo {
    //relaciones
    private String nombre;
    private List<Jugador> jugadores;
    private List<Partido> partidos;

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    //metodos

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }
}




