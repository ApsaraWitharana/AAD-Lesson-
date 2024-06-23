package lk.ijse.gdse68.api;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MyServlet extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        resp.getWriter().println("Hello, I'm from MyServlet");

        ServletConfig config = getServletConfig();
        String city = config.getInitParameter("city");
        System.out.println("MyServlet: "+city);

        ServletContext context = getServletContext();
        String country = context.getInitParameter("country");
        System.out.println("MyServlet: "+ country);
    }
}
