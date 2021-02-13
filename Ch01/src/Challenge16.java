
public class Challenge16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int customers = 15000;
		long energy = Math.round(customers * 0.18); //(long)(customers * 0.18);
		long citrus = Math.round(energy * 0.58); // (long)(energy * 0.58);
		System.out.println("Energy drinks per week: " + energy);
		System.out.println("Citrus-flavored energy drinks per week: " + citrus);
	}
}
