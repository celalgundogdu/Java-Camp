package homework.statics;

public class ProductManager {
	
	public void add(Product product) {
		if (ProductValidator.isValid(product)) {
			System.out.println(product.getName() + " eklendi");
		} else {
			System.out.println("Urun bilgileri gecersiz");
		}
	}

}
