package homework.inheritance;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.id = 123;
		customer.email= "celal@example.com";
		employee.id = 245;
		employee.salary = 10000;
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		customerManager.add();
		employeeManager.list();
		employeeManager.getBestEmployee();

	}

}
