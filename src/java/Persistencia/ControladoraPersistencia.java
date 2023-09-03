
package Persistencia;

import Logica.Empleado;
import Logica.Habitacion;
import Logica.Huesped;
import Logica.Reserva;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    //llamado a JpaController para crear las tablas en BD
    EmpleadoJpaController jpaEmpleado = new EmpleadoJpaController();
    
    HabitacionJpaController jpaHabitacion = new HabitacionJpaController();
    
    HuespedJpaController jpaHuesped = new HuespedJpaController();
    
    PersonaJpaController jpaPersona = new PersonaJpaController();
    
    ReservaJpaController jpaReserva = new ReservaJpaController();
    
    //Metodos Para Crear pasar los datos a la BD mediante jpa 
    public void crearEmpleado(Empleado empleado) {
        try {
            jpaEmpleado.create(empleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearHabitacion(Habitacion habitacion) {
        
        try {
            jpaHabitacion.create(habitacion);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearHuesped(Huesped huesped) {
        
        try {
            jpaHuesped.create(huesped);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearReserva(Reserva reserva) {
        
        try {
            jpaReserva.create(reserva);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para traer lista empleados y verificar usuario y contraseñas para el logging
    public List<Empleado> traerUsuarios() {
        
        return jpaEmpleado.findEmpleadoEntities();
        
    }

    public List<Huesped> traerHuespedes() {
        
        return jpaHuesped.findHuespedEntities();
    }

    public List<Empleado> traerEmpleados() {
        
        return jpaEmpleado.findEmpleadoEntities();
    }

    public List<Habitacion> traerHabitaciones() {
        
        return jpaHabitacion.findHabitacionEntities();
    }
    
}
