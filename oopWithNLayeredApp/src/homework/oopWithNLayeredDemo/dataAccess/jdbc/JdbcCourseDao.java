package homework.oopWithNLayeredDemo.dataAccess.jdbc;

import java.util.ArrayList;
import java.util.List;

import homework.oopWithNLayeredDemo.dataAccess.CourseDao;
import homework.oopWithNLayeredDemo.entities.Course;

public class JdbcCourseDao implements CourseDao {
	
	private List<Course> courseList = new ArrayList<>();

	@Override
	public void add(Course course) {
		courseList.add(course);
		System.out.println(course.getCourseName() + " saved with Jdbc");
	}

	@Override
	public List<Course> getAll() {
		return courseList;
	}
}
