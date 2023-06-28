package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet("/addServlet")
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection; 
       
	public void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_Backend","Sanket","Mh15dg0525");
//			connection = DriverManager.getConnection("jdbc:mysql://localhost/JDBC_Backend","Sanket","Mh15dg0525");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		
		try {
//			 Class.forName("com.mysql.cj.jdbc.Driver");
//			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_Backend", "Sanket", "Mh15dg0525");
			 String sql = "insert into user (firstName,lastName,email ,password) values(?,?,?,to_base64(?))";
			 PreparedStatement st = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //pre compiled sql
			
			st.setString(1, firstName);
			st.setString(2, lastName);
			st.setString(3, email);
			st.setString(4, password);
			
			st.executeUpdate();
			
			ResultSet rs = st.getGeneratedKeys();
			
			if(rs != null && rs.next()) {
				System.out.println("Generated id " + rs.getInt(1));
				
			}
			
			
		 }catch(SQLException e) {
			   e.printStackTrace();
		 }finally {
			 try {connection.close();}catch (Exception e){ e.printStackTrace();}
		 }
		/*
		
		try {
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("insert into user values ('"+firstName+"','"+lastName+"','"+email+"','"+password+"')");
			
			PrintWriter out = response.getWriter();
			
			
			if(result > 0) {
				out.print("<h3>USER CREATED!!</h3>");
			}else {
				out.print("<h3>Error Creating the user!!</<h3>");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/
	}
	
	public void destroyed() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
