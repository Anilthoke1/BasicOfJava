package forLoop;

public class Demolast {
	public static void main(String[] args) {
		int num=2222,r=0,sum=1,count=0;
		while(num!=0) {
		r=num%10;
		sum=sum*r;
		num=num/10;
		count++;
		}
		System.out.println(sum);
		System.out.println(count);
		
		
		
		
	}

}
