package demowork;

public class Varaible {
	 static int id; static String name;
	void display(int id,String name ) {
		Varaible.id=id;
		Varaible.name=name;
		
	}
	void dis() {
		
		System.out.println(id+name);
	}
	static {
		System.out.println("static block");
	}
	public static void main(String[] args) {
		Varaible s=new Varaible();
		//System.out.println(s1.id);
		s.display(4,"anil");
		System.out.println(id);
		s.dis();
		
		

	}

	

}
