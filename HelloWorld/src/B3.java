class A{  
A(){  
System.out.println("A parent class constructor invoked");  
}  
}  

class B2 extends A{
	
	B2() {  
		System.out.println("B2 class constructor invoked");  
		} 	
	
	{ System.out.println("B2 initialize block is invoked");}
	

}
  
class B3 extends B2{  
B3(){  
super();  
System.out.println("B3 child class constructor invoked");  
}  
  
B3(int a){  
super();  
System.out.println("B3 child class constructor invoked "+a);  
}  
  
{System.out.println("B3 instance initializer block is invoked");}  
  
public static void main(String args[]){  
//B3 b1=new B3();  
B3 b2=new B3(10);  
}  
}  