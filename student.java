import java.util.Scanner;

public class student {
	 private String name;
	    private static double age;

	    public student(String e, double s){
	        name = e;
	        age = s;
	    }

	    public String getname(){
	        return name;
	    }
	    public  double getage(){
	        return age;

	    }

	    public static void main(String[] args) {

	        student[] array = new student[4];
	        Scanner sc = new Scanner(System.in);        
	        for(int i = 0; i < 4; i++) {
	            System.out.printf("Please enter your employee name:");
	            String e = sc.next();
	            System.out.printf("Please enter your salary:");
	            double s = sc.nextDouble();
	            array[i] = new student(e, s);
	        }
	          
	            if(age>18)
	            {
	            	
	            	for(int j=0;j<4;j++)
	            	{
	            		
	            	System.out.println("count"+j);}
	            }
	        }
	    }
	



