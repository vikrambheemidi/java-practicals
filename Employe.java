import java.util.Scanner;

public class Employe {

		 private String name;
		    private static double empSal;

		    public Employe(String e, double s){
		        name = e;
		        empSal = s;
		    }

		    public String getname(){
		        return name;
		    }
		    public  double getSalary(){
		        return empSal;

		    }

		    public static void main(String[] args) {

		        Employe[] array = new Employe[10];
		        Scanner sc = new Scanner(System.in);        
		        for(int i = 0; i < 10; i++) {
		            System.out.printf("Please enter your employee name:");
		            String e = sc.next();
		            System.out.printf("Please enter your salary:");
		            double s = sc.nextDouble();
		            array[i] = new Employe(e, s);
		            if(empSal==10000)
		            {
		            	System.out.println("bonus is "+ 10);
		            }
		            if(empSal==50000)
		            {
		            	System.out.println("bonus is "+ 30);
		            }
		            if(empSal==100000)
		            {
		            	System.out.println("bonus is "+ 50);
		            }
		        }
		    }
		}


