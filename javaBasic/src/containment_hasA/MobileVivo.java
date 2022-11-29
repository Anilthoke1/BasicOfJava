package containment_hasA;

 class Mobile {
	private int id,price;
	Vivo S;
	
	void setId(int id) {
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	void setprice(int price) {
		this.price=price;
	}
	int getPrice() {
		return price;
	}
	void setS(Vivo s) {
		this.S=s;
	}
	Vivo getS() {
		return S;
	}
}

class Vivo{
	private int ime;private String color;
	
	void setIme(int ime) {
		this.ime=ime;
		
	}
	int getIme() {
		return ime;
	}
	void setColor(String color) {
		this.color=color;
	}
	String getcolor() {
		return color;
	}
	public String toString() {
		return color+" "+ime;
	}
}

public class MobileVivo{
	public static void main(String[] args) {
		Vivo d=new Vivo();
		d.setColor("blue");
		d.setIme(2323);
		Mobile h=new Mobile();
		h.setS(d);
		System.out.println(h.getS());
	    

		}
	
}



