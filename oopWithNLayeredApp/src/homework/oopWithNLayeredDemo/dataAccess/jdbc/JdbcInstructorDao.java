package homework.oopWithNLayeredDemo.dataAccess.jdbc;

import java.util.ArrayList;
import java.util.List;

import homework.oopWithNLayeredDemo.dataAccess.InstructorDao;
import homework.oopWithNLayeredDemo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
	
	private List<Instructor> instructorList = new ArrayList<>();

	@Override
	public void add(Instructor instructor) {
		instructorList.add(instructor);
		System.out.println(instructor.getFullName() + " saved with Hibernate");
	}

	@Override
	public List<Instructor> getAll() {
		return instructorList;
	}
}
