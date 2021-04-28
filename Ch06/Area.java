
public class Area {
	
	public static double getArea(double r) {
		return Math.PI * Math.pow(r, 2);
	}
	
	public static int getArea(int width, int length) {
		return width * length;
	}
	
	public static double getArea(double r, double h) {
		return Math.PI * Math.pow(r, 2) * h;
	}
}
