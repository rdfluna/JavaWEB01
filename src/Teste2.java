
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/teste2")
public class Teste2 extends HttpServlet {
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
				
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>TABUADA</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form method='post' action = 'teste2' >");
		out.println("Digite um numero: <input type='number' min='0' max='10' name='numero'>");
		out.println("<input type='submit' name='botao'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
				
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numero = request.getParameter("numero");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		if(isNumeric(numero)){
			for(int i = 0; i <= 10; i++){
				out.println(numero + "X" + i + " = " + Integer.parseInt(numero) * i + "<br/>");
			}
		}else{
			out.println("<h1>Não é número</h1>");
		}	
		
		out.println("<a href='teste2'><input type='button' name='txtVoltar' value='voltar'></a>");
		
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

	private boolean isNumeric(String numero) {
		return numero.matches("-?\\d+(\\.\\d+)?");
	}
}