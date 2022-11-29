package encpsulationAssignment;

class Department{
	int id;String name;
	public Department(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	public String toString () {
		return id+" "+name;
	}
	
}
public class Student  {
	int roll;String name;
	Department s;
	public Student(int roll,String name,Department s) {
		this.roll=roll;
		this.name=name;
		this.s=s;
		
	}
	public String toString () {
		return roll+" "+name+" "+ s;
	}
	public static void main(String[] args) {
		Department d=new Department(1, "anil");
		System.out.println(d.toString());
		Student t=new Student(2,"sunil",d);
		System.out.println(t.toString());
		
	}
	

}
