import java.util.Scanner;

public class Challenge08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the first runner: ");
		String name1 = input.nextLine();
		System.out.print("Enter the time of the first runner: ");
		int time1 = input.nextInt();
		input.nextLine();
		System.out.print("Enter the name of the second runner: ");
		String name2 = input.nextLine();
		System.out.print("Enter the time of the second runner: ");
		int time2 = input.nextInt();
		input.nextLine();
		System.out.print("Enter the name of the third runner: ");
		String name3 = input.nextLine();
		System.out.print("Enter the time of the third runner: ");
		int time3 = input.nextInt();
		System.out.println("First runner: " + getFirst(name1, name2, name3, time1, time2, time3));
		System.out.println("Second runner: " + getSecond(name1, name2, name3, time1, time2, time3));
		System.out.println("Third runner: " + getThird(name1, name2, name3, time1, time2, time3));
		input.close();
	}
	
	public static String getFirst(String name1, String name2, String name3, int time1, int time2, int time3) {
		int temp1;
		String temp2;
		if (time2 < time1) {
			temp1 = time2;
			time2 = time1;
			time1 = temp1;
			temp2 = name2;
			name2 = name1;
			name1 = temp2;
		}
		if (time3 < time2) {
			temp1 = time3;
			time3 = time2;
			time2 = temp1;
			temp2 = name3;
			name3 = name2;
			name2 = temp2;
		}
		if (time2 < time1) {
			temp1 = time2;
			time2 = time1;
			time1 = temp1;
			temp2 = name2;
			name2 = name1;
			name1 = temp2;
		}
		return name1;
	}
	
	public static String getSecond(String name1, String name2, String name3, int time1, int time2, int time3) {
		int temp1;
		String temp2;
		if (time2 < time1) {
			temp1 = time2;
			time2 = time1;
			time1 = temp1;
			temp2 = name2;
			name2 = name1;
			name1 = temp2;
		}
		if (time3 < time2) {
			temp1 = time3;
			time3 = time2;
			time2 = temp1;
			temp2 = name3;
			name3 = name2;
			name2 = temp2;
		}
		if (time2 < time1) {
			temp1 = time2;
			time2 = time1;
			time1 = temp1;
			temp2 = name2;
			name2 = name1;
			name1 = temp2;
		}
		return name2;
	}
	
	public static String getThird(String name1, String name2, String name3, int time1, int time2, int time3) {
		int temp1;
		String temp2;
		if (time2 < time1) {
			temp1 = time2;
			time2 = time1;
			time1 = temp1;
			temp2 = name2;
			name2 = name1;
			name1 = temp2;
		}
		if (time3 < time2) {
			temp1 = time3;
			time3 = time2;
			time2 = temp1;
			temp2 = name3;
			name3 = name2;
			name2 = temp2;
		}
		if (time2 < time1) {
			temp1 = time2;
			time2 = time1;
			time1 = temp1;
			temp2 = name2;
			name2 = name1;
			name1 = temp2;
		}
		return name3;
	}
}
