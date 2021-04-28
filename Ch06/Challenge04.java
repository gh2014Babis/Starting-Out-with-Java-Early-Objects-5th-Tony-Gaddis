import java.util.Scanner;

public class Challenge04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the width of first tract: ");
		double width1 = Double.parseDouble(input.next());
		System.out.print("Enter the length of first tract: ");
		double length1 = Double.parseDouble(input.next());
		LandTract lt1 = new LandTract(width1, length1);
		System.out.print("Enter the width of second tract: ");
		double width2 = Double.parseDouble(input.next());
		System.out.print("Enter the length of second tract: ");
		double length2 = Double.parseDouble(input.next());
		LandTract lt2 = new LandTract(width2, length2);
		System.out.println("1 " + lt1);
		System.out.println("2 " + lt2);
		if (lt1.equals(lt2)) {
			System.out.println("The two tracts are equals");
		} else {
			System.out.println("The two tracts are not equals");
		}
		input.close();
	}
}
