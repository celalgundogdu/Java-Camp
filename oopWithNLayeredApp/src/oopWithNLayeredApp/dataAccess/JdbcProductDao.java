package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("JDBC ile veritabanina eklendi");
	}
	
}
