@WebFilter("/home")
public class AuthFilter implementsFilter { 
@Override public void doFilter(ServletRequestrequest,
ServletResponseresponse,
FilterChain chain)
throws IOException, ServletException{
HttpServletRequestreq = 
(HttpServletRequest) request;
HttpServletResponseres = (HttpServletResponse) response; 
HttpSession session= req.getSession(false);
if (session !=null && session.getAttribute("username")!= null)
     {
         chain.doFilter(request,
             response);
     } 
else {
  res.sendRedirect("index.html");
 }
}
}