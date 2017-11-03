package harman;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Register.do")
public class addcity extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("service executed");
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String cityname = request.getParameter("txtName");
			String pincode = request.getParameter("txtpincode");
			
			
			
			User user = new User();
			user.setcityname(cityname);
			user.setpincode(pincode);
			
			
			
			JDBCHelper helper = new JDBCHelper();
			helper.openConnection();
			int i = helper.addcity(user);
			if(i>0){
				out.print("city added Successfully....");
				
				
			}else{
				out.print("error occurred....");
			}
			helper.closeConnection();
		}

	}

