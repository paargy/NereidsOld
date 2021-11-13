
public class TotalCharacteristics{

	private static double[] charArray; // contains the total amount of characteristics
	
	private static int numberOfCharacteristics;
	
	// initializes charArray -> user gives Nereid Objects.
	public static void totalChars(Nereid n1, Nereid n2, Nereid n3){ //n1, n2, n3 the numbers of 3 nereids
		// it will add up the sum of the characteristics 
		
		numberOfCharacteristics = n1.getNereidVec().length;	// so basically numberOfCharacteristics = 9.
		
		charArray = new double[numberOfCharacteristics];	// creates array of characteristics (initialized with 0s). 
		
		double [] n1Vec = n1.getNereidVec();
		double [] n2Vec = n2.getNereidVec();
		double [] n3Vec = n3.getNereidVec();
		
		for(int i=0; i<numberOfCharacteristics; i++) {
			charArray[i] += n1Vec[i] + n2Vec[i] + n3Vec[i];	// adds individually every characteristic of the 3 nereids -> saves it to corresponding index in charArray. 
		}

	}
	
	
	// initializes charArray -> user gives number in array.
	public static void totalChars(int i1, int i2, int i3){ 
		// it will add up the sum of the characteristics 		
		Nereid [] nereids = makeNereidProfiles.makeNereidProfiles(); 
		
		Nereid n1 = nereids[i1]; 
		Nereid n2 = nereids[i2];
		Nereid n3 = nereids[i3];
		
		totalChars(n1,n2,n3);	// uses totalChars method with Neraids as parameter.
	}

	
	// initializes charArray -> user gives Nereid Objects.
	public static void totalChars(String n1Name, String n2Name, String n3Name){ 
		Nereid [] nereids = makeNereidProfiles.makeNereidProfiles(); 
		
		// initializes nereid references to null:
		Nereid n1 = null;
		Nereid n2 = null; 
		Nereid n3 = null;
		
		// itirates through all created Nereids -> assigns nereids if found (checks by name).
		for(Nereid i: nereids) {
			if(i.getName().equals(n1Name)) {
				n1 = i;
			}
			if(i.getName().equals(n2Name)) {
				n2 = i;
			}
			if(i.getName().equals(n3Name)) {
				n3 = i;
			}
		}
		
		// if nereid was not found (ex incorrect spelling of nereids name):
		if(n1==null||n2==null||n3==null) {
			System.out.println("Could not find requested nereid.");
			return;
		}
		
		totalChars(n1,n2,n3);	// uses totalChars method with Neraids as parameter.

	}
	
	
	// getters and setters -----------------------------------------
	public static double[] getCharArray() {
		return charArray;
	}


	public static void setCharArray(double[] charArray) {
		TotalCharacteristics.charArray = charArray;
	}

	public static double getTotalAgility() {
		return charArray[0];
	}
	public static double getTotalOrganization() {
		return charArray[1];
	}
	public static double getTotalWisdom() {
		return charArray[2];
	}
	public static double getTotalWindlessness() {
		return charArray[3];
	}
	public static double getTotalCourage() {
		return charArray[4];
	}
	public static double getTotalStrength() {
		return charArray[5];
	}
	public static double getTotalAnimalFriendly() {
		return charArray[6];
	}
	public static double getTotalOrientation() {
		return charArray[7];
	}
	public static double getTotalJustice() {
		return charArray[8];
	}
	//------------------------------------------------------------
	
	public static void printCharArray() {
		System.out.println("Agility: "+charArray[0]+"\nOrganization: "+charArray[1]+"\nWisdom: "+charArray[2]+
				"\nWindlessness: "+charArray[3]+"\nCourage: "+charArray[4]+"\nStrength: "+charArray[5]+"\nAnimal Friendly: "+charArray[6]+
				"\nOrientation: "+charArray[7]+"\nJustice: "+charArray[8]);
	}

}


