packagecom.servlet;
 importjava.io.IOException;
  importjakarta.servlet.Filter; 
  importjakarta.servlet.FilterChain; 
  importjakarta.servlet.ServletException; 
  importjakarta.servlet.ServletRequest; 
  importjakarta.servlet.ServletResponse; 
  importjakarta.servlet.annotation.WebFilter; 
@WebFilter("/*")
 public class MyFilter implementsFilter{ 
@Override public void doFilter( ServletRequestrequest,
   ServletResponseresponse,
    FilterChain chain) throws IOException, ServletException{ 
      System.out.println("Request intercepted");
       chain.doFilter(request, response); 
       System.out.println("Response completed"); 
      }
     }
