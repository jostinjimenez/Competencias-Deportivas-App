package org.example.logic;

import java.util.List;

public class DeporteIndividual extends Deporte{
    //Atributos
    private int jugadoresPorPartido;

    //Relaciones
    private Equipo equipo;
    private Categoria categoria;


    //Constructor
    public DeporteIndividual(String nombre, TipoDeporte tipoDeporte, Categoria categoria, int jugadoresPorPartido) {
        super(nombre, tipoDeporte, categoria);
        this.jugadoresPorPartido = jugadoresPorPartido;
    }


    //Metodos


    //Getters y Setters


    //Metodos adicionales

    //toString

}
