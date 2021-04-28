
public class Geometry {
	
	public static double getCircleArea(double r) {		
		return Math.PI * Math.pow(r, r);
	}
	
	public static double getRectangleArea(double l, double w) {
		return l * w;
	}
	
	public static double getTriangleArea(double b, double h) {
		return b * h * 0.5;
	}
}
