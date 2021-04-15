import java.util.*;
public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in); 
		    System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
		    System.out.println("a. int 1x=10; ");
		    System.out.println("b. int x=10;");
		    System.out.println("c. float x=10.0f;");
		    System.out.println("d. string x=\"10\";");
		    System.out.println("Enter your choice");
		    char c = sc.next().charAt(0);
		    switch(c)
		    {
		        case 'a': System.out.println("Wrong answer!");
		                break;
		        case 'b': System.out.println("Right answer!");
		                break;
		        case 'c': System.out.println("Wrong answer!");
		                break;
		        case 'd': System.out.println("Wrong answer!");
		                break;
		        default: System.out.println("Enter a choice!");
		    }
	}

}
