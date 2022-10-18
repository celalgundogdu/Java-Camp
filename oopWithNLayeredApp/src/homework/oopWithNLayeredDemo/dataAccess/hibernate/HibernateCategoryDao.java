package homework.oopWithNLayeredDemo.dataAccess.hibernate;

import java.util.ArrayList;
import java.util.List;

import homework.oopWithNLayeredDemo.dataAccess.CategoryDao;
import homework.oopWithNLayeredDemo.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	private List<Category> categoryList = new ArrayList<>();

	@Override
	public void add(Category category) {
		categoryList.add(category);
		System.out.println(category.getCategoryName() + " saved with Hibernate");
	}

	@Override
	public List<Category> getAll() {
		return categoryList;
	}
}
