package intro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		String title = "Kodlama.io";
		System.out.println(title);
		
		int expiration = 12;
		double dollarYesterday = 18.25;
		double dollarToday = 18.5;
		boolean isDollarLower = false;
		
		String arrow = "";
		if (dollarToday < dollarYesterday) {
			arrow = "down.svg";
		} else if (dollarToday > dollarYesterday) {
			arrow = "up.svg";
		} else {
			arrow = "equal.svg";
		}
		System.out.println(arrow);
		
		String[] credits = {"Hýzlý Kredi", "Eðitim Kredisi", "Emekli Kredisi"};
		for(int i = 0; i < credits.length; i++) {
			System.out.println(credits[i]);
		}
		
		for(String credit : credits) {
			System.out.print(credit + " - ");
		}
	}

}
