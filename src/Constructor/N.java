package Constructor;

public class N {
static{
	System.out.println("SIB of class");
}
public static void main(String[] args) {
	System.out.println(M.a);
	M a1=new M();
	a1.method();
}
}
