package Lab4;

public class Staff extends Employee {
	private String staff;

	public Staff() {
		super();
		this.staff = "Default";
		// TODO Auto-generated constructor stub
	}

	public Staff(String staff, int sal, int empnum, String name,
			String address, int number) {
		super(sal, empnum, name, address, number);
		this.staff = staff;
	}

	public String getStaff() {
		return staff;
	}

	public void setStaff(String staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "Staff [staff=" + staff + super.toString() + "]";
	}

}
