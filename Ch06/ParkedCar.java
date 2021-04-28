
public class ParkedCar {
	
	private String make;
	private String model;
	private String color;
	private String licenseNum;
	private int parkedMinutes;
	
	public ParkedCar(String make, String model, String color, String licenseNum, int parkedMinutes) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNum = licenseNum;
		this.parkedMinutes = parkedMinutes;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getLicenseNum() {
		return licenseNum;
	}
	
	public int getParkedMinutes() {
		return parkedMinutes;
	}
	
	public String toString() {
		String str = "Make: " + getMake() + "\n"
				   + "Model: " + getModel() + "\n"
				   + "Color: " + getColor() + "\n"
				   + "License Number: " + getLicenseNum() + "\n"
				   + "Minutes of parking: " + getParkedMinutes();
		return str;
	}
}
