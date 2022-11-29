package forLoop;

public class NumberPattern {
public static void main(String[] args) {
	int r=6,k=1;
	for(int i=0;i<=r;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(k+" ");
			k++;
		}
		System.out.println();
	}
}
}
