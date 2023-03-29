package week3codingassignment;

public class Week3codingassignment {

	public static void main(String[] args) {
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int result = ages[ages.length - 1] - ages[0];
		System.out.println(result);
		
		int sum = 0;
		for (int number : ages) {
			sum += number;
		}
		int average = sum / ages.length;
		System.out.println(average);
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int sumNames = 0;
		for (String name: names) {
			sumNames += name.length();
		}
		int averageNameLength = sumNames / names.length;
		System.out.println(averageNameLength);
		
		String allNames = "";
		for (String name: names) {
			allNames += name + " ";
		}
		System.out.println(allNames);
		
		int[] nameLengths = new int [names.length];
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		int sumNameLengths = 0;
		for (int length: nameLengths) {
			sumNameLengths += length;
		}
		System.out.println(sumNameLengths);
		
		System.out.println(allNames("Hello", 3));
		System.out.println(fullName("Marcus", "Fenix"));
		System.out.println(sumGreater100(ages));
		
		double[] agesDouble = {3, 9, 23, 64, 2, 8, 28, 93, 72};
		System.out.println(averageDouble(agesDouble));
		
		double[] tryDouble = {3, 9, 23, 64, 2, 8, 28, 93, 72};
		System.out.println(isaverageGreater(agesDouble, tryDouble));
		
		
		System.out.println("I will buy a drink: " + willBuyDrink(false, 12.75));
		System.out.println("I will buy a drink: " + willBuyDrink(true, 12.75));
		
		System.out.println("The names array contains 'Sam': " + arrayContains(names, "Sam"));
		
		
		
			
	}
	
	public static String allNames(String word, int n) {
		String resultStr = "";
		for (int i = 0; i < n; i++) {
			resultStr += word;
		}
		return resultStr;
	}
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public static boolean sumGreater100(int[] arr) {
		int sum = 0;
		for (int num: arr) {
			sum += num;
		}
		return sum > 100;
	}
	public static double averageDouble(double[] arr) {
		double sum = 0;
		for (double num: arr) {
			sum += num;
		}
		return sum / arr.length;
	}
	public static boolean isaverageGreater(double[] arr1, double[] arr2) {
		double sum1 = 0;
		double sum2 = 0;
		for (double num : arr1) {
			sum1 += num;
		}
		for (double num2: arr2) {
			sum2 += num2;
		}
		return (sum1 / arr1.length) > (sum2 / arr2.length);
	}
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && (moneyInPocket > 10.50);
	}
	
	public static boolean arrayContains(String[] arr, String word) {
		for (String name: arr) {
			if (name.equals(word)) {
				return true;
			}
		}
		return false;
	}
}
