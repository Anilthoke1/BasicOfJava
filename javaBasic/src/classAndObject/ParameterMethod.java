package classAndObject;
import java.util.*;
public class ParameterMethod {

		void add(int a,int b) {
			System.out.println(a+b);
		}
		void sub(int a,int b) {
			System.out.println(a-b);
		}
		void multi(int a,int b) {
			System.out.println(a*b);
		}
		void div(int a,int b) {
			System.out.println(a/b);
		}
	public static void main(String[] args) {
		ParameterMethod s=new ParameterMethod();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two number ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		s.add(x, y);
		s.sub(x, y);
		s.div(x, y);
		s.multi(x, y);
		
		
	}

}
