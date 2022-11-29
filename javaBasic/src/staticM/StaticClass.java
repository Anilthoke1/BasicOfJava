package staticM;

public class StaticClass {
	int a=3;
	static int b=6;
	static class Inner{
	void display() {
		int c=3;
		System.out.println(b+c);
	}
	
	}

}
