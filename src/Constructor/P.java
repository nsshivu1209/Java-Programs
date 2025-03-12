package Constructor;

public class P {

static{
	System.out.println("SIB of class");
}
public static void main(String[] args) {
	System.out.println(O.a);
	O a1=new O();
	a1.method();
	String s[]={"Lavanya","amulya","shivu"};
	O.main(s);
}

}
