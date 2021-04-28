
public class Challenge03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RetailItem it1 = new RetailItem();
		it1.setDescription("Jacket");
		try {
			it1.setUnitsOnHand(12);
		} catch (InvalidUnits e) {
			System.out.println(e.getMessage());
		}
		try {
			it1.setPrice(-59.95);
		} catch (InvalidPrice e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Description: " + it1.getDescription());
		System.out.println("Units on hand: " + it1.getUnitsOnHand());
		System.out.println("Price: " + it1.getPrice());
	}
}
