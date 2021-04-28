
public class RoulettePocket {
	
	private int pocketNumber;
	
	public RoulettePocket(int pocketNumber) {
		this.pocketNumber = pocketNumber;
	}
	
	public String getPocketColor() {
		String color;
		if (pocketNumber == 0) {
			color = "Green";
		} else if (pocketNumber <= 10) {
			if (pocketNumber % 2 == 0)
				color = "Black";
			else
				color = "Red";
		} else if (pocketNumber <= 18) {
			if (pocketNumber % 2 == 0)
				color ="Red";
			else 
				color = "Black";
		} else if (pocketNumber <= 28) {
			if (pocketNumber % 2 == 0)
				color = "Black";
			else 
				color = "Red";
		} else {
			if (pocketNumber % 2 == 0)
				color = "Red";
			else
				color = "Black";
		}
		return color;
	}
}
 