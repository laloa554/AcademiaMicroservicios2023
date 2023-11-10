package herencia.Simple;

public class Person {
	private String name;
	private String lastName;
	private String gender;
	private int age;
	
	public Person() {
		this.name = null;
		this.lastName = null;
		this.gender = null;
		this.age = 0;
	}
	
	public Person(String name, String lastName, String gender, int age) {
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Name: " + name+"\n"
				+"Last name: " + lastName+"\n"
				+"Gender: " + gender+"\n"
				+"Age: " + age+"\n"
				;
	}
}
