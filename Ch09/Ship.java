
public class Ship {
	
	private String name;
	private String builtYear;
	
	public Ship(String name, String builtYear) {
		this.name = name;
		this.builtYear = builtYear;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBuiltYear(String builtYear) {
		this.builtYear = builtYear;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBuiltYear() {
		return builtYear;
	}
	
	public String toString() {
		return "Name: " + name + ", Built year: " + builtYear;
	}
}
