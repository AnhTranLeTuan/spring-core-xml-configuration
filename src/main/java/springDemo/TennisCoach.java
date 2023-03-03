package springDemo;

import springDemo.service.AdditionalService;

// Setter injection
public class TennisCoach implements Coach {
	
	private AdditionalService service;
	private String coachName;
	private String dob;
	private String country;

	@Override
	public String getAdditionalInformation() {
		return service.additionalService() + "\t\t" + coachName;
	}

	@Override
	public String getExercises() {
		return "Tennis Exercises";
	}
	
	public String coachPersonalInformation() {
		return "Coach name: " + coachName + "\n"
			+  "DOB: " + dob + "\n"
			+  "Country: " + country + "\n";
	}
	
	public void setService(AdditionalService service) {
		this.service = service;
	}
	
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


}
