package org.example.logic;

public abstract class Inscripcion {
    //relaciones
    private Deporte deporte;
    private Temporada temporada;

    //constructores
    public Inscripcion(Deporte deporte, Temporada temporada) {
        this.deporte = deporte;
        this.temporada = temporada;
    }

    //getters y setters

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "deporte=" + deporte + ", temporada=" + temporada + '}';
    }
}
