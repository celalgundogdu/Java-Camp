package homework.methods;

public class Main {

	public static void main(String[] args) {

		searchNumber();
		int sum1 = add(5, 7);
		int sum2 = add(2, 4, 9);
		System.out.println(sum1);
		System.out.println(sum2);
	}

	public static void searchNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int numberToSearch = 5;
		boolean isFound = false;
		for (int number : numbers) {
			if (number == numberToSearch) {
				isFound = true;
				break;
			}
		}
		if (isFound) {
			sendMessage(numberToSearch + " bulundu");
		} else {
			sendMessage(numberToSearch + " bulunamadı");
		}
	}

	public static void sendMessage(String message) {
		System.out.println(message);
	}

	public static int add(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

}
