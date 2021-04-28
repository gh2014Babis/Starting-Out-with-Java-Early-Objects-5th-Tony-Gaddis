
public class Challenge20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin c = new Coin();
		System.out.println("Initial side: " + c.getSideUp());
		int nh = 0, nt = 0;
		String sideUp;
		for (int i = 1; i <= 20; i++) {
			c = new Coin();
			sideUp = c.getSideUp();
			System.out.println(sideUp);
			if (sideUp.equals("heads"))
				nh++;
			else
				nt++;
		}
		System.out.println(nh + " heads");
		System.out.println(nt + " tails");
	}
}
