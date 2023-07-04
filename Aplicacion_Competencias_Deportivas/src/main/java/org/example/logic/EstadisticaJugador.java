package org.example.logic;

public class EstadisticaJugador {
    private Partido partido;
    //atributos
    private String nombreJugador;
    private int partidoJugados;
    //constructor
    public EstadisticaJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
        this.partidoJugados = 0;
    }
    //getters y setters
    public String getNombreJugador() {
        return nombreJugador;
    }
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    public int getPartidoJugados() {
        return partidoJugados;
    }
    public void setPartidoJugados(int partidoJugados) {
        this.partidoJugados = partidoJugados;
    }
    //metodos
    public void incrementarPartidoJugados() {
        this.partidoJugados++;
    }
    public void calcularEstadisticaJugador(Partido partido) {
        this.partido = partido;
        this.partidoJugados++;
    }
}
