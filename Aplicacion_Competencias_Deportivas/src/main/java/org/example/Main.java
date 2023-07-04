package org.example;

import org.example.logic.*;

public class Main {
    public static void main(String[] args) {

    Competencia competencia = new Competencia("Copa de Fulbol");
    competencia.agregarDeporte(new DeporteIndividual("Fulbol", TipoDeporte.EQUIPO, Categoria.PROFESIONAL, 11));

    

    }
}