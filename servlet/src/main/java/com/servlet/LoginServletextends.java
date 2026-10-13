@WebServlet("/login")
public class LoginServletextends HttpServlet{
@Override protected void doPost(HttpServletRequestrequest, 
    HttpServletResponseresponse) throws ServletException, 
    IOException{ response.setContentType("text/html");
String username =request.getParameter("username");
String password =request.getParameter("password"); 

PrintWriter out =response.getWriter();
if ("admin".equals(username) && "1234".equals(password)){
     HttpSession session= request.getSession();
     session.setAttribute("username",username);
     out.println("<h1>Login Successful</h1>");
     out.println("<ahref='home'>Go toHome</a>");
    }
else {
     out.println("<h1>Invalid Login</h1>");
  }
 }
}