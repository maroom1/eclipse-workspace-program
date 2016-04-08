
public class Person {

	private String name;
	private String address;
	private Heart heart;
	
	public Person(String name,	String address){
		this.name	=	name;
		this.address	=	address;
		this.heart	=	new Heart();
	}
	public void display(){
		System.out.println(name+"	"+address);
        heart.display();
	}
}


