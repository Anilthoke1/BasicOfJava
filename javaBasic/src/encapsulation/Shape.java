package encapsulation;

public class Shape {
void area(int l,int w) {
	System.out.println("area of the rectangle : "+l*w);
}
void area(int l) {
	System.out.println("area of the square : "+l*l);
}
void area(float pi,int r,int h ) {
	System.out.println("area of the sphere : "+ pi*r*h);
}
void area(int a,float pi,int r,int h) {
	System.out.println("area of the cylinder : "+a*pi*r*h);
}
public static void main(String[] args) {
	

Shape s=new Shape();
s.area(2,5);
s.area(3);
s.area(3.14f, 3, 2);
s.area(2, 3.14f, 4, 22);

	
}	
}
