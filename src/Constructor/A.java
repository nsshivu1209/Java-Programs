package Constructor;

public class A {
int a=10;
static int b=20;
{
	System.out.println("IIB-1");
	int a=20;
	System.out.println(this.a);
	
}
{
	System.out.println("IIB-2");
	int b=30;
	System.out.println(a+" "+A.b);
	
}
public static void main(String[] args) {
	System.out.println("hello");
	A a1=new A();
	System.out.println("hye");
	A a2=new A();
}
}
