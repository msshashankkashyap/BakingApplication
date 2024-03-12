package BankingApplication;

import java.util.Scanner;

public class Bankingapplication {

	public static void main(String[] args) {
		
		BankAccount ba=new BankAccount();
		
		ba.showMenu();
		
	}

}
class BankAccount
{
	int balance;
	int previousTranscation;
	String customerName;
	String customerId;
	
	BankAccount( )
	{
		System.out.println("enter the customer name");
		Scanner sc=new Scanner(System.in);
		
		this.customerName=sc.nextLine();
		System.out.println("Enter the customer id");
		this.customerId=sc.nextLine();
		
	}
	void deposit(int amount) 
	{
		if(amount>=0) {
			balance=balance+amount;
			previousTranscation=amount;
		}
		else
		{
			System.out.println("Please enter the correct input");
		}
	}
	void withdraw(int amount) {
		if(amount>=0) {
			balance=balance-amount;
			previousTranscation=-amount;
		}else
		{
			System.out.println("Please enter the correct input");
		}
	}
	void getprevoiusTransaction() {
		if(previousTranscation>0) {
			System.out.println("Deposited: "+previousTranscation);
		}
		else if(previousTranscation<0) {
			System.out.println("Withdraw:"+Math.abs(previousTranscation));
		}
		else
		{
			System.out.println("No transaction occured");
		}
	}
	void showMenu() 
	{
		char option='\0';
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome "+customerName);
		System.out.println("Your ID is  "+customerId);
		System.out.println("\n");
		System.out.println("A.Check Balance");
		System.out.println("B.Deposit");
		System.out.println("C.Withdraw");
		System.out.println("D.Previous transaction");
		System.out.println("E.Exit ");
		
		do 
		{
			System.out.println("--------------------------------------");
			System.out.println("enter an option");
			System.out.println("--------------------------------------");
			option=sc.next().charAt(0);
			
			
			switch(option) {
			case'A':
				System.out.println("-----------------------------------");
				System.out.println("Your aCcount balance is: "+balance);
				System.out.println("-----------------------------------");
				break;
			case 'B':
				System.out.println("-----------------------------------");
				System.out.println("Enter the amount to deposit ");
				System.out.println("-----------------------------------");
				int amount=sc.nextInt();
				deposit(amount);
				
				break;
			case 'C':
				System.out.println("-----------------------------------");
				System.out.println("Enter the amount to withdraw:");
				int amount2=sc.nextInt();
				withdraw(amount2);
				
				break;
			case'D':
				System.out.println("-----------------------------------");
				getprevoiusTransaction();
				System.out.println("-----------------------------------");
				
				break;
			case'E':
				System.out.println("-----------------------------------");
				break;
				default:
					System.out.println("Invalid Option!!.Please enter again");
					break;
			}
		}
		while(option!='E') ;
			System.out.println("Thank you for using our services");
		
			
		
	}
}