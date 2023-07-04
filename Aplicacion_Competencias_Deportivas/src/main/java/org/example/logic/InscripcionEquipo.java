package org.example.logic;

public class InscripcionEquipo extends Inscripcion{
    //relaciones
    private Equipo equipo;

<<<<<<< HEAD

=======
>>>>>>> master
    //constructores
    public InscripcionEquipo(Deporte deporte, Temporada temporada, Equipo equipo) {
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
