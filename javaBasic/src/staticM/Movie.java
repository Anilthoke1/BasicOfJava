package staticM;

public class Movie {

	int id;String name ,producer;
	
	{
		id=32;
		name="super30";
		producer="nadiawala";
		
	}
	{
		System.out.println("instance block 1");
	}

	Movie(){
		id=4;
		name="super30";
		producer="reliance entr";
		
	}
	void display() {
		
		System.out.println(id+" "+name+" "+producer);
	}
	public static void main(String[] args) {
	Movie s=new Movie();
	s.display();
	System.out.println();
	Movie s1=new Movie();
	s1.display();
	}
}
