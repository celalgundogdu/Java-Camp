package homework.recap;

public class CustomerManager {
	
	private CreditManager creditManager;
	
	public CustomerManager(CreditManager creditManager) {
		this.creditManager = creditManager;
	}

	public void save(Customer customer) {
		System.out.println("Musteri kaydedildi");
	}
	
	public void giveCredit() {
		this.creditManager.calculate();
	}

}
