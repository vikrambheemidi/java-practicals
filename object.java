import java.util.*;
public class object {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int[] a=new int[5];
	for(int i=0;i<5;i++)
	{
		a[i]=s.nextInt();
		}
	for(int j=0;j<5;j++)
	{
		if(a[j]>50)
		{
		System.out.print(a[j]);
		}
	}
	
}
}
