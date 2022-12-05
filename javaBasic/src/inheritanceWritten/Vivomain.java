package inheritanceWritten;



class Mobile {
	void battery() {
		System.out.println("battary available ");
	}
	void microphone() {
		System.out.println(" microphonr available");
	}

}
  class Vivo extends Mobile {
		int price; String screenTouch;
		
		void vivoDis(int price,String Stouh) {
			this.price=price;
			this.screenTouch=Stouh;
			super.battery();
			super.microphone();
			System.out.println("price is"+price +" and"+"screenTouch"+screenTouch);
			
		}

	}

public class Vivomain {
	public static void main(String[] args) {
		Vivo v=new Vivo();
		v.battery();
		v.microphone();
		v.vivoDis(25000, "yes");
		
	}

}
