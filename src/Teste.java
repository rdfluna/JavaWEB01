import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Teste")
public class Teste extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Pagina em Servlet </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Testando o Mundi</h1>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

}
