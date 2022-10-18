package homework.oopWithNLayeredDemo.business;

import java.util.List;

import homework.oopWithNLayeredDemo.core.logging.Logger;
import homework.oopWithNLayeredDemo.dataAccess.CourseDao;
import homework.oopWithNLayeredDemo.entities.Course;

public class CourseManager {
	
	private final CourseDao courseDao;
	private final List<Logger> loggers;
	
	public CourseManager(CourseDao courseDao, List<Logger> loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		List<Course> courseList = courseDao.getAll();
		boolean isExists = courseList.stream()
							.anyMatch(item -> course.getCourseName().equals(item.getCourseName()));
		if(isExists) {
			throw new Exception(course.getCourseName() + " already exists");
		} else if(course.getPrice() < 0) {
			throw new Exception("Price can not be less than 0");
		}
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}

}
