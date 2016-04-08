package Lab4;
public class Student extends Person{ 

private String major;
private int id;
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	
	this.major = major;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Student() {
	super();
	this.major = "Default";
	this.id = 0;
	// TODO Auto-generated constructor stub
}

public Student(String major, int id,String name, String address, int number) {
	super(name, address, number);
	this.major = major;
	this.id = id;
}
@Override
public String toString() {
	return "Student [major=" + major + ", id=" + id + ", name=" + name
			+ ", address=" + address + ", number=" + number + "]";
}


	}
