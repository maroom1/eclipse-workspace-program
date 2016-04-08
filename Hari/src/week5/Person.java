package week5;

public class Person {
	private String name;
	private String address;
	private Heart heart;

	public Person() {
		this.name = "Hello";
		this.address = "World";
		this.heart= new Heart();
	}
	

	


	public void display() {
		System.out.println(name);
		System.out.println(address);
		//System.out.println(heart);
		heart.display();
	}
	public static void main(String [] args){
		Person p1= new Person();
		p1.display();
	}
	

	

}
