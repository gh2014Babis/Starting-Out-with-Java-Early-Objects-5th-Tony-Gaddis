
public class RoomDimension {
	
	double width;
	double length;
	
	public RoomDimension(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double getArea() {
		return width * length;
	}
	
	public String toString() {
		return "Room's area: " + getArea();
	}
}
