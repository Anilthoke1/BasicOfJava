package classAndObject;

public class Employee4 {
	String name,dept; int id,salary;
	void data(String n,int i,String d,int s) {
		name=n;
		id=i;
		dept=d;
		salary=s;
		}

	public  String tostring() {
		return name+" "+id+" "+dept+" "+salary;
	}
	public static void main(String[] args) {
		Employee4 s=new Employee4();
		s.data("anil", 1,"computer", 75236);
		System.out.println(s.tostring());
		
		
	}
}
