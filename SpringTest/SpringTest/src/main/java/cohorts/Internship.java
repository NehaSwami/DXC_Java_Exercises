package cohorts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Internship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Resource r=new ClassPathResource("applicationContext.xml");  
	        BeanFactory factory=new XmlBeanFactory(r);  
	          
	        Cohorts s=(Cohorts)factory.getBean("cohorts");  
	        s.show(); 
	       DXC d=(DXC)factory.getBean("dxc");  
	        d.show1(); 
	}

}
