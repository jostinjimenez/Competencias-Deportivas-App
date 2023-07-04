package org.example.logic;

import java.util.ArrayList;
import java.util.List;

public abstract class Deporte{
    //Atributos
    private String nombre;
    private TipoDeporte tipoDeporte;
    private Categoria categoria;

    //Relaciones


    //Constructor
    public Deporte(String nombre, TipoDeporte tipoDeporte, Categoria categoria) {
        this.nombre = nombre;
        this.tipoDeporte = tipoDeporte;
        this.categoria = categoria;
    }

    //Metodos


    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoDeporte getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(TipoDeporte tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    //Metodos adicionales


    //toString


    @Override
    public String toString() {
        return "Deporte{" +
                "nombre='" + nombre + '\'' +
                ", tipoDeporte=" + tipoDeporte +
                ", categoria=" + categoria +
                '}';
    }
}
