package servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pa")
public class PassMultipleValue extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int k=0,h=5;
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c:cookies)
		{
			if(c.getName().equals("k"))
			{
				k=Integer.parseInt(c.getValue());
			}
		}
		
		k= k*h;
		
		res.getWriter().println(k);
		
		
	}
	

}
