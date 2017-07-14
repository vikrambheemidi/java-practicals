import java.util.Scanner;

public class student1 {
	
	public static void main(String args[]){
		
		Scanner s=new Scanner(System.in);
		int age = 0;
		String name;
		int r=0;
		
		for(int i=0;i<3;i++)
		{
	
			System.out.println("enter student name");
			System.out.println("enter student age");
			age=s.nextInt();	
			name=s.next();
			
			if(age>18)
			{
				
				System.out.println("student is elgible");
				r=r+1;
			}
			else
			{
				System.out.println("age must be >18");
			}
		}
		System.out.println("no eligible "+r);
	}

}
