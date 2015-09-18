package springAOP.Tutorials;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) { 
		BasicConfigurator.configure();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	    Performer performer = (Performer)context.getBean("performerBean"); 
	    performer.doSmth(); 
	 } 
}
