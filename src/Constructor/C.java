package Constructor;

public class C {
static int a=10;
static int b=20;
static{
	a=30;//reinitilization of glblvrible
	System.out.println("sib-1");
	
}
static{
	int b=30;//crtng a vrible
	System.out.println(b);//local vrible
	System.out.println(C.b);//globl vrible
	System.out.println("sib-3");
	b=40;//re initialization local vrible
	
}
static{
	int a=30;//crtng a local vrible
	System.out.println(a+" "+b);
	System.out.println("sib");
	
}
public static void main(String[] args) {
	
}
}
