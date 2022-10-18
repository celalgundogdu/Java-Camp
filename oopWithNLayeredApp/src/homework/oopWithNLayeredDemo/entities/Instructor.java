package homework.oopWithNLayeredDemo.entities;

public class Instructor {

	private int id;
	private String fullName;
	private String description;

	public Instructor() {

	}

	public Instructor(int id, String fullName, String description) {
		this.id = id;
		this.fullName = fullName;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
