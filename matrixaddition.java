import java.util.Scanner;

public class matrixaddition {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter no. rows");
		int rows=s.nextInt();
		System.out.println("enter no.columns");
        int columns=s.nextInt();
        int a[][]=new int[rows][columns];
        int b[][]=new int[rows][columns];

        int c[][]=new int[rows][columns];
        System.out.println("first matrix");
        for(int i=0;i<rows;i++)
        {
        	for(int j=0;j<columns;j++)
        	{
        		a[i][j]=s.nextInt();
        	}
        }
        System.out.println("second matrix");
        
        for(int i=0;i<rows;i++)
        {
        	for(int j=0;j<columns;j++)
        	{
        		b[i][j]=s.nextInt();
        	}
        }

        for(int i=0;i<rows;i++)
        {
        	for(int j=0;j<columns;j++)
        	{
        	c[i][j]=a[i][j]+b[i][j];
        	}
        }
        System.out.println("sum of two matrix is");
        for(int i=0;i<rows;i++)
        {
        	for(int j=0;j<columns;j++){
        	
        		System.out.print(c[i][j]+"\t");}System.out.println("");
                
        	
        }
        
	}

}
