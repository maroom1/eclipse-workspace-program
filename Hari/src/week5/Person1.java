package week5;

public class Person1 {
	private String name;
	private Address address;

	public Person1() {
		this.name = "Hello";
		this.address = new Address();
	}

	public void display() {
		System.out.println(name);
		address.display();

	}

	public static void main(String[] args) {
		Person1 p2 = new Person1();
		p2.display();
	}

}
