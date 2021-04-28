import java.util.Scanner;

public class Challenge05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Payroll emp = new Payroll();
		try {
			System.out.print("Enter the employee's name: ");
			String name = input.nextLine();
			emp.setName(name);
		} catch (InvalidEmployeeName e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.print("Enter the ID: ");
			int id = input.nextInt();
			emp.setIDNumber(id);
		} catch (InvalidIDNumber e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.print("Enter the pay rate: ");
			double payRate = Double.parseDouble(input.next());
			emp.setPayRate(payRate);
		} catch (InvalidHourlyPayRate e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.print("Enter the hours worked: ");
			int hoursWorked = input.nextInt();
			emp.setHoursWorked(hoursWorked);
		} catch (InvalidHoursWorked e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Name: " + emp.getName());
		System.out.println("ID: " + emp.getID());
		System.out.println("Pay rate: $" + emp.getPayRate());
		System.out.println("Hours worked: " + emp.getHoursWorked());
		System.out.println("Gross pay: $" + emp.grossPay());
		input.close();
	}
}
