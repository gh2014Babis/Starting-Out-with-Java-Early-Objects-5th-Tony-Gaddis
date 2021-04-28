
public class LandTract {
	
	private double width;
	private double length;
	
	public LandTract(double w, double l) {
		width = w;
		length = l;
	}
	
	public double getTractArea() {
		return width * length;
	}
	
	@SuppressWarnings("unused")
	private boolean equals(LandTract o) {
		if (o.getTractArea() != this.getTractArea())
			return false;
		return true;
	}
	
	public String toString() {
		return "Tract's area: " + getTractArea();
	}
}
