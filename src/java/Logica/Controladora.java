
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia persistencia = new ControladoraPersistencia();
    
    

    //metodos para instanciar los objetos en sus respectivas clases 
    public void crearEmpleado(String dni, String nombre, String apellido, Date fechaNac, String direccion, String cargo, String usuario, String contrasenia) {
        Empleado empleado = new Empleado();
        List <Reserva> reservas = new ArrayList <>();
        
        empleado.setDni(dni);
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setFechaNac(fechaNac);
        empleado.setDireccion(direccion);
        empleado.setCargo(cargo);
        empleado.setUsuario(usuario);
        empleado.setContrasenia(contrasenia);        
        empleado.setReservas(reservas);
        
        persistencia.crearEmpleado(empleado);
        
        
    }

    public void crearHabitacion(int IdHabitacion, int piso, String nombreHabitacion, String tipoHabitacion, Double precioNoche) {
        Habitacion habitacion = new Habitacion();
        List <Reserva> reservas = new ArrayList<>();
        
        habitacion.setIdHabitacion(IdHabitacion);
        habitacion.setPiso(piso);
        habitacion.setNombre(nombreHabitacion);
        habitacion.setTipo(tipoHabitacion);
        habitacion.setPrecioNoche(precioNoche);  
        habitacion.setReservas(reservas);
        
        persistencia.crearHabitacion(habitacion);
    }

    public void crarHuesped(String dni, String nombre, String apellido, String direccion, Date fechaNac, String profesion) {
        Huesped huesped = new Huesped();
        List <Reserva> reservas = new ArrayList<>();
        
        huesped.setDni(dni);
        huesped.setNombre(nombre);
        huesped.setApellido(apellido);
        huesped.setDireccion(direccion);
        huesped.setFechaNac(fechaNac);
        huesped.setProfesion(profesion);
        huesped.setReservas(reservas);
        
        persistencia.crearHuesped(huesped);
       
    }

    public void crearReserva(Date fechaIngreso, Date fechaSalida) {
        Reserva reserva = new Reserva();
                
        reserva.setFechaIngreso(fechaIngreso);
        reserva.setFechaSalida(fechaSalida);
        
        
        
        persistencia.crearReserva(reserva);
        
    }

    //metodo para buscar usuario y contraseña de cada empleado para ingresar a la aplicación
    public boolean verificarUsuario(String usuario, String contrasenia) {
        List <Empleado> listaUsuarios = persistencia.traerUsuarios();
        
        if (listaUsuarios != null){
            
            for (Empleado user : listaUsuarios) {
                
                if (user.getUsuario().equals(usuario) && user.getContrasenia().equals(contrasenia)) {
                  return true;  
                }
            }
           
        }
         return false;
    }
    
    public List<Huesped> traerHuespedes (){
    
    return persistencia.traerHuespedes();
    }
    
    
    
    
    
    
}
