package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomCodeBeanLifeCycleDemoApp {
	// Add custom code during bean life cycle
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("configurationFileForCustomCodeBeanLifeCycle.xml");
		
		Coach coach = container.getBean("football", Coach.class);
		
		System.out.println(coach.getExercises());
		
		container.close();
	}

}
