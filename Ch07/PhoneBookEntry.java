public class PhoneBookEntry {

	private String name;
	private String phone;
	
	public PhoneBookEntry(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String toString() {
		return "Name: " + name + " Phone: " + phone;
	}
}