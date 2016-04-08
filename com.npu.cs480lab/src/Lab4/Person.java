package Lab4;

public class Person {
	protected String name;
	protected String address;
	protected int number;
	

	public Person() {
		this.name = "Default";
		this.address = "Default";
		this.number = 0;
	}

	public Person(String name, String address, int number) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", number="
				+ number + "]";
	}

	

}