package homework.inheritance2;

public class Main {

	public static void main(String[] args) {

		TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
		teacherCreditManager.calculate();
		
		CreditUI creditUI = new CreditUI();
		creditUI.calculateCredit(teacherCreditManager);
		creditUI.calculateCredit(new AgriculturalCreditManager());
	}

}
