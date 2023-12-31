
package Servlet;

import Logica.Controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvHabitacion", urlPatterns = {"/SvHabitacion"})
public class SvHabitacion extends HttpServlet {

   
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
        
        int IdHabitacion = Integer.parseInt(request.getParameter("idHabitacion"));
        int piso = Integer.parseInt(request.getParameter("piso"));
        String nombreHabitacion = request.getParameter("nombreHabitacion");
        String tipoHabitacion = request.getParameter("tipoHabitacion");
        Double precioNoche = Double.parseDouble(request.getParameter("precioNoche"));
       
        
        request.getSession().setAttribute("idHabitacion",IdHabitacion); 
        request.getSession().setAttribute("piso",piso);
        request.getSession().setAttribute("nombreHabitacion",nombreHabitacion);
        request.getSession().setAttribute("tipoHabitacion",tipoHabitacion);
        request.getSession().setAttribute("precioNoche",precioNoche);
       
        
        response.sendRedirect("habitacion.jsp");
        
      Controladora control = new Controladora();
      control.crearHabitacion(IdHabitacion, piso, nombreHabitacion, tipoHabitacion, precioNoche);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
