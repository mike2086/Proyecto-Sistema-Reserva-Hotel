
package Logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Empleado extends Persona implements Serializable {
    
    @Basic
    private String cargo;
    private String usuario;
    private String contrasenia;
    
    @OneToMany 
    List <Reserva> reservas;

    public Empleado() {
    }

    public Empleado(String cargo, String usuario, String contrasenia, List<Reserva> reservas, int idPersona, String dni, String nombre, String apellido, String direccion, Date fechaNac) {
        super(idPersona, dni, nombre, apellido, direccion, fechaNac);
        this.cargo = cargo;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.reservas = reservas;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    
    

   

    
    
    
    
    
}
