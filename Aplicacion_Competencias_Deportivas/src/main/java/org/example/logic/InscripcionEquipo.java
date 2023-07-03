package org.example.logic;

public class InscripcionEquipo extends Inscripcion{
    //relaciones
    private Equipo equipo;

    //constructores
    public InscripcionEquipo(Equipo equipo, Deporte deporte, Temporada temporada) {
        super(deporte, temporada);
        this.equipo = equipo;
    }

    //getters y setters

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "InscripcionEquipo{" + "equipo=" + equipo + '}';
    }
}
