package springDemo;

import springDemo.service.AdditionalService;

// Constructor injection and setter injection
public class SoccerCoach implements Coach {

	private AdditionalService service;
	private String coachName;
	
	public SoccerCoach(AdditionalService service){
		this.service = service;
	}
	
	@Override
	public String getExercises() {
		return "Soccer Exercises";
	}

	@Override
	public String getAdditionalInformation() {
		
		return service.additionalService() + "\t\t" + coachName;
	}
	
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

}
