
public class FatGram {
	
	private static final double CALORIES_OF_FAT = 9;
	
	private double calories;
	private double fatGrams;
	
	public FatGram(double calories, double fatGrams) {
		this.calories = calories;
		this.fatGrams = fatGrams;
	}
	
	public double getPercentage() {
		double fatCalories = fatGrams * CALORIES_OF_FAT;
		return fatCalories / calories;
	}
}
