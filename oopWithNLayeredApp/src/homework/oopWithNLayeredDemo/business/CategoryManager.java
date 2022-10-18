package homework.oopWithNLayeredDemo.business;

import java.util.List;

import homework.oopWithNLayeredDemo.core.logging.Logger;
import homework.oopWithNLayeredDemo.dataAccess.CategoryDao;
import homework.oopWithNLayeredDemo.entities.Category;

public class CategoryManager {
	
	private final CategoryDao categoryDao;
	private final List<Logger> loggers;

	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		List<Category> categoryList = categoryDao.getAll();
		boolean isExists = categoryList.stream()
							.anyMatch(item -> category.getCategoryName().equals(item.getCategoryName()));
		if(isExists) {
			throw new Exception(category.getCategoryName() + " already exists");
		}
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}

}
