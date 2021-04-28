
public class Coin {
	
	private String sideUp;
	
	public Coin() {
		toss();
	}
	
	public void toss() {
		int randomNumber = (int)Math.round(Math.random());
		if (randomNumber == 0) {
			sideUp = "heads";
		} else {
			sideUp = "tails";
		}
	}
	
	public String getSideUp() {
		return sideUp;
	}
}
