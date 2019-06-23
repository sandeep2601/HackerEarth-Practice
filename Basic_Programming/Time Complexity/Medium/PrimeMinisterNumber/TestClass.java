// Total Time Taken : 1.75764s

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class TestClass {
	public static void main(String args[]) throws Exception {
 
		int splittedNumbers[]; // declaring array
		splittedNumbers = new int[2]; // allocating memory to array
		splittedNumbers = readInput();
		// ArrayList<Integer> secretNumbers = new ArrayList<Integer>();
		StringBuilder stringBuilderConcat = new StringBuilder();
 
		for (int i = splittedNumbers[0]; i <= splittedNumbers[1]; i++) {
			if (isPrimeTwo(i)) {
				if (isPrimeTwo(sumOfIndividualDigits(i))) {
					// secretNumbers.add(i);
					stringBuilderConcat.append(i);
					stringBuilderConcat.append(" ");
				}
			}
		}
		// for (int i = 0; i < secretNumbers.size(); i++){
		// System.out.print(secretNumbers.get(i));
		// System.out.print(" ");
		// }
		System.out.println(stringBuilderConcat);
	}
 
	public static int[] readInput() {
		String userInput = null;
		int splittedNumbers[]; // declaring array
		splittedNumbers = new int[2]; // allocating memory to array
		String[] splitedString = new String[2]; // declaring/setting array
		boolean haveDetailsBeenProvidedInCorrectly = true; // true when details
															// have NOT been
															// provided
															// correctly
 
		try {
 
			while (haveDetailsBeenProvidedInCorrectly) {
				// BufferedReader
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				// System.out.println(
				// "Enter single line containing two space separated integers, a
				// and b where a is higher than b.");
				userInput = br.readLine();
 
				Pattern p = Pattern.compile("[0-9]{1,7}\\s[0-9]{1,7}");
				Matcher m = p.matcher(userInput);
				boolean b = m.matches();
 
				if (b) {
					// haveDetailsBeenProvidedInCorrectly = false;
					splitedString = userInput.split("\\s+");
 
					splittedNumbers[0] = Integer.parseInt(splitedString[0]);
					splittedNumbers[1] = Integer.parseInt(splitedString[1]);
 
					if (splitedString.length == 2 && 1 <= Integer.parseInt(splitedString[0])
							&& Integer.parseInt(splitedString[1]) <= 1000000
							&& Integer.parseInt(splitedString[0]) < Integer.parseInt(splitedString[1])) {
						haveDetailsBeenProvidedInCorrectly = false;
					}
				} else {
					System.out.println("Please enter numbers only. Rage 1 to 1000000");
				}
			}
 
		} catch (Exception e) {
			e.printStackTrace();
		}
 
		return splittedNumbers;
 
	}
 
	public static boolean isPrime(int number) {
		int m = number / 2;
 
		if (number == 0 || number == 1) {
			// System.out.println(number + " is not prime number");
			return false;
		} else {
			for (int i = 2; i <= m; i++) {
				if (number % i == 0) {
					// System.out.println(number + " is not prime number");
					return false;
				}
			}
			// System.out.println(number + " is prime number");
			return true;
		}
	}
 
	public static boolean isPrimeTwo(int number) {
		if (number > 2 && number % 2 == 0) {
			// System.out.println(number + " is not prime number");
			return false;
		}
		int top = (int) Math.sqrt(number) + 1;
		for (int i = 3; i < top; i += 2) {
			if (number % i == 0) {
				// System.out.println(number + " is not prime");
				return false;
			}
		}
		// System.out.println(number + " is prime");
		return true;
	}
 
	public static int sumOfIndividualDigits(int number) {
		int sum = 0;
 
		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		return sum;
	}
}