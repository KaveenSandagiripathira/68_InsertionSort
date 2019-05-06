/*********************************
 * comments
 ********************************/
import java.util.ArrayList;

public class UserOfInsertionSort {
	public static void main(String[] commandLine) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(5);
		myList.add(3);
		myList.add(7);
		myList.add(9);
		myList.add(2);
		myList.add(1);
		myList.add(6);
		myList.add(4);
		myList.add(8);
		myList.add(0);
		System.out.println(myList);
		InsertionSort.insertionSort(myList);
		System.out.println(myList);
	}
}