package forLoop;

public class Downpattern {
public static void main(String[] args) {
	int r=6;
	for(int i=0;i<=r;i++) {
		for(int j=r;j>=i;j--) {
			System.out.print(" *");
		}
		System.out.println();
	}
}
}
 