
public class Teacher extends Person{

	private String subject;
	private String section;
	//private Person p;
	
	public Teacher(String name, String address, String subject, String section) {
		super(name, address);
		this.subject = subject;
		this.section = section;
		//this.p = new Person(name, address);
	}


	public void display1(){
		super.display();
		System.out.println(subject + "	" + section);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teacher t=new Teacher("Ken", "Fremont", "Java", "A");
t.display1();
	}
	
}
