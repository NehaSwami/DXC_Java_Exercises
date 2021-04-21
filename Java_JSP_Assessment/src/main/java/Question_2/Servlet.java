package Question_2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			response.setContentType("text/html");
			String name = request.getParameter("name");
	        String course = request.getParameter("course");
	         
	        System.out.println("Name: " + name);
	        System.out.println("Course: " + course);
	 
	 
	        PrintWriter writer = response.getWriter();
	         
	 
	        String htmlRespone = "<html>";
	        htmlRespone += "<h2>Your name is: " + name + "<br/>";      
	        htmlRespone += "Your course is: " + course + "</h2>";    
	        htmlRespone += "</html>";
	         
	        writer.println(htmlRespone);
		}
		catch(Exception e) {
			System.out.print(e);
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
