/*All the banks operating in India are controlled by RBI. 
RBI has set a well defined guideline (e.g. minimum interest rate, 
minimum balance allowed, maximum withdrawal limit etc)
which all banks must follow. 
For example, suppose RBI has set minimum interest rate applicable 
to a saving bank account to be 4% annually; however, banks are free
to use 4% interest rate or to set any rates above it. 
 
Write a JAVA program to implement bank functionality in the above scenario 
and demonstrate the dynamic polymorphism concept. 
Note: Create few classes namely Customer, Account, RBI (Base Class) 
and few derived classes (SBI, ICICI, PNB etc).
Assume and implement required member variables and functions in each class. */
import java.util.*;
public class Question_7 {
	class Customer{
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		void display()
		{
			System.out.println("Enter name: ");
			name = sc.nextLine();
			System.out.println("Enter age: ");
			age = sc.nextInt();
			System.out.println("Name and age are: "+name+" "+age);
		}
	}
	class Account{
		int accno;
		String acctype;
		Scanner sc = new Scanner(System.in);
		void display()
		{
			System.out.println("Enter account number: ");
			accno = sc.nextInt();
			System.out.println("Enter account type: ");
			acctype = sc.nextLine();
			System.out.println("Account number and account type are: "+ accno +" "+ acctype);
		}
	}
	class RBI
	{
		Scanner sc = new Scanner(System.in);
		public double getROI()
		{
			double roi;
			do {
				System.out.println("Enter Rate Of Interest: ");
				roi = sc.nextDouble();
				if(roi < 4)
				{
					System.out.println("Interest must be greater than 4");
				}
				
			}while(roi<4);
			
			return roi;
		}
		public double getWithdrwalLimit()
		{
			
			System.out.println("Enter maximum withdrawal limit: ");
			double wl = sc.nextDouble();
			return wl;
		}
		public double getMinBalance()
		{
			System.out.println("Enter minimum balance allowed: ");
			double bal = sc.nextDouble();
			return bal;
		}
	}
	class SBI extends RBI
	{
		void display()
		{
		System.out.println("For SBI");
		}
	}
	class ICICI extends RBI
	{
		void display()
		{
		System.out.println("For ICICI");
		}
	}
	class PNB extends RBI
	{
		void display()
		{
		System.out.println("For PNB");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question_7 q = new Question_7();
		/*Customer c = q.new Customer();
		c.display();
		Account a = q.new Account();
		a.display();
		*/
		RBI b;
		b = q.new SBI();
		System.out.println("SBI ROI is: "+ b.getROI());
		System.out.println("SBI Minimum withdrawal amount is: "+ b.getWithdrwalLimit());
		System.out.println("SBI Minimum balance allowed is: "+ b.getMinBalance());
		RBI b1 = q.new ICICI();
		System.out.println("ICICI ROI is: "+ b1.getROI());
		System.out.println("ICICI Minimum withdrawal amount is: "+ b1.getWithdrwalLimit());
		System.out.println("ICICI Minimum balance allowed is: "+ b1.getMinBalance());
		RBI b2 = q.new PNB();
		System.out.println("PNB ROI is: "+ b2.getROI());
		System.out.println("PNB Minimum withdrawal amount is: "+ b2.getWithdrwalLimit());
		System.out.println("PNB Minimum balance allowed is: "+ b2.getMinBalance());
		
	}

}
