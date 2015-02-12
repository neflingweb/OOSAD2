package Week3.Roles;

public class Doctor extends Professional {

	protected Specialisation hasa;
	private String hospital;

	public String getHospital() {
		return this.hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

}