package containment_hasA;

class Computer{
	int price ,id;String name;
	Motherboard m;
	Computer(int price,int id,String name ,Motherboard m){
		this.id=id;
		this.price=price;
		this.name=name;
		this.m=m;
		
	}
	public String toString() {
		return id+" "+m;
	}
}

class Motherboard{
	int number;String name, size;
	Motherboard(int number,String name,String size){
		this.number=number;
		this.name=name;
		this.size=size;
	}
	public String toString() {
		return name+"added \n"+number;
	}
}


public class ComputerBoard {
	public static void main(String[] args) {
		Motherboard s=new Motherboard(1,"Floppy", "full");
		Computer c=new Computer(5000,5,"hp",s);
		System.out.println(c.toString());
		
		
		
		
	}

}
