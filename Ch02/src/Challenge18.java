
public class Challenge18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sharesPurchased = 1000;
		double purchased = sharesPurchased * 32.87;
		double stockbrokerOnPurchase = purchased * 0.02;
		double totalPurchased = purchased + stockbrokerOnPurchase;
		
		int sharesSold = 1000;
		double sold = sharesSold * 33.92;
		double stockbrokerOnSale = sold * 0.02;
		double totalSold = sold - stockbrokerOnSale;
		
		double profit = totalSold - totalPurchased;		
		System.out.println("Profit: " + profit + "$");
	}
}
