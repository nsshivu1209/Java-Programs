package Constructor;

public class E {
int a=10;
static int b=20;
{
	int a=20;
	a=30;
	System.out.println("IIB-1");
	System.out.println(a);
	
}
{
	System.out.println("IIB-2");
	b=30;

	System.out.println(a+" "+b);
}
{
	System.out.println("IIB-3");
	int b=10;
	System.out.println(b);
	System.out.println(a+" "+E.b);
	
}
public static void main(String[] args) {
	System.out.println("hi");
	E a1=new E();
	System.out.println("hello");
}
}
