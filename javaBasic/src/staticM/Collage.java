package staticM;

import java.util.Scanner;

public class Collage {
	int sid;String sname;
	static String university="pune university",collage="coep";
	
	Collage(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
		
	}
	void display() {
		System.out.println("student id is "+sid+" & student name is "+sname);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id and name");
		int a=sc.nextInt();
		String b=sc.next();
		Collage s=new Collage(a,b);
		s.display();
		System.out.println(Collage.university+"and collage is"+Collage.collage);
		
	}

}
