package forLoop;

import java.util.Scanner;

class Students{
	void name(String name) {
		System.out.println(name);
	}
	
	void grade(int math,int english,int java,int html,int css) {
		int greade=math+english+java+html+css;
	 int total=(greade*100)/500;
		System.out.println(total);
		
	}
	
}


public class Percentage {
	public static void main(String[] args) {
		Students s=new Students();
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	s.name(name);
	int m=sc.nextInt();
			int e=sc.nextInt();
			int j=sc.nextInt();
					int h=sc.nextInt(),
					c=sc.nextInt();
	s.grade(m, e, j, h, c);
	sc.close();
	

	
	}
}

