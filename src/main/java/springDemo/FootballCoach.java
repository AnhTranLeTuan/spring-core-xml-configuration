package springDemo;

import springDemo.service.AdditionalService;

// Constructor injection and setter injection
public class FootballCoach implements Coach {
	
	private AdditionalService service;
	private String coachName;
	
	public FootballCoach() {}
	
	public FootballCoach(AdditionalService service){
		this.service = service;
	}
	@Override
	public String getExercises() {
		return "Football Exercises";
	}

	@Override
	public String getAdditionalInformation() {
		
		return service.additionalService() + "\t\t" + coachName;
	}
	
	public void initFunction() {
		System.out.println("Tasks during bean initialization");
	}
	
	public void destroyFunction() {
		System.out.println("Tasks during bean destruction");
	}
	
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	
}
