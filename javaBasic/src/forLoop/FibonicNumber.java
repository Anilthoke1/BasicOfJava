package forLoop;

public class FibonicNumber {
	public static void main(String[] args) {
		int a=0,b=1,c,count=10;
		for(int i=0;i<count;i++) {
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
			
			
		}
		
		
	}

}
