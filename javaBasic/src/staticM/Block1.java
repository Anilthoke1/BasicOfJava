package staticM;

public class Block1 {
	int a=2;
	static int  b=3;
	
	void display() {
		System.out.println(a+b);
	}
	static {
		System.out.println("its is a first block");
	}

	static {
		System.out.println("its is a second block");
	}

	static {
		System.out.println("its is a third block");
	}
	public static void main(String[] args) {
		Block1 s=new Block1();
		s.display();
		
		}
	

}
