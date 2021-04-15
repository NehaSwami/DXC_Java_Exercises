import java.util.*;
public class Question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String fname = sc.nextLine();
		System.out.println("Enter middle name: ");
		String mname = sc.nextLine();
		System.out.println("Enter last name: ");
		String lname = sc.nextLine();
		
		System.out.println("Name is "+ fname.substring(0,1)+ "."+ mname.substring(0,1)+"."+lname);
	}

}