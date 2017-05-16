import javax.servlet.*;
import java.io.*;
import java.util.Enumeration;

/* @author SIDHARTHA */

public class demo_GenericServlet extends GenericServlet
{
    
    ServletConfig config=null;
    
    @Override
    public void init(ServletConfig config)
    {
        this.config=config;
    }
    
    @Override
    public void init() throws ServletException
    {
        
    }
    
    @Override
    public void service(ServletRequest rq, ServletResponse rs) throws IOException,ServletException
    {
        rs.setContentType("text/html");
        PrintWriter pw = rs.getWriter();
        pw.println("HELLO");
    }

    @Override
    public ServletConfig getServletConfig()
    {
        return config;
    }
    
    @Override
    public String getServletInfo()
    {
        return "Made with hate in New Delhi. No rights Reserved. :-P";
    }
    
    @Override
    public ServletContext getServletContext()
    {
        //learn about ServletContext first
        return null;
    }
    
    @Override 
    public String getServletName()
    {
        return "demo_GenericServlet";
    }
    
    @Override
    public void log(String msg)
    {
        System.out.println(msg);
        // code to insert the message in a log file
    }
    
    @Override
    public void log(String msg,Throwable th)
    {
        System.out.println(msg);
        //code to insert the message in a log file
        // AND
        th.printStackTrace();
    }
 
    public void detroy()
    {
        System.out.println("\n\nHasta-La-Vista. The Servled is closing. !!");
    }
}