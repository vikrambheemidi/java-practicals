import java.util.Scanner;

public class average {
	public static void main(String args[])
	{
		  int n, add = 0;
	        float average;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n ; i++)
	        {
	            a[i] = s.nextInt();
	            add =add+a[i];
	        }
	        System.out.println("Sum:"+add);
	        average = add / n;
	        System.out.println("Average:"+average);
	}

}
