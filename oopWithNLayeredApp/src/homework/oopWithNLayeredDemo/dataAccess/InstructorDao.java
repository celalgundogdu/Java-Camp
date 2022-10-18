package homework.oopWithNLayeredDemo.dataAccess;

import java.util.List;

import homework.oopWithNLayeredDemo.entities.Instructor;

public interface InstructorDao {

	void add(Instructor instructor);
	List<Instructor> getAll();
}
