import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import WebApplication1.*;
import javax.ejb.EJB;


public class addtwo extends HttpServlet
{@EJB
     ejbsession  obj;
        public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
        {response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
         int a= Integer.parseInt(request.getParameter("t1"));
          int b= Integer.parseInt(request.getParameter("t2"));
          obj.setI(a);
          obj.setJ(b);
          obj.add();
          int k=obj.getK(); 
            out.println("<h1>addition of two numbers  using ejb " + k + "</h1>");
        } 
      
}