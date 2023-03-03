package springDemo;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// Constructor injection and setter injection through the Spring container
// Inject objects and literal values
public class DependecyInjectionDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("configurationFileForDependencyInjection.xml");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type \"soccer\" or \"football\" or \"tennis\"");
		String userAnswer = scanner.nextLine();
		
		Coach coach = container.getBean(userAnswer, Coach.class);
		System.out.println(coach.getAdditionalInformation());
		
		System.out.println("\n\n");
		
		// Test for values injected from the properties file
		TennisCoach tennisCoach = container.getBean("tennis", TennisCoach.class);
		System.out.println(tennisCoach.coachPersonalInformation());
		
		container.close();
	}
}
