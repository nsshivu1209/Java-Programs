package Constructor;

public class H {
int a=10;
H(){
	System.out.println("constructor");
	}
{
	System.out.println("IIB-1");
}
{
	a=20;
	System.out.println(a);
	System.out.println("IIB-2");
}
H(int a){
	this.a=a;
}
public static void main(String[] args) {
	System.out.println("hye");
	H a1=new H();
	System.out.println("main method");
	H a2=new H(10);
}
static{
	System.out.println("SIB-1");
}
}

