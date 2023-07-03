package org.example.logic;

import java.util.LinkedList;
import java.util.List;

public class Competencia {
    //Atributos
    private String nombre;

    //Relaciones
    private List<Deporte> deporteList;
    private List<Temporada> temporadaList;

    //Constructor


    public Competencia(int id, List<Deporte> deporteList, List<Temporada> temporadaList) {
        this.nombre = nombre;
        this.deporteList = new LinkedList<Deporte>() {
        };
        this.temporadaList = new LinkedList<Temporada>();
    }

    //Metodos
    public void agregarDeporte(Deporte deporte) {
        deporteList.add(deporte);
    }

    public Temporada crearTemporada() {
        return new Temporada();
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
