package org.example.logic;

public class DeporteEquipo extends Deporte{
    //Atributos
    private int jugadoresPorEquipo;

    //Relaciones

    //Constructor

    public DeporteEquipo(String nombre, TipoDeporte tipoDeporte, Categoria categoria, int jugadoresPorEquipo) {
        super(nombre, tipoDeporte, categoria);
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

    @Override
    public String toString() {
        return super.toString() +
                "DeporteEquipo{" +
                "jugadoresPorEquipo=" + jugadoresPorEquipo +
                '}';
    }
}
