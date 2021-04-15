/*Create a class 'Student' with three data members which are name, age and address.
The constructor of the class assigns default values name as "unknown", 
age as '0' and address as "not available". 
It has two members with the same name 'setInfo'. 
First method has two parameters for name and age and assigns 
the same whereas the second method takes has three parameters
which are assigned to name, age and address respectively. 
Print the name, age and address of 10 students. 
Hint - Use array of objects */
import java.util.*;
public class Question_6 {

	public class Student{
		public String name = new String();
		public int age;
		public String address = new String();
		
	 Student(String name, int age, String address)
		{
			this.name = "unknown";
			this.age = 0;
			this.address = "not available";
		}
		
	 void setInfo(String n, int a)
	 {
		 name = n;
		 age = a;
		 /*System.out.println("Details of Student is:");
		 System.out.println("Name: "+name);
		 System.out.println("Age: "+age);*/
	 }
	 	 
	 void setInfo(String n, int a, String ad)
	 {
		 name = n;
		 age = a;
		 address = ad;
	 }
	 
	 void display()
	 {
		 System.out.println("Name: "+name);
		 System.out.println("Age: "+age);
		 System.out.println("Address: "+address);
	 }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stdobj = new Student[10];
		stdobj[0] = new Student("A", 12, "Bnglr");
		stdobj[1] = new Student("B", 11, "Bnglr");
		stdobj[2] = new Student("C", 12, "Bnglr");
		stdobj[3] = new Student("D", 12, "Bnglr");
		stdobj[6] = new Student("E", 12, "Bnglr");
		stdobj[9] = new Student("F", 12, "Bnglr");
		stdobj[0].display();
		stdobj[1].display();
		stdobj[2].display();
		stdobj[3].display();
		stdobj[4].display();
		stdobj[5].display();
		stdobj[6].display();
		stdobj[7].display();
		stdobj[8].display();
		stdobj[9].display();
	}

}