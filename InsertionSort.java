/*********************************
 * comments
 ********************************/
import java.util.ArrayList;

public class InsertionSort {
	public static void insert1(ArrayList<Integer> list, int numSorted){
		int valueToInsert = list.get(numSorted);
		for (int indexToCompare = numSorted - 1;indexToCompare >= 0;indexToCompare--){
			if (valueToInsert > list.get(indexToCompare)){
				list.set(indexToCompare + 1, valueToInsert); //Drop 
				break;
			}
			else{
				list.set(indexToCompare, list.set(indexToCompare + 1, list.get(indexToCompare))); //Shift
			}
		}	
	}
	public static void insertionSort(ArrayList<Integer> list){
		for (int numSorted = 1; numSorted < list.size(); numSorted++){
			insert1(list, numSorted);
			// for debugging
			System.out.println(numSorted);
			System.out.println( "    dbg: "
						+ "after inserting element " + list.get(numSorted)
						+ " elements: " + list
						);
		}
}
	
}
	