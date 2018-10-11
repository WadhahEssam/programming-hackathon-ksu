package challenge;

public class Challenge {

	public static void main(String[] args) {
		// test
	}
	
	public static boolean[] flibTime(boolean bool, int n) {
		boolean[] result = new boolean[n];
		boolean element = bool;
		for (int i = 0; i < result.length; i++) {
			result[i] = element;
			element = !element;
		}
		return result;
	}

	public static String makeTheFirstLetterCapital(String s) {
		String result = "";
		String firstLetter = "";
		String restOfWord = "";
		String[] splittedString = s.split(" ");
		for (int i = 0; i < splittedString.length; i++) {
			firstLetter = splittedString[i].substring(0, 1);
			result = result + firstLetter.toUpperCase();
			restOfWord = splittedString[i].substring(1, splittedString[i].length());
			result = result + restOfWord + " ";
		}
		return result;
	}
	
	
	public static int findMissingElement(int[] numbers, int range) {
		String s = "";
		for (int i = 0; i < numbers.length; i++) {
			s = s + numbers[i] + " ";
		}
		for (int i = 1; i <= range; i++) {
			if(s.indexOf(i+"") == -1) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean findPair(int[] numbers, int sum) {
		for (int i = 0; i < numbers.length; i++) {
			for ( int y = 0; y < numbers.length; y++) {
				if (i == y) 
					continue;
				if (numbers[i] + numbers[y] == sum) {
					System.out.println(numbers[i] + " " + numbers[y]);
					return true;
				}
			}
		}
		return false; 
	}
	
	public static int[] reverse(int[] numbers, int k) {
		int[] reversed = new int[numbers.length]; 
		// copy array
		for (int i = 0; i < numbers.length; i++) {
			reversed[i] = numbers[i];
		}
		for(int i = 0; i < k; i++) {
			reversed[i] = numbers[numbers.length-i-1];
			reversed[reversed.length-i-1] = numbers[i];
		}
		return reversed;
	}
	
	public static int formN(int n) {
		int count = 0;
		int[] numbers = {1, 3, 5};
		for (int i = 0; i < numbers.length; i++) {
			for(int y = 0; y< numbers.length; y++) {
				if((numbers[i] + numbers[y]) == n) {
					count++;
				}
			}
		}
		return count;
	}
}









