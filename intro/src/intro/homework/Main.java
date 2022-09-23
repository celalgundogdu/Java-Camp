package intro.homework;

public class Main {

	public static void main(String[] args) {

		// primitive types: boolean, char, byte, short, int, long, float, double
		int numOfStudents = 10;
		boolean isCorrect = false;
		String message = "Öðrenci sayýsý: ";
		System.out.println(message + numOfStudents);

		// if blocks
		int num1 = 20;
		int num2 = 25;
		int num3 = 2;
		int biggestNum = num1;
		if (biggestNum < num2) {
			biggestNum = num2;
		}
		if (biggestNum < num3) {
			biggestNum = num3;
		}
		System.out.println(biggestNum);

		// switch-case
		char grade = 'B';
		switch (grade) {
			case 'A':
				System.out.println("Çok iyi");
				break;
			case 'B':
				System.out.println("Ýyi");
				break;
			case 'C':
				System.out.println("Orta");
				break;
			case 'D':
				System.out.println("Ýdare eder");
				break;
			case 'F':
				System.out.println("Kötü");
				break;
			default:
				System.out.println("Geçersiz harf");
		}

		// loops
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
		}

		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		int j = 10;
		do {
			System.out.println(j);
			j -= 2;
		} while (j > 0);

		// arrays
		double[] numbers = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = Double.MIN_VALUE;
		for (double number : numbers) {
			if (number > max) {
				max = number;
			}
			total += number;
		}
		System.out.println("Total: " + total);
		System.out.println("Max: " + max);

		String[][] cities = new String[2][2];
		cities[0][0] = "Ýstanbul";
		cities[0][1] = "Edirne";
		cities[1][0] = "Ýzmir";
		cities[1][1] = "Manisa";
		for (int k = 0; k < cities.length; k++) {
			for (int m = 0; m < cities[0].length; m++) {
				System.out.println(cities[k][m]);
			}
		}

		// strings
		String text = "Bugün hava çok güzel ";
		text = text.trim();
		System.out.println("Metin uzunluðu: " + text.length());
		System.out.println(text.startsWith("B"));
		System.out.println(text.indexOf("hava"));
		System.out.println(text.substring(6));
		System.out.println(text.substring(2, 5));
		for (String word : text.split(" ")) {
			System.out.println(word.toUpperCase());
		}

		
		// exercise-1
		int num = 19;
		boolean isPrime = true;
		if (num <= 1) {
			isPrime = false;
		}
		for (int n = 2; n < Math.sqrt(num); n++) {
			if (num % n == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println(num + " asal sayýdýr");
		} else {
			System.out.println(num + " asal sayý deðildir");
		}

		// exercise-2
		char letter = 'I';
		char[] boldVowel = { 'A', 'I', 'O', 'U' };
		char[] narrowVowel = { 'E', 'Ý', 'Ö', 'Ü' };
		for (int n = 0; n < 4; n++) {
			if (letter == boldVowel[n]) {
				System.out.println("Kalýn ünlü");
				break;
			} else if (letter == narrowVowel[n]) {
				System.out.println("Ýnce ünlü");
				break;
			}
		}

		// exercise-3
		int number = 28;
		int totalDivider = 0;
		int n = 1;
		while ((number / 2) >= n) {
			if ((number % n) == 0) {
				totalDivider += n;
			}
			n++;
		}
		if (totalDivider == number) {
			System.out.println(number + " mükemmel sayýdýr");
		} else {
			System.out.println(number + " mükemmel sayý deðildir");
		}

	}

}
