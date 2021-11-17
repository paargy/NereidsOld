public class Score{
  static int score = 5;
  public static int DificultyOvercome(){
    score += 2;
    return score;
  }
  public static int minusOne(){ // used every time characteristic does not exist
    score -= 1;
    return score;
  }
}