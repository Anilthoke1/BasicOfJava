package javaBasic;

public class Prime_number {
	public static void main(String[] args) {
		int min=24,num,i=0;
		int mid=min/2;
		while(i<=mid) {
			if(min%2==0) {
				break;
			}
			i++;
			
		}
		if(i>min) {
			System.out.println("Prime");
		}else 
			System.out.println("not prime");
	}

}
