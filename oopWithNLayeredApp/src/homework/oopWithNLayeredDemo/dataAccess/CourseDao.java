package homework.oopWithNLayeredDemo.dataAccess;

import java.util.List;

import homework.oopWithNLayeredDemo.entities.Course;

public interface CourseDao {
	
	void add(Course course);
	List<Course> getAll();
}
