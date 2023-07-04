package org.example.logic;

import java.util.Date;
import java.util.List;

public class Partido  {

    private List<Pronostico> pronosticoList;
    private List<EstadisticaJugador> estadisticaJugadorList;
    private List<EstadisticaEquipo> estadisticaEquipoList;

    //relaciones
    private Date fecha;
    private String grupo;
    private Deporte deporte;
    private EstadoPartido estado;
    private String resultado;

    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public enum EstadoPartido {
        PENDIENTE, JUGADO, SUSPENDIDO
    }

    //getters y setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }


    public EstadoPartido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPartido estado) {
        this.estado = estado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    /*public Marcador getMarcador() {
        return marcador;
    }*/

   /* public void setMarcador(Marcador marcador) {
        this.marcador = marcador;
    }*/

    //constructores
    public Partido(Date fecha, String grupo, Deporte deporte, EstadoPartido estado, String resultado) {
        this.fecha = fecha;
        this.grupo = grupo;
        this.deporte = deporte;
        this.estado = estado;
        this.resultado = resultado;
        //this.marcador = new Marcador();
    }

    //metodos
    @Override
    public String toString() {
        return "Partido{" + "fecha=" + fecha + ", grupo=" + grupo + ", deporte=" + deporte + ", estado=" + estado + ", resultado=" + resultado + '}';
    }
}
