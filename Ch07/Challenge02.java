import java.util.Scanner;

public class Challenge02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] employeeId = new int[7];
		int[] hours = new int[7];
		double[] payRate = new double[7];
		double[] wages = new double[7];
		Payroll p = new Payroll(hours, payRate, wages);
		employeeId = p.getEmployeeId();
		int h;
		double pr;
		for (int i = 0; i < employeeId.length; i++) {
			System.out.println("Employee " + employeeId[i]);
			System.out.print("Enter hours: ");
			h = input.nextInt();
			while (h < 0) {
				System.out.println("Invalid input value");
				System.out.print("Enter hours: ");
				h = input.nextInt();
			}
			hours[i] = h;
			System.out.print("Enter pay rate: ");
			pr = Double.parseDouble(input.next());
			while (pr < 6.00) {
				System.out.println("Invalid input value");
				System.out.print("Enter pay rate: ");
				pr = Double.parseDouble(input.next());
			}
			payRate[i] = pr;
			wages[i] = h * pr;
		}
		p.setHours(hours);
		p.setPayRate(payRate);
		p.setWages(wages);
		for (int i = 0; i < employeeId.length; i++) {
			System.out.println("ID: " + employeeId[i] + " Gross Wages: $" + wages[i]);
		}
		System.out.print("Enter an ID: ");
		int id = input.nextInt();
		int pos = find(employeeId, id);
		if (pos != -1) {
			System.out.println("Gross pay: $" + p.getGrossPayOfID(id));
		} else {
			System.out.println("The ID " + id + " does not exist");
		}
		input.close();
	}
	
	public static int find(int[] employeeId, int id) {
		int pos = -1;
		int i = 0;
		while (i < employeeId.length && pos == -1) {
			if (employeeId[i] == id)
				pos = i;
			else
				i++;
		}
		return pos;
	}
}
