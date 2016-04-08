package Lab3;

public class Person {
	
	private String name;
	private String address;
	private String phonenumber;
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address
				+ ", phonenumber=" + phonenumber + "]";
	}


	public Person(String name, String address, String phonenumber) {
		super();
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
	}
  public void display()
  {
	  System.out.println(toString());
	  
  }

	public static void main(String args[]){
		Person p=new Person("Kyi", "Fremont", "1345678952");
		p.display();
	
		
	}

}
