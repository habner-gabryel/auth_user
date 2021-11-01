package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletReader
 */
@WebServlet("/ServletReader")
public class ServletReader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletReader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String cpf = session.getAttribute("cpf").toString();
		String senha = session.getAttribute("senha").toString();

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		 
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Service</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<p> Este é o usuário com o CPF: " + cpf + "</p>");
		out.println("<p> E senha: " + senha + "</p>");
		out.println(" </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();

		
	}

}
