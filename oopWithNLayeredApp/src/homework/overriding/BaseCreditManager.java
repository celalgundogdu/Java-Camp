package homework.overriding;

public class BaseCreditManager {

	public double calculate(double amount) {
		return amount * 1.18;
	}
	
	// not overridable
	public final int givePromotion() {
		return 100;
	}
	
}
