package Lab4;

public class Faculty extends Employee{

	private String dept;
	private String course;
	public Faculty() {
		super();
		this.dept = "Default";
		this.course = "Default";
		// TODO Auto-generated constructor stub
	}

	public Faculty(String dept, String course,int sal, int empnum,String name, String address, int number) {
		super(sal, empnum,name, address, number);
		this.dept = dept;
		this.course = course;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Faculty [dept=" + dept + ", course=" + course +super.toString() + "]";
	}

	
	
}
