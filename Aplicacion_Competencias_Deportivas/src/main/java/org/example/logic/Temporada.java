package org.example.logic;

import java.util.List;

public class Temporada {
    //relaciones
    private int numero;
    private List<Inscripcion> inscripciones;
    private List<Partido> partidos;

    //getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
    public Temporada(int numero, List<Inscripcion> inscripciones, List<Partido> partidos) {
        this.numero = numero;
        this.inscripciones = inscripciones;
        this.partidos = partidos;
    }

    //metodos
    public void inscribirEquipo(Equipo equipo) {

    }
    public void inscribirJugador(Jugador jugador) {

    }
    public void crearPartidos() {
    }

    @Override
    public String toString() {
        return "Temporada{" + "numero=" + numero + ", inscripciones=" + inscripciones + ", partidos=" + partidos + '}';
    }
}
