package javaProject;

public class main {

	public static void main(String[] args) {

		calculateScore(true, 800, 5, 100);
		calculateScore(false, 10000, 8, 200);
	}

	public static int calculateScore(boolean gameOver, int score, int leveCompleted, int bonus) {

		if (gameOver) {
			int finalScore = score + (leveCompleted * bonus);
			finalScore += 2000;
			System.out.println("secondFinal Score =" + finalScore);
			return finalScore;
		}

		else {
			int finalScore = -1;
			System.out.println("secondFinal Score =" + finalScore);
			return finalScore;
		}

	}
}
