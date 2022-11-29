package staticM;

public class Book {
	Book(){
		this(6);
		System.out.println("it is first block");
	}
	
	Book(int x){
	this(3,4);
		System.out.println(x);
	}
	Book(int x,int y){
		this(4,4,6);
		System.out.println(x+" "+y);
		
	}
	Book(int x,int y,int z){
		
		System.out.println(x+" "+y+" "+z);
		
	}
	
	public static void main(String[] args) {
		Book s=new Book();
		
	}
	

}
