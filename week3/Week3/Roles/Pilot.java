package Week3.Roles;

public class Pilot extends Professional {

	protected Rating hasa;
	private String licenceNum;
	private String planeType;

	public String getLicenceNum() {
		return this.licenceNum;
	}

	public void setLicenceNum(String licenceNum) {
		this.licenceNum = licenceNum;
	}

	public String getPlaneType() {
		return this.planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

}