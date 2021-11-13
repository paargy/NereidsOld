import java.util.Scanner;

public class GamePlay{

	private static boolean endOfGame = false;
	
	public static void GamePlay(){
		
		if(endOfGame) {	// if game has ended it does nothing.
			return;
		}

		Nereid [] nereids = makeNereidProfiles.makeNereidProfiles(); //makes nereid profiles
		int[] choosedNereids = chooseNereids(nereids);
		TotalCharacteristics.totalChars(choosedNereids[0], choosedNereids[1], choosedNereids[2]); //adds up the total characteristics
		
		int numberOfWaves = 8;
		
		boolean lost = false;

		for (int i = 0; i < numberOfWaves; i ++){
			System.out.println("========= WAVE "+(i+1)+" =========");
			printCurrentTotalChar();	// prints current total characteristics.
			
			Difficulty dif1 = MakeDifficulties.returnRandomDifficulty();
			Difficulty dif2 = MakeDifficulties.returnRandomDifficulty();
			Difficulty dif3 = MakeDifficulties.returnRandomDifficulty();

			int dif = chooseDiff(dif1, dif2, dif3); // will contain the player's choice of one of the three difficulties

			switch (dif){
				case 1:{ 
					FaceDifficulty faceDif1 = new FaceDifficulty(dif1); //dif1 object of the class Difficulty
					break;
				}
				case 2:{
					FaceDifficulty faceDif2 = new FaceDifficulty(dif2); //   =/=
					break;
				}
				case 3:{
					FaceDifficulty faceDif3 = new FaceDifficulty(dif3); //   =/=
					break;
				}
			} 
		
			if (Score.getScore() <= 0){
				System.out.println("Score: "+Score.getScore());
				lost = true;  //if score becomes 0 they lose
				break; //break the for 
			}
			
		}
		
		if(lost) {
			Lose(); //method to be made
		}else{
			Win(Score.getScore()); //method to be made , we need the score to print it 
		}
		endOfGame = true;
	}
	
	private static void Lose() {
		System.out.println("You lost.");
	}
	
	private static void Win(int score) {
		System.out.println("You won with score " + score +"!");
	}
	
	private static int[] chooseNereids(Nereid[] nereids) {
		Scanner input = new Scanner(System.in);
		
		int[] choosedNereids = new int[3];
		System.out.println("Make your choice...\n");
		for(int i=0; i<nereids.length; i++) {
			System.out.print("------\n"+(i+1)+". ");	// prints as "1. (Nereid's name)\nCharacteristics..."
			nereids[i].printNereid();
		}
		int count = 0;
		int choice;
		System.out.print("------\nChoice: ");
		while(count<3) {
			choice = input.nextInt();
			while(choice <= 0 || choice>nereids.length) {
				System.out.print("Wrong choice. Please, try again: ");
				choice = input.nextInt();
			}
			choosedNereids[count] = choice - 1;	// saves the indexes of wanted nereids of the nereid array.
			count++;
		}
	
		return choosedNereids;
	}
	
	private static int chooseDiff(Difficulty diff1, Difficulty diff2, Difficulty diff3) {
		Scanner input = new Scanner(System.in);
		System.out.println("You came across these 3 difficulties. Which do you go against?\n");
		System.out.print("---------\n1. ");
		System.out.println(diff1.getName());
		System.out.print("---------\n2. ");
		System.out.println(diff2.getName());
		System.out.print("---------\n3. ");
		System.out.println(diff3.getName());
		
		System.out.print("------\nChoice: ");
		int choice = input.nextInt();
		while(choice <= 0 || choice>3) {
			System.out.print("Wrong choice. Please, try again: ");
			choice = input.nextInt();
		}
		
		return choice;	
	}
	
	private static void printCurrentTotalChar() {
		System.out.println("=======\nYour current stats are: ");
		TotalCharacteristics.printCharArray();
		System.out.println("===============");
	}
	
}