package encapsulation;

public class Additionn {

	void add(int a,int b) {
		System.out.println(a+" "+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+" "+b+" "+c);
	}
	void add(String a,int b) {
		System.out.println(a+" "+b);
	}
	void add(int a,int b,String  c) {
		System.out.println(a+" "+b+" "+c);
	
	}
	public static void main(String[] args) {
		Additionn s=new Additionn() ;
		s.add(2, 2);
		s.add("a", 8);
		s.add(2, 5, 8);
		s.add(2, 5, "A");
	}
}
