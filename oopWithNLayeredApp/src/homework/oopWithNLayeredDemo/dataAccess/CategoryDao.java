package homework.oopWithNLayeredDemo.dataAccess;

import java.util.List;

import homework.oopWithNLayeredDemo.entities.Category;

public interface CategoryDao {

	void add(Category category);
	List<Category> getAll();
}
