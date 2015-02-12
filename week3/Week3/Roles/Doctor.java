package Week3.Roles;

import java.util.*;

public class Doctor extends Professional {

	protected Collection<Specialisation> hasa;
	private String hospital;

	public String getHospital() {
		return this.hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

}