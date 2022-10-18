package homework.oopWithNLayeredDemo.business;

import homework.oopWithNLayeredDemo.core.logging.Logger;
import homework.oopWithNLayeredDemo.dataAccess.InstructorDao;
import homework.oopWithNLayeredDemo.entities.Instructor;

public class InstructorManager {
	
	private final InstructorDao instructorDao;
	private final Logger logger;

	public InstructorManager(InstructorDao instructorDao, Logger logger) {
		this.instructorDao = instructorDao;
		this.logger = logger;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		logger.log(instructor.getFullName());
	}

}
