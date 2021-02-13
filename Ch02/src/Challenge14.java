
public class Challenge14 {
	
	final static double COMMISSION_RATE = 0.02;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int shares = 1000;
		double sharePrice = 25.50;
		double amountPaid = shares * sharePrice;
		double amountCom = amountPaid * COMMISSION_RATE;
		double totalAmount = amountPaid + amountCom;
		System.out.println("The amount paid: $" + amountPaid);
		System.out.println("The amount of the commission: $" + amountCom);
		System.out.println("The total amount paid: $" + totalAmount);
	}
}
