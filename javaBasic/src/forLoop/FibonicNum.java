package forLoop;

public class FibonicNum {
	public static void main(String[] args) {
		int num=0,a=0,b=1,c=2,i=0;
	while(num<10) {
		c=a+b;
		a=b;
		b=c;
		
	num++;
		System.out.println(c);
	}
	
	
		
	
	}

}
