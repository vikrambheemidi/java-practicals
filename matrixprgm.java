import java.util.Scanner;

public class matrixprgm {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		
		int ar[][]=new int[2][3];
	
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
			ar[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
			System.out.println(ar[i][j]+"");
			}
		}System.out.println();
		
		
	}

}
