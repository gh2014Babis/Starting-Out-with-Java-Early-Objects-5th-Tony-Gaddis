
public class CargoShip extends Ship {
	
	private int capacity;
	
	public CargoShip(String name, String builtYear, int capacity) {
		super(name, builtYear);
		this.capacity = capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public String toString() {
		return "Name: " + getName() + ", Capacity: " + getCapacity() + " tonnage";
	}
}
