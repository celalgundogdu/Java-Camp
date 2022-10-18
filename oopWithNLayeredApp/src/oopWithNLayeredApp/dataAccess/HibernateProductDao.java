package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile veritabanina eklendi");
	}

}
