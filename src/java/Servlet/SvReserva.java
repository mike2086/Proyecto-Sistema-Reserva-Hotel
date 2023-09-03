
package Servlet;

import Logica.Controladora;
import Logica.Empleado;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvReserva", urlPatterns = {"/SvReserva"})
public class SvReserva extends HttpServlet {

    //funcion para convertir string a date
    public static Date parseFecha(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
    
        try{
        fechaDate = formato.parse(fecha);
        }
        catch (ParseException ex){
            System.out.println("No se pudo Convertir fecha");
        }

        return fechaDate;
    }
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        Date fechaIngreso = parseFecha(request.getParameter("date-start"));
        Date fechaSalida = parseFecha(request.getParameter("date-end"));
        int idEmpleado = Integer.parseInt(request.getParameter("idEmpleado"));
        int idHuesped = Integer.parseInt(request.getParameter("idHuesped"));
        int idHabitacion = Integer.parseInt(request.getParameter("idHabitacion"));
        
        
        Controladora control = new Controladora();
        
        request.getSession().setAttribute("date-start",fechaIngreso);
        request.getSession().setAttribute("date-end",fechaSalida);
        /*
        request.getSession().getAttribute("idEmpleado", idEmpleado);
        request.getSession().getAttribute("idHuesped", idHuesped);
        request.getSession().getAttribute("idHabitacion", idHabitacion);
        */
        
        
        
        response.sendRedirect("reserva.jsp");
       
      
      control.crearReserva(fechaIngreso, fechaSalida);
      
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
