package homework.statics;

public class Main {

	public static void main(String[] args) {

		ProductManager productManager = new ProductManager();
		Product product = new Product(1, "Laptop", 5000);
		productManager.add(product);
		
		DatabaseHelper.Connection.createConnection();
		
	}

}
