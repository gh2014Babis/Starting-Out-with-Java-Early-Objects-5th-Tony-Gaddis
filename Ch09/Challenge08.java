public class Challenge08 {

	public static void main(String[] args) {
		PreferredCustomer pc = new PreferredCustomer("BBBB", "GGGG 32", "1234567890", 2020, true, 2300);
		System.out.println("Name: " + pc.getName());
		System.out.println("Address: " + pc.getAddress());
		System.out.println("Phone: " + pc.getPhone());
		System.out.println("Number: " + pc.getNumber());
		System.out.println("Mail list: " + pc.getMailList());
		System.out.println("Purchases: $" + pc.getPurchases());
		System.out.println("Discount: $" + (pc.getDiscount() * 100) + "%");
	}
}