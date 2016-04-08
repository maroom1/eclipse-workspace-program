package Lab7;

public class Test {

	public static void main(String[] args) {

		Task t = new Task();

		t.setProjectId(100);

		t.setProjectName("Windows");

		t.setModuleName("Network");

		t.setTaskName("Write Protocols");

		System.out.println("Project Id: " + t.getProjectId()
				+ "\nProject Name: " + t.getProjectName() + "\nModule Name: "
				+ t.getModuleName() + "\nTask Name: " + t.getTaskName());
	}
}