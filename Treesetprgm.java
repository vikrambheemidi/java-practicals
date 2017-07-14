import java.util.*;
class EmployeeDetails implements Comparable<EmployeeDetails>{
	String name;
	int id;
	int age;	
	/*public EmployeeDetails(String name, int id, int age) {
		this.name=name;
		this.id=id;
		this.age=age;
	}
*/
	
	
		public int compareTo(EmployeeDetails e){
			if(id>e.id)
			{
				return 1;
			}
			else if(id<e.id){
				return -1;
			}
			else
				return 0;
		}		
}	

public class Treesetprgm{
	public static void main(String args[]){
		Set<EmployeeDetails> obj=new TreeSet<EmployeeDetails>();
		EmployeeDetails e1=new EmployeeDetails("vikram",123,23);
		EmployeeDetails e2=new EmployeeDetails("vicky",12345,23);
		obj.add(e1);
		obj.add(e2);
		for(EmployeeDetails a:obj){
			System.out.println(a.id+" "+a.name+" "+a.age+" " );
		}	
	}
}
