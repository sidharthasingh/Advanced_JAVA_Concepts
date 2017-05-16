import javax.servlet.*;
import java.io.*;

/* @author SIDHARTHA */

public class demo_Servlet implements Servlet
{
  
    ServletConfig config=null;
    
    @Override
    public void init(ServletConfig c)
    {
        this.config=c;
        System.out.println("\n\nTHE SERVLET HAS BEEN INITIALIZED !");
    }
    
    @Override
    public void service(ServletRequest rq, ServletResponse rs) throws IOException, ServletException
    {
        rs.setContentType("text/html");
        PrintWriter pw = rs.getWriter();
        pw.println("HELLO");
    }
    
    @Override
    public void destroy()
    {
        System.out.println("\n\nTHE SERVLET IS BEING DESTROYED !");
    }
    
    @Override
    public ServletConfig getServletConfig()
    {
        return config;
    }
    
    @Override
    public String getServletInfo()
    {
        return "DAmn it Damian. There is nothing such as floppy-right.";
    }

}