package homework.statics;

public class ProductValidator {
	
	static {
		System.out.println("statik blok calisti");
	}
	
	public static boolean isValid(Product product) {
		if(product.getPrice() > 0 && !product.getName().isEmpty()) {
			return true;
		}
		return false;
	}

}
