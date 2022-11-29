package classAndObjectAssignment;

import java.util.Scanner;

public class Percentage {
	
	int total,grade;
	void marks(int math,int java,int css,int html,int english) {
		 total=math+java+css+html+english;
		
	}
	void data() {
		grade=(total*100)/500;
		
	}
	void grade() {
		if(grade>60)
			System.out.println("1st class");
		else if(grade>50)
			System.out.println("2nd class");
		else if(grade>40)
			System.out.println("3rd class");
		else if(grade>35)
			System.out.println("pass");
		else
			System.out.println("Fail");
		System.out.println("Youe grade is :" +grade);
	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Percentage s=new Percentage();
		System.out.println("enter all subjects marsk");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		s.marks(a, b,c, d,e);
		s.data();
		s.grade();
		sc.close();
	}

}
