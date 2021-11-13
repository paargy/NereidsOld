public class Score{
	
	private static int score = 5;	// starting score

	private static int addPoint = 2;
	
	public static void DifficultyOvercome(){
		score+=addPoint;
	}

	public static void minusOne(){  // used every time characteristic does not exist 
		score--;
	}

	
	public static int getAddPoint() {
		return addPoint;
	}

	public static void setAddPoint(int addPoint) {
		Score.addPoint = addPoint;
	}

	// returns score
	public static int getScore() {
		return score;
	}

	// sets score
	public static void setScore(int score) {
		Score.score = score;
	}
	
}