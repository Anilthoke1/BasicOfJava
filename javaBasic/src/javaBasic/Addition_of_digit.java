package javaBasic;

public class Addition_of_digit {
	public static void main(String[] args) {
		int num=3344,sum=1;
		while(num!=0) {
			int r=num%10;
			sum=sum*r;
			num=num/10;
			
				
		}
	
		System.out.println(sum);
	}

}
