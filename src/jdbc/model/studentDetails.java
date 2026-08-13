package jdbc.model;

public class studentDetails {

	private int id;
	private String Name;
	private int age;
	private String gender;
	private String department;

	public studentDetails() {
	}

	public studentDetails(int stid, String Na, int ag, String gen, String dep) {
		this.id = stid;
		this.Name = Na;
		this.age = ag;
		this.gender = gen;
		this.department = dep;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String toString() {

		return this.id + ":" + this.Name + ":" + this.age + ":" + this.gender + ":" + this.department;

	}
}
