package hello;

interface A{
	
	void a();
	void b();
	void c();
	void d();
} 

abstract class B implements A{
	
	public void a(){
		System.out.println(" interface a");
		
	}
}

 class interfavce_abstract  extends B{

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("Interface b");
}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("interface c");
		
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("interface d");
		
	}
public static void main(String args[]){
	interfavce_abstract i=new interfavce_abstract();
	i.a();i.b();i.c();i.d();
} 
}
