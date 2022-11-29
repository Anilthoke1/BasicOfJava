package polymorphism;

public class Car
{
	int id;String name,milage;
	Car(int id,String name,String milage  ){
		this.id=id;
		this.name=name;
		this.milage=milage;
		
	}
	Car(int id,String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+" \n"+name+"\n"+milage);
	}
	public static void main(String[] args) {
		Car s =new Car(2,"anil","60k");
		Car s1=new Car(2,"sunil");
		s.display();
		s1.display();
	}

}
