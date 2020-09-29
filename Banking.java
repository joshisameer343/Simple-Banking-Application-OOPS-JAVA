
import java.util.Scanner;

public class Banking {   
   public static void main(String[] args) {
		BankAccount obj1= new BankAccount("Sam","BA001234");
		obj1.showMenu();
		
   }
}

class BankAccount
{
	int balance;
	int previousTransaction;
	String name;
	String id;
	
	BankAccount(String cname,String cid)
	{
		name=cname;
		id=cid;
		
	}
	
	void deposit(int amount)
	{
		if(amount>0)
		{
			balance=balance+amount;
			previousTransaction=amount;
		}
		else
		{
			System.out.println("invalid amount");
		}
	}
	
	void withdraw(int amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance=balance-amount;
			previousTransaction= -amount;
		}
		else
		{
			System.out.println("invalid amount");
		}
	}
	
	void previousTransaction(){
		
		
		System.out.println(previousTransaction);
	}
	
	void showMenu()
	{
		char option='\0';
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome "+name);
		System.out.println("Your ID is "+id);
		System.out.println("\n");
		System.out.println("A. Check Balance ");
		System.out.println("B. Deposit ");
		System.out.println("C. Withdraw ");
		System.out.println("D. Previous Transation");
		System.out.println("E. Exit ");
		
		do
		{
			System.out.println("=============================================");
			System.out.println("Choose Option");
			System.out.println("=============================================");
			option=sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
				{
					case 'A':
						System.out.println("Your Balance is : " +balance);
						break;
					case 'B':
						System.out.println("Enter amount to be deposited");
						int amount1=sc.nextInt();
						deposit(amount1);
						System.out.println("Your acoount credited with : "+amount1);
						System.out.println("\n");
						break;
						
					case 'C':
						System.out.println("Enter amount to withdraw");
						int amount2=sc.nextInt();
						withdraw(amount2);
						System.out.println("\n");
						break;
						
					case 'D':
						
						previousTransaction();
						System.out.println("\n");
						break;
						
					default:
						System.out.println("Invalid Option");
				}
			}while(option != 'E');
			
			System.out.println("Thank You for using our services");
			
			
	}
}