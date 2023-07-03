package org.example.logic;

public class DeporteEquipo extends Deporte{
    //Atributos
    private int jugadoresPorEquipo;

    //Relaciones

    //Constructor

    public DeporteEquipo(int jugadoresPorEquipo) {
        this.jugadoresPorEquipo = jugadoresPorEquipo;
    }


    //Metodos

    //Getters y Setters

    public int getJugadoresPorEquipo() {
        return jugadoresPorEquipo;
    }

    public void setJugadoresPorEquipo(int jugadoresPorEquipo) {
        this.jugadoresPorEquipo = jugadoresPorEquipo;
    }


    //Metodos adicionales

    //toString
}
