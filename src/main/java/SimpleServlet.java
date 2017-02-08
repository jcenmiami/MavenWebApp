

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int accessTimes;

    /**
     * Default constructor. 
     */
    public SimpleServlet() {
        // TODO Auto-generated constructor stub
    	accessTimes = 0;
    }
    
    // If the site was accessed, add 1 to counter.
    public void siteAccessed(){
    	accessTimes++;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		siteAccessed();
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>");
		out.println("Current Time");
		out.println("</title></head><body>");
		out.println("<p>The current time is " + new java.util.Date());
		out.println("</p>The page has been accessed " + accessTimes + " times");
		out.println("</body></html>");
	}

}
