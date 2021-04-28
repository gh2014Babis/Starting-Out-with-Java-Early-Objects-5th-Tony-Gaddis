import java.util.Scanner;

public class Challenge07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the date: ");
		String date = input.next();
		input.nextLine();
		System.out.print("Enter the payee's name: ");
		String name = input.nextLine();
		System.out.print("Enter the amount: ");
		double amount = Double.parseDouble(input.next());
		int intPart = (int)amount;
		double cents = amount - intPart;
		System.out.println("\t\t\t\t\t\tDate: " + date);
		System.out.println("Pay to the Order of:\t" + name + "\t\t$" + amount);
		if (cents > 0)
			System.out.println(getStringOfIntPart(intPart) + "dollars and " + Math.round(cents * 100) + " cents");
		else
			System.out.println(getStringOfIntPart(intPart) + "dollars");
		input.close();
	}
	
	public static String getStringOfIntPart(int intPart) {
		String str = "";
		String subStr = "";
		String p = Integer.toString(intPart);
		int size = p.length();
		int n = 0, triada = 0;
		for (int i = p.length() - 1; i >= 0; i--) {
			n++;
			if (n == 1) {
				size--;
				if (Character.getNumericValue(p.charAt(i)) == 1)
					subStr = "one ";
				else if (Character.getNumericValue(p.charAt(i)) == 2)
					subStr = "two ";	
				else if (Character.getNumericValue(p.charAt(i)) == 3)
					subStr = "three ";
				else if (Character.getNumericValue(p.charAt(i)) == 4)
					subStr = "four ";
				else if (Character.getNumericValue(p.charAt(i)) == 5)
					subStr = "five ";
				else if (Character.getNumericValue(p.charAt(i)) == 6)
					subStr = "six ";
				else if (Character.getNumericValue(p.charAt(i)) == 7)
					subStr = "seven ";
				else if (Character.getNumericValue(p.charAt(i)) == 8)
					subStr = "eight ";
				else if (Character.getNumericValue(p.charAt(i)) == 9)
					subStr = "nine ";
			} else if (n == 2) {
				size--;
				if (Character.getNumericValue(p.charAt(i)) == 1) {
					if (Character.getNumericValue(p.charAt(i + 1)) == 0)
						subStr = "ten";
					else if (Character.getNumericValue(p.charAt(i + 1)) == 1)
						subStr = "eleven";
					else if (Character.getNumericValue(p.charAt(i + 1)) == 2)
						subStr = "twelve";	
					else if (Character.getNumericValue(p.charAt(i + 1)) == 3)
						subStr = "thirteen";
					else if (Character.getNumericValue(p.charAt(i + 1)) == 4)
						subStr = "fourteen";
					else if (Character.getNumericValue(p.charAt(i + 1)) == 5)
						subStr = "fifteen";
					else if (Character.getNumericValue(p.charAt(i + 1)) == 6)
						subStr = "sixteen";
					else if (Character.getNumericValue(p.charAt(i + 1)) == 7)
						subStr = "seventeen";
					else if (Character.getNumericValue(p.charAt(i + 1)) == 8)
						subStr = "eighteen";
					else if (Character.getNumericValue(p.charAt(i)) == 9)
						subStr = "nineteen";
				} else if (Character.getNumericValue(p.charAt(i)) == 2) {
					subStr = "twenty " + subStr;
				} else if (Character.getNumericValue(p.charAt(i)) == 3) {
					subStr = "thirty " + subStr;
				} else if (Character.getNumericValue(p.charAt(i)) == 4) {
					subStr = "forty " + subStr;
				} else if (Character.getNumericValue(p.charAt(i)) == 5) {
					subStr = "fifty " + subStr;
				} else if (Character.getNumericValue(p.charAt(i)) == 6) {
					subStr = "sixty " + subStr;
				} else if (Character.getNumericValue(p.charAt(i)) == 7) {
					subStr = "seventy " + subStr;
				} else if (Character.getNumericValue(p.charAt(i)) == 8) {
					subStr = "eighty " + subStr;
				} else if (Character.getNumericValue(p.charAt(i)) == 9) {
					subStr = "ninty " + subStr;
				}					
			} else if (n == 3) {
				size--;
				if (Character.getNumericValue(p.charAt(i)) == 1) {
					subStr = "one hundred " + subStr;
				} else if (Character.getNumericValue(p.charAt(i)) == 2) {
					subStr = "two hundred " + subStr;
				} else if (Character.getNumericValue(p.charAt(i)) == 3) {
					subStr = "three hundred " + subStr;
				} else if (Character.getNumericValue(p.charAt(i)) == 4) {
					subStr = "four hundred " + subStr;
				} else if (Character.getNumericValue(p.charAt(i)) == 5) {
					subStr = "five hundred " + subStr;
				} else if (Character.getNumericValue(p.charAt(i)) == 6) {
					subStr = "six hundred " + subStr;
				} else if (Character.getNumericValue(p.charAt(i)) == 7) {
					subStr = "seven hundred " + subStr;
				} else if (Character.getNumericValue(p.charAt(i)) == 8) {
					subStr = "eight hundred " + subStr;
				} else if (Character.getNumericValue(p.charAt(i)) == 9) {
					subStr = "nine hundred " + subStr;
				}			
			}
			if (size == 0) 
				str = subStr + str;
			if (n == 3 && size > 0) {
				str = subStr + str;
				subStr = "";
				triada++;
				if (triada == 1) {
					if (size > 1 || Character.getNumericValue(p.charAt(i - 1)) > 1)
						str = "thousands " + str;
					else 
						str = "thousand " + str;
				} else if (triada == 2) {
					if (size > 1 || Character.getNumericValue(p.charAt(i - 1)) > 1)
						str = "millions " + str;
					else
						str = "million " + str;
				} else {
					if (size > 1 || Character.getNumericValue(p.charAt(i - 1)) > 1)
						str = "billions " + str;
					else
						str = "billion " + str;
				}
				n = 0;
			}
		}
		return str;
	}
}
