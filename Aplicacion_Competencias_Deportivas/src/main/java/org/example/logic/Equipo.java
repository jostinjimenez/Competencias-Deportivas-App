package org.example.logic;
import java.util.List;

public class Equipo {
private String nombre;
private List<Jugador> jugadores;
private List<Partido> partidos;
    public String getNombre() {
        return nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }
}




