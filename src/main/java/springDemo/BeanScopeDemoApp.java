package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	// Bean scope from singleton which is the single instance to prototype which is multiple instances
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("configurationFileForBeanScope.xml");
		
		Coach coach1 = container.getBean("football", Coach.class);
		Coach coach2 = container.getBean("football", Coach.class);
		
		// Check the hash code of the address of each object to demonstrate these two objects are different to each other
		System.out.println(coach1);
		System.out.println(coach2);
		
		container.close();
	}

}
