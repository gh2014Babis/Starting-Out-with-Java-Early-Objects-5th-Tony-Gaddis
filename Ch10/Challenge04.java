
public class Challenge04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Month m2 = new Month(14);
			System.out.println("Month name: " + m2.getMonthName());
		} catch (InvalidMonthNumber e) {
			System.out.println(e.getMessage());
		}
		try {
			Month m1 = new Month("Babis");	
			System.out.println("Month number: " + m1.getMonthNumber());
		} catch (InvalidMonthName e) {
			System.out.println(e.getMessage());
		}		
	}
}
