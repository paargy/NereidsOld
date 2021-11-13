import java.util.LinkedList;

//public Nereid(String name, double agility, double organization, double wisdom, 
			//double windlessness, double courage,
			//double strength, double animalFriendly, double orientation, double justice)


public class makeNereidProfiles{
	
	
	// 1st implementation -> returns array of all neraids (stathero megethos)
	public static Nereid[] makeNereidProfiles() {
		Nereid [] nereids = new Nereid [9]; 
		nereids[0] = new Nereid("Actaea",2,0,2,0,0,0,0,3,1);
		nereids[1] = new Nereid("Doris",0,2,0,2,2,0,3,0,0);
		nereids[2] = new Nereid("Euagore",0,1,2,0,0,0,0,2,1);
		nereids[3] = new Nereid("Eucrate",2,0,0,2,3,2,0,0,0);
		nereids[4] = new Nereid("Eupompe",1,2,2,0,0,1,0,0,0);
		nereids[5] = new Nereid("Thetis",0,4,0,0,0,2,0,1,1);
		nereids[6] = new Nereid("Thoe",4,2,0,2,0,0,0,0,0);
		nereids[7] = new Nereid("Menippe",2,3,0,0,3,0,0,0,0);
		nereids[8] = new Nereid("Ploto",4,1,0,0,2,0,0,0,0);
		return nereids;
	}
	
	/*
	// 2nd implementation -> creates LinkedList of nereids (nereids can be removed, added, etc) --------------
	
	public static LinkedList<Nereid> nereids;
	
	private static boolean neraidsAlreadyCreated = false;	
	
	
	public static LinkedList<Nereid> makeNereidProfiles() {
		if(!neraidsAlreadyCreated) {
			// nereids are added in the list only once (at the beginning of the game).
			nereids = new LinkedList<Nereids>();
			nereids.add(new Nereid("Actaea",2,0,2,0,0,0,0,3,1));
			nereids.add(new Nereid("Doris",0,2,0,2,2,0,3,0,0));
			nereids.add(new Nereid("Euagore",0,1,2,0,0,0,0,2,1));
			nereids.add(new Nereid("Eucrate",2,0,0,2,3,2,0,0,0));
			nereids.add(new Nereid("Eupompe",1,2,2,0,0,1,0,0,0));
			nereids.add(new Nereid("Thetis",0,4,0,0,0,2,0,1,1));
			nereids.add(new Nereid("Thoe",4,2,0,2,0,0,0,0,0));
			nereids.add(new Nereid("Menippe",2,3,0,0,3,0,0,0,0));
			nereids.add(new Nereid("Ploto",4,1,0,0,2,0,0,0,0));
			neraidsAlreadyCreated = true;
		}
		return nereids;
	}


	public static void removeNereid(String nereidName) {
		// searches for nereid name -> deletes nereid if it finds requested name.
		for(Nereid i: nereids) {
			if(nereidName.equals(i.getName())) {
				nereids.remove(i);
				return;
			}
		}
		// requested Nereid was not found -> does not delete anything.
	}
	
	
	public static LinkedList<Nereid> getNereids() {
		return nereids;
	}

	// ------------------------------------------------------------------------------------------------------
	*/
}