package rajkumar;

public class Values {
	private int a;
	private int b,c;
	public Values(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Values() {
		super();
		a=3;
		b=4;
		c=5;
		
	}
	public Values(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		c=9;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Values [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	public void tosString() {
		 System.out.println("Values [a=" + a + ", b=" + b + ", c=" + c + "]");
	}
	public static void main(String [] args){
		Values v1 = new Values();
		Values v2=new Values(2,3);
		Values v3=new Values(1,2,3);
		System.out.println(v2.getA()+","+v2.getB()+","+v2.getC());
		System.out.println(v3.getA()+","+v3.getB()+","+v3.getC());
		System.out.println(v1.getA()+","+v1.getB()+","+v1.getC());
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
		//v1.toString();
		v1.tosString();
		v2.tosString();
		v3.tosString();
	}
	

}
