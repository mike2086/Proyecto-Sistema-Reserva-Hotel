
package Logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Huesped extends Persona implements Serializable {
    
    @Basic
    private String profesion;
    
    @OneToMany 
    List <Reserva> reservas;
    
        
    public Huesped() {
    }

    public Huesped(String profesion, List<Reserva> reservas, int idPersona, String dni, String nombre, String apellido, String direccion, Date fechaNac) {
        super(idPersona, dni, nombre, apellido, direccion, fechaNac);
        this.profesion = profesion;
        this.reservas = reservas;
    }

    

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }  

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    
    
    
    
    
    
}
