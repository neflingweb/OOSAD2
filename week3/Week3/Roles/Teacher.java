package Week3.Roles;

import java.util.*;

public class Teacher extends Professional {

	protected Collection<Module> teacheson;
	protected Collection<Degree> hasa;
	private String classes;
	private String levelOfEducation;

	public Teacher(String classes, String levelOfEducation){
	this.classes = classes;
	this.levelOfEducation = levelOfEducation;
	
	}
	public String getClasses() {
		return this.classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getLevelOfEducation() {
		return this.levelOfEducation;
	}

	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}

}
