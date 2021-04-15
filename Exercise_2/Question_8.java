public class Question_8 {

	class Bank{

		int getBalance(){ 
			return 0; 
			}

		}
		class BankA extends Bank{
		int getBalance(int balance) 
		{ 
			return balance; 
		}
		}

		class BankB extends Bank{
		int getBalance(int balance) 
		{
			return balance;
			}

		}

		class BankC extends Bank{

		int getBalance(int balance)
		{ 
			return balance; 
		}

		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question_8 q = new Question_8();
		BankA a = q.new BankA();
		BankB b = q.new BankB();
		BankC c = q.new BankC();

		System.out.println("$" +a.getBalance(1000));

		System.out.println("$" +b.getBalance(1500));

		System.out.println("$" +c.getBalance(2000));
	}

}