packagecom.servlet;
 importjava.io.IOException;
 importjava.io.PrintWriter; 
 importjakarta.servlet.ServletException;
 importjakarta.servlet.annotation.WebServlet; 
importjakarta.servlet.http.HttpServlet;
importjakarta.servlet.http.HttpServletRequest;
importjakarta.servlet.http.HttpServletResponse;
@WebServlet("/hello")
publicclass HelloServletextends HttpServlet{ 
@Override
protected void doGet(HttpServletRequestrequest,
 HttpServletResponseresponse) throws ServletException,
IOException{ response.setContentType("text/html");
PrintWriter out =response.getWriter(); 
out.println("<h1>Hello Students!</h1>"); 
out.println("<h2>Welcome to ServletProgramming</h2>"); 
}
}