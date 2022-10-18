package oopWithNLayeredApp;

import java.util.List;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {

		Product product1 = new Product(1, "Iphone Xr", 10000);
		ProductManager productManager = new ProductManager(
				new HibernateProductDao(),
				List.of(new DatabaseLogger(), new MailLogger()));
		
		productManager.add(product1);
	}

}
