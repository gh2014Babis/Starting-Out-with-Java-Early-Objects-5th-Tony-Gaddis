import java.util.*;

public class Challenge19 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] questions = {"Q1", "Q2", "Q3", "Q4", "Q5", "Q6", "Q7", "Q8", "Q9", "Q10"};
		String[][] possibleAnswers = {{"Possible answer #1", "Possible answer #2", "Possible answer #3", "Possible answer #4"},
		                              {"Possible answer #1", "Possible answer #2", "Possible answer #3", "Possible answer #4"},
									  {"Possible answer #1", "Possible answer #2", "Possible answer #3", "Possible answer #4"},
									  {"Possible answer #1", "Possible answer #2", "Possible answer #3", "Possible answer #4"},
									  {"Possible answer #1", "Possible answer #2", "Possible answer #3", "Possible answer #4"},
									  {"Possible answer #1", "Possible answer #2", "Possible answer #3", "Possible answer #4"},
									  {"Possible answer #1", "Possible answer #2", "Possible answer #3", "Possible answer #4"},
									  {"Possible answer #1", "Possible answer #2", "Possible answer #3", "Possible answer #4"},
									  {"Possible answer #1", "Possible answer #2", "Possible answer #3", "Possible answer #4"},
									  {"Possible answer #1", "Possible answer #2", "Possible answer #3", "Possible answer #4"}};							
		int[] correctAnswers = {1, 2, 2, 4, 3, 2, 1, 3, 3, 4};
		Question[] trivia = new Question[10];
		for (int i = 0; i < trivia.length; i++) {
			trivia[i] = new Question();
			trivia[i].setQuestion(questions[i]);
			trivia[i].setPossibleAnswers(possibleAnswers[i]);
			trivia[i].setCorrect(correctAnswers[i]);
		}
		int score1 = 0;
		int score2 = 0;		
		int answer;
		for (int i = 0; i < trivia.length; i++) {
			if (i % 2 == 0) {
				System.out.println("---PLAYER 1---");
				System.out.println("Question: " + trivia[i].getQuestion());
				String[] pa = trivia[i].getPossibleAnswers();
				for (int j = 0; j < 4; j++) {
					System.out.println("->" + pa[j]);
				}
				System.out.print("Enter your answer [1-4]: ");
				answer = input.nextInt();
				while (answer < 1 || answer > 4) {
					System.out.println("Invalid input value");
					System.out.print("Enter your answer [1-4]: ");
					answer = input.nextInt();
				}
				if (answer == trivia[i].getCorrect())
					score1++;
			} else {
				System.out.println("---PLAYER 2---");
				System.out.println("Question: " + trivia[i].getQuestion());
				String[] pa = trivia[i].getPossibleAnswers();
				for (int j = 0; j < 4; j++) {
					System.out.println("->" + pa[j]);
				}
				System.out.print("Enter your answer [1-4]: ");
				answer = input.nextInt();
				while (answer < 1 || answer > 4) {
					System.out.println("Invalid input value");
					System.out.print("Enter your answer [1-4]: ");
					answer = input.nextInt();
				}
				if (answer == trivia[i].getCorrect())
					score2++;
			}
		}
		System.out.println("\nPlayer 1 score: " + score1);
		System.out.println("Player 2 score: " + score2);
		if (score1 > score2)
			System.out.println("PLAYER 1 WINS");
		else if (score1 < score2)
			System.out.println("PLAYER 2 WINS");
		else
			System.out.println("IT'S TIE");
		input.close();
	}
}