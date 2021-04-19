package Assessment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Employee {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<emp> employees = new ArrayList<emp>();
		SimpleDateFormat obj = new SimpleDateFormat("dd-mm-yyyy");
		employees.add(new emp("Rohit", "Data Analyst", obj.parse("15-01-2010"), 45, 90000));
		employees.add(new emp("Ramesh", "Production", obj.parse("2-12-2009"), 48, 92000));
		employees.add(new emp("Patil", "Marketing", obj.parse("22-09-2008"), 34, 75000));
		System.out.println("1.Sort employees by salary");
		System.out.println("2.Sort employees by age and by date of\r\n" + 
				"joining");
		System.out.println("Enter Your Choice");
		int choice = in.nextInt();
		switch(choice)
		{
			case 1: {
						Collections.sort(employees, new salaryComparator());
						for (int i = 0; i < employees.size(); i++)
						{
							System.out.println(employees.get(i));
						}
						
						break;
					}
			case 2: {
						Collections.sort(employees, new AgeComparator());
						for (int i = 0; i < employees.size(); i++)
						{
							System.out.println(employees.get(i));
						}
						break;
					}
			default:
					break;
		}
	
	}
	}


