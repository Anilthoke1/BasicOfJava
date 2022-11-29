package class_objectAssignment;

import java.util.Scanner;

class India{
	void sport(String name ) {
		switch (name) {
		case "india":
			System.out.println("India national game is hockey");
			break;
		case "china":
			System.out.println("China national game is Table Tennis");
			break;
		case "bangladesh":
			System.out.println("Bangladesh onal game is kabaddi");
			break;
		case "Italy":
			System.out.println("Italy national game is football");
			break;
		case "america":
			System.out.println("America national game is baseball");
			break;
			
			default:
				System.out.println("not in the list");
		
		}
		
	}
}

public class Game {
	public static void main(String[] args) {
		India s=new India();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the country name " );
		String country=sc.next().toLowerCase();
		s.sport(country);
		
		
		
	}

}
