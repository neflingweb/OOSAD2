package Week3.Roles;

public class Degree extends Qualification {

	private String degree;
	private String collegeAttended;

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getCollegeAttended() {
		return this.collegeAttended;
	}

	public void setCollegeAttended(String collegeAttended) {
		this.collegeAttended = collegeAttended;
	}
}