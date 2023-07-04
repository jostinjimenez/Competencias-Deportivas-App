package org.example.logic;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    //relaciones
    private int anio;
    private List<Inscripcion> inscripciones;
    private List<Partido> partidos;

    //getters y setters
    public int getNumero() {
        return anio;
    }

    public void setNumero(int numero) {
        this.anio = numero;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    //constructores
    public Temporada(int anio) {
        this.anio = anio;
        this.inscripciones = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }

    public Temporada() {
        this.inscripciones = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }


    //metodos
    public void inscribirEquipo(Equipo equipo) {
        InscripcionEquipo inscripcion = new InscripcionEquipo(equipo.getNombre());
        inscripciones.add(inscripcion);
    }


    public void inscribirJugador(Jugador jugador) {
        InscripcionJugador inscripcion = new InscripcionJugador(jugador);
        inscripciones.add(inscripcion);
    }

    public void crearPartidos() {
        // Lógica para crear los partidos de la temporada
    }

    @Override
    public String toString() {
        return "Temporada{" + "numero=" + anio + ", inscripciones=" + inscripciones + ", partidos=" + partidos + '}';
    }
}
