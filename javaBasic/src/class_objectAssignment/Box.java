package class_objectAssignment;

import java.util.Scanner;

class BoxVolume{
void parameter(int length,int width,int height) {
	int volume=length*width*height;
	System.out.println("Volume of the Box area is: "+volume);
	
}
	
}

public class Box {
	public static void main(String[] args) {
		BoxVolume s=new BoxVolume();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the box");
		int a=sc.nextInt();
		System.out.println("enter the width of the box");
		int b=sc.nextInt();
		System.out.println("enter the height of the box");
		int c=sc.nextInt();
		s.parameter(a, b, c);
		
		
		
	}

}
