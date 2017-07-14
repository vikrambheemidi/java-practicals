import java.util.*;
public class highestscore {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	
	int array[]=new int[5];
	String ar[]=new String[5];
	int i;
	for(i=0;i<5;i++)
	{
		System.out.print("enter student name");
		ar[i]=s.next();
	System.out.print("enter student score");
	array[i]=s.nextInt();
	}
	int max=0;
	String top="";
	for(int j=0;j<5;j++)
	{
		if(array[j]>max)
		{
	     max=array[j];
	     top = ar[j];
		}
	
	}
	System.out.println("max score student is:"+max+" name of the student is "+top);
	}
}