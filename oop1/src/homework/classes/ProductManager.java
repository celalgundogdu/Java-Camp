package homework.classes;

public class ProductManager {

	public void add(Product product) {
		System.out.println(product.getName() + " eklendi");
	}

	public void update(Product product) {
		System.out.println(product.getName() + " guncellendi");
	}

}
