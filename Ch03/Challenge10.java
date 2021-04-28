import java.util.Scanner;

public class Challenge10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of your pet: ");
		String name = input.next();
		System.out.print("Enter the type: ");
		String type = input.next();
		System.out.print("Enter the age: ");
		int age = input.nextInt();
		Pet p = new Pet();
		p.setName(name);
		p.setType(type);
		p.setAge(age);
		System.out.println("Name: " + p.getName());
		System.out.println("Type: " + p.getType());
		System.out.println("Age: " + p.getAge());
		input.close();
	}
}
