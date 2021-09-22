		// Problem : We have an array of integers and a targetSum. 
		// We want to find 2 numbers that add up to targetSum. 
		// Solution: First, we think of having a loop that traverses the array. 
		// Going through each and every number.  With that being done, we compare the value to y.
		// Such that, if targetSum - x = y. We have a potential number.
		// We then store this potential number in a Hashtable until we find a second potential number.
		// Once we have two numbers that add up to the targetSum, we return an array of the values.

import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {	
		//Set up a Hash Table to store the numbers of the array
		Set<Integer> numbers = new HashSet<>();
		//For loop for traversing each number of the array
		for(int num : array){
			//Subtract the current number of the array from the targetSum to find potential number
			int potentialnumber = targetSum - num;
			//If potential number is found in the Hash Table, we return the number and potential
			//number in an array. Otherwise, add number to Hash Table.
			if (numbers.contains(potentialnumber)){
				return new int[] {potentialnumber, num};
			} else {
				numbers.add(num);
			}
		}
    return new int[0];
  }
}