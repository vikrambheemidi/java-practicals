
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ReadData", urlPatterns = { "/ReadData" })
public class ReadData extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		FileReader fr=new FileReader("E:\\html\\aaaa.txt");
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");

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

/*		out.println("Customer ID Is " + cid);
		out.println("<br/>");
		out.println("Customer Name Is " + cname);
		out.println("<br/>");
		out.println("Customer gender Is " + gender);
		out.println("<br/>");
		out.println("Customer Age Is " + cage);
		out.println("<br/>");
		out.println("Customer address Is " + addr);
		out.println("<br/>");
		out.println("a1 " + a1);
		out.println("<br/>");
		out.println("a2 " + a2);
		out.println("<br/>");
		out.println("Customer pin Is " + pin);
		out.println("<br/>");
		out.println("Customer Phone Is " + phn);
		out.println("<br/>");
		out.println("Chk1 " + chk1);
		out.println("<br/>");
		out.println("Chk2 " + chk2);
		out.println("<br/>");
		out.println("Chk3 " + chk3);
		out.println("<br/>");
		out.println("Chk4 " + chk4);
		out.println("<br/>");
		out.println("Chk5 " + chk5);
		out.println("<br/>");
		out.println("Customer DOB Is " + dob);
		out.println("<br/>");
		out.println("<br/>");
		out.println("<br/>");
		out.println("<br/>");
*/
		
		int i=0;
		
		if((i=fr.read())!=-1){
			
		
		// .1. Display total male and female customers
		int fe = 0, m = 0;
		if (gender.equals("female")) {
			fe++;
		} else {
			m++;
		}
		out.println("Total female and male count is " + fe + "...." + m);

		// ..2. Display the total customer country wise

		// . 3. Display the total customer who like Traveling
		int trav = 0;
		if (chk5.equals("on")) {
			trav++;
		}
		out.println("Customer who love travelling are " + trav);

		// ..4. Display total customer who like reading
		int read = 0;
		if (chk2.equals("on")) {
			read++;
		}
		out.println("Customer who love reading are " + read);

		// ..5. Display total customer who is above 18 years of age

		int agec = 0;
		if (Integer.parseInt(cage) > 18) {
			agec++;
		}
		out.println("Customer who's age is >18 " + agec);

		// .. 6. Display total customer who do not have phone
		int ph = 0;
		if (phn.equals("null")) {
			ph++;
		}
		out.println("Customer who does not have phone " + ph);
		}
	}
}
