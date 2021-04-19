package Assessment;
import java.util.*;
public class UserMainCode {
	public static boolean checkPassword(String password){
		boolean validPassword = lCaseLetter(password) && uCaseLetter(password) && hasDigit(password) && hasSpecialChar(password);
		return validPassword;
	}
	
	public static boolean lCaseLetter(String password)
	{
		if(true)
		{
		int count = 0;
		for (int i = 90; i <= 122; i++) {
			  
            char c = (char)i;
            String str1 = Character.toString(c);
            if(password.contains(str1))
            	count = 1;
		}
		if(count==0)
			return false;
		}
		return true;
	}
	
	public static boolean uCaseLetter(String password)
	{
		if (true)
	    { 
	        int count = 0; 
	  
	        for(int i = 65; i <= 90; i++) 
	        { 
	            char c = (char)i;
	            String str1 = Character.toString(c);
	            if(password.contains(str1))
	                count = 1; 
	        } 
	        if (count == 0) 
	            return false; 
	    } 
	  return true;
	}
	
	public static boolean hasDigit(String password)
	{
		if (true)
	    { 
	        int count = 0; 
	        for(int i = 0; i <= 9; i++)
	        {      
	            String str1 = Integer.toString(i); 
	            if(password.contains(str1))	     
	                count = 1; 
	        } 
	        if (count == 0) 
	            return false; 
	    } 
		return true;
	}
	
	public static boolean hasSpecialChar(String password)
	{
		if(true)
		{
			int count = 0;
		String specialChar = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
		for(int i =0; i<password.length(); i++)
		{
			char ch = password.charAt(i);
			if(!(password.contains(specialChar)))
				count = 1;
		}
		if(count ==0)
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = sc.nextLine();
		System.out.println(checkPassword(password) ? "Valid Password" : "Invalid Password");
		
		
	}

}
