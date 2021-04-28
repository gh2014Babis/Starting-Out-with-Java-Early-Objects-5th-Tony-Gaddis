import java.util.Scanner;

public class Challenge10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temparature: ");
		double temperature = Double.parseDouble(input.next());
		FreezeBoil fb = new FreezeBoil();
		fb.setTemperature(temperature);
		if (fb.isEthylFreezing())
			System.out.println("Ethyl alcohol will freeze");
		if (fb.isEthylBoiling())
			System.out.println("Ethyl alcohol will boil");
		if (fb.isOxygenFreezing())
			System.out.println("Oxygen will freeze");
		if (fb.isOxygenBoiling())
			System.out.println("Oxygen will boil");
		if (fb.isWaterFreezing())
			System.out.println("Water will freeze");
		if (fb.isWaterBoiling())
			System.out.println("Water will boil");
		input.close();
	}
}
