package inheritance;

public class PersonMain {
	public static void main(String[] args) {
		
	
	Student s=new Student();
	s.percentage(45, 45, 45, 45, 45);
	s.setCollage("COEP");
	System.out.println(s.toString());
	Faculty f=new Faculty();
	f.setSalary(500000);
	f.setSubject(5);
	f.pfCalculator();
	

	}
}
