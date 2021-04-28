import java.util.Scanner;

public class Challenge06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter the ID: ");
		int id = input.nextInt();
		Payroll emp = new Payroll(name, id);
		System.out.print("Enter the pay rate: ");
		double payRate = Double.parseDouble(input.next());
		System.out.print("Enter the hours worked: ");
		int hoursWorked = input.nextInt();
		emp.setPayRate(payRate);
		emp.setHoursWorked(hoursWorked);
		System.out.println("Name: " + emp.getName());
		System.out.println("ID: " + emp.getID());
		System.out.println("Pay rate: $" + emp.getPayRate());
		System.out.println("Hours worked: " + emp.getHoursWorked());
		System.out.println("Gross pay: $" + emp.grossPay());
		input.close();
	}
}
