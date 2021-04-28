
public class Employee {
	
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setIDNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	
	public int getIDNumber() {
		return idNumber;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("ID Number: " + idNumber);
		System.out.println("Department: " + department);
		System.out.println("Position: " + position);
	}
}
