package homework.polymorphism;

public class Main {

	public static void main(String[] args) {

		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger() };

		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();

	}

}
