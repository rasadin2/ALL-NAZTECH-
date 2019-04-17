package project1;

public class Person {
	private String name,gender,address;
	private int id,age;
	
	//setter and getter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//constractor with argument
	public Person(String name, String gender, String address, int id, int age) {
		//super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.id = id;
		this.age = age;
	}
	//constractor without agrument
	public Person() {
		//super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", address=" + address + ", id=" + id + ", age=" + age
				+ "]";
	}
}
