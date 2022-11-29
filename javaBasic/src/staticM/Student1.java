package staticM;

public class Student1 {
	int a=4;static int b=5;

static void display() {
	Student1 t=new Student1();
	System.out.println(t.a+b);
}
public static void main(String[] args) {
	display()
;
	}
}
