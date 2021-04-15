import java.util.*;
public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice;
		String con="y";

		Scanner sc = new Scanner(System.in);
		System.out.println("What is the command keyword to exit a loop in Java?");
		System.out.println("a.quit");
		System.out.println("b.continue");
		System.out.println("c.break");
		System.out.println("d.exit");
		while (con.compareTo("y")==0)
		{

		System.out.print("Enter your choice:");
		choice =sc.nextLine();

		if (choice.compareTo("c")==0)
		{
		System.out.println("Congratulation!");
		}
		else if (choice.compareTo("q")==0 || choice.compareTo("e")==0) {  System.out.println("Exiting...!"); break; }else System.out.println("Incorrect!");

System.out.print("Again? press y to continue:");
con =sc.nextLine();
	}

	}
}
