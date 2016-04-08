package chinnapilla;

import java.util.ArrayList;

public class Course {

	private String dept_name;
	private int course_num;
	private String instructor;
	private ArrayList<String> students;
	private int size;
	
	public Course( String deptname,int deptsize,int coursenum){
		
		this.dept_name=deptname;
		this.course_num=coursenum;
		students=new ArrayList<String>(deptsize);
		this.size=deptsize;
	}
	public void setInstructor(String instructor){
		this.instructor=instructor;
	
	}
	public Boolean addStudent(String s){
		
		if(students.contains(s)){
			return false;
					} else if(students.size()>=size) {
						return false;}else{
						
					students.add(s);	
						
					}
		return true;
	}
	
	public void removeStudent(String s){
		
		students.remove(s);
		
	}
	
	public Boolean hasStudent(String s){
		
		if(students.contains(s)){
			return true;
					}
	return false;
	}
	
	public String getinstructor(){
		
	return this.instructor;
	}
	
	public int getSize(){
		
		return this.size;
	}
	
	public int getcoursenum(){
		
		return course_num;
	}
	
	public ArrayList<String> returnArray()
	{
		return this.students;
		
		
	}
	
	
	
}
