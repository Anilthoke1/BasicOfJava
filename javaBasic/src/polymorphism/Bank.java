package polymorphism;

import java.util.Scanner;

public class Bank {
	
	
	

	void withdraw(int amount,  Account tt) {
		int accbal=tt.getBalance();
		
		if(accbal>amount) {
			accbal=accbal-amount;
			System.out.println(accbal);
		tt.setBalance (accbal);
		}
	else
		System.out.println("low balance ");
}  
void deposit(int balance) {
		
		int depost=+balance;
		//System.out.println(depost);
		
	}
	public static void main(String[] args) {
	Account s=new Account();
	s.setId(3);
	s.setNumber(74537864);
	s.setBalance(5000);
	Scanner sc=new Scanner(System.in);
	System.out.println("ente the amount");
	int amo=sc.nextInt();
	
	Bank s1=new Bank();
	s1.withdraw(amo, s);
	//s1.deposit( amo);
	
	
	
	}
}
