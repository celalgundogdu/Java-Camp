package homework.overriding;

public class Main {

	public static void main(String[] args) {

		BaseCreditManager[] creditManagers = { new StudentCreditManager(), new FarmerCreditManager() };
		for (BaseCreditManager creditManager : creditManagers) {
			System.out.println(creditManager.calculate(1000));
		}

	}

}
