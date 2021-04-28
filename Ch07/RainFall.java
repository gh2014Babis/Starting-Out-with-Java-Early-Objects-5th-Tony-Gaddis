
public class RainFall {
	
	private double[] rainfall;
	
	public RainFall(double[] rainfall) {
		this.rainfall = new double[rainfall.length];
		for (int i = 0; i < rainfall.length; i++)
			this.rainfall[i] = rainfall[i];
	}
	
	public double getTotal() {
		double total = 0;
		for (int i = 0; i < rainfall.length; i++) {
			total += rainfall[i];
		}
		return total;
	}
	
	public double getAvg() {
		return getTotal() / 12;
	}
	
	public int getMax() {
		int posMax = 0;
		for (int i = 1; i < rainfall.length; i++) {
			if (rainfall[i] > rainfall[posMax])
				posMax = i;
		}
		return posMax;
	}
	
	public int getMin() {
		int posMin = 0;
		for (int i = 1; i < rainfall.length; i++) {
			if (rainfall[i] < rainfall[posMin])
				posMin = i;
		}
		return posMin;
	}
}
