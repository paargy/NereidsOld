
//public enum dif{ ...}; //dificulty name

public class Difficulty{
	
	private boolean diffFaced;	// says if this difficulty has been faced.
	
	// difficulty's characteristics and name ------
	private String name;
	
	private double agility;
	private double organization;
	private double wisdom;
	private double windlessness;
	private double courage;
	private double strength;
	private double animalFriendly;
	private double orientation;
	private double justice;
	// ---------------------------------------
	
	// Vector representation of difficulty:
	private double[] diffVec;	// used to immediately get characteristics through iteration.
	// ----------------------------------
	
	
	public Difficulty(String name, double agility, double organization, double wisdom, double windlessness,
			double courage, double strength, double animalFriendly, double orientation, double justice) {
		this.diffFaced = false;
		this.name = name;
		this.agility = agility;
		this.organization = organization;
		this.wisdom = wisdom;
		this.windlessness = windlessness;
		this.courage = courage;
		this.strength = strength;
		this.animalFriendly = animalFriendly;
		this.orientation = orientation;
		this.justice = justice;
	
		// initialization of difficulty's vector:
		setDiffVec(new double[]{agility, organization, wisdom, windlessness, courage, strength, animalFriendly, orientation, justice});
	}
	

	// getters & setters for characteristics, name and vector representation: ------

	
	
	public double[] getDiffVec() {
		return diffVec;
	}

	public boolean isDiffFaced() {
		return diffFaced;
	}

	public void setDiffFaced(boolean diffShown) {
		this.diffFaced = diffShown;
	}

	public void setDiffVec(double[] diffVec) {
		this.diffVec = diffVec;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAgility() {
		return agility;
	}
	public void setAgility(double agility) {
		this.agility = agility;
	}
	public double getOrganization() {
		return organization;
	}
	public void setOrganization(double organization) {
		this.organization = organization;
	}
	public double getWisdom() {
		return wisdom;
	}
	public void setWisdom(double wisdom) {
		this.wisdom = wisdom;
	}
	public double getWindlessness() {
		return windlessness;
	}
	public void setWindlessness(double windlessness) {
		this.windlessness = windlessness;
	}
	public double getCourage() {
		return courage;
	}
	public void setCourage(double courage) {
		this.courage = courage;
	}
	public double getStrength() {
		return strength;
	}
	public void setStrength(double strength) {
		this.strength = strength;
	}
	public double getAnimalFriendly() {
		return animalFriendly;
	}
	public void setAnimalFriendly(double animalFriendly) {
		this.animalFriendly = animalFriendly;
	}
	public double getOrientation() {
		return orientation;
	}
	public void setOrientation(double orientation) {
		this.orientation = orientation;
	}
	public double getJustice() {
		return justice;
	}
	public void setJustice(double justice) {
		this.justice = justice;
	}

	// returs instance of difficulty.
	public Difficulty getDifficulty() {
		return this;
	}
	
	public void printDifficulty() {
		System.out.println(name+":");
		System.out.println("Agility: "+diffVec[0]+"\nOrganization: "+diffVec[1]+"\nWisdom: "+diffVec[2]+
							"\nWindlessness: "+diffVec[3]+"\nCourage: "+diffVec[4]+"\nStrength: "+diffVec[5]+"\nAnimal Friendly: "+diffVec[6]+
							"\nOrientation: "+diffVec[7]+"\nJustice: "+diffVec[8]);
	}
	
	
	public void printDiffVec() {
		System.out.println("Agility: "+diffVec[0]+"\nOrganization: "+diffVec[1]+"\nWisdom: "+diffVec[2]+
							"\nWindlessness: "+diffVec[3]+"\nCourage: "+diffVec[4]+"\nStrength: "+diffVec[5]+"\nAnimal Friendly: "+diffVec[6]+
							"\nOrientation: "+diffVec[7]+"\nJustice: "+diffVec[8]);
	}
	
	// -------------------------------------------------------------------------------
	
}

