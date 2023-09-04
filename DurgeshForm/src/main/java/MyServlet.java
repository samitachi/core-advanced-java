
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void dopost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// These request and response are important parameters of this method
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Welcome to the register servlet</h2>");
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		
String cond=request.getParameter("condiation");

if(cond.equals("checked")) {
	out.println("<h2> Name: " + name + "<h2>");
	out.println("<h2> Password: " + password + "<h2>");
	out.println("<h2> Email: " + email + "<h2>");
	out.println("<h2> Gender: " + gender + "<h2>");
	out.println("<h2> Course: " + course + "<h2>");

	
	
}else {
	out.println("<h2>You have not accepted terms and condition</h2>");
}
	}

}
