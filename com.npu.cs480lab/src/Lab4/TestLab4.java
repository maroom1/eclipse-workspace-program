package Lab4;

public class TestLab4 {

	public static void main(String[] args) {
	
		System.out.println("Main method");
		Person p = new Person("Kyi", "Fremont", 123456789);
		System.out.println("Person info ---------------- \n" + p.toString());
		Student s1 = new Student("MSCS", 9478,"Kyi", "Fremont", 123456789);
		System.out.println("Student info ---------------- \n" + s1.toString());
		Staff s = new Staff("administrator",12500,94538,"Chnag jr","SFO",1245823);
		System.out.println("Staff info ---------------- \n"+s.toString());
		Faculty f = new Faculty("CS","Java",18500,94539,"Chang Sr","Newark",5214785);
		System.out.println("Faculty info ---------------- \n"+f.toString());

	}

}
