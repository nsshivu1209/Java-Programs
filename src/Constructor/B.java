package Constructor;

public class B {
static int a=10;
static int b=30;
static{
	System.out.println("sib-1");
	a=20;
}
static{
	int b=20;
	System.out.println(b);
	System.out.println(a);
}static{
	int a=40;
	System.out.println("sib-3");
	b=50;
	
}
public static void main(String[] args) {
	System.out.println(a+" "+b);
}
}
