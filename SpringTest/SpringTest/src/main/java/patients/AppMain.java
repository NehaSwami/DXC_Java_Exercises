package patients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	
	public static void main(String[] args) {
		ApplicationContext objA = new ClassPathXmlApplicationContext("bean.xml");
		Patient p = (Patient)objA.getBean("patient");
		p.show();
	}

}


