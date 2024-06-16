
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

 
@WebServlet("/login")   
public class Hell extends HttpServlet {
    private static final long serialVersionUID = 1L;

     


    public Hell() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
    	String url ="jdbc:mysql://localhost:3306/login";
		String user_name ="root"; 
		String pass ="root";
		 
		PrintWriter pw = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			Connection conn = DriverManager.getConnection(url,user_name,pass);
			 
			Statement stmt = conn.createStatement();
			String query = "insert into user (name ,username ,password ) ";

			 
			
			boolean bar =stmt.execute(query);
 			
			conn.close( );
			System.out.println("closed");
			}
			
			catch(Exception e){
				
			}
    	
		String query = "insert into user (name ,username ,password ) ";

//      String name = request.getParameter("name");

        
//       if (.equals(username) && .equals(password)) {
          pw.println("<h1>Welcome, " + username + password +"!</h1>");
//      } else {
//          pw.println("<h1>Invalid username or password</h1>");
//          pw.println("<a href='NewFile.jsp'>Try again</a>");
//      }
    }
}