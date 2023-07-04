package org.example.logic;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    // relaciones
    private int anio;
    private List<Inscripcion> inscripcionList;
    private List<Partido> partidoList;

    // getters y setters
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public List<Inscripcion> getInscripcionList() {
        return inscripcionList;
    }

    public void setInscripcionList(List<Inscripcion> inscripcionList) {
        this.inscripcionList = inscripcionList;
    }

    public List<Partido> getPartidoList() {
        return partidoList;
    }

    public void setPartidoList(List<Partido> partidoList) {
        this.partidoList = partidoList;
    }

    // constructores
    public Temporada(int anio) {
        this.anio = anio;
        this.inscripcionList = new ArrayList<>();
        this.partidoList = new ArrayList<>();
    }


    // metodos
    public void inscribirEquipo(Equipo equipo) {

    }

    public void inscribirJugador(Jugador jugador) {

    }


    public void crearPartidos() {

    }

    @Override
    public String toString() {
        return "Temporada{" + "numero=" + anio + ", inscripciones=" + inscripcionList + ", partidos=" + partidoList + '}';
    }
}
