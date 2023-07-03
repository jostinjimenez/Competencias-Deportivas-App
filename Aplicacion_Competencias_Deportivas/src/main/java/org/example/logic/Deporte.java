package org.example.logic;

import java.util.List;

public abstract class Deporte{
    //Atributos
    private String nombre;
    private TipoDeporte tipoDeporte;
    private List<Categoria> categoriaList;

    //Relaciones


    //Constructor


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

    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }


    //Metodos adicionales


    //toString


}
