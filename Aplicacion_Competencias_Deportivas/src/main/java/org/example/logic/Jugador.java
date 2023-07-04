package org.example.logic;
import java.util.List;
public class Jugador {
    //relaciones
    private String nombre;
    private List<Partido> partidos;
   private Equipo equipo;

   //getters y setters
   public String getNombre() {
       return nombre;
   }
   public String getEquipo() {
       return equipo.getNombre();
   }
   public void setEquipo(Equipo equipo) {
       this.equipo = equipo;
   }
   public void agregarPartido(Partido partido) {
       partidos.add(partido);
   }
}


