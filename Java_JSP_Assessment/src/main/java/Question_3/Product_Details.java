package Question_3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product_Details
 */
@WebServlet("/Product_Details")
public class Product_Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product_Details() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		String id=request.getParameter("pid");
		String name=request.getParameter("pname");
		int price=Integer.parseInt(request.getParameter("pprice"));
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/Cohort","root","root123");
			PreparedStatement st=con.prepareStatement("insert into Product values(?,?,?)");
			st.setString(1, id);
			st.setString(2, name);
			st.setInt(3, price);
			st.executeUpdate();
			st.close();
			con.close();
			response.getWriter().print("Inserted successfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
