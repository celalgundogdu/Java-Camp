package homework.recap;

public class MilitaryCreditManager extends BaseCreditManager {

	@Override
	public void calculate() {
		System.out.println("Asker kredisi hesaplandi");
	}
	
	@Override
	public void save() {
		System.out.println("Kaydediliyor..");
		super.save();
	}

}
