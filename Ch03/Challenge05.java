
public class Challenge05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RetailItem it1 = new RetailItem();
		it1.setDescription("Jacket");
		it1.setUnitsOnHand(12);
		it1.setPrice(59.95);
		RetailItem it2 = new RetailItem();
		it2.setDescription("Designer Jeans");
		it2.setUnitsOnHand(40);
		it2.setPrice(34.95);
		RetailItem it3 = new RetailItem();
		it3.setDescription("Shirt");
		it3.setUnitsOnHand(20);
		it3.setPrice(24.95);
		System.out.println("Description: " + it1.getDescription());
		System.out.println("Units on hand: " + it1.getUnitsOnHand());
		System.out.println("Price: " + it1.getPrice());
		System.out.println("********************");
		System.out.println("Description: " + it2.getDescription());
		System.out.println("Units on hand: " + it2.getUnitsOnHand());
		System.out.println("Price: " + it2.getPrice());
		System.out.println("********************");
		System.out.println("Description: " + it3.getDescription());
		System.out.println("Units on hand: " + it3.getUnitsOnHand());
		System.out.println("Price: " + it3.getPrice());
	}
}
