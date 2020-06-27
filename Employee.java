public class Employee {
	private String name;
	private String company;
	private String location;

	public Employee(String name, String company, String location) {
		this.name = name;
		this.company = company;
		this.location = location;
	}

	public String getName() {
		return this.name;
	}

	public String getCompany() {
		return this.company;
	}

	public String getLocation() {
		return this.location;
	}

	public void sayHello() {
		System.out.println("Hi this is " + this.name);
	}

	public static void main(String[] args) {
		Employee John = new Employee("John", "Flexon", "Dublin");
		John.sayHello();
	}
}