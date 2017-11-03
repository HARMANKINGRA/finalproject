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
@WebServlet("/add.do")
public class adddocument extends HttpServlet {
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
			
			String certiname = request.getParameter("txtName");
			String certidiscription = request.getParameter("txtDame");
			String certilocation = request.getParameter("txtLame");
			
			
			
			usercerti usercerti = new usercerti(certilocation, certilocation, certilocation);
			usercerti.setcertiname(certiname);
			usercerti.setcertidiscription(certidiscription);
			usercerti.setcertilocation(certilocation);
			
			JDBCHELPERCERTI helper1 = new JDBCHELPERCERTI();
			helper1.openConnection();
			int i = helper1.addcertiname(usercerti);
			if(i>0){
				out.print(" added Successfully....");
			}else{
				out.print("error occurred....");
			}
			helper1.closeConnection();
		}

	}


