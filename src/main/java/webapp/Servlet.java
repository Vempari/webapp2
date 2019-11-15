package webapp;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

   @WebServlet("/ejbServlet")
public class Servlet extends javax.servlet.http.HttpServlet {
    @EJB
    EJBLogic ejbLogic;
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
