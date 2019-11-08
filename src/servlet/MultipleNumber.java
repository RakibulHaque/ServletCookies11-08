package servlet;
//using cookies to pass value from one servlet to another servlet

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/multiple")
public class MultipleNumber extends HttpServlet {
	
  public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
  {
	  int i= Integer.parseInt(req.getParameter("num1"));
	  int j= Integer.parseInt(req.getParameter("num2"));
	  
	  int k=i*j;
	  
	  Cookie cookie = new Cookie("k",k+ "");  
	  res.addCookie(cookie);
	  
	  res.sendRedirect("pa");
	  
	  res.getWriter().println("multiple value: "+k);
  }
	
	

}
