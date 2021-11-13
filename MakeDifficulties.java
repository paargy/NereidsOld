import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class MakeDifficulties{
	
	// 1st implementation: -----------------------------------	
	private static int numberOfDifficulties = 10;
	private static Difficulty [] difficulties = new Difficulty[numberOfDifficulties];	// initializes difficultis[i] at null.

	private static int counter;
	//public Difficulty(String name, double agility, double organization, double wisdom, double windlessness,
			//double courage, double strength, double animalFriendly, double orientation, double justice) {
	
	public static void makeDifficulties(){
		counter = 0;
		difficulties[0] = new Difficulty("Rocks",2,1,0,0,0,0,0,0,0);
		difficulties[1] = new Difficulty("Swell",0,0,0,1,1,1,0,0,0);
		difficulties[2] = new Difficulty("Pirates",1,1,0,0,1,0,0,0,0);
		difficulties[3] = new Difficulty("Wind",1,1,0,0,0,1,0,0,0);
		difficulties[4] = new Difficulty("Sea Animals",1,0,0,0,1,0,1,0,0);
		difficulties[5] = new Difficulty("Storm",0,0,0,1,1,0,0,1,0);
		difficulties[6] = new Difficulty("Conflict",0,1,1,0,0,0,0,0,1);
		difficulties[7] = new Difficulty("Disorientation",0,0,1,0,0,0,0,2,0);
		difficulties[8] = new Difficulty("Mermaids",0,1,0,0,0,0,2,0,0);
		difficulties[9] = new Difficulty("Sirens",0,0,1,0,0,0,0,2,0);
		arrayShuffle(difficulties);	// shuffles array of difficulties.
	}
	
	public static Difficulty returnRandomDifficulty(){
		if(difficulties[0]==null) {	// checks if makeDifficulties method was used.
			makeDifficulties();
		}
		counter = (counter+1)%numberOfDifficulties;	// increases counter by 1 (has to smaller than numberOfDifficulties bc it will be used in array of difficulties)
		while(difficulties[counter].isDiffFaced()) {
			counter = (counter+1)%numberOfDifficulties;	// continues to increment counter until difficulty has not been faced by user.
		}
		
		return difficulties[counter];	// returns (never faced) difficulty.
		
	}

    // creating a method to shuffle the array - used to shuffle difficulties.
    private static void arrayShuffle(Object[] arr)
    {
        Random rand = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            
            // select index randomly
            int index = rand.nextInt(i + 1);
            
            // swapping between i th term and the index th
            // term
            Object g = arr[index];
            arr[index] = arr[i];
            arr[i] = g;
        }
    }
	
	
	// ------------------------------------------------------

	/*
	// 2nd implementation: (recommended)-----------------------------------------------------------------------------------
	// uses LinkedList of difficulties (difficulties can be removed, added, etc) 
	// like so, difficulties can be removed from list when defeated.
	
	public static LinkedList<Difficulty> totalDifficulties;
	
	private static boolean diffAlreadyCreated = false;
	
	public static LinkedList<Difficulty> makeDifficulties() {
		if(!diffAlreadyCreated) {
			totalDifficulties = new LinkedList<Difficulty>();
			totalDifficulties.add(new Difficulty("Rocks",2,1,0,0,0,0,0,0,0));
			totalDifficulties.add(new Difficulty("Swell",0,0,0,1,1,1,0,0,0));
			totalDifficulties.add(new Difficulty("Pirates",1,1,0,0,1,0,0,0,0));
			totalDifficulties.add(new Difficulty("Wind",1,1,0,0,0,1,0,0,0));
			totalDifficulties.add(new Difficulty("Sea Animals",1,0,0,0,1,0,1,0,0));
			totalDifficulties.add(new Difficulty("Storm",0,0,0,1,1,0,0,1,0));
			totalDifficulties.add(new Difficulty("Conflict",0,1,1,0,0,0,0,0,1));
			totalDifficulties.add(new Difficulty("Disorientation",0,0,1,0,0,0,0,2,0));
			shuffleList(totalDifficulties);	// randomizes the list of difficulties (only once at the beginning).
			diffAlreadyCreated = true;
		}
		return totalDifficulties;
	}
	
	// once a difficulty is defeated, it can be removed -> not repetition of difficulties (takes as parameter object Difficulty).
	public static void removeDifficulty(Difficulty difficulty) {
		totalDifficulties.remove(difficulty);
	}
	
	// removes difficulty by name.
	public static void removeDifficulty(String diffName) {	
		Difficulty d = null;
		
		for(Difficulty i: totalDifficulties) {
			if(diffName.equals(i.getName())) {
				d = i;
				break;
			}
		}
		
		if(d==null) {
			System.out.println("Could not find requested difficulty.");
			return;
		}
		
		removeDifficulty(d);
		
	}
	
	// shuffles default list:
	public static void shuffleList(){
		if(totalDifficulties==null) {	// checks if totalDifficulties has been created.
			makeDifficulties();
		}
		shuffleList(totalDifficulties);
	}
	
	// shuffles list in parameter:
	public static void shuffleList(LinkedList<Difficulty> difficulties) {
		if(difficulties==null) {
			System.out.println("Difficulties have not been created yet.");
			return;
		}
        // creating an Array and storing all data of the
        // list to the array
        Object[] array = difficulties.toArray();
  
        // here we are shuffling more than once
        // shuffle 1
        arrayShuffle(array);
        listDataAdder(array, difficulties);
	}
	
	
	
	// SOURCE: 	https://www.geeksforgeeks.org/how-to-shuffle-elements-in-linkedlist-in-java/ 
    // Creating a data to add shuffled data of the array to
    // the list
    private static void listDataAdder(Object[] arr,
                              LinkedList<Difficulty> list)
    {
        // creating a ListIterator on the LinkedList
        ListIterator<Difficulty> it = list.listIterator();
  
        // Traversing the LinkedList and setting all
        // shuffled data of the array to the list
        for (Object e : arr) {
            it.next();
            it.set((Difficulty) e);
        }
    }
  
    // creating a method to shuffle the array
    private static void arrayShuffle(Object[] arr)
    {
        Random rand = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            
            // select index randomly
            int index = rand.nextInt(i + 1);
            
            // swapping between i th term and the index th
            // term
            Object g = arr[index];
            arr[index] = arr[i];
            arr[i] = g;
        }
    }
    
    public static void printTotalDifficulties() {
    	for(Difficulty i:totalDifficulties) {
    		System.out.println("-------------");
    		System.out.println(i.getName());
        	i.printDiffVec();
    	}
    }
	
	//--------------------------------------------------------------------------------------------------
	*/
}