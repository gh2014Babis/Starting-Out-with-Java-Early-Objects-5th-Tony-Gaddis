
public class Challenge02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String firstName;
		String middleName;
		String lastName;
		
		firstName = "Babis";
		middleName = "Spyros";
		lastName = "Antonopoulos";
		
		char firstInitial = firstName.charAt(0);
		char middleInitial = middleName.charAt(middleName.length() / 2);
		char lastInitial = lastName.charAt(lastName.length() - 1);
		
		System.out.println("First char of " + firstName + ": " + firstInitial);
		System.out.println("Middle char of " + middleName + ": " + middleInitial);
		System.out.println("Last char of " + lastName + ": " + lastInitial);
	}
}
