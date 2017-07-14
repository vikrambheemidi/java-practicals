import java.util.HashMap;
import java.util.Map;

public class Employee {
 String name;
 String id;
 static int age;
	public Employee(String name, int i, int age) {
		
		this.id=i;
		this.name=name;
		this.age=age;
}
	
	public static void main(String args[]){
	HashMap<Integer,Employee> obj=new HashMap<Integer,Employee>();
	Employee e1=new Employee("123abc","vikram",23);
	Employee e2=new Employee("123abcd","vicky",23);
	obj.put(1,e1);
	obj.put(2,e2);
	System.out.println("details of an employee");
	for(Map.Entry<Integer,Employee> s:obj.entrySet()){
		 int key=s.getKey();  
	        Employee b=s.getValue();
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+age+""); 
	}
	 System.out.println("details after remove");  
	obj.remove(2);
	for(Map.Entry<Integer,Employee> s:obj.entrySet()){
		 int key=s.getKey();  
	        Employee b=s.getValue();
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+age+""); 
	}
	 System.out.println("details after update");  
		obj.put(2,e2);
		for(Map.Entry<Integer,Employee> s:obj.entrySet()){
			 int key=s.getKey();  
		        Employee b=s.getValue();
		        System.out.println(key+" Details:");  
		        System.out.println(b.id+" "+b.name+" "+age+""); 
		}
}
}
