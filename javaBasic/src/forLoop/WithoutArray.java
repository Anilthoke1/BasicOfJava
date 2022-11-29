package forLoop;

import java.util.Scanner;

public class WithoutArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,d,freq=0;
		num=sc.nextInt();
		d=sc.nextInt();
		while(num!=0) {
			if(num%10==d) {
				freq++;
				
			}
			num=num/10;
		}
		System.out.println(freq);
		sc.close();
		
		
		
	}
}
