import java.util.*;
public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter a key:");
	    char c = sc.next().charAt(0);   
	   
	
	    switch(c)
	    {
	        case '0': 
	            System.out.println("You pressed 0");
	            break;
            case '1': 
	            System.out.println("You pressed 1");
	            break;
	        case '2': 
	            System.out.println("You pressed 2");
	            break;
	        case '3': 
	            System.out.println("You pressed 3");
	            break;
	        case '4': 
	            System.out.println("You pressed 4");
	            break;
	        case '5': 
	            System.out.println("You pressed 5");
	            break;
	        case '6': 
	            System.out.println("You pressed 6");
	            break;
	        case '7': 
	            System.out.println("You pressed 7");
	            break;
	        case '8': 
	            System.out.println("You pressed 8");
	            break;
	        case '9': 
	            System.out.println("You pressed 9");
	            break;
	        default:
	            System.out.println("Not allowed");
	    }

	}

}
