package org.example.logic;

import java.util.Date;
import java.util.List;

public class Partido {
    private List<Pronostico> pronosticoList;
    private List<EstadisticaJugador> estadisticaJugadorList;
    private List<EstadisticaEquipo> estadisticaEquipoList;
    //relaciones
    private Date fecha;
    private String grupo;
    private Deporte deporte;
    private List<Participante> participantes;
    private EstadoPartido estado;
    private String resultado;

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

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
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
    public Partido(Date fecha, String grupo, Deporte deporte, List<Participante> participantes, EstadoPartido estado, String resultado) {
        this.fecha = fecha;
        this.grupo = grupo;
        this.deporte = deporte;
        this.participantes = participantes;
        this.estado = estado;
        this.resultado = resultado;
        //this.marcador = new Marcador();
    }

    //metodos
    public void agregarParticipante(Participante participante) {
        participantes.add(participante);
    }

    @Override
    public String toString() {
        return "Partido{" + "fecha=" + fecha + ", grupo=" + grupo + ", deporte=" + deporte + ", participantes=" + participantes + ", estado=" + estado + ", resultado=" + resultado + '}';
    }
}
