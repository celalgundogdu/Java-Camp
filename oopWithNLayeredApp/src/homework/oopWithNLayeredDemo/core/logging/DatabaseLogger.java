package homework.oopWithNLayeredDemo.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Logged to db: " + message);
	}

}
