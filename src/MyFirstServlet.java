import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by aaleksandrov on 01.07.14.
 */
public class MyFirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hello Servlet");
        response.setContentType("text/html");
        String userName = request.getParameter("userName");
        String fullName= request.getParameter("fullName");
        String profession = request.getParameter("profession");
        String[] location = request.getParameterValues("location");
        PrintWriter writer = response.getWriter();
        writer.print("<b>Hello " + userName + "  we know your full name is " + fullName + ". Your profession is " + profession + " you are at ");
        for(String str:location){
            writer.print(str + " ");
        }
        writer.print("</b>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hello Servlet");
        response.setContentType("text/html");
        String userName = request.getParameter("userName");
        PrintWriter writer = response.getWriter();
        writer.print("<b>Hello " + userName + " response!11!!!<b>");
    }
}
