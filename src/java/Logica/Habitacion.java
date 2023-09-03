
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Habitacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idHabitacion;
    
    @Basic
    private int piso;
    private String Nombre;
    private String tipo;
    private Double precioNoche;
    
    @OneToMany 
    List <Reserva> reservas;
   
    
    
    public Habitacion() {
    }

    public Habitacion(int idHabitacion, int piso, String Nombre, String tipo, Double precioNoche, List<Reserva> reservas) {
        this.idHabitacion = idHabitacion;
        this.piso = piso;
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.reservas = reservas;
    }

    

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(Double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

   
    
    
    
    
}
