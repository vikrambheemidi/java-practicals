import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProcessData extends HttpServlet 
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String cid = req.getParameter("cid");
        String cname = req.getParameter("cname");
        String gender = req.getParameter("rad1");
        String cage = req.getParameter("age");
        String addr = req.getParameter("addr");
        String a1 = req.getParameter("1");
        String a2 = req.getParameter("2");
        String pin = req.getParameter("pin");
        String phn = req.getParameter("phn");
        String chk1 = req.getParameter("chk1");
        String chk2 = req.getParameter("chk2");
        String chk3 = req.getParameter("chk3");
        String chk4 = req.getParameter("chk4");
        String chk5 = req.getParameter("chk5");
        String dob = req.getParameter("dob");
       
        
        String filename = "E:\\html\\aaaa.txt";
        FileWriter fw =  null;
        BufferedWriter bw = null; 
            
        String Details = cid+","+cname+","+gender+","+cage+","+addr+","+a1+","+a2+","+pin+","+phn+","+chk1+","+chk2+","
        		+chk3+","+chk4+","+chk5+","+dob;
        try
        {
            fw =  new FileWriter(filename,true);
            bw = new BufferedWriter(fw);
            
          
            bw.write(Details);
            bw.newLine();
            bw.close();
            fw.close();
            out.println("Data Successfully Written to file .....");
    
        }
        catch(IOException e)
        {   
            System.out.println(e.getMessage());
        }
    }
}
