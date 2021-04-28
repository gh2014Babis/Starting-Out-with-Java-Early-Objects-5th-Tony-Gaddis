import java.util.Scanner;

public class Challenge17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.next();
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		System.out.print("Enter your city: ");
		String city = input.next();
		System.out.print("Enter your college: ");
		String college = input.next();
		System.out.print("Enter your profession: ");
		String profession = input.next();
		System.out.print("Enter a type of animal: ");
		String animal = input.next();
		System.out.print("Enter the pet's name: ");
		String petName = input.next();
		System.out.print("There once was a person named " + name + " who lived in " + city +". At the age of " + age + ", \n"
                         + name + " went to college at " + college + ". " + name + " graduated and went to work as a \n"
                         + profession + ". Then, " + name + " adopted a(n) " + animal + " named " + petName + ". They both lived \n"
                         + "happily ever after! ");
		input.close();
	}
}
