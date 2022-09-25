package homework.classes;

public class Main {

	public static void main(String[] args) {
		// value type 
		int num1 = 10;
		int num2 = 20;
		num2 = num1;
		num1 = 30;
		System.out.println(num2);

		// reference type: class, interface, array
		int[] numbers1 = { 1, 2, 3 };
		int[] numbers2 = { 4, 5, 6 };
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
		
		
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(10000);
		product.setStockAmount(5);
		
		Product product2 = new Product(2, "Telefon", "Samsung Telefon", 5000, 10);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		productManager.add(product2);
	}

}
