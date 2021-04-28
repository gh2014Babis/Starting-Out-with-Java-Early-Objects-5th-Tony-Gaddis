public class Challenge07 {

	public static void main(String[] args) {
		Customer c = new Customer("BBBB", "GGGG 32", "1234567890", 2020, true);
		System.out.println("Name: " + c.getName());
		System.out.println("Address: " + c.getAddress());
		System.out.println("Phone: " + c.getPhone());
		System.out.println("Number: " + c.getNumber());
		System.out.println("Mail list: " + c.getMailList());
	}
}