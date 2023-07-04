package org.example.logic;

import java.util.List;

public class DeporteIndividual extends Deporte{
    //Atributos

    //Relaciones
    private Equipo equipo;
    private Categoria categoria;


    //Constructor
    public DeporteIndividual(String nombre, TipoDeporte tipoDeporte, Categoria categoria) {
        super(nombre, tipoDeporte, categoria);
    }


    //Metodos


    //Getters y Setters


    //Metodos adicionales

    //toString


    @Override
    public String toString() {
        return super.toString() +
                "DeporteIndividual{" +
                "equipo=" + equipo +
                ", categoria=" + categoria +
                '}';
    }
}
