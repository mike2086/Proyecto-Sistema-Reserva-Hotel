
package Servlet;

import Logica.Controladora;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvHuesped", urlPatterns = {"/SvHuesped"})
public class SvHuesped extends HttpServlet {
    
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
        
                
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String direccion = request.getParameter("direccion");
        Date fechaNac = parseFecha(request.getParameter("date-start"));
        String profesion = request.getParameter("profesion");
       
        
        request.getSession().setAttribute("dni",dni);
        request.getSession().setAttribute("nombre",nombre);
        request.getSession().setAttribute("apellido",apellido);
        request.getSession().setAttribute("direccion",direccion);
        request.getSession().setAttribute("date-start",fechaNac);
        request.getSession().setAttribute("profesion",profesion);
       
        
        response.sendRedirect("huesped.jsp");
        
      Controladora control = new Controladora();
      control.crarHuesped(dni, nombre, apellido, direccion, fechaNac, profesion);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
