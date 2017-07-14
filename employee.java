import java.util.Scanner;

public class employee {
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		int j = 0;
		String n;
		int sum;
		do
		{
			System.out.println("enter the emploee names");
			 n=s.next();
			
			 System.out.println("enter the salaries");
			   sum=s.nextInt();
			 if(sum==10000)
			{
				System.out.println("bonus %is" +30);
			}
			  else if(sum==30000)
			  {
				  System.out.println("bonus  %is"+20);
		      }
			  else if(sum==50000)
			  {
				  System.out.println("bonus %is"+10);
			  }
			 System.out.println(j);
			 j++;		 
	}while(j<10);
	}}
		