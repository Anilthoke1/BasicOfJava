package demowork;

class Car{
	void run(int km,int speed) {
		System.out.println(km+speed);
	}
}
class Bus extends Car{
	void run(int km,int speed) {
		super.run(km, speed);
		System.out.println(km+" "+speed);
	}
}




public class Overide {
	public static void main(String[] args) {
		Bus t=new Bus();
		t.run(55, 100);
		
	}

}
