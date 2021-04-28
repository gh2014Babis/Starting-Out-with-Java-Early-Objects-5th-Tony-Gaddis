import java.util.*;

public class Lottery {

	private int[] lotteryNumbers = new int[5];
	
	public Lottery() {
		Random rand = new Random();
		for (int i = 0; i < lotteryNumbers.length; i++) {
			boolean found = true;
			while (found) {
				this.lotteryNumbers[i] = rand.nextInt(10);
				if (!find01(this.lotteryNumbers[i], i))
					found = false;
			}
		}
	}
	
	public boolean find01(int number, int idx) {
		int i = 0;
		while (i < idx) {
			if (lotteryNumbers[i] == number)
				return true;
			i++;
		}
		return false;
	}
	
	public boolean find02(int number) {
		int i = 0;
		while (i < lotteryNumbers.length) {
			if (lotteryNumbers[i] == number)
				return true;
			i++;
		}
		return false;
	}
	
	public int compare(int[] playerNumbers) {
		int total = 0;
		for (int i = 0; i < playerNumbers.length; i++) {
			if (find02(playerNumbers[i]))
				total++;
		}
		return total;
	}
	
	public int[] getLotteryNumbers() {
		return lotteryNumbers;
	}
}