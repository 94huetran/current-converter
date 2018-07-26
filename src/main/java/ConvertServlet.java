import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "ConvertServlet", urlPatterns = "/curency-converter")
public class ConvertServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));
        float result = rate * usd;
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h2>Rate: " + rate + "</h2>");
        pw.println("<h2>USD: " + usd + "</h2>");
        pw.println("<h2>VND: " + result + "</h2>");
        pw.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
