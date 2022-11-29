package classAndObjectAssignment;

import java.util.Scanner;

public class Box {
	
	int length,height, width;
	void volume(int l,int h,int w ) {
		length=l;
		height=h;
		width=w;
	}
	int  display() {
		int volume=length*height*width;
		//System.out.println(volume);
		return volume;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int  b=sc.nextInt();
		int  c=sc.nextInt();
		Box s=new Box();
		s.volume(a, b, c);
		s.display();
		int g=s.display();
		System.out.println(g);
		sc.close();
		
		
		
	}

}
