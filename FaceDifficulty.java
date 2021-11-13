public class FaceDifficulty{

	private int missing = 0; // counts the difficulties it did not overcome
	private boolean difFaced; //true if it faced the difficulty, false if it did not 
	private int completeDifficulty = 0;
	private boolean doOnce = true;	// the "baloma"
	
	public FaceDifficulty(Difficulty dif){ // constructor that takes the obgect Difficulty as argument 
		double [] totalCharacteristics = TotalCharacteristics.getCharArray();
		
		double [] diffVec = dif.getDiffVec();
		
		for(int i=0; i<9; i++) {
			if(diffVec[i]>0) {
				if(diffVec[i]<=totalCharacteristics[i]) {
					totalCharacteristics[i] -= diffVec[i]; 
					completeDifficulty+=(int)diffVec[i];
				}
				else {
					totalCharacteristics[i] = 0;	// if it cannot face difficulty, it sets corresponding characteristic to 0.
					DifficultyNotFaced();	// method called when the characteristics are not enough to face the difficulty
					dif.setDiffFaced(difFaced);// sets diffFaced to false.
				}
			}
			
			if(completeDifficulty>=3 && doOnce) {
				DifficultyDefeated();	// method called when the characteristics are enough to face the difficulty
				dif.setDiffFaced(difFaced);// sets diffFaced to true.
				System.out.println("You earned "+Score.getAddPoint()+" points");
			}
		}
		
		if(missing!=0) {
			System.out.println("You lost "+missing+" point(s). Your current score is: "+Score.getScore());
		}
		
		System.out.println("Your current score is: "+Score.getScore());

	}
	
	public void DifficultyNotFaced(){
		missing ++;
		difFaced = false;
		Score.minusOne(); // for every missing characteristic 1 point gets removed
	}
	
	public void DifficultyDefeated() {
		difFaced = true;
		doOnce = false;
		Score.DifficultyOvercome();// adds points to score if difficulty has been defeated.
	}

	public int getMissing(){
		return missing;
	}

	public boolean getDifFaced(){
		return difFaced;
	}


}