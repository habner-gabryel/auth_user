package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAuth
 */
@WebServlet("/ServletAuth")
public class ServletAuth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static String url = "jdbc:mysql://localhost:3306/javaweb?autoReconnect=true&useSSL=false";
	static String user = "root";
	static String password = "SWAsis123*";
	static Connection conexao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAuth() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection(url, user, password);
			conexao.setAutoCommit(false);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cpfmask = request.getParameter("cpf");
		cpfmask = cpfmask.replaceAll("[.-]", "");
		long cpf = Long.parseLong(cpfmask);
		String senha = request.getParameter("senha");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
		String consulta = "SELECT * FROM users WHERE cpf = '" + cpf + "' AND senha = '" + senha + "';";
		Statement statement;
			statement = conexao.createStatement();
			ResultSet rs = statement.executeQuery(consulta);
			
			if(rs.next()) { //User Autenticado
				out.println("<h2> Autenticação efetuada com sucesso!</h2>");
			}else {
				out.println("<h2> some daqui meo </h2>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
