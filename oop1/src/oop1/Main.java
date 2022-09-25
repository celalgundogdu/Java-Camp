package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setImageUrl("image1.jpg");
		product1.setUnitsInStock(3);

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(8);
		product2.setImageUrl("image2.jpg");
		product2.setUnitsInStock(2);

		Product[] products = { product1, product2 };
		for (Product product : products) {
			System.out.println(product.getName());
		}

		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("123456");
		individualCustomer.setPhone("05551234567");
		individualCustomer.setFirstName("Celal");
		individualCustomer.setLastName("Gündoðdu");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCustomerNumber("123");
		corporateCustomer.setPhone("05550123456");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("154135232");

		Customer[] customers = { individualCustomer, corporateCustomer };
	}

}
