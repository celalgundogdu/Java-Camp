package homework.oopWithNLayeredDemo;

import java.util.List;

import homework.oopWithNLayeredDemo.business.CourseManager;
import homework.oopWithNLayeredDemo.core.logging.DatabaseLogger;
import homework.oopWithNLayeredDemo.core.logging.EmailLogger;
import homework.oopWithNLayeredDemo.dataAccess.hibernate.HibernateCourseDao;
import homework.oopWithNLayeredDemo.entities.Course;

public class Main {

	public static void main(String[] args) {

		Course course = new Course(1, "Java & Spring Boot", 1000);
		CourseManager courseManager = new CourseManager(
				new HibernateCourseDao(),
				List.of(new DatabaseLogger(), new EmailLogger()));

		try {
			courseManager.add(course);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
