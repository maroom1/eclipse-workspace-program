package Lab4;

public class Employee extends Person{

	private int sal;
	private int empnum;
	public Employee() {
		super();
		this.sal = 0;
		this.empnum = 0;
		// TODO Auto-generated constructor stub
	}
	


	public Employee(int sal, int empnum,String name, String address, int number) {
		super(name, address, number);
		this.sal = sal;
		this.empnum = empnum;
		
	}

	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getEmpnum() {
		return empnum;
	}
	public void setEmpnum(int empnum) {
		this.empnum = empnum;
	}



	@Override
	public String toString() {
		return "Employee [sal=" + sal + ", empnum=" + empnum + ", name=" + name
				+ ", address=" + address + ", number=" + number + "]";
	}



	
}
