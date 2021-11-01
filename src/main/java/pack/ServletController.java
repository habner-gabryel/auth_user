package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
    	ServletContext context = getServletContext();
    	context.setAttribute("classe", this.getClass());
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cpf = request.getParameter("cpf");
		String senha = request.getParameter("senha");
		 
		HttpSession session = request.getSession();
		session.setAttribute("cpf", cpf);
		session.setAttribute("senha", senha);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		 
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Service</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<p> Este � o usu�rio com o CPF: " + cpf + "</p>");
		out.println("<p> E senha: " + senha + "</p>");
		out.println(" </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
