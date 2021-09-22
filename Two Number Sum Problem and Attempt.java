import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {	
		Set<Integer> numbers = new HashSet<>();
		for(int num : array){
			int potentialnumber = targetSum - num;
			if (numbers.contains(potentialnumber)){
				return new int[] {potentialnumber, num};
			} else {
				numbers.add(num);
			}
		}
    return new int[0];
  }
}
