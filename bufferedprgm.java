import java.io.*;
public class bufferedprgm {
public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	//int a=Integer.parseInt(br.readLine());
	
System.out.println("enter amount");
int a=Integer.parseInt(br.readLine());
System.out.println("enter amount");
if(a<0)
{
	System.out.println("u r not eligible for loan");
}


else if(a>=10000)
{
	System.out.println("eligible for loan of 100000");
}


else if(a>=50000)
{
	System.out.println("eligible for loan of 500000");
}
//System.out.println("enter amount");
int d=Integer.parseInt(br.readLine());
if(d>=100000)
{
	System.out.println("eligible for loan of 1000000");
}	
}	
}