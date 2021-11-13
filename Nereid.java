//public enum char{ .... };

public class Nereid{

	// nereid's characteristics and name ------
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
	
	// Vector representation of nereid:
	private double[] nereidVec;	// used to immediately get characteristics through iteration.
	// ----------------------------------
	
	
	// constructor for nereid
	public Nereid(String name, double agility, double organization, double wisdom, double windlessness, double courage,
			double strength, double animalFriendly, double orientation, double justice) {
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
		
		// initialization of nereid's vector:
		setNereidVec(new double[]{agility, organization, wisdom, windlessness, courage, strength, animalFriendly, orientation, justice});
		
	}
	
	
	// getters & setters for characteristics, name and vector representation: ------
	public double[] getNereidVec() {
		return nereidVec;
	}


	public void setNereidVec(double[] nereidVec) {
		this.nereidVec = nereidVec;
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
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
	public void printNereid() {
		System.out.println(name+":");
		System.out.println("Agility: "+nereidVec[0]+"\nOrganization: "+nereidVec[1]+"\nWisdom: "+nereidVec[2]+
				"\nWindlessness: "+nereidVec[3]+"\nCourage: "+nereidVec[4]+"\nStrength: "+nereidVec[5]+"\nAnimal Friendly: "+nereidVec[6]+
				"\nOrientation: "+nereidVec[7]+"\nJustice: "+nereidVec[8]);
	}
	
	
	// ---------------------------------------------------
	
	/*
	public getCharacteristics(){
	 	//courage --> 5 (charecteristics from enum table)
		//uigig -->2
	
		// when 0 not stated
		
	}
	*/

}