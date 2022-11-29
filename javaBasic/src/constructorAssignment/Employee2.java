package constructorAssignment;

public class Employee2 {
	private int id; 
	private String name, salary;
	Employee2(int id,String name,String salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		System.out.println(id+" "+name+" "+salary);
	}
	Employee2(){
		System.out.println(id+" "+name+" "+salary);
	}
	
	
public static void main(String[] args) {
	Employee2 s=new Employee2(5,"Anil","50k");
	Employee2 s1=new Employee2();
	Employee s2=new Employee();
	s2.setId(4);
	System.out.println(s2.getId());
	s2.setName("sunil");
	System.out.println(s2.getName());
	s2.setSalary("60k");
	System.out.println(s2.getSalary());
	

	
}
	
}
