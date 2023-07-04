package org.example.logic;

public class InscripcionJugador extends Inscripcion {
    // relaciones
    private Jugador jugador;

    // constructores
    public InscripcionJugador(Jugador jugador, Deporte deporte, Temporada temporada) {
        super(deporte, temporada);
        this.jugador = jugador;
    }

    // getters y setters

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "InscripcionJugador{" + "jugador=" + jugador + '}';
    }
}
