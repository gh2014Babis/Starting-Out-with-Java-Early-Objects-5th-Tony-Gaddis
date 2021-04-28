import java.util.Scanner;

public class Challenge08_2 {

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
	
	@SuppressWarnings("unused")
	public static String getFirst(String name1, String name2, String name3, int time1, int time2, int time3) {
		String name1st, name2nd, name3rd;
		int time1st, time2nd, time3rd;
		if (time1 < time2) {
			name1st = name1;
			time1st = time1;
			name2nd = name2;
			time2nd = time2;
		} else {
			name1st = name2;
			time1st = time2;
			name2nd = name1;
			time2nd = time1;
		}
		if (time2nd < time3) {
			name3rd = name3;
			time3rd = time3;
		} else {
			name3rd = name2nd;
			time3rd = time2nd;
			if (time3 < time1st) {
				name2nd = name1st;
				time2nd = time1st;
				name1st = name3;
				time1st = time3;				
			} else {
				name2nd = name3;
				time2nd = time3;
			}
		}
		return name1st;
	}
	
	@SuppressWarnings("unused")
	public static String getSecond(String name1, String name2, String name3, int time1, int time2, int time3) {
		String name1st, name2nd, name3rd;
		int time1st, time2nd, time3rd;
		if (time1 < time2) {
			name1st = name1;
			time1st = time1;
			name2nd = name2;
			time2nd = time2;
		} else {
			name1st = name2;
			time1st = time2;
			name2nd = name1;
			time2nd = time1;
		}
		if (time2nd < time3) {
			name3rd = name3;
			time3rd = time3;
		} else {
			name3rd = name2nd;
			time3rd = time2nd;
			if (time3 < time1st) {
				name2nd = name1st;
				time2nd = time1st;
				name1st = name3;
				time1st = time3;
			} else {
				name2nd = name3;
				time2nd = time3;
			}
		}
		return name2nd;
	}
	
	@SuppressWarnings("unused")
	public static String getThird(String name1, String name2, String name3, int time1, int time2, int time3) {
		String name1st, name2nd, name3rd;
		int time1st, time2nd, time3rd;
		if (time1 < time2) {
			name1st = name1;
			time1st = time1;
			name2nd = name2;
			time2nd = time2;
		} else {
			name1st = name2;
			time1st = time2;
			name2nd = name1;
			time2nd = time1;
		}
		if (time2nd < time3) {
			name3rd = name3;
			time3rd = time3;
		} else {
			name3rd = name2nd;
			time3rd = time2nd;
			if (time3 < time1st) {
				name2nd = name1st;
				time2nd = time1st;
				name1st = name3;
				time1st = time3;
			} else {
				name2nd = name3;
				time2nd = time3;
			}
		}
		return name3rd;
	}

}
