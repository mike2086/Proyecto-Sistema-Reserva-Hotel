
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


@WebServlet(name = "SvEmpleado", urlPatterns = {"/SvEmpleado"})
public class SvEmpleado extends HttpServlet {

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
        String cargo = request.getParameter("cargo");
        String usuario = request.getParameter("usuario");
        String contrasenia = request.getParameter("contrasenia");
       
        
        request.getSession().setAttribute("dni",dni);
        request.getSession().setAttribute("nombre",nombre);
        request.getSession().setAttribute("apellido",apellido);
        request.getSession().setAttribute("date-start",fechaNac);
        request.getSession().setAttribute("direccion",direccion);
        request.getSession().setAttribute("cargo",cargo);
        request.getSession().setAttribute("usuario",usuario);
        request.getSession().setAttribute("contrasenia",contrasenia);
        
        response.sendRedirect("empleado.jsp");
        
      Controladora control = new Controladora();
      control.crearEmpleado(dni, nombre, apellido, fechaNac, direccion, cargo, usuario, contrasenia);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
