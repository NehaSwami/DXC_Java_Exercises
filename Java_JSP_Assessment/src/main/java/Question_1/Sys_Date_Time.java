package Question_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sys_Date_Time
 */
@WebServlet("/Sys_Date_Time")
public class Sys_Date_Time extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sys_Date_Time() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
	          response.setContentType("text/html");
	          PrintWriter pw = response.getWriter();
	          
	          java.util.Date date = new java.util.Date();
	          
	          pw.println("<h2>"+"Current Date & Time: " +date.toString()+"</h2>");
	        
	          pw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			}
	}
	

}
