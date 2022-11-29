package classAndObject;

public class EmployeeP {
	int id;String name,dept;double contact;int salary;int rating;double pfCal;
	void data(int i,String n,String d,double c,int s,int r) {
		id=i;
		name=n;
		dept=d;
		contact=c;
		salary=s;
		rating=r;
		
	}
	void bonus() {
		int bouns=(salary*rating)/100;
		
		System.out.println("bouns is "+bouns);
	}
	void Pf() {
		 pfCal=0.3*salary;
		 System.out.println( "pf is "+pfCal);
		
	}
	void display() {
		System.out.println("employee name is "+name );
		System.out.println("employee salay is "+salary);
		
	
	}
	public static void main(String[] args) {
	EmployeeP s=new EmployeeP();
	 s.data(1,"anil","electronics", 625327632,55555,1);
	 //s.display();
	 new EmployeeP().display();
	 s.bonus();
	 s.Pf();
	
	}
	
	
	

}
