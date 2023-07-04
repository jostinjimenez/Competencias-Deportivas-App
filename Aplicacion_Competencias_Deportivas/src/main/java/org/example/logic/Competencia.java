package org.example.logic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Competencia {
    //Atributos
    private String nombre;

    //Relaciones
    private List<Deporte> deporteList;
    private List<Temporada> temporadaList;

    //Constructor


    public Competencia(String nombre) {
        this.nombre = nombre;
        this.deporteList = new ArrayList<Deporte>();
        this.temporadaList = new ArrayList<Temporada>();
    }

    //Metodos
    public void agregarDeporte(Deporte deporte) {
        deporteList.add(deporte);
    }


    public Temporada crearTemporada() {
        Temporada temporada = new Temporada();
        temporadaList.add(temporada);
        return temporada;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Deporte> getDeporteList() {
        return deporteList;
    }

    public void setDeporteList(List<Deporte> deporteList) {
        this.deporteList = deporteList;
    }

    public List<Temporada> getTemporadaList() {
        return temporadaList;
    }

    public void setTemporadaList(List<Temporada> temporadaList) {
        this.temporadaList = temporadaList;
    }


    //Metodos adicionales

    //toString


}
